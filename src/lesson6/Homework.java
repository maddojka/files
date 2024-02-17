package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenArr = scan.nextInt();
        scan.nextLine();
        String[] arrayOfString = new String[lenArr];
        int index = 0;
        while (arrayOfString[lenArr - 1] == null) {
            String str = scan.nextLine();
            boolean result = true;
            for (int i = 0; i < arrayOfString.length; i++) {
                if (str.equals(arrayOfString[i])) result = false;
            }
            if (str.equals("exit")) break;
            if (index < arrayOfString.length && result) {
                arrayOfString[index] = str;
                index++;
            }
        }
        System.out.println(Arrays.toString(arrayOfString));

        // Bubble Sort Algorithm
        Scanner scan01 = new Scanner(System.in);
        int arrSize = scan01.nextInt();
        int[] sortArray = new int[arrSize];

        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = scan01.nextInt();
        }

        boolean needToSort = true;

        while (needToSort) {
            needToSort = false;
            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] > sortArray[i + 1]) {
                    needToSort = true;
                    int temp = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(sortArray));
        }

        // Sliding window algorithm
        int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44};
        int k = 4;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += task02[i];
        }
        for (int i = k; i < task02.length; i++) {
            sum += task02[i] - task02[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
