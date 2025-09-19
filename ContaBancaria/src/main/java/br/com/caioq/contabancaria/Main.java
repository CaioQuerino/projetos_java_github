package br.com.caioq.contabancaria;
        
import br.com.caioq.contabancaria.service.ServicoConta;
import br.com.caioq.contabancaria.service.ServicoUsuario;
import br.com.caioq.contabancaria.model.Conta;
import br.com.caioq.contabancaria.model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta
        Conta conta = new Conta("Caio", "123", 1234);
        
        // Criando usuário
        Usuario usuario = new Usuario(conta);
        
        // Serviços
        ServicoConta servicoConta = new ServicoConta(conta);
        ServicoUsuario servicoUsuario = new ServicoUsuario(usuario);
        
        // Tentativa de login
        boolean logado = servicoUsuario.login("Caio", "123");
        
        if (logado) {
            // Operações bancárias
            servicoConta.depositar(1000);
            servicoConta.sacar(250);
            servicoConta.consultarSaldo();
        }
        
        System.out.println("\nTitular da conta: " + usuario.getConta().getNome());
    }
}