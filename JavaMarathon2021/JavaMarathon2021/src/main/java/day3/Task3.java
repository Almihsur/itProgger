package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        while (count < 7) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            count++;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }

    }

}

