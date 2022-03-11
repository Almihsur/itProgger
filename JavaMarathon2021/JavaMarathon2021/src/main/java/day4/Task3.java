package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int index = 0;
        int max = 0;
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                System.out.print(arr[i][j] + " ");
                sum = sum + arr[i][j];
                if (sum > max){
                    max = sum;
                    index = i;
                }
            }System.out.print("// sum = " + sum);
            System.out.println();
        }
        System.out.println("Index "+index+", max sum  "+max);
    }
}
