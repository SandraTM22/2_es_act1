package com.casoOne.casoOne.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Le decimos que es una entidad
@Entity

// Le indicamos que esto sera una tabla
@Table(name = "products")
public class Product {

    // Le dicemos que es un Id y que tiene que generar un valor unico
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private double price;
    private User user;

    public Product(Integer id, String name, String description, double price, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.user = user;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
    }

}
