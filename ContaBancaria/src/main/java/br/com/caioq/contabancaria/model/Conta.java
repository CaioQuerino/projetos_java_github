package br.com.caioq.contabancaria.model;


public class Conta {

    private Long id;
    private double saldo;
    private String senha;
    private String agencia;
    private String conta;
    private Usuario titular;

    public Conta() {}

    public Conta(String senha, String agencia, String conta) {
        this.senha = senha;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getConta() { return conta; }
    public void setConta(String conta) { this.conta = conta; }

    public Usuario getTitular() { return titular; }
    public void setTitular(Usuario titular) { this.titular = titular; }
}
