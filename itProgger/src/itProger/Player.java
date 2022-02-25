package itProger;

public class Player {
    private Variants choose;
    private String name;

    // constr w/o arguments
    protected Player() {
        this.name = "Bot";
        int min = 1; // min
        int max = 3; // max
        double r = Math.random();
        int var = (int) (r * max + min);

        switch (var) {
            case 1:
                this.choose = Variants.PAPER;
                break;
            case 2:
                this.choose = Variants.ROCK;
                break;
            case 3:
                this.choose = Variants.SCISSORS;
                break;
        }

    }   // constr with arguments

    protected Player(Variants choose, String name) {
        this.choose = choose;
        this.name = name;
    }

    // method hwoWins
    public String whoWins(Player player1, Player player2) {
        String message = "";
        if (player1.choose == player2.choose)
            message = "Ничья";
        else if (player1.choose == Variants.PAPER) {
            message = "Победил игрок с именем " + player2.name;
        } else if (player1.choose == Variants.ROCK) {
            message = "Победил игрок с именем " + player1.name;
        }
        return message; // return result
    }

}
