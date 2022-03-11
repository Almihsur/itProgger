package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    static final int SALF_HEALER = 50;
    static final int TIMAT_HEALER = 30;
    public Shaman() {
        physDef = 0.2;
        physAtt = 10;
        magicDef = 0.2;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        int healerHealth = health + SALF_HEALER;
        if (healerHealth > MAX_HEALTH){
            health = MAX_HEALTH;
        } else {
            health += SALF_HEALER;
        }
    }

    @Override
    public void healTeammate(Hero h) {
        if (h.health + TIMAT_HEALER > MAX_HEALTH){
            h.health = MAX_HEALTH;
        } else {
            h.health += TIMAT_HEALER;
        }
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
