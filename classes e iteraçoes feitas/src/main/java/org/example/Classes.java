package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Classe para gerenciar os usuários e as interações na rede social
class Gerenciador {
    // Atributo para armazenar os usuários cadastrados na rede social
    private List<Usuario> usuarios;

    // Construtor do gerenciador
    public Gerenciador() {
        this.usuarios = new ArrayList<>(); // Inicializa a lista de usuários vazia
    }

    // Método para cadastrar um novo usuário na rede social
    public void cadastrarUsuario(String nome, String email, String senha) {
        Usuario usuario = new Usuario(nome, email, senha); // Cria um novo usuário com os dados informados
        this.usuarios.add(usuario); // Adiciona o usuário à lista de usuários cadastrados
        System.out.println("Usuário " + nome + " cadastrado com sucesso!"); // Imprime uma mensagem de confirmação
    }

    // Método para buscar um usuário na rede social pelo nome
    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : this.usuarios) { // Percorre a lista de usuários cadastrados
            if (usuario.getNome().equals(nome)) { // Verifica se o nome do usuário é igual ao nome informado
                return usuario; // Retorna o usuário encontrado
            }
        }
        return null; // Retorna null se não encontrar nenhum usuário com o nome informado
    }

    // Método para autenticar um usuário na rede social pelo email e senha
    public Usuario autenticarUsuario(String email, String senha) {
        for (Usuario usuario : this.usuarios) { // Percorre a lista de usuários cadastrados
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) { // Verifica se o email e a senha do usuário são iguais aos informados
                return usuario; // Retorna o usuário autenticado
            }
        }
        return null; // Retorna null se não encontrar nenhum usuário com o email e senha informados
    }

}
