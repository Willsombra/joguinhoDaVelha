/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Willian
 */
public class Jogo extends JFrame{

    JButton cor;
    JButton [] Botoes;
    JPanel Paineljogo;
    int vezJogador;
    String simbolo;
    
    public Jogo() {
        super("Jogo da velha");
        ((JComponent)getContentPane()).setBorder(new EmptyBorder(5,5,5,5));
    
        Paineljogo = new JPanel();
        Paineljogo.setLayout(new GridLayout(3,3,10,10));
        cor= new JButton("");
        
        Botoes= new JButton[9];
        
        for(int i =0; i<9; i++){
            Botoes[i]= new JButton("");
        }
        
        Botoes[0].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(0);
            }
        });
        Paineljogo.add(Botoes[0]);
        
        Botoes[1].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(1);
            }
        });
        Paineljogo.add(Botoes[1]);
        
        Botoes[2].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(2);
            }
        });
        Paineljogo.add(Botoes[2]);
        
        Botoes[3].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(3);
            }
        });
        Paineljogo.add(Botoes[3]);
        
        Botoes[4].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(4);
            }
        });
        Paineljogo.add(Botoes[4]);
        
        Botoes[5].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(5);
            }
        });
        Paineljogo.add(Botoes[5]);
        
        Botoes[6].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(6);
            }
        });
        Paineljogo.add(Botoes[6]);
        
        Botoes[7].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(7);
            }
        });
        Paineljogo.add(Botoes[7]);
        
        Botoes[8].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(8);
            }
        });
        Paineljogo.add(Botoes[8]);
        
         Botoes[8].setFont(new Font("Calibri", Font.BOLD, 70));
        Botoes[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(8);
            }
        });
        
        add(Paineljogo);
        setLocation(470,200);
        setSize(400,400);
        setVisible(true);
        
    }
    
    public void jogada(int simbol){
        Boolean vencedor= false;
        if(vezJogador ==0){
            simbolo="X";
            vezJogador=1;
        }else{
            simbolo="O";
            vezJogador=0;
        }
        Botoes[simbol].setText(simbolo);
        Botoes[simbol].setEnabled(false);
        //JOptionPane.showMessageDialog(null, Botoes[simbol].getText());
        
        //---------------------- VERIFICAÇÃO X 
        if("X".equals(Botoes[0].getText()) && "X".equals(Botoes[1].getText()) && "X".equals(Botoes[2].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("X".equals(Botoes[3].getText()) && "X".equals(Botoes[4].getText()) && "X".equals(Botoes[5].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("X".equals(Botoes[6].getText()) && "X".equals(Botoes[7].getText()) && "X".equals(Botoes[8].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("X".equals(Botoes[0].getText()) && "X".equals(Botoes[3].getText()) && "X".equals(Botoes[6].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("X".equals(Botoes[1].getText()) && "X".equals(Botoes[4].getText()) && "X".equals(Botoes[7].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("X".equals(Botoes[2].getText()) && "X".equals(Botoes[5].getText()) && "X".equals(Botoes[8].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("X".equals(Botoes[0].getText()) && "X".equals(Botoes[4].getText()) && "X".equals(Botoes[8].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("X".equals(Botoes[2].getText()) && "X".equals(Botoes[4].getText()) && "X".equals(Botoes[6].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        
        //==========================================VERIFICAÇÃO O
        if("O".equals(Botoes[0].getText()) && "O".equals(Botoes[1].getText()) && "O".equals(Botoes[2].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("O".equals(Botoes[3].getText()) && "O".equals(Botoes[4].getText()) && "O".equals(Botoes[5].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("O".equals(Botoes[6].getText()) && "O".equals(Botoes[7].getText()) && "O".equals(Botoes[8].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("O".equals(Botoes[0].getText()) && "O".equals(Botoes[3].getText()) && "O".equals(Botoes[6].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("O".equals(Botoes[1].getText()) && "O".equals(Botoes[4].getText()) && "O".equals(Botoes[7].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("O".equals(Botoes[2].getText()) && "O".equals(Botoes[5].getText()) && "O".equals(Botoes[8].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("O".equals(Botoes[0].getText()) && "O".equals(Botoes[4].getText()) && "O".equals(Botoes[8].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        if("O".equals(Botoes[2].getText()) && "O".equals(Botoes[4].getText()) && "O".equals(Botoes[6].getText())){
            JOptionPane.showMessageDialog(null, "vencedor eh o jogador "+ vezJogador);
            vencedor=true;
        }
        
        
        if(vencedor== true){
            for(int i =0; i<9; i++){
            Botoes[i].setText("");
            }
        }
        
        
    }
    
    public void vencedor(){
        //if(Botoes[0].getText() && Botoes[1]getText() && Botoes[2]getText()="X"){
          int simbol;
          
          
        //}
    }
    
    
}
