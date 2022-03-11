package day11.task2;

public class Magican extends Hero implements MagicAttack {

    public Magican() {
        physDef = 0;
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.2;
    }

    @Override
    public void magicalAttack(Hero h) {
        double attackScore = magicAtt - (magicAtt * h.magicDef);
        if (h.health < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Magican{" +
                "health=" + health +
                '}';
    }
}
