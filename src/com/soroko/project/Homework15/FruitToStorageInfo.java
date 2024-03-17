package com.soroko.project.Homework15;

import java.util.Objects;

public class FruitToStorageInfo {
    private final FruitType type;
    private double price;
    private int count;

    public FruitToStorageInfo(FruitType type, double price, int count) {
        if (price <= 0.0)
            throw new IllegalArgumentException("Цена не может быть меньше или равна нулю.");
        if (count <= 0 || count > 50)
            throw new IllegalArgumentException("Количество добавляемых фруктов не может быть меньше" +
                    " или равно нулю или больше 50.");
        this.type = type;
        this.price = price;
        this.count = count;
    }

    public FruitType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FruitToStorageInfo)) return false;
        FruitToStorageInfo that = (FruitToStorageInfo) o;
        return that.getPrice() == getPrice() && getType() == that.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getPrice());
    }

    @Override
    public String toString() {
        return
                "Фрукт: " + type +
                        ", цена: " + price +
                        ", количество: " + count;
    }
}