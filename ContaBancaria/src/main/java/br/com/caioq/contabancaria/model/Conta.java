package br.com.caioq.contabancaria.model;

public class Conta {

    private double saldo;
    private String senha;
    private String agencia;
    private final String conta;

    public Conta(String senha, String agencia, String conta) {

        this.senha = senha;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }
}
