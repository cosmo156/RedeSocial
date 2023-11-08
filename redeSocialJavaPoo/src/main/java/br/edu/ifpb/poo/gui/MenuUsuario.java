package br.edu.ifpb.poo.gui;

import br.edu.ifpb.poo.domain.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUsuario {
    public MenuUsuario(Usuario user){
        JFrame mainFrame = new JFrame(" Bem-vindo " + user);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setSize(400, 200);
        mainFrame.setLayout(new FlowLayout());

        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        JButton criarPostagemButton = new JButton("Criar Postagem");
        JButton interagirPostagensButton = new JButton("Interagir com Outras Postagens");
        JLabel minhaspostagensLabel = new JLabel("Minhas Postagens: ");
        JPanel jPanel = new JPanel();

        for (Postagem postagem: user.getPostagens()){
            defaultListModel.addElement(postagem.getTexto());
        }

        JList<String> jList = new JList<>(defaultListModel);
        JScrollPane scrollPane = new JScrollPane(jList);
        criarPostagemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente a lógica para criar uma postagem aqui
                new FormCriarPostagem(user);
            }
        });


        interagirPostagensButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente a lógica para interagir com outras postagens aqui
                JOptionPane.showMessageDialog(null, "Opção 'Interagir com Outras Postagens' selecionada");
            }
        });
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(criarPostagemButton);
        jPanel.add(interagirPostagensButton);
        jPanel.add(minhaspostagensLabel);
        jPanel.add(jList);
        mainFrame.add(jPanel);
        mainFrame.setVisible(true);
    }
}
