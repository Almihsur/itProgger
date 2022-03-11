package day13;

import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Vasya");
        User user2 = new User("Petya");
        User user3 = new User("Pasha");
        MessageDatabase.addNewMessage(user1, user2, "Петя, привет, как дела?");
        MessageDatabase.addNewMessage(user1, user2, "Напиши мне");
        MessageDatabase.addNewMessage(user2, user1, "Вася, привет. Все хорошо");
        MessageDatabase.addNewMessage(user2, user1, "Что тебе написать?");
        MessageDatabase.addNewMessage(user2, user1, "Вася, ты Учишь Java?");
        MessageDatabase.addNewMessage(user3, user1, "Вася, Привет!");
        MessageDatabase.addNewMessage(user3, user1, "Петя учит Java");
        MessageDatabase.addNewMessage(user3, user1, "А ты?");
        MessageDatabase.addNewMessage(user1, user3, "Паша, Привет");
        MessageDatabase.addNewMessage(user1, user3, "Я знаю, что Петя учит Java");
        MessageDatabase.addNewMessage(user1, user3, "А ты? Паша, Что делаешь?");
        MessageDatabase.addNewMessage(user3, user1, "Паша, а Петя тоже учит java!");

        user1.subscribe(user2);
        user1.subscribe(user3);
        user2.subscribe(user1);

        user1.isFriend(user2);
        System.out.println(user1.getSubscriptions());
        System.out.println(user1.isFriend(user2));

    }
}
