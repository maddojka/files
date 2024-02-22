package com.soroko.project.lesson06.Homework.Task2;

public class Product {
    private String productName;
    private double proteins;
    private double fats;
    private double carbohydrates;
    private int calories;

    public Product() {
    }

    public Product(String productName) {
        if ("".equals(productName))
            throw new IllegalArgumentException("Name of product cannot be empty");
        this.productName = productName;
    }

    public Product(String productName, double carbohydrates, int calories) {
        if ("".equals(productName))
            throw new IllegalArgumentException("Name of product cannot be empty");
        if (carbohydrates <= 0)
            throw new IllegalArgumentException("Fats should be greater than zero");
        if (calories <= 0)
            throw new IllegalArgumentException("Fats should be greater than zero");
        this.productName = productName;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public Product(String productName, double proteins, double fats, double carbohydrates, int calories) {
        if ("".equals(productName))
            throw new IllegalArgumentException("Name of product cannot be empty");
        if (proteins <= 0)
            throw new IllegalArgumentException("Proteins should be greater than zero");
        if (fats <= 0)
            throw new IllegalArgumentException("Fats should be greater than zero");
        if (carbohydrates <= 0)
            throw new IllegalArgumentException("Fats should be greater than zero");
        if (calories <= 0)
            throw new IllegalArgumentException("Fats should be greater than zero");
        this.productName = productName;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
