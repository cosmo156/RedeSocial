package br.edu.ifpb.poo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Postagem implements Serializable {
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


    public void adicionarComentario(String comentario) {
        Comentario comentario1 = new Comentario(this.autor, comentario);
        this.comentarios.add(comentario1);
    }

    public String toString() {
        return this.texto;
    }
}
