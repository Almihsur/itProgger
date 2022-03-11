package day14;

public class Task1_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 0, 2, 7, 23, 9, 11};
        int count = 0;
        while (count < arr.length) {
            System.out.println("Элемент с индексом " + count + ": " + arr[count]);
            count++;
        }
    }
}
