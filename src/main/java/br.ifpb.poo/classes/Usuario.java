package br.ifpb.poo.classes;
import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<Postagem> postagens;

    public Usuario(String nome) {
        this.nome = nome;
        this.postagens = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    void postar(String mensagem) {
        this.postagens.add(new Postagem(this, mensagem));
    }

    public List<Postagem> postagens(){
        return this.postagens;
    }
}