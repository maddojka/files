package com.soroko.project.lesson06.Homework;

public class MyPermittedProducts {

    static final double MAX_PROTEINS = 10.0;
    static final double MAX_FATS = 5.0;
    static final double MAX_CARBS = 15.0;
    static final int MAX_CALORIES = 40;
    Product product;

    public MyPermittedProducts() {
    }

    public MyPermittedProducts(Product product) {
        this.product = product;
    }

    public boolean checkProduct(Product product) {
        if ((product.getProteins()) > MAX_PROTEINS
                || (product.getFats() > MAX_FATS)
                || (product.getCarbohydrates() > MAX_CARBS)
                || (product.getCalories() > MAX_CALORIES)) return false;
        else return true;
    }

}
