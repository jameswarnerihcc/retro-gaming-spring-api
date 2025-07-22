package com.retrogaming.RetroGamingAPI;

import com.retrogaming.RetroGamingAPI.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
