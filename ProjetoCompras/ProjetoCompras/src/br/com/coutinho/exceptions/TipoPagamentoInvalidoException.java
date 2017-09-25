package br.com.coutinho.exceptions;

public class TipoPagamentoInvalidoException extends Exception {

    @Override
    public String getMessage() {
        return "Só aceitamos crédito ou débito";
    }
    
}
