package com.github.moodtodie.simplebot.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Display extends JFrame {

    private Dimension keyCommonSize = new Dimension(53,54);     //  Win
    private Dimension keySmallSize = new Dimension(53,32);      //  Esc
    private Dimension keyMediumSize = new Dimension(79,54);     //  Tab & Ctrl & Atl & \
    private Dimension capsLockKeySize = new Dimension(92,54);
    private Dimension shiftKeySize = new Dimension(118,54);     //  Enter
    private Dimension shiftRightKeySize = new Dimension(114,54);
    private Dimension spaceKeySize = new Dimension(313,54);
    private Dimension backspaceKeySize = new Dimension(105,54);

    private int[][] coordinatesLine1 = {{0,131,183,235,287,352,404,456,508,573,625,677,729},   //  781 - Normal keyboard
                                        {0}};       //  Line 1 -> 15px -> Line 2
    private int[][] coordinatesLine2 = {{0,52},
            {46}};
    private int[][] coordinatesLine3 = {{0,79},
            {99}};
    private int[][] coordinatesLine4 = {{0,52},
            {152}};
    private int[][] coordinatesLine5 = {{0,52},
            {205}};
    private int[][] coordinatesLine6 = {{0,52},
            {258}};

    private Color btnEnable = Color.green;
    private Color btnDisable = Color.red;
    private Color btnBlocked = Color.gray;
    private Font font = new Font("Arial", Font.BOLD,14);


    private Dimension screenCenter;
    private Dimension windowSize = new Dimension(1201, 315);

    private Display d = this;

    private ArrayList<Integer> activatedButtonsList = new ArrayList<>();
    private ArrayList<Integer> blockedButtonsList = new ArrayList<>();

    public Display(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //  Screen Settings
        setSize(windowSize);
        setResizable(false);
        screenCenter = getScreenCenterLocation(windowSize);
        setLocation((int) screenCenter.getWidth(),(int) screenCenter.getHeight());

            //  Visual Settings
        setVisible(true);
        setTitle("Simple Bot v3.0");
        setIconImage(new ImageIcon("res/icon.png").getImage());
    }

    public void displayCreator(){
        panelCreater();
    }

    private void panelCreater(){
        JPanel mainPanel = new JPanel();
//        JPanel line1 = new JPanel();
//        JPanel line2 = new JPanel();
//        JPanel line3 = new JPanel();
//        JPanel line4 = new JPanel();
//        JPanel line5 = new JPanel();
//        JPanel line6 = new JPanel();
//
//        JPanel additionalPanel = new JPanel();
//        JPanel additionalBlock1 = new JPanel();
//        JPanel additionalBlock2 = new JPanel();
//        JPanel arrowsBlock = new JPanel();
//        JPanel numBlock = new JPanel();

        d.add(mainPanel);
        mainPanel.setSize(windowSize);

//        mainPanel.add(line1);
//        line1.setLocation(0,0);
//        mainPanel.add(line2);
//        line1.setLocation(0,46);
//        mainPanel.add(line3);
//        mainPanel.add(line4);
//        mainPanel.add(line5);
//        mainPanel.add(line6);
//
//        line2.setLocation(0,0);
//        line3.setLocation(0,0);
//        line4.setLocation(0,0);
//        line5.setLocation(0,0);
//        line6.setLocation(0,0);
//
//        d.add(additionalPanel);
        //  additionalPanel blocks ...
    }

    private void keyboardCreator(){
        for (;true;){
//            createKey();
        }
    }

    private void buttonPressed(JButton button){
        int code = Integer.getInteger(button.getName());
    }

    private void createKey(String symbol,Font font , int keycode, int x, int y, Dimension keySize, JPanel line){
        JButton button = new JButton();
        line.add(button);
        button.setSize(keySize);
        button.setLocation(x,y);
        button.setFont(font);
        button.setText(symbol);
        button.setName(Integer.toString(keycode));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonPressed(button);
            }
        });
    }

    private Dimension getScreenCenterLocation(Dimension windowSize){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        screenHeight -= windowSize.height;
        screenHeight /= 2;

        screenWidth -= windowSize.width;
        screenWidth /= 2;

        return new Dimension(screenWidth , screenHeight);
    }
}
