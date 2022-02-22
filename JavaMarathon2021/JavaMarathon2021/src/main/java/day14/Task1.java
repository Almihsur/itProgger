package day14;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String name = "numbers.txt";
        try {
            File file = new File(name);
            if (!file.exists()) {
                file.createNewFile();}
                PrintWriter pw = new PrintWriter(file);
                Random random = new Random();
                for (int i = 0; i < 10; i++) {
                    pw.print(random.nextInt(100)+" ");
                }
                pw.close();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String string = scanner.nextLine();
                System.out.println(string);
                String[] stringNumbers = string.split(" ");
                int[] arrNum = new int[stringNumbers.length];
                int count = 0;
                for(String s: stringNumbers){
                    arrNum[count++] = Integer.parseInt(s);
                }
                int sum = Arrays.stream(arrNum).sum();
                System.out.println(sum);
            }
            scanner.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }


}
