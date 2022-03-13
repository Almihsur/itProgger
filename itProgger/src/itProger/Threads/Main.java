package itProger.Threads;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        byte age;
        String hobby_2;
        String name;
        String login;
        List<String> hobby = new ArrayList<>();
        String fn = "user.info";

        Scanner in = new Scanner(System.in);
        System.out.print("Insert your name: ");
        name = in.nextLine();

        System.out.print("Insert your login: ");
        login = in.nextLine();

        System.out.print("Insert your age: ");
        age = in.nextByte();

        System.out.print("Insert your hobby: ");
        in.nextLine();
        hobby_2 = in.nextLine();
        String[] hobbyArr = hobby_2.split(",");
        for (String s : hobbyArr) {
            hobby.add(s);
        }
        User user = new User(name, login, age, hobby);
        //System.out.println(user.toString());

        // serialise
        try {
            FileOutputStream fos = new FileOutputStream(fn);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        // deserialise
        try {
            FileInputStream fis = new FileInputStream(fn);
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.readObject());
            ois.close();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}
