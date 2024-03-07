package com.soroko.project.homework11.task.images;

public final class Editor implements Cloneable {
    private Drawable drawable;

    public Editor(Drawable drawable) {
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable) {
        this.drawable = drawable;
    }

    public void show() {
        drawable.draw();
    }

    @Override
    public Editor clone() {
        try {
            Editor cloned = (Editor) super.clone();
            return cloned;
        } catch (CloneNotSupportedException ex) {
            System.out.println("Клонирование не поддерживается");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Editor{" +
                "drawable=" + drawable +
                '}';
    }
}
