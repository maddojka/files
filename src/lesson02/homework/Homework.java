package lesson02.homework;

public class Homework {
    public static void main(String[] args) {
        // First task
        long quantityOfLetters = 100L;
        long lettersSent = 15L;
        long lettersRemain = quantityOfLetters - lettersSent;
        System.out.println("1. �������� ��������� " + lettersRemain + " �����");
        // Second task
        long hours = 13L;
        long distance = 970L;
        double velocity = (double) distance / hours / 3.6;
        System.out.print("2. �������� ����� ");
        System.out.printf("%.1f", velocity);
        System.out.print(" �/c");
        System.out.println();
        // Third task
        long valueOfLong = 23L;
        long firstValue = valueOfLong % 10;
        long secondValue = valueOfLong / 10 % 10;
        long SumOfValues = firstValue + secondValue;
        System.out.println("3. ����� ���� ����� " + valueOfLong + " ����� " + SumOfValues);
        // Fourth task
        float firstFloatValue = 320.0F;
        float secondFloatValue = 525.0F;
        secondFloatValue = secondFloatValue + firstFloatValue;
        firstFloatValue = secondFloatValue - firstFloatValue;
        secondFloatValue =  secondFloatValue - firstFloatValue;
        System.out.println("4. ������ ����� ����� " + firstFloatValue + " ������ ����� ����� " + secondFloatValue);
        /* doubleResult01 ����� ��� double
         doubleResult01 ����� �������� 1.0, ��� ��� ������ �� ��������� �������� � ������� (int ����������� ����� �����)
         ����� ��� �������������� � ���� double, ������ ��� ���������� ����� �������������� � ���� double � �������.
        */
    }
}
