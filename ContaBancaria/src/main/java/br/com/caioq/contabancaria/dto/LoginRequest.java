package br.com.caioq.contabancaria.dto;

public class LoginRequest {
    private String cpf;
    private String agencia;
    private String numero;
    private String senha;
    private String nome;

    // Getters e Setters

    
    public String getCPF() {
        return this.cpf;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public String getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }    
    
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }    
}
