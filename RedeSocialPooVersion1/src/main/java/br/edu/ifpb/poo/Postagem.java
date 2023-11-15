package br.edu.ifpb.poo;

import java.util.ArrayList;
import java.util.List;


public class Postagem {
    // Atributos da postagem
    private Usuario autor;
    private String texto;
    private Curtida curtidas;
    private List<Comentario> comentarios;

    public Postagem(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
        this.curtidas = new Curtida();
        this.comentarios = new ArrayList<>();
    }

    public String getTexto(){
        return this.texto;
    }

    public int getCurtidas() {
        return curtidas.getNumeroCurtidas();
    }


    public void curtir() {
        this.curtidas.curtir();
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void removerCurtida() {
       this.curtidas.descurtir();
    }

    public Usuario getAutor() {
        return this.autor;
    }

    public void adicionarComentario(String comentario) {
        this.comentarios.add(new Comentario(this.autor, comentario));
    }

    public String toString() {
        return this.texto;
    }
}
