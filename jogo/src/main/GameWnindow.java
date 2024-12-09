package main;

import javax.swing.*;

public class GameWnindow {
    private JFrame jframe;

    public GameWnindow(GamePanel gamePanel) {
        jframe = new JFrame();

        jframe.setSize(800, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setVisible(true);
    }

}
