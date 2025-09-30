package br.com.caioq.contabancaria.model;

public class Usuario {
    private Conta conta; 

    public Usuario(Conta conta) {
        this.conta = conta;
    }
    
    public Conta getConta() {
        return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}