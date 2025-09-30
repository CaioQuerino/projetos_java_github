package br.com.caioq.contabancaria.model;

public class Conta {
    private Usuario usuario;
    private double saldo;
    private String senha;
    private String agencia;
    private final String conta;

    public Conta(Usuario usuario, String senha, String agencia, String conta) {
        this.usuario = usuario;
        this.senha = senha;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }

    public Usuario getUsuario() {
        return usuario;
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
