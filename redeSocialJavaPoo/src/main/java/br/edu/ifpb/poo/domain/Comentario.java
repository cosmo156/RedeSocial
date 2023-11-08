package br.edu.ifpb.poo.domain;

import java.io.Serializable;

// Classe para representar um comentário na rede social
public class Comentario implements Serializable {
    // Atributos do comentário
    private Usuario autor; // Usuário que fez o comentário
    private String texto; // Texto do comentário

    public Comentario(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public Usuario getAutor() {
        return autor;
    }


    public String getTexto() {
        return texto;
    }

    public String toString() {
        return this.texto;
    }
}
