package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe para representar um usuário da rede social
public class Usuario {
    // Atributos do usuário
    private String nome;
    private String email;
    private String senha;
    private List<Usuario> amigos; // Lista de amigos do usuário
    private List<Postagem> postagens; // Lista de postagens do usuário

    // Construtor do usuário
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.amigos = new ArrayList<>(); // Inicializa a lista de amigos vazia
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

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    public void setPostagens(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    // Método para adicionar um amigo à lista de amigos do usuário
    public void adicionarAmigo(Usuario amigo) {
        if (!this.amigos.contains(amigo)) { // Verifica se o amigo já não está na lista
            this.amigos.add(amigo); // Adiciona o amigo à lista
            amigo.adicionarAmigo(this); // Adiciona o usuário à lista de amigos do amigo
        }
    }

    // Método para remover um amigo da lista de amigos do usuário
    public void removerAmigo(Usuario amigo) {
        if (this.amigos.contains(amigo)) { // Verifica se o amigo está na lista
            this.amigos.remove(amigo); // Remove o amigo da lista
            amigo.removerAmigo(this); // Remove o usuário da lista de amigos do amigo
        }
    }

    // Método para fazer uma postagem na rede social
    public void fazerPostagem(String texto, List<Usuario> marcados) {
        Postagem postagem = new Postagem(this, texto, marcados); // Cria uma nova postagem com o usuário, o texto e os usuários marcados
        this.postagens.add(postagem); // Adiciona a postagem à lista de postagens do usuário
        for (Usuario marcado : marcados) { // Para cada usuário marcado na postagem
            marcado.getPostagens().add(postagem); // Adiciona a postagem à lista de postagens do usuário marcado
        }
    }

    public void adicionarCurtida(Postagem postagem) {
    }
}
