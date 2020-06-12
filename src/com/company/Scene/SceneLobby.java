package com.company.Scene;

import com.company.Monster.Monster;
import com.company.Monster.MonsterServant;
import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponMagicWand;

public class SceneLobby extends Scene{

    MonsterServant servant2 = new MonsterServant();




    public void initMonster(){
        servant2.setId("m2");
        servant2.setDescription("佣人2");
        servant2.setHpValue(100);
        servant2.setCurrentWeapon(new WeaponMagicWand("mw2", "魔杖2", 20));
    }

    public SceneLobby() {
        initMonster();
    }
    public void play(){

    }
    @Override
    public String getMonsterDesc() {
        return servant2.getDescription();
    }
    @Override
    public MonsterServant getMonster() {
        return servant2;
    }
    @Override
    public Weapon getMonsterWeapon() {
        return servant2.getCurrentWeapon();
    }
}
