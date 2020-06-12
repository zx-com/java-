package com.company.Scene;

import com.company.Monster.Monster;
import com.company.Weapon.Weapon;

public class SceneYourroom extends Scene {
    @Override
    public String getMonsterDesc() {
        return "没有怪物";
    }

    @Override
    public Monster getMonster() {
        return null;
    }

    @Override
    public Weapon getMonsterWeapon() {
        return null;
    }
}
