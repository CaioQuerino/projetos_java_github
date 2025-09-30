package br.com.caioq.contabancaria.service;

import org.springframework.stereotype.Service;
import br.com.caioq.contabancaria.model.Conta;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoConta {

    private final List<Conta> contas = new ArrayList<>();
    private Long contadorId = 1L;

    public Conta criarConta(Conta conta) {
        conta.setId(this.contadorId++);
        contas.add(conta);
        return conta;
    }

    public List<Conta> listarContas() {
        return contas;
    }

    public Conta buscarPorId(Long id) {
        return contas.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Conta atualizarConta(Long id, Conta contaAtualizada) {
        Conta conta = buscarPorId(id);
        if (conta != null) {
            conta.setTitular(contaAtualizada.getTitular());
            conta.setSaldo(contaAtualizada.getSaldo());
        }
        return conta;
    }

    public void deletarConta(Long id) {
        contas.removeIf(c -> c.getId().equals(id));
    }
}
