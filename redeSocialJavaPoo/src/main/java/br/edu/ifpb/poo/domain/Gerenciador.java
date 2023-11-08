package br.edu.ifpb.poo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Gerenciador implements Serializable {

    private List<Usuario> usuarios;

    public Gerenciador() {
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(String nome, String senha) {
        Usuario usuario = new Usuario(nome, senha);
        this.usuarios.add(usuario);
        System.out.println("Usuário " + nome + " cadastrado com sucesso!");
    }

    public Usuario logarUsuario(String nome, String senha) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
                System.out.println("Usuario logado com sucesso!");
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado!");
        return null;
    }

    public Usuario getUsuario(String nome){
        for (Usuario usuario: this.usuarios){
            if (usuario.getNome().equals(nome)){
                System.out.println("Usuário " + usuario.getNome() + " encontardo com sucesso!");
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }

}
