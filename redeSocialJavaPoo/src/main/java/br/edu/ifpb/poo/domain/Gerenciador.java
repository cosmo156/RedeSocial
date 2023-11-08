package br.edu.ifpb.poo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Classe para gerenciar os usuários e as interações na rede social
public class Gerenciador implements Serializable {
    // Atributo para armazenar os usuários cadastrados na rede social
    private List<Usuario> usuarios;

    // Construtor do gerenciador

    public Gerenciador() {
        this.usuarios = new ArrayList<>(); // Inicializa a lista de usuários vazia
    }

    // Método para cadastrar um novo usuário na rede social
    public void cadastrarUsuario(String nome, String senha) {
        Usuario usuario = new Usuario(nome, senha); // Cria um novo usuário com os dados informados
        this.usuarios.add(usuario); // Adiciona o usuário à lista de usuários cadastrados
        System.out.println("Usuário " + nome + " cadastrado com sucesso!"); // Imprime uma mensagem de confirmação
    }

    // Método para buscar um usuário na rede social pelo nome para logar
    public Usuario logarUsuario(String nome, String senha) {
        for (Usuario usuario : this.usuarios) { // Percorre a lista de usuários cadastrados
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) { // Verifica se o nome do usuário é igual ao nome informado
                System.out.println("Usuario logado com sucesso!");
                return usuario; // Retorna o usuário encontrado
            }
        }
        System.out.println("Usuário não encontrado!");
        return null;// Retorna null se não encontrar nenhum usuário com o nome informado
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
