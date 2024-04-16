package com.soroko.project.Homework27.Task02;

public class Good {
    private int id;
    private String title;
    private double price;
    private int quantity;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("Номер товара не может быть меньше или равно нулю");
        this.id = id;
    }


    public void setTitle(String title) {
        if ("".equals(title)) throw new IllegalArgumentException("Название товара не может быть пустой строкой");
        this.title = title;
    }

    public void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("Цена товара не может быть меньше или равно нулю");
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (price < 0) throw new IllegalArgumentException("Цена товара не может быть меньше нуля");
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
