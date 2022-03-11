package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;
    private static String word, word2, word3;

    public int getStamina() {
        System.out.println(" выносливость игрока = " + stamina);
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;
        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        int realCount = (6 - countPlayers);
        if (countPlayers == 1 || realCount == 1) {
            word = "игрок";
            word2 = "место";
            word3 = "свободное";
        }
        if (countPlayers == 2 || realCount == 2) {
            word = "игрока";
            word2 = "места";
            word3 = "свободных";
        }
        if (countPlayers == 3 || realCount == 3) {
            word = "игрока";
            word2 = "места";
            word3 = "свободных";
        }
        if (countPlayers == 4 || realCount == 4) {
            word = "игрока";
            word2 = "места";
            word3 = "свободных";
        }
        if (countPlayers == 5 || realCount == 5) {
            word = "игроков";
            word2 = "мест";
            word3 = "свободных";
        }
        if (countPlayers == 6 || realCount == 6) {
            word = "игроков";
            word2 = "мест";
            word3 = "свободных";
        }

        System.out.println("На поле " + countPlayers + " " + word + " ");
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + realCount + " " + word3 + " " + word2 + " ");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
