/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JFrame;




/**
 *
 * @author Rodrigo
 */
public class Main extends JFrame {

    JFrame janela;

    public static void main(String[] args) {

        JanelaCalculadora view = new JanelaCalculadora();
        JFrame janela = new JFrame();

        janela.setTitle("Minha Calculadora");
        janela.setSize(430, 500);

        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.add(view);
        janela.setVisible(true);

        CalculadoraController ctl = new CalculadoraController(view);

    }
}
