package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Lada");
        arrayList.add("Marsedes");
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("SsagYeng");

        arrayList.remove(2);
        arrayList.add(2,"Fiat");

        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
    }
}