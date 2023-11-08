package br.edu.ifpb.poo.interfaces;

import br.edu.ifpb.poo.domain.Postagem;

import java.util.List;

public interface UsuarioIF {
    String getNome();
    String getSenha();
    List<Postagem> getPostagens();
    void fazerPostagem(String texto);
}
