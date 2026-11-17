
import javax.swing.*;

import java.awt.*;

public class TelaReino {
 public static void main(String[] args) {
    JFrame janelaReino = new JFrame();
    JPanel telaReino = new JPanel();
    JButton botaoAnimal = new JButton("ANIMAL");
    JButton botaoPlanta = new JButton("PLANTA");

    telaReino.setLayout(new GridLayout(2, 1, 10, 10));
    botaoAnimal.setPreferredSize(new Dimension(300, 100));
    botaoPlanta.setPreferredSize(new Dimension(300, 100));

    botaoAnimal.setBackground(Color.RED);
    botaoAnimal.setForeground(Color.BLACK);

    botaoPlanta.setBackground(Color.GREEN);
    botaoPlanta.setForeground(Color.BLACK);

    telaReino.add(botaoAnimal);
    telaReino.add(botaoPlanta);

    janelaReino.add(telaReino);

    janelaReino.setVisible(true);
 }
    
}