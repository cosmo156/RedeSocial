package br.edu.ifpb.poo.repository;

import br.edu.ifpb.poo.adpter.DataService;
import br.edu.ifpb.poo.domain.Usuario;

import java.util.List;

public class UsuarioRepository {
    private DataService dataService;
    private static UsuarioRepository instance;

    private UsuarioRepository(DataService dataService){
        this.dataService = dataService;
    }

    public static UsuarioRepository getInstance() {
        if (instance == null) {
            instance = new UsuarioRepository(new InMemoryDataService());
        }
        return instance;
    }

    public void setRepository(DataService dataService){
        this.dataService = dataService;
    }

    public void add(Usuario user){
        dataService.add(user);
    }
    public List<Usuario> getAllUser(){
        return dataService.getAllUser();
    }
    public void updateUser(Usuario user){
        dataService.updateUser(user);
    }
    public Usuario searchUser(String nome){
        return dataService.searchUser(nome);
    }
    public boolean userExists(String nome){
        return dataService.userExists(nome);
    }
    public void removeUser(String nome){
        dataService.removeUser(nome);
    }
}
