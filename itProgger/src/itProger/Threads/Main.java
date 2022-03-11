package itProger.Threads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Process p = new Process();
 p.start();
        System.out.println("Press any kee");
 Scanner s = new Scanner(System.in);
 s.nextLine();
 p.exit();
    }
}
