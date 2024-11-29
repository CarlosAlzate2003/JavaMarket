package com.market.app.domain;

import com.market.app.persistence.entity.CategoriasEntity;

public class Product {
    private int productoId;

    private String name;

    private int categoryId;

    private double price;

    private int stock;

    private boolean active;

    private CategoriasEntity category;

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CategoriasEntity getCategory() {
        return category;
    }

    public void setCategory(CategoriasEntity category) {
        this.category = category;
    }
}
