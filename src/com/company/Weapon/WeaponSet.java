package com.company.Weapon;

import com.company.itemCURD;

import java.util.ArrayList;

public class WeaponSet implements itemCURD {
    private ArrayList<Weapon> weapons = new ArrayList<>();


    @Override
    public void insert(Object object) {
        weapons.add((Weapon) object);
    }

    @Override
    public Object select(String id) {
        boolean flag = false;
        Weapon weapon = null;
        for (Weapon item:weapons){
            if (true == item.equals(id)){
                flag = true;
                weapon = item;
                break;
            }
        }
        if (flag == true){
            return weapon;
        }
        else {
            System.out.println("无此武器");
            return weapon;
        }
    }

    @Override
    public void delect(String id) {
        Weapon weapon = null;
        weapon = (Weapon) select(id);
        if (null != weapon){
            weapons.remove(weapon);
        }


    }

    @Override
    public void update(String id, int number) {

    }


}
