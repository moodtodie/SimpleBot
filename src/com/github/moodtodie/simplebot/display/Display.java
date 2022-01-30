package com.github.moodtodie.simplebot.display;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

//    private int keyCommonSize[] = {53,54};        //  Win
    private Dimension keyCommonSize = new Dimension(53,54);
//    private int keySmallSize[] = {53,32};   //  Esc
    private Dimension keySmallSize = new Dimension(53,32);
//    private int keyMediumSize[] = {79,54};  //  Tab & Ctrl & Atl & \
    private Dimension keyMediumSize = new Dimension(79,54);
//    private int capsLockKeySize[] = {92,54};
    private Dimension capsLockKeySize = new Dimension(92,54);
//    private int shiftKeySize[] = {118,54};  //  Enter
    private Dimension shiftKeySize = new Dimension(118,54);
//    private int shiftRightKeySize[] = {114,54};
    private Dimension shiftRightKeySize = new Dimension(114,54);
//    private int spaceKeySize[] = {313,54};
    private Dimension spaceKeySize = new Dimension(313,54);
//    private int backspaceKeySize[] = {105,54};
    private Dimension backspaceKeySize = new Dimension(105,54);

    private Color btnEnable = Color.green;
    private Color btnDisable = Color.red;
    private Color btnLocked = Color.gray;
    private Font font = new Font("Arial", Font.BOLD,14);


    private Dimension screenCenter;
    private Dimension windowSize = new Dimension(1201, 315);

    private JPanel panel = new JPanel();

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
        Display d = this;
        d.add(panel);
        panel.setSize(windowSize);
        panel.setBackground(btnEnable);
    }

    private void keypadCreator(){

    }

    private void createKey(String name, int code, int x, int y, Dimension keySize){

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
