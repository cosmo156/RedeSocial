package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe para representar um usuário da rede social
public class Usuario {
    // Atributos do usuário
    private String nome;
    private String email;
    private String senha;

    private List<Postagem> postagens; // Lista de postagens do usuário

    // Construtor do usuário
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.postagens = new ArrayList<>(); // Inicializa a lista de postagens vazia
    }

    // Métodos getters e setters dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    public void setPostagens(List<Postagem> postagens) {
        this.postagens = postagens;
    }
    // Método para fazer uma postagem na rede social
    public void fazerPostagem(String texto) {
        Postagem postagem = new Postagem(this, texto); // Cria uma nova postagem com o usuário, o texto e os usuários marcados
        this.postagens.add(postagem); // Adiciona a postagem à lista de postagens do usuário

    }

    public void adicionarCurtida(Postagem postagem) {
        postagem.curtir();
    }
}
