package br.com.caioq.contabancaria.controllers;

import br.com.caioq.contabancaria.dto.LoginRequest;
import br.com.caioq.contabancaria.model.Conta;
import br.com.caioq.contabancaria.model.Usuario;
import br.com.caioq.contabancaria.service.ServicoUsuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final ServicoUsuario servicoUsuario;

    public UsuarioController(ServicoUsuario servicoUsuario) {
        this.servicoUsuario = servicoUsuario;
    }

    @PostMapping("/login")
 
    public String login(@RequestBody Usuario usuario) {
        
        if(usuario == null) {
            return null;
        }

        boolean logado = servicoUsuario.login(usuario);
        return logado ? "Login realizado com sucesso!" : "Dados incorretos!";
    }
}
