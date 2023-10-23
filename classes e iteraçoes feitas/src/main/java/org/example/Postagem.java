package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe para representar uma postagem na rede social
public class Postagem {
    // Atributos da postagem
    private Usuario autor; // Usuário que fez a postagem
    private String texto; // Texto da postagem
    private List<Usuario> marcados; // Lista de usuários marcados na postagem
    private List<Usuario> curtidas; // Lista de usuários que curtiram a postagem
    private List<Comentario> comentarios; // Lista de comentários da postagem

    // Construtor da postagem
    public Postagem(Usuario autor, String texto, List<Usuario> marcados) {
        this.autor = autor;
        this.texto = texto;
        this.marcados = marcados;
        this.curtidas = new ArrayList<>(); // Inicializa a lista de curtidas vazia
        this.comentarios = new ArrayList<>(); // Inicializa a lista de comentários vazia
    }

    // Métodos getters e setters dos atributos
    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Usuario> getMarcados() {
        return marcados;
    }

    public void setMarcados(List<Usuario> marcados) {
        this.marcados = marcados;
    }

    public List<Usuario> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(List<Usuario> curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    // Método para adicionar uma curtida à postagem
    public void adicionarCurtida(Usuario usuario) {
        if (!this.curtidas.contains(usuario)) { // Verifica se o usuário já não curtiu a postagem
            this.curtidas.add(usuario); // Adiciona o usuário à lista de curtidas
        }
    }

    // Método para remover uma curtida da postagem
    public void removerCurtida(Usuario usuario) {
        if (this.curtidas.contains(usuario)) { // Verifica se o usuário curtiu a postagem
            this.curtidas.remove(usuario); // Remove o usuário da lista de curtidas
        }
    }

    // Método para adicionar um comentário à postagem
    public void adicionarComentario(Comentario comentario) {
        this.comentarios.add(comentario); // Adiciona o comentário à lista de comentários
    }

}
