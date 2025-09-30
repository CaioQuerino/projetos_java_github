package br.com.caioq.contabancaria.service;

import br.com.caioq.contabancaria.model.Usuario;

public class ServicoUsuario {
    final Usuario usuario;

    public ServicoUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean login(String cpf, String agencia, String conta, String senha) {
               
        if (usuario.getConta().getAgencia().equals(agencia) && 
            usuario.getConta().getConta().equals(conta) &&
            usuario.getConta().getSenha().equals(senha) &&
            usuario.getConta().getUsuario().getCPF().equals(cpf)
            ) {
            System.out.println("Usuário logado com sucesso!");
            return true;
        } else {
            System.out.println("Dados incorretos!");
            return false;
        }
    }
}