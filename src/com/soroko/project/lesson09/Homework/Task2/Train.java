package com.soroko.project.lesson09.Homework.Task2;

public class Train implements Stack {
    private String number;
    private Wagon wagon;
    private Wagon[] wagons;
    private int tos;

    public Train(String number, Wagon wagon) {
        this.number = number;
        this.wagon = wagon;
    }

    public Train(String number, Wagon wagon, int size) {
        this.number = number;
        this.wagon = wagon;
        wagons = new Wagon[size];
        tos = -1;
    }


    public String getNumber() {
        return number;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public void addMiddle(Wagon wagon) {
        int middle = wagons.length / 2;
        int count = 0;

        Wagon[] temp1 = new Wagon[wagons.length - middle + 1];
        Wagon[] temp2 = new Wagon[wagons.length - middle];
        Wagon[] temp3 = new Wagon[wagons.length + 1];
        for (int i = 0; i < temp1.length - 1; i++) {
            temp1[i] = wagons[i];
        }
        temp1[middle + 1] = wagon;
        for (int i = 0; i < temp2.length - 1; i++) {
            temp2[i] = wagons[i + middle + 1];
        }
        for (int i = 0; i < temp1.length; i++) {
            temp3[i] = temp1[i];
            count++;
        }
        for (int i = 0; i < temp2.length - 1; i++) {
            temp3[count++] = temp2[i];
        }
        wagons = temp3;
        for (int i = middle; i < wagons.length - 1; i++) {
            Wagon temp = wagons[i].getWagon();
            wagons[i].setWagon(wagons[i + 1].getWagon());
            wagons[i + 1].setWagon(temp);
        }
    }


    public int amountOfWagons() {
        return wagons.length;
    }

    @Override
    public int removeWagon() {
        if (tos < 0) {
            System.out.println("Вагоны отсутствуют");
            return 0;
        } else {
            Wagon[] temp = new Wagon[wagons.length - 1];
            for (int i = 0; i < wagons.length - 1; i++) temp[i] = wagons[i];
            wagons[--tos] = wagon;
            wagons = temp;

        }
        return tos;
    }

    @Override
    public void addWagon(Wagon wagon) {
        if (tos == wagons.length - 1) {
            Wagon[] temp = new Wagon[wagons.length + 1];
            for (int i = 0; i < wagons.length; i++) temp[i] = wagons[i];
            wagons = temp;
            wagons[++tos] = wagon;
        } else wagons[++tos] = wagon;
    }

    @Override
    public void print() {
        for (int i = 0; i < wagons.length; i++) {
            System.out.println(wagons[i] + " ");
        }
    }
}

//  wagons = (index > wagons.length) ? Arrays.copyOf(wagons, index) : wagons;




