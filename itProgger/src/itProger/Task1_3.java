package itProger;
//2642 дня записано в переменной. Определите количество лет, недель, дней.
//// Дней - 2642
//// Вывод будет следующим
//"Лет: 7, недель: 12, дней: 3"

import java.util.Date;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num = 2642;
//        int years = num / 365;
//        int weeks = (num % 365)/7;
//        int days = num - (years *365) - (weeks * 7);
//        System.out.println("Лет: "+years+", недель: "+weeks+", дней: "+days);

        //Создайте программу, которая будет принимать число (n), введенное пользователем,
        // и выдавать результат в виде (n + n * 2).
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число:");
//        int n = scanner.nextInt();
//        System.out.println("Вводим "+n);
//        System.out.println("Получаем: "+ n + ""+(n * 2));

//        System.out.print("Введите число 1: ");
//        int n = scanner.nextInt();
//        System.out.print("Введите число 2: ");
//        int n2 = scanner.nextInt();
//        System.out.println("Сумма введенных чисел: "+ (n + n2));

//        System.out.print("Введите имя:");
//        String name = scanner.nextLine();
//        System.out.print("Введите фамилию:");
//        String surname = scanner.nextLine();
//        System.out.println("Сколько вам лет, "+name+"?");
//        int age = scanner.nextInt();
//        System.out.println("Ваше имя: "+name);
//        System.out.println("Ваше фамилия: "+surname);
//        System.out.println("Вам: "+age+" лет");

// Введите число от 1 до 7, которое будет соответствовать дню недели.
//Например: при вводе числа 1 на экране будет выводиться «Понедельник» и т. д.
//Сделайте подобную проверку при помощи операторов switch case.

//        System.out.print("Введите число:");
//        int n = scanner.nextInt();
//        switch (n){
//            case 1:
//                System.out.println("Понедельник");
//                break;
//            case 2:
//                System.out.println("Вторник");
//                break;
//            case 3:
//                System.out.println("Среда");
//                break;
//                case 4:
//                System.out.println("Четверг");
//                break;
//            case 5:
//                System.out.println("Пятница");
//                break;
//            case 6:
//                System.out.println("Суббота");
//                break;
//            case 7:
//                System.out.println("Воскресенье");
//                break;
//            default: System.out.println("Неверное число");
//        }

        System.out.print("Введите строку 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String s2 = scanner.nextLine();
        int result = s1.compareTo(s2);
        //System.out.println(result);
        if (result < 0)
        System.out.println("Вторая строка больше первой");
        else if (result == 0)
        System.out.println("Первая строка равна второй");
        else
        System.out.println("Первая строка больше второй");
    }
}
