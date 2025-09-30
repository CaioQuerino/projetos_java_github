package br.com.caioq.contabancaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.caioq.contabancaria.model.Conta;
import br.com.caioq.contabancaria.model.Usuario;
import br.com.caioq.contabancaria.service.ServicoConta;
import br.com.caioq.contabancaria.service.ServicoValidadores;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    private final ServicoConta servicoConta;
    private final ServicoValidadores servicoValidadores;

    @Autowired
    public ContaController(ServicoConta servicoConta, 
                ServicoValidadores servicoValidadores) {
        
        this.servicoConta = servicoConta;
        this.servicoValidadores = servicoValidadores;
    }

    @PostMapping
    public ResponseEntity<?> criarConta(@RequestBody Conta conta) {
        Usuario titular = conta.getTitular();

        if (titular == null || !servicoValidadores.validarCPF(titular.getCPF())) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("CPF inválido ou não informado!");
        }

        Conta contaCriada = servicoConta.criarConta(conta);
        return ResponseEntity.status(HttpStatus.CREATED).body(contaCriada);
    }

    // Listar todas as contas
    @GetMapping
    public List<Conta> listarContas() {
        return servicoConta.listarContas();
    }

    // Buscar conta por id
    @GetMapping("/{id}")
    public Conta buscarPorId(@PathVariable Long id) {
        return servicoConta.buscarPorId(id);
    }

    // Atualizar conta
    @PutMapping("/{id}")
    public Conta atualizarConta(@PathVariable Long id, @RequestBody Conta contaAtualizada) {
        return servicoConta.atualizarConta(id, contaAtualizada);
    }

    // Deletar conta
    @DeleteMapping("/{id}")
    public void deletarConta(@PathVariable Long id) {
        servicoConta.deletarConta(id);
    }
}
