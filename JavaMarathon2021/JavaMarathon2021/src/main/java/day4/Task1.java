package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /**/
        int i, n, arr[];
        n = s.nextInt();
        arr = new int[n];
        for (i = 1; i < n; i++)
            arr[i] = (int) (Math.random() * 20);
//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Длинна массива: " + arr.length);
        int m = 0;
        int l = 0;
        int k = 0;
        int j = 0;
        int sum = 0;
        for (int num : arr) {
            if (num > 8) {
                m = m + 1;
            }
            if (num == 1) {
                l = l + 1;
            }
                 if (num % 2 == 0) {
                k = k + 1;
            }
            if (num % 2 != 0) {
                j = j + 1;
            }
            sum += num;
        }
        System.out.println("Количество чисел больше 8: " + m);
        System.out.println("Количество чисел равных 1: " + l);
        System.out.println("Количество четных чисел: " + k);
        System.out.println("Количество нечетных чисел: " + j);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
