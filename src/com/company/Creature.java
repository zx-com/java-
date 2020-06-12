package com.company;

import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponSet;

public class Creature {
    private String id;
    private String description;
    private int HpValue;
    private Weapon currentWeapon;

    private WeaponSet weaponSet = new WeaponSet();
    public void useArticle(Weapon weapon,Creature creature){
        ;
    }

    public Creature() {
    }

    public Creature(String id, String description, int hpValue) {
        this.id = id;
        this.description = description;
        this.HpValue = hpValue;
    }

    public int getHpValue() {
        return HpValue;
    }

    public void setHpValue(int hpValue) {
        HpValue = hpValue;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public WeaponSet getWeaponSet() {
        return weaponSet;
    }

    public void setWeaponSet(WeaponSet weaponSet) {
        this.weaponSet = weaponSet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
