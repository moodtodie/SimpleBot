package com.github.moodtodie.simplebot.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Display extends JFrame {

    private Dimension keyCommonSize = new Dimension(53,52);     //  Win
    private Dimension keySmallSize = new Dimension(53,30);      //  Esc
    private Dimension keyMediumSize = new Dimension(79,52);     //  Tab & Ctrl & Atl & \
    private Dimension capsLockKeySize = new Dimension(92,52);
    private Dimension keyHighSize = new Dimension(121,52);     //  L.Shift & Enter
    private Dimension shiftRightKeySize = new Dimension(147,52);
    private Dimension spaceKeySize = new Dimension(331,52);
    private Dimension backspaceKeySize = new Dimension(105,52);

    private Color btnEnable = new Color(0,217,0);
    private Color btnDisable = new Color(183,183,183);
    private Color btnBlocked = new Color(255,121,121);
    private Color btnText = new Color(255,255,255);
    private Color panelColor1 = new Color(206,255,0);
    private Color panelColor2 = new Color(15,192,252);
    private Color panelColor3 = new Color(0,128,128);
    private Font font = new Font("Arial", Font.BOLD,14);

    private Dimension screenCenter;
    private Dimension windowSize = new Dimension(1201, 347);

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
        panelCreator();
        keyboardCreator();
    }

//    private JPanel line1 = new JPanel();
    private JPanel line2 = new JPanel();
    private JPanel line3 = new JPanel();
    private JPanel line4 = new JPanel();
    private JPanel line5 = new JPanel();
    private JPanel line6 = new JPanel();

    private void buttonPressed(JButton button){
//        int code = Integer.getInteger(button.getName());
        if (button.getBackground() == btnEnable){
            button.setBackground(btnDisable);
        }else if (button.getBackground() == btnDisable){
            button.setBackground(btnEnable);
        }
        System.out.println("*click*");
    }

    private void panelCreator(){
//        d.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        d.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JPanel mainPanel = new JPanel();
        JPanel additionalPanel = new JPanel();

//        JPanel additionalBlock1 = new JPanel();
//        JPanel additionalBlock2 = new JPanel();
//        JPanel arrowsBlock = new JPanel();
//        JPanel numBlock = new JPanel();

        d.add(mainPanel);
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));

//        mainPanel.add(line1);
//        line1.setBackground(panelColor1);
//        line2.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));

        mainPanel.add(line2);
        line2.setBackground(panelColor2);
        line2.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));

        mainPanel.add(line3);
        line3.setBackground(panelColor1);
        line3.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));

        mainPanel.add(line4);
        line4.setBackground(panelColor2);
        line4.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));

        mainPanel.add(line5);
        line5.setBackground(panelColor1);
        line5.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));

        mainPanel.add(line6);
        line6.setBackground(panelColor2);
        line6.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));
//
        d.add(additionalPanel);
//        additionalPanel.setLayout();
        additionalPanel.setPreferredSize(new Dimension(30, windowSize.height));
        additionalPanel.setBackground(panelColor3);
        //  additionalPanel blocks ...
    }

    private void keyboardCreator(){
        //  Line 1

        //  Line 2
        createKey("~", 128, keyCommonSize, line2);
        createKey("1", 49, keyCommonSize, line2);
        createKey("2", 50, keyCommonSize, line2);
        createKey("3", 51, keyCommonSize, line2);
        createKey("4", 52, keyCommonSize, line2);
        createKey("5", 53, keyCommonSize, line2);
        createKey("6", 54, keyCommonSize, line2);
        createKey("7", 55, keyCommonSize, line2);
        createKey("8", 56, keyCommonSize, line2);
        createKey("9", 57, keyCommonSize, line2);
        createKey("0", 48, keyCommonSize, line2);
        createKey("-", 45, keyCommonSize, line2);
        createKey("=", 61, keyCommonSize, line2);
        createKey("Backspace", 8, backspaceKeySize, line2);

        //  Line 3
        createKey("Tab", 192, keyMediumSize, line3);
        createKey("Q", 81, keyCommonSize, line3);
        createKey("W", 87, keyCommonSize, line3);
        createKey("E", 69, keyCommonSize, line3);
        createKey("R", 82, keyCommonSize, line3);
        createKey("T", 84, keyCommonSize, line3);
        createKey("Y", 89, keyCommonSize, line3);
        createKey("U", 85, keyCommonSize, line3);
        createKey("I", 73, keyCommonSize, line3);
        createKey("O", 79, keyCommonSize, line3);
        createKey("P", 80, keyCommonSize, line3);
        createKey("[", 91, keyCommonSize, line3);
        createKey("]", 93, keyCommonSize, line3);
        createKey("\\", 92, keyMediumSize, line3);

        //  Line 4
        createKey("Caps Lock", 20, capsLockKeySize, line4);
        createKey("A", 65, keyCommonSize, line4);
        createKey("S", 83, keyCommonSize, line4);
        createKey("D", 68, keyCommonSize, line4);
        createKey("F", 70, keyCommonSize, line4);
        createKey("G", 71, keyCommonSize, line4);
        createKey("H", 72, keyCommonSize, line4);
        createKey("J", 74, keyCommonSize, line4);
        createKey("K", 75, keyCommonSize, line4);
        createKey("L", 76, keyCommonSize, line4);
        createKey(";", 59, keyCommonSize, line4);
        createKey("'", 129, keyCommonSize, line4);
        createKey("Enter", 10, keyHighSize, line4);

        // Line 5
        createKey("Shift", 16, keyHighSize, line5);
        createKey("Z", 90, keyCommonSize, line5);
        createKey("X", 88, keyCommonSize, line5);
        createKey("C", 67, keyCommonSize, line5);
        createKey("V", 86, keyCommonSize, line5);
        createKey("B", 66, keyCommonSize, line5);
        createKey("N", 78, keyCommonSize, line5);
        createKey("M", 77, keyCommonSize, line5);
        createKey(",", 44, keyCommonSize, line5);
        createKey(".", 46, keyCommonSize, line5);
        createKey("/", 47, keyCommonSize, line5);
        createKey("Shift", 16, shiftRightKeySize, line5);

        // Line 6
        createKey("Ctrl", 17, keyMediumSize, line6);
        createKey("Win", -1, keyCommonSize, line6);
        createKey("Alt", 18, keyMediumSize, line6);
        createKey("Space", 32, spaceKeySize, line6);
        createKey("Alt", 18, keyMediumSize, line6);
        createKey("Win", -1, keyCommonSize, line6);
        createKey("Menu", -1, keyCommonSize, line6);
        createKey("Ctrl", 17, keyMediumSize, line6);
    }

    private void createKey(String symbol, int keycode, Dimension keySize, JPanel line){
        JButton button = new JButton();
        line.add(button);

        button.setForeground(btnText);
        button.setBackground(btnDisable);
        button.setFont(font);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        if (keycode < 0){
            button.setBackground(btnBlocked);
            button.setEnabled(false);
        }

        button.setPreferredSize(keySize);
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
