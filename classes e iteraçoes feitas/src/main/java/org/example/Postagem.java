package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe para representar uma postagem na rede social
public class Postagem {
    // Atributos da postagem
    private Usuario autor; // Usuário que fez a postagem
    private String texto; // Texto da postagem

    private int curtidas; // Lista de usuários que curtiram a postagem
    private List<Comentario> comentarios; // Lista de comentários da postagem

    // Construtor da postagem
    public Postagem(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
        this.curtidas = 0; // Inicializa a lista de curtidas vazia
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




    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        this.curtidas ++;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    // Método para remover uma curtida da postagem
    public void removerCurtida(Usuario usuario) {
       this.curtidas --;
    }

    // Método para adicionar um comentário à postagem
    public void adicionarComentario(Comentario comentario) {
        this.comentarios.add(comentario); // Adiciona o comentário à lista de comentários
    }

}
