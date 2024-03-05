package com.soroko.project.homework11.task;

import com.soroko.project.homework11.task.animals.Wolf;
import com.soroko.project.homework11.task.images.Editor;
import com.soroko.project.homework11.task.images.Gallery;
import com.soroko.project.homework11.task.images.Image;

public class Homework {
    public static void main(String[] args) throws CloneNotSupportedException {
        // clone task
        Image image1 = new Image("Картина1");
        Image image2 = new Image("Картина2");
        Image image3 = new Image("Картина3");

        Image[] images = new Image[]{image1, image2, image3};
        Image[] images2 = new Image[]{image3, image2, image1};

        Gallery gallery = new Gallery("Галерея", images);
        Gallery gallery2 = new Gallery("Галерея2", images2);

        Editor editor = new Editor(image2);
        Editor editorCopy = editor.clone();

        System.out.println(editor.toString());
        System.out.println(editorCopy.toString());

        editorCopy.setDrawable(image1);
        System.out.println(editorCopy.toString());
        // equals task
        String[] likeToEat = new String[]{"Pig", "Cow"};
        String[] likeToEat2 = new String[]{"Goose", "Dog"};

        Wolf wolf01 = new Wolf("wolf1", 5, likeToEat, "grey");
        Wolf wolf02 = new Wolf("wolf1", 5, likeToEat, "grey");

        System.out.println(wolf01.equals(wolf02));
    }
}
