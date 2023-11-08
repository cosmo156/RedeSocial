package br.edu.ifpb.poo.interfaces;

import br.edu.ifpb.poo.domain.Comentario;

import java.util.List;

public interface PostagemIF {


    String getTexto();
    int getCurtidas();
    void curtir();
    void removerCurtida();
    List<Comentario> getComentarios();
    void adicionarComentario(String comentario);

}
