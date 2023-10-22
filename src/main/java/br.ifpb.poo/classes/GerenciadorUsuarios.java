package br.ifpb.poo.classes;


import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    List<Usuario> usuarios;

    public GerenciadorUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(String nome) {
        this.usuarios.add(new Usuario(nome));
    }

    public Usuario selecionarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }
        return null;
    }
}
