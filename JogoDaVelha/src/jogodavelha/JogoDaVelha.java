/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class JogoDaVelha extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogo tela= new Jogo();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        
        
        
    }
    
}
