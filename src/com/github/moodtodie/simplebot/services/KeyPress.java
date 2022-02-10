package com.github.moodtodie.simplebot.services;

import java.awt.*;
import java.util.ArrayList;

public class KeyPress{

    private int cooldown;
    private ArrayList<Integer> list = new ArrayList<>();
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

    public void deleteCode(int code){
        int index = list.indexOf(code);
        list.remove(index);
    }

//    private boolean healthCheck(){
//        if (list.size() > 0){
//            return true;
//        } else return false;
//    }

    private boolean healthCheck(int code){
        try {
            int index = list.indexOf(code);

            return true;
        } catch (Exception e){
            return false;
        }
    }

    public void m(int code){
        while (healthCheck(code)){

        }
    }

//    @Override
//    public void run() {
//        while (healthCheck()){
//            for (int i = 1; i < list.size(); i++){
//                robot.keyPress(list.get(i));
//                robot.delay(cooldown);
//                robot.keyRelease(list.get(i));
//                robot.delay(cooldown);
//            }
//        }
//    }
}
