package view;

import java.awt.*;

import javax.swing.*;

public class TelaInicial {
    public static void main(String[] args) {
    JFrame janelaInicial = new JFrame();
    JPanel telaInicial = new JPanel();
    JButton botaoRegistrar = new JButton("REGISTRAR");
    JButton botaoConsltar = new JButton("CONSULTAR");

telaInicial.setLayout(new GridLayout(2, 1, 10, 10));
botaoRegistrar.setPreferredSize(new Dimension(300, 100));
botaoConsltar.setPreferredSize(new Dimension(300, 100));

botaoRegistrar.setBackground(Color.GREEN);
botaoRegistrar.setForeground(Color.BLACK);

telaInicial.add(botaoRegistrar);

botaoConsltar.setBackground(Color.RED);
botaoConsltar.setForeground(Color.BLACK);

telaInicial.add(botaoConsltar);

janelaInicial.add(telaInicial);

janelaInicial.setVisible(true);
    }

}
