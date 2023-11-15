package br.edu.ifpb.poo.domain;

import java.io.Serializable;

public class Comentario implements Serializable {
    // Atributos do comentário
    private String texto;

    public Comentario(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public String toString() {
        return this.texto;
    }
}
