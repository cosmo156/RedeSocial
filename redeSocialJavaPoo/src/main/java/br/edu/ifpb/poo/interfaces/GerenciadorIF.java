package br.edu.ifpb.poo.interfaces;

import br.edu.ifpb.poo.domain.Usuario;
import java.util.List;

public interface GerenciadorIF {
    void cadastrarUsuario(String nome, String senha);
    Usuario logarUsuario(String nome, String senha);
    Usuario getUsuario(String nome);
    List<Usuario> getUsuarios();

}
