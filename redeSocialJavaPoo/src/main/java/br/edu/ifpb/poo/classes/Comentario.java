package br.edu.ifpb.poo.classes;

import br.edu.ifpb.poo.interfaces.ComentarioIF;

// Classe para representar um comentário na rede social
public class Comentario implements ComentarioIF {
    // Atributos do comentário
    private Usuario autor; // Usuário que fez o comentário
    private String texto; // Texto do comentário

    public Comentario(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    @Override
    public Usuario getAutor() {
        return autor;
    }

    @Override
    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
