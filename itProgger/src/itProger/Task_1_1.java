package itProger;

//Создайте программу, которая выводит строку и подсчитывает в ней количество:
//букв;
//пробелов;
//чисел;
//символов (здесь имеется ввиду символы по типу , и !).
public class Task_1_1 {
    public static void main(String[] args) {
        String s = "Hello, I am the 1!";
        int sym = 0;
        int space = 0;
        int dig = 0;
        int other = 0;
        char[] arrChar = s.toCharArray();

        for (char c : arrChar) {
            if (Character.isLetter(c))
                sym++;
            else if (Character.isSpaceChar(c))
                space++;
            else if (Character.isDigit(c))
                dig++;
            else other++;
        }
        System.out.println("букв: " + sym);
        System.out.println("пробелов " + space);
        System.out.println("чисел " + dig);
        System.out.println("символов " + other);
    }
}
