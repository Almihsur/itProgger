package day14;
//Ниже создан двумерный массив данных. При помощи циклов for выведите каждый элемент
// по отдельности на экран в формате: «Элемент: el», где el – значение элемента.
//Важно: никаких пропусков строк и прочих дополнительных выводов информации не создавайте.
public class Task1_4 {
    public static void main(String[] args) {
        int[][] x = {
                {0, 34, 2},
                {3, 4, 5}
        };
        int i, j;
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++)
                System.out.println("Элемент: " + x[i][j]);
        }
    }
}
