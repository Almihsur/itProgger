package itProger.Threads;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

public class User implements Serializable {
    private String name, login;
    private byte age;
    private List<String> hobby;


    public User() {
    }
    public User(String name, String login, byte age, List<String> hobby) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobby = hobby;

    }

    @Override
    public String toString() {
        hobby.forEach(s -> System.out.println(s));
        return "User:" + name +
                " with login:" + login +". "+
                "His age: " + age +", All his hobby:";

    }
}