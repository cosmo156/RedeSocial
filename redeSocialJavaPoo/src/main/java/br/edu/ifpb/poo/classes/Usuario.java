package br.edu.ifpb.poo.classes;


import java.util.ArrayList;
import java.util.List;

// Classe para representar um usuário da rede social
public class Usuario {
    // Atributos do usuário
    private String nome;
    private String senha;
    private List<Postagem> postagens; // Lista de postagens do usuário

    // Construtor do usuário
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.postagens = new ArrayList<>(); // Inicializa a lista de postagens vazia
    }

    // Métodos getters e setters dos atributos
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public List<Postagem> getPostagens() {
        return this.postagens;
    }

    // Método para fazer uma postagem na rede social
    public void fazerPostagem(String texto) {
        Postagem postagem = new Postagem(this, texto); // Cria uma nova postagem com o usuário, o texto e os usuários marcados
        this.postagens.add(postagem); // Adiciona a postagem à lista de postagens do usuário

    }
}
