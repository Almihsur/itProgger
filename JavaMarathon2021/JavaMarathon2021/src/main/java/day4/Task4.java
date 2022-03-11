package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 10);
        System.out.print(Arrays.toString(arr));
        System.out.println();
        int maxIndex = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxIndex = i;
                }
            }
        }
        System.out.println(maxIndex);
        System.out.println(maxSum);


    }
}
