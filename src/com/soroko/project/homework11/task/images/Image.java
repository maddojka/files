package com.soroko.project.homework11.task.images;

public class Image implements Drawable, Cloneable {
    private String path;

    public Image(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public void draw() {
        System.out.println(path);
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не поддерживается");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Image{" +
                "path='" + path + '\'' +
                '}';
    }
}