package br.edu.ifpb.poo;


import java.util.ArrayList;
import java.util.List;


public class Usuario {

    private String nome;
    private String senha;
    private List<Postagem> postagens;

    // Construtor do usuário
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.postagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Postagem> getPostagens() {
        return this.postagens;
    }
    public void fazerPostagem(String texto) {
        Postagem postagem = new Postagem(this, texto);
        this.postagens.add(postagem);
        System.out.println("Postagem criada com sucesso!");
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
