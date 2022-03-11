package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите кол-во этажей");
        int f = s.nextInt();
        if (f < 0) {
            System.out.println("Этажность не может быть отрицательной!");
        } else if (f <= 1 && f <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (f <= 5 && f <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (f <= 9) {
            System.out.println("Многоэтажный дом");
        }

    }
}
