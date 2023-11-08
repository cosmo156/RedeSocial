package br.edu.ifpb.poo.validators;

public enum CaracterValidator {
    MIN_CARACTER_VALIDATOR(3);
    private final int value;

    private CaracterValidator (int value) {
        this.value = value;
    }

}
