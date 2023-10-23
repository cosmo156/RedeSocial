package org.example;

// Classe para representar um comentário na rede social
public class Comentario {
    // Atributos do comentário
    private Usuario autor; // Usuário que fez o comentário
    private String texto; // Texto do comentário

    // Construtor do comentário
    public Comentario(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
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
}
