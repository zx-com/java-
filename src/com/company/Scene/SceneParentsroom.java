package com.company.Scene;

import com.company.Monster.Monster;
import com.company.Monster.MonsterWitch;
import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponBigMagicWand;

public class SceneParentsroom extends Scene{
    private MonsterWitch witch = new MonsterWitch();

    public void initMonster(){
        witch.setId("m6");
        witch.setDescription("女巫");
        witch.setHpValue(200);
        witch.setCurrentWeapon(new WeaponBigMagicWand("mw6", "大魔杖", 40));
    }

    public SceneParentsroom() {
        initMonster();
    }
    public void play(){


    }
    @Override
    public String getMonsterDesc() {
        return witch.getDescription();

    }
    @Override
    public MonsterWitch getMonster() {
        return witch;
    }
    @Override
    public Weapon getMonsterWeapon() {
        return witch.getCurrentWeapon();
    }
}
