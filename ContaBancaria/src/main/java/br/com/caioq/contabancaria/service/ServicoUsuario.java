package br.com.caioq.contabancaria.service;

import br.com.caioq.contabancaria.model.Usuario;

public class ServicoUsuario {
    final Usuario usuario;
    public ServicoValidadores servicoValidadores;

    public ServicoUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.servicoValidadores = new ServicoValidadores();
    }

    public boolean login(String cpf, String senha) {
       
       if(!servicoValidadores.validarCPF(cpf)) {
           System.out.println("CPF invalido!");
           return false;
       } else {
            System.out.println("CPF valido!");
       }
               
        if (usuario.getConta().getCPF().equals(cpf) && 
            usuario.getConta().getSenha().equals(senha)) {
            System.out.println("Usuário logado com sucesso!");
            return true;
        } else {
            System.out.println("Dados incorretos!");
            return false;
        }
    }
}