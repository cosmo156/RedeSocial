package br.edu.ifpb.poo.validators;

import br.edu.ifpb.poo.adpter.Validator;

public class SenhaValidator implements Validator {
    final int MIN_CARACTER_SENHA = 3;
    @Override
    public boolean validate(Object data) {
        if (data.toString().length() > MIN_CARACTER_SENHA){
            return true;
        }
        return false;
    }
}
