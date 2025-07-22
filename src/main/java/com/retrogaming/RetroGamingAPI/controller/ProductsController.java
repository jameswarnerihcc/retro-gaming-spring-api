package com.retrogaming.RetroGamingAPI.controller;

import com.retrogaming.RetroGamingAPI.model.Product;
import com.retrogaming.RetroGamingAPI.service.ProductsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @Autowired
    private ProductsServiceImpl productsService;

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return productsService.getAllProducts();
    }
}
