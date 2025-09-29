package br.com.caioq.contabancaria.model;

import br.com.caioq.contabancaria.service.ServicoValidadores;

public class Conta {
    private double saldo;
    private String nome;
    private String cpf;
    private String senha;
    private String agencia;
    private final String conta;
    private final ServicoValidadores servicoValidadores = new ServicoValidadores();

    public Conta(String nome, String cpf, String senha, String agencia, String conta) {
        this.saldo = 0;
        this.nome = nome;
        this.setCPF(cpf);
        this.senha = senha;
        this.agencia = agencia;
        this.conta = conta;
    }

 
    private boolean isValidCpf(String cpf) {
        return servicoValidadores.validarCPF(cpf);
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
    
    public String getCPF() {
        return cpf;
    }
    
    private void setCPF(String cpf) {
        if (!isValidCpf(cpf)) {
            throw new IllegalArgumentException("CPF inválido: " + cpf);
        }
        this.cpf = cpf;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public String getConta() {
        return conta;
    }
}
