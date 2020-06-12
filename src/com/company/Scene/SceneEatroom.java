package com.company.Scene;

import com.company.Monster.Monster;
import com.company.Monster.MonsterServant;
import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponMagicWand;

public class SceneEatroom extends Scene{
    MonsterServant servant3 = new MonsterServant();

    public void initMonster(){
        servant3.setId("m3");
        servant3.setDescription("佣人3");
        servant3.setHpValue(100);
        servant3.setCurrentWeapon(new WeaponMagicWand("mw3", "魔杖3", 20));
    }

    public SceneEatroom() {
        initMonster();
    }
    public void play(){

    }

    @Override
    public String getMonsterDesc() {
        return servant3.getDescription();

    }

    @Override
    public MonsterServant getMonster() {
        return servant3;
    }

    @Override
    public Weapon getMonsterWeapon() {
        return servant3.getCurrentWeapon();
    }
}
