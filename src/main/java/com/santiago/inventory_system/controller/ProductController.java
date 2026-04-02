package com.santiago.inventory_system.controller;

import com.santiago.inventory_system.model.Product;
import com.santiago.inventory_system.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET todos
    @GetMapping
    public List<Product> getAll() {
        return productService.getAllProducts();
    }

    // GET por ID
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // POST crear
    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    // PUT actualizar
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    // DELETE eliminar
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return productService.deleteProduct(id);
    }
}