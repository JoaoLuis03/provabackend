package br.com.joao.consultamedica.exception;

public class ExceptionDataIntegrityViolation extends RuntimeException{
    public ExceptionDataIntegrityViolation(String message) {
        super(message);
    }
}
