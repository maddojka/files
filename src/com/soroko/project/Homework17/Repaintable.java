package com.soroko.project.Homework17;

public interface Repaintable {
    boolean changeColor(Color newColor);
    Color getColor();

    enum Color{
        RED("�������"), ORANGE("���������"), BLACK("������"), BLUE("�����"), GOLD("����������");
        private final String name;

        Color(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}