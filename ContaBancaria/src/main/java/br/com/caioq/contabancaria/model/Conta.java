package br.com.caioq.contabancaria.model;

import br.com.caioq.contabancaria.service.ServicoValidadores;

public class Conta {
    private double saldo;
    private String nome;
    private String cpf;
    private String senha;
    private int agencia;
    private ServicoValidadores servicoValidadores = new ServicoValidadores();

    public Conta(String nome, String cpf, String senha, int agencia) {
        this.saldo = 0;
        this.nome = nome;
        this.setCPF(cpf);
        this.senha = senha;
        this.agencia = agencia;
    }
    

    private boolean isValidCPF(String cpf) {
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
        if(!isValidCPF(cpf)) {
            System.out.println("CPF Invalido!");
            return;
        }
        System.out.println("CPF Valido!");
        this.cpf = cpf;
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
