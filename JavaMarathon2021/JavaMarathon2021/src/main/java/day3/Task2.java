package day3;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true){
            //System.out.println("Введите делимое:");
            double a = s.nextDouble();
            //System.out.println("Введите делитель:");
            double b = s.nextDouble();
            if (b == 0) {
                System.out.println("На 0 делить нельзя. До свидания! )");
                break;
            } else {
                System.out.println(a / b);

            }
       }

    }
}
