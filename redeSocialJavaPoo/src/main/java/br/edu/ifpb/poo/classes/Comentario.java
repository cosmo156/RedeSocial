package br.edu.ifpb.poo.classes;

// Classe para representar um comentário na rede social
public class Comentario {
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

    @Override
    public String toString() {
        return this.texto;
    }
}
