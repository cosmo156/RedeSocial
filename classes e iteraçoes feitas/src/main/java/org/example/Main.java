package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Classe principal para testar a rede social textual simples em Java
public class Main {

    public static void main(String[] args) {

        Gerenciador gerenciador = new Gerenciador(); // Cria um novo gerenciador da rede social

        gerenciador.cadastrarUsuario("Zezinho", "zezinho@gmail.com", "123456"); // Cadastra o usuário Zezinho na rede social
        gerenciador.cadastrarUsuario("Luizinho", "luizinho@gmail.com", "654321"); // Cadastra o usuário Luizinho na rede social
        gerenciador.cadastrarUsuario("Huguinho", "huguinho@gmail.com", "789012"); // Cadastra o usuário Huguinho na rede social

        Usuario zezinho = gerenciador.buscarUsuario("Zezinho"); // Busca o usuário Zezinho na rede social
        Usuario luizinho = gerenciador.buscarUsuario("Luizinho"); // Busca o usuário Luizinho na rede social
        Usuario huguinho = gerenciador.buscarUsuario("Huguinho"); // Busca o usuário Huguinho na rede social



        zezinho.fazerPostagem("Olá, amigos! Estou testando a rede social textual simples em Java!"); // Zezinho faz uma postagem marcando Luizinho e Huguinho

        Postagem postagem = zezinho.getPostagens().get(0); // Obtém a primeira postagem de Zezinho

        luizinho.adicionarCurtida(postagem); // Luizinho curte a postagem de Zezinho
        huguinho.adicionarCurtida(postagem); // Huguinho curte a postagem de Zezinho

        Comentario comentario1 = new Comentario(luizinho, "Que legal, Zezinho! Parabéns pelo teste!"); // Cria um comentário de Luizinho para a postagem de Zezinho
        Comentario comentario2 = new Comentario(huguinho, "Muito bom, Zezinho! Ficou ótimo!"); // Cria um comentário de Huguinho para a postagem de Zezinho

        postagem.adicionarComentario(comentario1); // Adiciona o comentário de Luizinho à postagem de Zezinho
        postagem.adicionarComentario(comentario2); // Adiciona o comentário de Huguinho à postagem de Zezinho

        System.out.println("Autor da postagem: " + postagem.getAutor().getNome()); // Imprime o nome do autor da postagem
        System.out.println("Texto da postagem: " + postagem.getTexto()); // Imprime o texto da postagem
        System.out.println("Usuários marcados na postagem: "); // Imprime os usuários marcados na postagem

        System.out.println("Número de curtidas na postagem: " + postagem.getCurtidas()); // Imprime o número de curtidas na postagem
        System.out.println("Comentários da postagem: "); // Imprime os comentários da postagem
        for (Comentario comentario : postagem.getComentarios()) { // Percorre a lista de comentários da postagem
            System.out.println(comentario.getAutor().getNome() + ": " + comentario.getTexto()); // Imprime o nome do autor e o texto do comentário
        }

    }
}
