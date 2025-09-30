package br.com.caioq.contabancaria.service;

import org.springframework.stereotype.Service;
import br.com.caioq.contabancaria.model.Conta;

@Service
public class ServicoConta {

    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + conta.getSaldo());
    }

    public void sacar(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo(Conta conta) {
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }

    public Conta getConta(Conta conta) {
        return conta;
    }
}