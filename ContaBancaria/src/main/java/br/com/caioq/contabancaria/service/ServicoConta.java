package br.com.caioq.contabancaria.service;

import br.com.caioq.contabancaria.model.Conta;

public class ServicoConta {
    private Conta conta;

    public ServicoConta(Conta conta) {
        this.conta = conta;
    }

    public void sacar(double valor) {
        conta.setValor(valor);
        if (valor <= 0) {
            System.out.println("Valor inválido para saque!");
        } else if (valor > conta.getSaldo()) {
            System.out.println("Saldo insuficiente!");
        } else {
            conta.setSaldo(conta.getSaldo() - conta.getValor());
            System.out.printf("Saque realizado! Novo saldo: R$%.2f\n", conta.getSaldo());
        }
    }
    
    public void depositar(double valor) {
        conta.setValor(valor);
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito!");
        } else {
            conta.setSaldo(conta.getSaldo() + conta.getValor());
            System.out.printf("Depósito realizado! Novo saldo: R$%.2f\n", conta.getSaldo());
        }
    }

    public void consultarSaldo() {}

    public Conta getConta() {
        return conta;
    }
    
    public Conta setConta(Conta conta) {
        return this.conta = conta;
    }
}