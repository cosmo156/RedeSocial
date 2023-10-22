package br.ifpb.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Postagem {
        private Usuario autor;
        private String mensagem;
        private List<Comentario> comentarios;
        private int curtidas;

        public Postagem(Usuario autor, String mensagem) {
            this.autor = autor;
            this.mensagem = mensagem;
            this.comentarios = new ArrayList<>();
            this.curtidas = 0;
        }

    public String getMensagem() {
        return mensagem;
    }


    public List<Comentario> getComentarios() {
        return comentarios;
    }


    public int getCurtidas() {
        return curtidas;
    }

    public void curtir(){
         this.curtidas++;
    }

    public void comentar(Usuario user, String comentario){
         this.comentarios.add(new Comentario(user, comentario));
    }

}
