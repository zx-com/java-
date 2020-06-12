package com.company.Scene;

import com.company.Monster.Monster;
import com.company.Monster.MonsterServant;
import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponMagicWand;

public class SceneSwimming extends Scene{
    MonsterServant servant5 = new MonsterServant();

    public void initMonster(){
        servant5.setId("m5");
        servant5.setDescription("佣人5");
        servant5.setHpValue(100);
        servant5.setCurrentWeapon(new WeaponMagicWand("mw5", "魔杖5", 20));
    }

    public SceneSwimming() {
        initMonster();
    }
    public void play(){


    }
    @Override
    public String getMonsterDesc() {
        return servant5.getDescription();

    }
    @Override
    public MonsterServant getMonster() {
        return servant5;
    }
    @Override
    public Weapon getMonsterWeapon() {
        return servant5.getCurrentWeapon();
    }
}
