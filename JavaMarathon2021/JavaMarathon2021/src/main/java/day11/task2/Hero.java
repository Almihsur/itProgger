package day11.task2;

public abstract class Hero implements PhysAttack {
    int physAtt, magicAtt, health;
    double physDef, magicDef;
    final int MIN_HEALTH = 0;
    final int MAX_HEALTH = 100;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero h) {
        double attackScore = physAtt - (physAtt * h.physDef);
        if (h.health < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;
        }
    }
}
