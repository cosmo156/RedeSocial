package br.edu.ifpb.poo.gui;

import br.edu.ifpb.poo.domain.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCriarPostagem {
    private Usuario user;

    public FormCriarPostagem(Usuario user){
        this.user = user;
        JFrame criarPostagemFrame = new JFrame();
        JPanel criarPostPainel = new JPanel();
        criarPostagemFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        criarPostagemFrame.setSize(400, 200);
        criarPostagemFrame.setLayout(new FlowLayout());

        criarPostPainel.setLayout(new BoxLayout(criarPostPainel, BoxLayout.Y_AXIS));

        JButton criarPostButton = new JButton("Criar Postagem");
        JLabel conteudoPostLabel = new JLabel("Conteudo da postagem: ");
        JTextArea conteudoPostText = new JTextArea();

        criarPostPainel.add(conteudoPostLabel);
        criarPostPainel.add(Box.createVerticalStrut(10));
        criarPostPainel.add(conteudoPostText);
        criarPostPainel.add(Box.createVerticalStrut(10));
        criarPostPainel.add(criarPostButton);
        criarPostPainel.add(Box.createVerticalGlue());

        criarPostButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                user.fazerPostagem(conteudoPostText.getText());
                new SucessMsgGUI("Postagem criada com sucesso!");
            }
        });
        criarPostagemFrame.add(criarPostPainel);
        criarPostagemFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new FormCriarPostagem(new Usuario("teste", "12346"));
    }
}
