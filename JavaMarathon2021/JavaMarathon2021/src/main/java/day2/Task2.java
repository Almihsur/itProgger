package day2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ВВедите границы массива");
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
