package com.soroko.project.lesson06.Homework.Task2;

public class MyPermittedProducts {

    final double MAX_PROTEINS = 10.0;
    final double MAX_FATS = 5.0;
    final double MAX_CARBS = 15.0;
    final int MAX_CALORIES = 40;
    private Product product;

    public MyPermittedProducts() {
    }

    public MyPermittedProducts(Product product) {
        this.product = product;
    }

    public boolean checkProduct(Product product) {
        if ((product.getProteins()) > MAX_PROTEINS
                || (product.getFats() > MAX_FATS)
                || (product.getCarbohydrates() > MAX_CARBS)
                || (product.getCalories() > MAX_CALORIES)) {
            return false;
        } else {
            return true;
        }
    }

    public double getMAX_PROTEINS() {
        return MAX_PROTEINS;
    }

    public double getMAX_FATS() {
        return MAX_FATS;
    }

    public double getMAX_CARBS() {
        return MAX_CARBS;
    }

    public int getMAX_CALORIES() {
        return MAX_CALORIES;
    }
}
