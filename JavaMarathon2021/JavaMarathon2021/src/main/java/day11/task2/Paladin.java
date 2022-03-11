package day11.task2;

public class Paladin extends Hero implements Healer{
    static final int SALF_HEALER = 25;
    static final int TIMAT_HEALER = 25;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;

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
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
