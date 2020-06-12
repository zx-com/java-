package com.company;

import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponSet;

public class Person extends Creature{

    @Override
    public void useArticle(Weapon weapon, Creature creature) {
        weapon.useArtical(creature);
    }

    public Person(String id, String description, int hpValue) {
        super(id, description, hpValue);
    }

    public Person() {

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
    public Weapon getCurrentWeapon() {
        return super.getCurrentWeapon();
    }

    @Override
    public void setCurrentWeapon(Weapon currentWeapon) {
        super.setCurrentWeapon(currentWeapon);
    }

    @Override
    public WeaponSet getWeaponSet() {
        return super.getWeaponSet();
    }

    @Override
    public void setWeaponSet(WeaponSet weaponSet) {
        super.setWeaponSet(weaponSet);
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
