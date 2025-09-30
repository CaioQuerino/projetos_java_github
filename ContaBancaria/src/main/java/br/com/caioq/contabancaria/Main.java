package br.com.caioq.contabancaria;

import br.com.caioq.contabancaria.model.Conta;
import br.com.caioq.contabancaria.model.Usuario;
import br.com.caioq.contabancaria.service.ServicoConta;
import br.com.caioq.contabancaria.service.ServicoUsuario;

public class Main {
    public static void main(String[] args) {
        // Criando usuário
        Usuario usuario = new Usuario("Caio", "12345678901");

        // Criando conta vinculada ao usuário
        Conta conta = new Conta(usuario, "123", "1234-5", "12345-6");
        usuario.setConta(conta);

        // Serviços
        ServicoConta servicoConta = new ServicoConta(conta);
        ServicoUsuario servicoUsuario = new ServicoUsuario(usuario);

        // Tentativa de login
        boolean logado = servicoUsuario.login("12345678901", "1234-5", "12345-6", "123");

        if (logado) {
            System.out.printf("Nome: %s\n", usuario.getNome());
            System.out.printf("Agência: %s\n", conta.getAgencia());
            System.out.printf("Conta: %s\n", conta.getConta());

            servicoConta.depositar(1000);
            servicoConta.sacar(250);
            servicoConta.consultarSaldo();
            System.out.println("\nTitular da conta: " + usuario.getNome());
        }
    }
}
