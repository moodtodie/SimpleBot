package com.github.moodtodie.simplebot;

import java.awt.*;

public class Test {
    public void showAllFonts(){
        int i = 0;
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String s : fonts){
            System.out.println(++i + ". " + s);
        }
    }
}
