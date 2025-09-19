package br.com.caioq.contabancaria.model;

public class Usuario {
    private final Conta conta;

    public Usuario(Conta conta) {
        this.conta = conta;
    }
    
    public Conta getConta() {
        return conta;
    }
}