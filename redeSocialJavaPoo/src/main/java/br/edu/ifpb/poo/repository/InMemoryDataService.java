package br.edu.ifpb.poo.repository;

import br.edu.ifpb.poo.adpter.DataService;
import br.edu.ifpb.poo.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDataService implements DataService {
    protected List<Usuario> usuarios = new ArrayList<>();
    @Override
    public void add(Usuario user) {
        this.usuarios.add(user);
    }

    @Override
    public List<Usuario> getAllUser() {
        return this.usuarios;
    }

    @Override
    public void updateUser(Usuario user) {
        int index = user.getPostagens().indexOf(user);
        usuarios.set(index, user);
    }

    @Override
    public Usuario searchUser(String nome) {
        for (Usuario user: this.usuarios){
            if (user.getNome().equals(nome)){
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean userExists(String nome) {
        for (Usuario user: this.usuarios){
            if (user.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void removeUser(String nome) {
        for (Usuario user: this.usuarios){
            if (user.getNome().equals(nome)){
                this.usuarios.remove(user);
            }
        }
    }
}
