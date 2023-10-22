package br.ifpb.poo.classes;

class Comentario {
    Usuario autor;
    String mensagem;

    public Comentario(Usuario autor, String mensagem) {
        this.autor = autor;
        this.mensagem = mensagem;
    }
}