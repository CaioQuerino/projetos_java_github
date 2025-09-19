package br.com.caioq.contabancaria.service;

import br.com.caioq.contabancaria.model.Usuario;

public class ServicoUsuario {
    private Usuario usuario;

    public ServicoUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean login(String nome, String senha) {
        if (usuario.getConta().getNome().equals(nome) && 
            usuario.getConta().getSenha().equals(senha)) {
            System.out.println("Usuário logado com sucesso!");
            return true;
        } else {
            System.out.println("Dados incorretos!");
            return false;
        }
    }
}