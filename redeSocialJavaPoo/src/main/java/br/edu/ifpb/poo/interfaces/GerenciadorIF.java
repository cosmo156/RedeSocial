package br.edu.ifpb.poo.interfaces;

import br.edu.ifpb.poo.classes.Usuario;

public interface GerenciadorIF {
    void cadastrarUsuario();
    Usuario buscarUsuario();

    Usuario autenticarUsuario();
}
