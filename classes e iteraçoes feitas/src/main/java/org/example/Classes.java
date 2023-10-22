package org.example;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    String nome;
    List<Postagem> postagens;

    public Usuario(String nome) {
        this.nome = nome;
        this.postagens = new ArrayList<>();
    }

    void postar(String mensagem) {
        this.postagens.add(new Postagem(this, mensagem));
    }
}

class Postagem {
    Usuario autor;
    String mensagem;
    List<Comentario> comentarios;
    int curtidas;

    public Postagem(Usuario autor, String mensagem) {
        this.autor = autor;
        this.mensagem = mensagem;
        this.comentarios = new ArrayList<>();
        this.curtidas = 0;
    }

    void curtir() {
        this.curtidas++;
    }

    void comentar(Usuario usuario, String mensagem) {
        this.comentarios.add(new Comentario(usuario, mensagem));
    }
}

class Comentario {
    Usuario autor;
    String mensagem;

    public Comentario(Usuario autor, String mensagem) {
        this.autor = autor;
        this.mensagem = mensagem;
    }
}

class GerenciadorUsuarios {
    List<Usuario> usuarios;

    public GerenciadorUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    void adicionarUsuario(String nome) {
        this.usuarios.add(new Usuario(nome));
    }

    Usuario selecionarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.nome.equals(nome)) {
                return usuario;
            }
        }
        return null;
    }
}
