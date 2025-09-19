package br.com.caioq.contabancaria.model;

public class Conta {
    private double saldo;
    private String nome;
    private String senha;
    private int agencia;

    public Conta(String nome, String senha, int agencia) {
        this.saldo = 0;
        this.nome = nome;
        this.senha = senha;
        this.agencia = agencia;
    }

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}