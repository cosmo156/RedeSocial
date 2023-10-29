package br.edu.ifpb.poo.exceptions;

public class UsuarioNotFoundException extends Exception{
    public UsuarioNotFoundException() {
        super("Falha ao tenaar enconatrar o usuario");
    }
}
