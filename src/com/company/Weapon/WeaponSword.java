package com.company.Weapon;

import com.company.Creature;

public class WeaponSword extends Weapon{
    public WeaponSword() {
    }

    public WeaponSword(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override
    public void useArtical(Creature creature) {
        creature.setHpValue(creature.getHpValue()+this.getDamagePoints());
    }

    @Override
    public int getDamagePoints() {
        return super.getDamagePoints();
    }

    @Override
    public void setDamagePoints(int damagePoints) {
        super.setDamagePoints(damagePoints);
    }
}
