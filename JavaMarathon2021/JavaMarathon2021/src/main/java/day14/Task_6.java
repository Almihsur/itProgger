package day14;

public class Task_6 {
    public static void main (String[] args) {
        int[] numbers = new int[] { -1, 7, -3, -4, 5, -2, 6, 4 };
        int sum = 0;
        for( int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0)
               sum += numbers[i];
        }
        System.out.print("Сумма: "+sum);
    }
}
