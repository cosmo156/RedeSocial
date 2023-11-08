package br.edu.ifpb.poo.validators;

import br.edu.ifpb.poo.adpter.Validator;

public class NomeValidator implements Validator {
    final int MIN_CARACT_NOME = 3;
    @Override
    public boolean validate(Object data) {;
        if (data.toString().length() > MIN_CARACT_NOME){
            return false;
        }
        return true;
    }
}
