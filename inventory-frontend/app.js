const API = "https://inventory-system-puqi.onrender.com/api/products";

// Cargar productos
async function loadProducts() {
    const res = await fetch(API);
    const data = await res.json();

    const list = document.getElementById("productList");
    list.innerHTML = "";

    data.forEach(p => {
        list.innerHTML += `
      <li>
        ${p.name} - $${p.price}
        <button onclick="deleteProduct(${p.id})">❌</button>
      </li>
    `;
    });
}

// Crear producto
async function createProduct() {
    const name = document.getElementById("name").value;
    const price = document.getElementById("price").value;

    await fetch(API, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ name, price })
    });

    loadProducts();
}

// Eliminar
async function deleteProduct(id) {
    await fetch(`${API}/${id}`, {
        method: "DELETE"
    });

    loadProducts();
}

// Buscar
async function searchProducts() {
    const name = document.getElementById("search").value;

    const res = await fetch(`${API}/search?name=${name}`);
    const data = await res.json();

    const list = document.getElementById("productList");
    list.innerHTML = "";

    data.forEach(p => {
        list.innerHTML += `<li>${p.name} - $${p.price}</li>`;
    });
}

// Auto cargar
loadProducts();