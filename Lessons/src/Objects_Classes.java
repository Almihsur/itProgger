import java.util.Scanner;

public class Objects_Classes {
    public static void main(String[] args) {
      Human human1 = new Human();
        Scanner s = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = s.nextLine(); //вводим имя
        System.out.println("Insert your age");
        int age = s.nextInt(); // вводим возраст

        human1.setAge(age);
        human1.setName(name);
        human1.getInfo();

    }
    }


