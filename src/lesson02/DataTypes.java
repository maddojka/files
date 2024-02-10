package lesson02;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("¬ывод данных в консоль");
        int userAge;
        int width, height;
        userAge = 79;
        width = 100;
        height = 187;
        byte age = 127;
        userAge = 80; //переопределение значени€
        int numberOfColors = 3;
        int numberOfFruits = 10, numberOfVegetables = 11;
        byte byteFromFile = 56;
        short numberOfLessons = 15;
        long millis = 334, age1 = 8_000_000_000L;
        age1 = 7_000_000_000L;
        float temp = 35.88F;
        double maxTemp = 335.88;
        var classVersion = 10;
        var count = (short) 358;
        var readByte = (byte) 100;
        var balance = 100.5;
        var numberOfHours = 15.6F;
        var isActive = true;
        int int01 = 10;
        int zeroInt = 0;
        //   System.out.println(int01 / zeroInt);
        double double01 = 10.0;
        double zeroDouble = 0.0;
        System.out.println(double01 / zeroDouble);
        int num01 = 3;
        int num02 = 2;
        int result = num01 / num02;
        System.out.println(result);
        double doubleResult = (double) num01 / num02;
        System.out.println(doubleResult);
        short value1 = 25;
        byte value2 = 30;
        byte byteValue = 1;
        int intValue = byteValue;
        var doubleResult01 = (double) (num01 / num02);
        System.out.println(doubleResult01);
    }
}
