package com.company.Weapon;

import com.company.Creature;

public class WeaponBigMagicWand extends Weapon{
    public WeaponBigMagicWand() {
    }

    public WeaponBigMagicWand(String id, String description, int damagePoints) {
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
