package itProger;

public class Task_2 {
    public static void main(String[] args) {

     Player bot = new Player(); // Есть конструкор без параметров
     Player alex = new Player(Variants.SCISSORS, "Alex"); // А есть конструктор с параметрами

// Получаем результат
        System.out.println(bot.whoWins(bot, alex));
    }
}
