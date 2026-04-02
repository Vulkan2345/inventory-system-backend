package com.santiago.inventory_system.service;

import com.santiago.inventory_system.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Laptop", 2500));
        products.add(new Product(2L, "Mouse", 50));
        products.add(new Product(3L, "Teclado", 120));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Product createProduct(Product product) {
        product.setId((long) (products.size() + 1));
        products.add(product);
        return product;
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                p.setName(updatedProduct.getName());
                p.setPrice(updatedProduct.getPrice());
                return p;
            }
        }
        return null;
    }

    public String deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
        return "Producto eliminado " + id;
    }
}