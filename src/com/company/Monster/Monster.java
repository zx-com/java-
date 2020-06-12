package com.company.Monster;

import com.company.Creature;
import com.company.Weapon.Weapon;

public class Monster extends Creature {
    @Override
    public void useArticle(Weapon weapon, Creature creature) {
        super.useArticle(weapon, creature);
    }

    public Monster() {
        super();
    }

    public Monster(String id, String description, int hpValue) {
        super(id, description, hpValue);
    }
}
