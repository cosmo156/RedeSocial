package br.edu.ifpb.poo.interfaces;

import br.edu.ifpb.poo.domain.Usuario;

public interface ComentarioIF{

    Usuario getAutor();
    String getTexto();
}
