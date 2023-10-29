package br.edu.ifpb.poo.classes;

import br.edu.ifpb.poo.interfaces.PostagemIF;

import java.util.ArrayList;
import java.util.List;

// Classe para representar uma postagem na rede social
public class Postagem implements PostagemIF {
    // Atributos da postagem
    private Usuario autor; // Usuário que fez a postagem
    private String texto; // Texto da postagem
    private Curtida curtidas; // Número de curtidas de uma postagem
    private List<Comentario> comentarios; // Lista de comentários da postagem

    // Construtor da postagem
    public Postagem(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
        this.curtidas = new Curtida();
        this.comentarios = new ArrayList<>(); // Inicializa a lista de comentários vazia
    }
    @Override
    public String getTexto(){
        return this.texto;
    }

    @Override
    public int getCurtidas() {
        return curtidas.getNumeroCurtidas();
    }

    @Override
    public void curtir() {
        this.curtidas.curtir();
    }

    @Override
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    // Método para remover uma curtida da postagem
    @Override
    public void removerCurtida() {
       this.curtidas.descurtir();
    }

    // Método para adicionar um comentário à postagem
    @Override
    public void adicionarComentario(String comentario) {
        Comentario comentario1 = new Comentario(this.autor, comentario);
        this.comentarios.add(comentario1); // Adiciona o comentário à lista de comentários
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
