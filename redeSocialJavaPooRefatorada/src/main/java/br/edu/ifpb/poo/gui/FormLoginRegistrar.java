//package br.edu.ifpb.poo.gui;
//
//import br.edu.ifpb.poo.domain.*;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class FormLoginRegistrar {
//
//    public FormLoginRegistrar(){
//        Gerenciador adm = new Gerenciador();
//        JFrame frame = new JFrame("Login e Registro");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(270, 170);
//        frame.setLayout(new FlowLayout());
//
//        JLabel usernameLabel = new JLabel("Nome de Usuario:");
//        JTextField usernameField = new JTextField(20);
//
//        JLabel passwordLabel = new JLabel("Senha:");
//        JPasswordField passwordField = new JPasswordField(20);
//
//        JButton loginButton = new JButton("Login");
//        JButton registerButton = new JButton("Registrar");
//
//        frame.add(usernameLabel);
//        frame.add(usernameField);
//
//        frame.add(passwordLabel);
//        frame.add(passwordField);
//
//        frame.add(loginButton);
//        frame.add(registerButton);
//
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = usernameField.getText();
//                char[] password = passwordField.getPassword();
//                if (adm.getUsuarios().isEmpty()){
//                    JOptionPane.showMessageDialog(null, "Nenhum usuario cadastrado!");
//                }
//                else {
//                    Usuario user = adm.getUsuario(username);
//                    if (user != null){
//                        new MenuUsuario(user);
//                    }
//                    else {
//                        new MsgErrorGui("Usuario nao encontrado!");
//                    }
//                }
//            }
//        });
//        registerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = usernameField.getText();
//                char[] password = passwordField.getPassword();
//                // Implemente a lógica de registro do usuário aqui
//                if (username.isEmpty() || password.toString().isEmpty()){
//                   new MsgErrorGui("Os campos de Nome e senha nao podem ser vazios!");
//                }else {
//                    if (password.length <= 2|| username.length() <= 2){
//                        new MsgErrorGui("A senha e o nome deve conter pelo menos 3 caracteres!");
//                    }
//                    else {
//                        adm.cadastrarUsuario(username, new String(password));
//                        new SucessMsgGUI("O usuario " + username + " foi cadastrado com sucesso!");
//                    }
//                }
//            }
//        });
//        frame.setVisible(true);
//    }
//}
