package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10000);
        for (int num : arr) {
            System.out.print(" | " + num);

        }
        int max = 0;
        int min = 10000;
        int numNull = 0;
        int sum = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        for (int num : arr) {
            if (num % 10 == 0) {
                numNull++;
            }
        }
        for (int num : arr) {
            if (num % 10 == 0) {
                sum += num;
            }
        }
        System.out.println();
        System.out.println("Наибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Заканчиваются на 0: " + numNull);
        System.out.println("Сумма заканчиваются на 0: " + sum);
    }
}
