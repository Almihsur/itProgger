package day8;

public class Task1 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        String s ="";
        for (int i = 0; i <= 10000; i++)
            s += (i + " ");
            System.out.println(s);

        long after = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (after - before));

        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++)
            sb.append(i).append(" ");
        System.out.println(sb);
        after = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (after - before));
    }
}
