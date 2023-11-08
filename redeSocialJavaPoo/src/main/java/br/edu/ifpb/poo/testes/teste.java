package br.edu.ifpb.poo.testes;

import br.edu.ifpb.poo.domain.*;

import java.io.*;

public class teste {

    public static void main(String[] args) {
        Gerenciador adm = new Gerenciador();
        adm.cadastrarUsuario("user", "123");
        Usuario user = adm.getUsuario("user");

        user.fazerPostagem("Hello World!");
        Postagem postagem = user.getPostagens().get(0);
        postagem.adicionarComentario("Legal");
        postagem.curtir();

        try (FileOutputStream arquivo = new FileOutputStream("pessoa.ser");
             ObjectOutputStream out = new ObjectOutputStream(arquivo)) {
            out.writeObject(user);
            System.out.println("Objeto serializado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Desserializar o objeto
        try (FileInputStream arquivo = new FileInputStream("pessoa.ser");
             ObjectInputStream in = new ObjectInputStream(arquivo)) {
            Usuario UsuarioDesserializada = (Usuario) in.readObject();
            System.out.println("Objeto desserializado: " + UsuarioDesserializada.getNome() + ", " + UsuarioDesserializada.getSenha());
            System.out.println(UsuarioDesserializada.getPostagens());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
