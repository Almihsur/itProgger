package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        //int n = random.nextInt(10) + 90;

        Player player1 = new Player(random.nextInt(10) + 90);
        //player1.getStamina();
        Player player2 = new Player(random.nextInt(10) + 90);
        //player2.getStamina();
        Player player3 = new Player(random.nextInt(10) + 90);
        //Player.info();
        //player3.getStamina();
        Player player4 = new Player(random.nextInt(10) + 90);
        //player4.getStamina();
        Player player5 = new Player(random.nextInt(10) + 90);
        //player5.getStamina();
        Player player6 = new Player(random.nextInt(10) + 90);
        //player6.getStamina();
        Player.info();

for (int i = 0;i < 100; i++){
    player3.run();
}
        player3.getStamina();
        Player.info();
    }
}
