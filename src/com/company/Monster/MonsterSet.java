package com.company.Monster;

import com.company.itemCURD;

import java.util.ArrayList;

public class MonsterSet implements itemCURD {
    private ArrayList<Monster> monsters = new ArrayList<>();

    @Override
    public void insert(Object object) {
        monsters.add((Monster)object);
    }

    @Override
    public Object select(String id) {
        boolean flag = false;
        Monster monster = null;
        for (Monster item:monsters){
            if (true == item.equals(id)){
                flag = true;
                monster = item;
                break;
            }
        }
        if (flag == true){
            return monster;
        }
        else {
            System.out.println("无此武器");
            return monster;
        }
    }

    @Override
    public void delect(String id) {
        Monster monster = null;
        monster = (Monster) select(id);
        if (null != monster){
            monsters.remove(monster);
        }

    }

    @Override
    public void update(String id, int number) {

    }
}
