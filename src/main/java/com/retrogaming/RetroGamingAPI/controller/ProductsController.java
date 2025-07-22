package com.retrogaming.RetroGamingAPI.controller;

import com.retrogaming.RetroGamingAPI.model.Product;
import com.retrogaming.RetroGamingAPI.service.ProductsServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @Autowired
    private ProductsServiceImpl productsService;

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return productsService.getAllProducts();
    }

    @PostMapping("/new/product")
    public Product saveProduct(@Valid @RequestBody Product product) {
        productsService.saveProduct(product);
        return product;
    }
}
