package br.com.caioq.contabancaria;
        
import java.util.Scanner;
import br.com.caioq.contabancaria.service.ServicoConta;
import br.com.caioq.contabancaria.model.Conta;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        ServicoConta servicoConta = new ServicoConta(conta);
        
        int opcao;
        do {
            System.out.println("\n=== Sistema Bancário ===");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Valor para sacar: R$");
                    double valorSaque = sc.nextDouble();
                    servicoConta.sacar(valorSaque);
                    break;
                case 2:
                    System.out.print("Valor para depositar: R$");
                    double valorDeposito = sc.nextDouble();
                    servicoConta.depositar(valorDeposito);
                    break;
                case 3:
                    servicoConta.consultarSaldo();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
        } while (opcao != 0);
        
        sc.close();
    }
}