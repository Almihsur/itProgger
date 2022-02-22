package itProger;
//Напишите программу, которая будет получать от пользователя число с 4 числами.
//Реализуйте разделение этого числа на отдельные цифры. Реализуйте разделение этого числа на отдельные цифры.
// Число 5934
// Результат 5, 9, 3, 4
import java.util.Scanner;
public class Task1_2 {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число с 4 цифрами: ");
    int n = scanner.nextInt();
    String s = String.valueOf(n);
    char[] array = s.toCharArray();
    System.out.print("Результат ");
    for (Character c:array){
        System.out.print(c+",");
    }
    }
}
