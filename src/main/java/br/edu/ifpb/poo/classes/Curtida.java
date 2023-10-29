package br.edu.ifpb.poo.classes;

public class Curtida {
    private int numeroCurtidas;

    public Curtida(){
        this.numeroCurtidas = 0;
    }

    public int getNumeroCurtidas(){
        return this.numeroCurtidas;
    }

    public void curtir(){
        this.numeroCurtidas++;
    }

    public void descurtir(){
        if (this.numeroCurtidas == 0){
            return;
        }
        this.numeroCurtidas--;
    }
}
