package com.company;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room>exits = new HashMap<String, Room>();

    public Room() {
    }

    public Room(String description) {
        this.description = description;
    }

    public Room getExit(String direction){
        return exits.get(direction);
    }

    public void setExits(String dir, Room room){
        exits.put(dir, room);
    }

    public String toString(){
        return description;
    }

    public String getExitDesc(){
        StringBuffer sb = new StringBuffer();
        for(String dir : exits.keySet()){
            sb.append(dir);
            sb.append(' ');
        }
        return sb.toString();
    }





}
