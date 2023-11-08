package br.edu.ifpb.poo.validators;

import br.edu.ifpb.poo.adpter.Validator;

public class NoEmptyValidator implements Validator {
    @Override
    public boolean validate(Object data) {
        return false;
    }
}
