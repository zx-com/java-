package com.company;

import com.company.Monster.MonsterSet;

import java.util.Scanner;

public class Main {
    private Room currentRoom;
    private MonsterSet monsterSet = new MonsterSet();


    public Main(){

    }
    private void start(){

    }



    public static void main(String[] args) {
	// write your code here
        Ui ui = new Ui();
        ui.createRooms();
        ui.printWelcome();

        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            if (words[0].equals("bye")) {
                break;
            } else if (words[0].equals("help")) {
                System.out.println("你可以做的命令有：go bye help attack");
                System.out.println("bye help attack为单命令，go为双命令，需要在后面接方向");
                System.out.println("如：\tgo east、\tattack、\thelp、\tbye");
            } else if (words[0].equals("go")) {
                ui.goRoom(words[1]);
            }else if (words[0].equals("attack")){
                ui.attack();
            }
        }
        in.close();


    }
}


