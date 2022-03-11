package day2;

import java.util.Scanner;
import static java.lang.Math.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число Х:");
        double x = s.nextDouble();
        if (x>=5){
           double y = (pow(x,2) - 10) / (x + 7);
            System.out.println("methood 1: Y = "+y);
        } else if (x>-3 && x<5){
           double y = (x + 3) * (pow(x,2) - 2);
            System.out.println("methood 2: Y = "+y);
        } else {
            System.out.println("methood 3: Y = 420");
        }


    }
}
