package com.company.Monster;

import com.company.Creature;
import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponMagicWand;

public class MonsterServant extends Monster{
    WeaponMagicWand weaponMagicWand = new WeaponMagicWand("mw1", "魔杖", -20);

    public void useArticle(Creature creature) {
        weaponMagicWand.useArtical(creature);
    }

    public MonsterServant() {


    }

    public MonsterServant(String id, String description, int hpValue) {
        super(id, description, hpValue);
    }

    @Override
    public int getHpValue() {
        return super.getHpValue();
    }

    @Override
    public void setHpValue(int hpValue) {
        super.setHpValue(hpValue);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }
}
