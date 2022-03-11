package day14;
import java.util.Arrays;

class Task2 {
    public static void main (String[] args) {
        float[] arr = new float[]{3.3f, 7.4f, 0.3f, 5.01f, 45.2f};
        Arrays.sort(arr);
        System.out.println("Элемент: "+arr[arr.length - 1]);
    }
}
