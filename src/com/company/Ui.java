package com.company;


import com.company.Scene.*;
import com.company.Weapon.Weapon;
import com.company.Weapon.WeaponGun;
import com.company.Weapon.WeaponKnife;
import com.company.Weapon.WeaponSword;

import java.util.HashMap;
import java.util.Scanner;

public class Ui {
    Room currentRoom;
    Weapon currentWeapon;
    WeaponKnife weaponKnife = new WeaponKnife("w1", "小刀", -40);
    WeaponSword weaponSword = new WeaponSword("w2", "剑", -80);
    WeaponGun weaponGun = new WeaponGun("w3", "枪", -150);
    Person person = new Person("p1", "杰克", 200);
    private HashMap<String, Object> table = new HashMap<String, Object>();
    int flagStudy = 0;
    int flagEatroom = 0;
    int flagLobby = 0;
    int flagParentsroom = 0;
    int flagSwimming = 0;
    int flagToilet = 0;
    public void createRooms(){
        Room yourbedroom = new Room("你的卧室");
        Room study = new Room("书房");
        Room lobby = new Room("大厅");
        Room eatroom = new Room("饭堂");
        Room toilet = new Room("厕所");
        Room swimming = new Room("游泳池");
        Room parentsroom = new Room("父母的卧室");
        Room outside = new Room("外面");

        yourbedroom.setExits("east", study);
        study.setExits("west", yourbedroom);
        study.setExits("east", lobby);
        lobby.setExits("west", study);
        lobby.setExits("north", swimming);
        lobby.setExits("east", eatroom);
        lobby.setExits("south", outside);
        eatroom.setExits("west", lobby);
        eatroom.setExits("east", toilet);
        toilet.setExits("west", eatroom);
        swimming.setExits("north", parentsroom);
        swimming.setExits("south", lobby);
        parentsroom.setExits("south", swimming);

        currentRoom = yourbedroom;

    }
    public void printWelcome(){
        System.out.println();
        System.out.println("Hello 欢迎来到该游戏!，你的身份为杰克。");
        System.out.println("游戏中你的宫殿受到女巫的袭击，你需要打败女巫阵营，到父母的卧室救出你的父母一起逃出去！");
        System.out.println("如果需要帮助，请输入'help'。");
        System.out.println();
        showPrompt();

    }
    public void showPrompt(){
        System.out.println("你在" + currentRoom.toString());
        if (currentRoom.toString().equals("外面")){
            if (flagParentsroom == 1){
                System.out.println("恭喜您！成功救出了父母并逃了出来");
                System.exit(0);
            }else{
                System.out.println("很遗憾你没能从女巫手中救下父母，独自跑了出来");
                System.exit(0);
            }
        }else {
            System.out.print("出口有:");
            System.out.println(currentRoom.getExitDesc());
            System.out.print("怪物有：");
            if (currentRoom.toString().equals("你的卧室")) {
                SceneYourroom scene = new SceneYourroom();
                System.out.println(scene.getMonsterDesc());
            } else if (currentRoom.toString().equals("书房")) {
                SceneStudy scene = new SceneStudy();
                if (flagStudy == 0) {
                    System.out.println(scene.getMonsterDesc());
                } else {
                    System.out.println("Null");
                }
            } else if (currentRoom.toString().equals("大厅")) {
                SceneLobby scene = new SceneLobby();
                if (flagLobby == 0) {
                    System.out.println(scene.getMonsterDesc());
                } else {
                    System.out.println("Null");
                }
            } else if (currentRoom.toString().equals("饭堂")) {
                SceneEatroom scene = new SceneEatroom();
                if (flagEatroom == 0) {
                    System.out.println(scene.getMonsterDesc());
                } else {
                    System.out.println("Null");
                }
            } else if (currentRoom.toString().equals("厕所")) {
                SceneToilet scene = new SceneToilet();
                if (flagToilet == 0) {
                    System.out.println(scene.getMonsterDesc());
                } else {
                    System.out.println("Null");
                }
            } else if (currentRoom.toString().equals("游泳池")) {
                SceneSwimming scene = new SceneSwimming();
                if (flagSwimming == 0) {
                    System.out.println(scene.getMonsterDesc());
                } else {
                    System.out.println("Null");
                }
            } else if (currentRoom.toString().equals("父母的卧室")) {
                SceneParentsroom scene = new SceneParentsroom();
                if (flagParentsroom == 0) {
                    System.out.println(scene.getMonsterDesc());
                } else {
                    System.out.println("Null");
                }
            }
        }


    }
    public void goRoom(String direction) {
        Room nextRoom = currentRoom.getExit(direction);


        if (nextRoom == null) {
            System.out.println("那里没有门！");
        } else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }


    public void attack(){
        if (currentRoom.toString().equals("你的卧室")){
            System.out.println("没有怪物，无法攻击！");
        }else if (currentRoom.toString().equals("书房")){
            SceneStudy scene = new SceneStudy();
            while (scene.getMonster().getHpValue()>0){
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                person.useArticle(chooseWeapon(), scene.getMonster());
                scene.getMonster().useArticle(person);
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                if (person.getHpValue()<=0){
                    System.out.println("您已死亡，游戏失败");
                    System.exit(0);
                }
                if (scene.getMonster().getHpValue()<=0){
                    flagStudy = 1;
                    System.out.println(scene.getMonsterDesc()+"已死亡");
                    System.out.println("请继续行动:");
                }
            }


        }else if (currentRoom.toString().equals("大厅")){
            SceneLobby scene = new SceneLobby();
            while (scene.getMonster().getHpValue()>0){
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                person.useArticle(chooseWeapon(), scene.getMonster());
                scene.getMonster().useArticle(person);
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                if (person.getHpValue()<=0){
                    System.out.println("您已死亡，游戏失败");
                    System.exit(0);
                }
                if (scene.getMonster().getHpValue()<=0){
                    flagLobby = 1;
                    System.out.println(scene.getMonsterDesc()+"已死亡");
                    System.out.println("请继续行动:");
                }
            }


        } else if (currentRoom.toString().equals("饭堂")){
            SceneEatroom scene = new SceneEatroom();
            while (scene.getMonster().getHpValue()>0){
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                person.useArticle(chooseWeapon(), scene.getMonster());
                scene.getMonster().useArticle(person);
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                if (person.getHpValue()<=0){
                    System.out.println("您已死亡，游戏失败");
                    System.exit(0);
                }
                if (scene.getMonster().getHpValue()<=0){
                    flagEatroom = 1;
                    System.out.println(scene.getMonsterDesc()+"已死亡");
                    System.out.println("请继续行动:");
                }
            }


        }else if (currentRoom.toString().equals("厕所")){
            SceneToilet scene = new SceneToilet();
            while (scene.getMonster().getHpValue()>0){
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                person.useArticle(chooseWeapon(), scene.getMonster());
                scene.getMonster().useArticle(person);
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                if (person.getHpValue()<=0){
                    System.out.println("您已死亡，游戏失败");
                    System.exit(0);
                }
                if (scene.getMonster().getHpValue()<=0){
                    flagToilet = 1;
                    System.out.println(scene.getMonsterDesc()+"已死亡");
                    System.out.println("请继续行动:");
                }
            }


        }else if (currentRoom.toString().equals("游泳池")){
            SceneSwimming scene = new SceneSwimming();
            while (scene.getMonster().getHpValue()>0){
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                person.useArticle(chooseWeapon(), scene.getMonster());
                scene.getMonster().useArticle(person);
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                if (person.getHpValue()<=0){
                    System.out.println("您已死亡，游戏失败");
                    System.exit(0);
                }
                if (scene.getMonster().getHpValue()<=0){
                    flagSwimming = 1;
                    System.out.println(scene.getMonsterDesc()+"已死亡");
                    System.out.println("请继续行动:");
                }
            }


        }else if (currentRoom.toString().equals("父母的卧室")){
            SceneParentsroom scene = new SceneParentsroom();
            while (scene.getMonster().getHpValue()>0){
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                person.useArticle(chooseWeapon(), scene.getMonster());
                scene.getMonster().useArticle(person);
                System.out.println(scene.getMonsterDesc()+"的血量："+scene.getMonster().getHpValue());
                System.out.println(person.getDescription()+"的血量: "+person.getHpValue());
                if (person.getHpValue()<=0){
                    System.out.println("您已死亡，游戏失败");
                    System.exit(0);
                }
                if (scene.getMonster().getHpValue()<=0){
                    flagParentsroom = 1;
                    System.out.println(scene.getMonsterDesc()+"已死亡");
                    System.out.println("您已经找到了父母，请尽快逃离");
                    System.out.println("请继续行动:");
                }
            }
        }


    }

    public Ui() {
        table.put("书房", new SceneStudy());
        table.put("大厅", new SceneLobby());
        table.put("饭堂", new SceneEatroom());
        table.put("厕所", new SceneToilet());
        table.put("游泳池", new SceneSwimming());
        table.put("父母的卧室", new SceneParentsroom());
        table.put("你的卧室", new SceneYourroom());



    }
    public Weapon chooseWeapon(){
        System.out.println("请选择要使用的武器：");
        System.out.println("1.小刀； 2.剑； 3.枪");
        Scanner in1 = new Scanner(System.in);
        int num = in1.nextInt();
        if (num == 1){
            currentWeapon = weaponKnife;
        }else if (num == 2){
            currentWeapon = weaponSword;
        }else if (num == 3){
            currentWeapon = weaponGun;
        }
        return currentWeapon;
    }
}
