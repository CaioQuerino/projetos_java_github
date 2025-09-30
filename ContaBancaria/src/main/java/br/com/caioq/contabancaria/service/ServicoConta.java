package br.com.caioq.contabancaria.service;

import br.com.caioq.contabancaria.model.Conta;

public class ServicoConta {
    private final Conta conta;

    public ServicoConta(Conta conta) {
        this.conta = conta;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque!");
        } else if (valor > conta.getSaldo()) {
            System.out.println("Saldo insuficiente!");
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.printf("Saque realizado! Novo saldo: R$%.2f\n", conta.getSaldo());
        }
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito!");
        } else {
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.printf("Depósito realizado! Novo saldo: R$%.2f\n", conta.getSaldo());
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$%.2f\n", conta.getSaldo());
    }

    public Conta getConta() {
        return conta;
    }
}