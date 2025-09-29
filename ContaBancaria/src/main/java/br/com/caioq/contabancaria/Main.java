package br.com.caioq.contabancaria;
        
import br.com.caioq.contabancaria.model.Conta;
import br.com.caioq.contabancaria.model.Usuario;
import br.com.caioq.contabancaria.service.ServicoConta;
import br.com.caioq.contabancaria.service.ServicoUsuario;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta
        
        Conta conta = new Conta("Paula", "24269158034", "123", "1234-5", "12345-6");
        
        // Criando usuário
        Usuario usuario = new Usuario(conta);
        
        // Serviços
        ServicoConta servicoConta = new ServicoConta(conta);
        ServicoUsuario servicoUsuario = new ServicoUsuario(usuario);
        
        // Tentativa de login
        
        boolean logado = servicoUsuario.login("24269158034", "1234-5", "12345-6", "123");
        
        if (logado) {
            // Operações bancárias
            System.out.printf("Nome: %s\n", usuario.getConta().getNome());
            System.out.printf("Agê: %s\n", usuario.getConta().getAgencia());        
            System.out.printf("Conta: %s\n", usuario.getConta().getConta());

            servicoConta.depositar(1000);
            servicoConta.sacar(250);
            servicoConta.consultarSaldo();
            System.out.println("\nTitular da conta: " + usuario.getConta().getNome());
        }
    }
}