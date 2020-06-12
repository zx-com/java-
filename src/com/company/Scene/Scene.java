package com.company.Scene;

import com.company.Monster.Monster;
import com.company.Weapon.Weapon;

public abstract class Scene {
    public void initMonster(){

    }
    public abstract String getMonsterDesc();
    public abstract Monster getMonster();
    public abstract Weapon getMonsterWeapon();


}
