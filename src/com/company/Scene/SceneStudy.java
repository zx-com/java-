package com.company.Scene;

import com.company.Monster.Monster;
import com.company.Monster.MonsterServant;
import com.company.Person;
import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponKnife;
import com.company.Weapon.WeaponMagicWand;

public class SceneStudy extends Scene{
    private Person person = new Person();
    private MonsterServant servant1 = new MonsterServant();



    public void initMonster(){
        servant1.setId("m1");
        servant1.setDescription("佣人1");
        servant1.setHpValue(100);
        servant1.setCurrentWeapon(new WeaponMagicWand("mw1", "魔杖1", 20));
    }

    public SceneStudy() {
        initMonster();

    }
    public void init(){


    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



    @Override
    public String getMonsterDesc() {
        return servant1.getDescription();

    }
    @Override
    public MonsterServant getMonster() {
        return servant1;
    }
    @Override
    public Weapon getMonsterWeapon() {
        return servant1.getCurrentWeapon();
    }
}
