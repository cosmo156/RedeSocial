package br.edu.ifpb.poo.domain;

import java.io.Serializable;

public class Comentario implements Serializable {
    // Atributos do comentário
    private Usuario autor;
    private String texto;

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
