package com.soroko.project.lesson09.Homework.Task2;

public class Wagon {
   private String number;
   private String type;
   private int amountOfPlaces;
   Wagon wagon;

   public Wagon(String number, String type, int amountOfPlaces) {
      this.number = number;
      this.type = type;
      this.amountOfPlaces = amountOfPlaces;
   }

   public Wagon(String number, String type, int amountOfPlaces, Wagon wagon) {
      this.number = number;
      this.type = type;
      this.amountOfPlaces = amountOfPlaces;
      this.wagon = wagon;
   }

   public String getNumber() {
      return number;
   }

   @Override
   public String toString() {
      return  "Номер " + number +
              " тип " + type +
              " количество мест " + amountOfPlaces;
   }
}
