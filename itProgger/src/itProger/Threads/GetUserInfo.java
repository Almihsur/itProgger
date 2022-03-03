package itProger.Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// get user info
public class GetUserInfo {
    private String name, login;
    private byte age;
    private List <String> hobby = new ArrayList<>();

    public void getInfo (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert your name: ");
        this.name = scanner.nextLine();
        //if (name == null)
        //System.out.println("The name no mast be empty!");
        System.out.print("Insert your login: ");
        this.login = scanner.nextLine();
        //if (login == null)
        //System.out.println("The login no mast be empty!");
        System.out.print("Insert your age: ");
        this.age = scanner.nextByte();
        //if (age != 0 && this.age > 0)
        //System.out.println("he age no mast be empty & not 0!");
        System.out.print("Insert your hobby: ");
        this.hobby.add(scanner.nextLine());
        this.hobby.add(scanner.nextLine());
//        this.hobby.add(scanner.nextLine());
//        this.hobby.add(scanner.nextLine());
        System.out.println("All data was wrote!");
    }

    @Override
    public String toString() {
        return "GetUserInfo{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }
}
