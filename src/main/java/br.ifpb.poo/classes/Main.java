package br.ifpb.poo.classes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Cria o gerenciador de usuários
        GerenciadorUsuarios gerenciador = new GerenciadorUsuarios();

        // Adiciona alguns usuários
        gerenciador.adicionarUsuario("João");
        gerenciador.adicionarUsuario("Maria");

        // Seleciona um usuário e faz uma postagem
        Usuario joao = gerenciador.selecionarUsuario("João");
        joao.postar("Olá, mundo!");

        // Seleciona outro usuário e interage com a postagem
        Usuario maria = gerenciador.selecionarUsuario("Maria");
        Postagem postagem = joao.postagens().get(0);
        postagem.curtir();
        postagem.comentar(maria, "Olá, João!");

        // Imprime as informações da postagem
        System.out.println("Postagem: " + postagem.getMensagem());
        System.out.println("Curtidas: " + postagem.getCurtidas());
        System.out.println("Primeiro comentário: " + postagem.getComentarios().get(0).mensagem);
    }
}