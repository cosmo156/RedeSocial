package br.edu.ifpb.poo.interfaces;

import br.edu.ifpb.poo.classes.Postagem;

public interface UsuarioIF {
    void adicionarCurtida(Postagem postagem);
    void fazerPostagem(String texto);
}
