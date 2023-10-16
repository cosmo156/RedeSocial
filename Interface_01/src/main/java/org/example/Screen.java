package org.example;

import javax.swing.*;
/*
public class Screen {
    public Screen(){
        JFrame jFrame = new JFrame("Nome do app");//Instanceia a classe frame
        jFrame.setVisible(true);//altera a visibilidade da tela, por padrão é falso
        jFrame.setSize(800,500);//passa as dimensões originais da tela assim que abre
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//serve para parar de rodar o codigo quanso fecha a janela
        //jFrame.setResizable(false);// Impede o redimensionamento da janela
        jFrame.setLocationRelativeTo(null);// seta em qual local a janela vai abrir, no caso null é o centro da tela


    }
}
*/

//****   OUTRA FORMA DE CRIAR O APP (MAIS FACIL) ******
public class Screen extends JFrame {
    public Screen(){
        setTitle("Nome do app");//Passa o titulo para a tela
        setVisible(true);//altera a visibilidade da tela, por padrão é falso
        setSize(800,500);//passa as dimensões originais da tela assim que abre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//serve para parar de rodar o codigo quanso fecha a janela
        //setResizable(false);// Impede o redimensionamento da janela
        setLocationRelativeTo(null);// seta em qual local a janela vai abrir, no caso null é o centro da tela


    }
}
