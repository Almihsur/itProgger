package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    String fn = "D:\\!PRORRAMMING\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv";
    String fnNew = "D:\\!PRORRAMMING\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.txt";

        try {
            File file = new File(fn);
            Scanner scanner = new Scanner(file);

            File fNew = new File(fnNew);
            if (!fNew.exists())
                fNew.createNewFile();
            PrintWriter pw = new PrintWriter(fNew);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] position = line.split(";");
                int i = Integer.parseInt(position[2]);
                if (i == 0){
                    System.out.println(line);
                    pw.println(line);
                }
            }

            scanner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
