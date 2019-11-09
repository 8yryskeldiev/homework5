package com.company;

import java.util.Random;

public class Boss {
    int health;
    double damage;
    int bossDefenceType;


    public  void changeBossDefence() {
        Random r = new Random();
        int randomIndex = r.nextInt(50);
        bossDefenceType = randomIndex;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(int bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }
}
