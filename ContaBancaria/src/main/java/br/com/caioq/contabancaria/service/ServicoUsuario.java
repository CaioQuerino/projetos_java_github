package br.com.caioq.contabancaria.service;

import org.springframework.stereotype.Service;
import br.com.caioq.contabancaria.model.Usuario;
import br.com.caioq.contabancaria.service.ServicoValidadores;

@Service
public class ServicoUsuario {

    private final ServicoValidadores servicoValidadores;

    public ServicoUsuario(ServicoValidadores servicoValidadores) {
        this.servicoValidadores = servicoValidadores;
    }

    public boolean login(Usuario usuario) {
        if (usuario == null || usuario.getConta() == null) {
            System.out.println("Usuário ou conta nula");
            return false;
        } 

        if (!servicoValidadores.validarCPF(usuario.getCPF())) {
            System.out.println("CPF inválido");
            return false;
        }

        if (usuario.getConta().getAgencia().equals(usuario.getConta().getAgencia()) &&
            usuario.getConta().getConta().equals(usuario.getConta().getConta()) &&
            usuario.getConta().getSenha().equals(usuario.getConta().getSenha())) {

            System.out.println("Usuário logado com sucesso");
            return true;
        } else {
            System.out.println("Dados incorretos");
            return false;
        }
    }
}
