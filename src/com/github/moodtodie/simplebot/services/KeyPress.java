package com.github.moodtodie.simplebot.services;

import java.awt.*;
import java.util.ArrayList;

public class KeyPress extends Thread{

    private int cooldown;
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private Robot robot;

    public KeyPress(){
        try {
            robot = new Robot(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice());
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void setCooldown(int cooldown){
        this.cooldown = cooldown;
    }

    public void addCode(int code){
        list.add(code);
    }

    public void removeCode(int code){
        int index = list.indexOf(code);
        list.remove(index);
    }

//    private boolean healthCheck(){
//        if (list.size() > 0){
//            return true;
//        } else return false;
//    }

    private boolean healthCheck(ArrayList<Integer> list){
        return (list.size() > 0) ? true : false;

//        if (list.size() > 0){
//            return true;
//        }
//        return false;
    }

    //healthCheck(aList)

    @Override
    public void run() {
        while (true){
            ArrayList<Integer> aList = list;
            for (int code : aList){
                robot.keyPress(aList.get(code));
                robot.delay(cooldown);
                robot.keyRelease(aList.get(code));
                robot.delay(cooldown);
            }
        }
    }
}
