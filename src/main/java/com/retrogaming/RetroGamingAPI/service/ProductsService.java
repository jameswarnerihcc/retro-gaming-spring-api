package com.retrogaming.RetroGamingAPI.service;

import com.retrogaming.RetroGamingAPI.model.Product;

import java.util.List;

public interface ProductsService {

    Iterable<Product> getAllProducts();

    void saveProduct(Product product);
}
