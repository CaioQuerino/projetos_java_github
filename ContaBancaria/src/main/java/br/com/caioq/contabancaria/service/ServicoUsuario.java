package br.com.caioq.contabancaria.service;


import org.springframework.stereotype.Service;
import br.com.caioq.contabancaria.model.Conta;
import br.com.caioq.contabancaria.model.Usuario;

@Service
public class ServicoUsuario {

    public boolean login(String cpf, String agencia, String numeroConta, 
                                         String senha, Usuario usuario) {
        Conta c = usuario.getConta();
        if (c == null) {
            System.out.println("Usuário não possui conta!");
            return false;
        }

        if (c.getAgencia().equals(agencia) &&
            c.getConta().equals(numeroConta) &&
            c.getSenha().equals(senha) &&
            usuario.getCPF().equals(cpf)) {

            System.out.println("Usuário logado com sucesso!");
            return true;
        } else {
            System.out.println("Dados incorretos!");
            return false;
        }
    }
}
