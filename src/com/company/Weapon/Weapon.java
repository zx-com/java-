package com.company.Weapon;

import com.company.Creature;

public class Weapon {
    private String id;
    private String description;
    private int damagePoints;

    public void useArtical(Creature creature){
        ;
    }

    public Weapon() {
    }

    public Weapon(String id, String description, int damagePoints) {
        this.id = id;
        this.description = description;
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
