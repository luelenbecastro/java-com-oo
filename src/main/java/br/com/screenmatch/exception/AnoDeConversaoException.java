package br.com.screenmatch.exception;

public class AnoDeConversaoException extends RuntimeException {
    private String mensagem;

    public AnoDeConversaoException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
