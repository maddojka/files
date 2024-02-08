package lesson02.homework;

public class Homework {
    public static void main(String[] args) {
        // First task
        long quantityOfLetters = 100L;
        long lettersSent = 15L;
        long lettersRemain = quantityOfLetters - lettersSent;
        System.out.println("1. It remains to send " + lettersRemain + " letters");
        // Second task
        long hours = 13L;
        long distance = 970L;
        double velocity = (double) distance / hours / 3.6;
        System.out.print("2. Velocity is equal to ");
        System.out.printf("%.1f", velocity);
        System.out.print(" m/s");
        System.out.println();
        // Third task
        long valueOfLong = 23L;
        long firstValue = valueOfLong % 10;
        long secondValue = valueOfLong / 10 % 10;
        long SumOfValues = firstValue + secondValue;
        System.out.println("3. Sum of digits of the number " + valueOfLong + " is equal to " + SumOfValues);
        // Fourth task
        float firstFloatValue = 320.0F;
        float secondFloatValue = 525.0F;
        secondFloatValue = secondFloatValue + firstFloatValue;
        firstFloatValue = secondFloatValue - firstFloatValue;
        secondFloatValue =  secondFloatValue - firstFloatValue;
        System.out.println("4. First number is equal to " + firstFloatValue + ", second number is equal to " + secondFloatValue);
        /* doubleResult01 имеет тип double
         doubleResult01 имеет значение 1.0, так как сперва мы вычисляем значение в скобках (int отбрасывает целую часть)
         далее идёт преобразование к типу double, потому что происходит явное преобразование к типу double в скобках.
        */
    }
}
