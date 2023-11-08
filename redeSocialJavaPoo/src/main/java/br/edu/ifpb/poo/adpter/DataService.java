package br.edu.ifpb.poo.adpter;
import br.edu.ifpb.poo.domain.Usuario;

import java.util.List;

public interface DataService {
    void add(Usuario user);
    List<Usuario> getAllUser();
    void updateUser(Usuario user);
    Usuario searchUser(String nome);
    boolean userExists(String nome);
    void removeUser(String nome);
}
