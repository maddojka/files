package com.soroko.project.homework11.task.images;

import java.util.Arrays;

public class Gallery implements Drawable {
    private String name;
    private Drawable[] drawables;

    public Gallery(String name, Drawable[] drawables) {
        this.drawables = drawables;
        this.name = name;
    }

    public Drawable[] getImages() {
        return drawables;
    }

    @Override
    public void draw() {
        System.out.println(name);
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    @Override
    public Gallery clone() {
        Gallery gallery = new Gallery(name, drawables);
        for (int i = 0; i < drawables.length; i++) {
            gallery.drawables[i] = drawables[i];
        }
        return gallery;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "name='" + name + '\'' +
                ", drawables=" + Arrays.toString(drawables) +
                '}';
    }
}
