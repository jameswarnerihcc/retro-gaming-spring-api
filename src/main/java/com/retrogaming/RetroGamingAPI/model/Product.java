package com.retrogaming.RetroGamingAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private int id;

    @NotEmpty
    private String name;

    private String description;

    @NotNull
    @Min(0)
    private double price;

}
