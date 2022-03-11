package day14;
//Ниже создан одномерный массив данных. При помощи цикла while найдите минимальный элемент массива
// и выведите его на экран в формате: «Минимальный элемент: el», где el – минимальный элемент.
public class Task_5 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 7, 3, -4, 5, 2, 6, 4 };
        int min = 0, i = 0;
        while (i < numbers.length){
            if (numbers[i] < min)
                min += numbers[i];
            i++;
        }
        System.out.println("Минимальный элемент: "+min);
    }
}
