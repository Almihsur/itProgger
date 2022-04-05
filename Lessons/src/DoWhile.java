import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
Scanner my_scanner = new Scanner(System.in);

int i;
do {
    System.out.println("Insert 5 ");
    i = my_scanner.nextInt();
}while (i!=5);
        System.out.println("All is OK!");
    }
}
