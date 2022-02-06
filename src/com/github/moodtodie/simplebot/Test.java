package com.github.moodtodie.simplebot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Test implements KeyListener {

    private ArrayList<Integer> keyCode = new ArrayList<>();
    private ArrayList<Character> keyChar = new ArrayList<>();

    public void aboutPressedKeys(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(300,100,160,120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);

        System.out.println("{KeyCode}\t{KeyChar}\t{KeyLocation}\t{ExtendedKeyCode}");
//        System.out.println("Key char: " + keyChar);
//        System.out.println("Key code: " + keyCode);
    }

    public void showAllFonts(){
        int i = 0;
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String s : fonts){
            System.out.println(++i + ". " + s);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("createKey(\"" + e.getKeyChar() + "\", " + e.getKeyCode() + ", keyCommonSize, line6);");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
