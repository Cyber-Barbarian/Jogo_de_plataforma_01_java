package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{
       public GamePanel() {
    }

    public void paintComponent(Graphics g) {
           super.paintComponent(g);
        // Definindo a cor do círculo
        g.setColor(Color.BLUE);
        // Desenhando o círculo (x, y, largura, altura)
        g.drawOval(50, 50, 100, 100);//vazio

        g.setColor(Color.RED);
        //retângulo
        g.fillRect(25,150,300,50);//cheio
    }
}
