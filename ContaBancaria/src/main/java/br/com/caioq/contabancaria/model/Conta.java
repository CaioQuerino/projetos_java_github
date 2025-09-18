package br.com.caioq.contabancaria.model;

public class Conta {
    private double saldo;
    private double valor;

    public Conta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}