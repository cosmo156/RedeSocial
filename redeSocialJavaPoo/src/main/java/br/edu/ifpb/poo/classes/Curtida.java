package br.edu.ifpb.poo.classes;

import br.edu.ifpb.poo.interfaces.CurtidaIF;

public class Curtida implements CurtidaIF {
    private int numeroCurtidas;

    public Curtida(){
        this.numeroCurtidas = 0;
    }

    @Override
    public int getNumeroCurtidas(){
        return this.numeroCurtidas;
    }

    @Override
    public void curtir(){
        this.numeroCurtidas++;
    }

    @Override
    public void descurtir(){
        if (this.numeroCurtidas == 0){
            return;
        }
        this.numeroCurtidas--;
    }
}
