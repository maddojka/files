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
    public Editor clone() throws CloneNotSupportedException {
        Editor cloned = (Editor) super.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "drawable=" + drawable +
                '}';
    }
}
