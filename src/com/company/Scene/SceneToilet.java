package com.company.Scene;

import com.company.Monster.Monster;
import com.company.Monster.MonsterServant;
import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponMagicWand;

public class SceneToilet extends Scene{
    MonsterServant servant4 = new MonsterServant();


    public void initMonster(){
        servant4.setId("m4");
        servant4.setDescription("佣人4");
        servant4.setHpValue(100);
        servant4.setCurrentWeapon(new WeaponMagicWand("mw4", "魔杖4", 20));
    }

    public SceneToilet() {
        initMonster();
    }
    public void play(){

    }
    @Override
    public String getMonsterDesc() {
        return servant4.getDescription();

    }
    @Override
    public MonsterServant getMonster() {
        return servant4;
    }
    @Override
    public Weapon getMonsterWeapon() {
        return servant4.getCurrentWeapon();
    }
}
