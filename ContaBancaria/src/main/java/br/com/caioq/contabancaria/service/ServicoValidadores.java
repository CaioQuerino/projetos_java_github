package br.com.caioq.contabancaria.service;

public class ServicoValidadores {
    public boolean validarCPF(String cpf) {
        if (cpf == null) return false;

        String cpfLimpo = cpf.replaceAll("\\D", "");

        if (cpfLimpo.length() != 11) return false;

        if (cpfLimpo.matches("(\\d)\\1{10}")) return false;

        try {
            int soma = 0, resto;

            for (int i = 1; i <= 9; i++) {
                soma += Integer.parseInt(cpfLimpo.substring(i - 1, i)) * (11 - i);
            }
            resto = (soma * 10) % 11;
            if (resto == 10 || resto == 11) resto = 0;
            if (resto != Integer.parseInt(cpfLimpo.substring(9, 10))) return false;

            soma = 0;
            for (int i = 1; i <= 10; i++) {
                soma += Integer.parseInt(cpfLimpo.substring(i - 1, i)) * (12 - i);
            }
            resto = (soma * 10) % 11;
            if (resto == 10 || resto == 11) resto = 0;
            return resto == Integer.parseInt(cpfLimpo.substring(10, 11));
        } catch (NumberFormatException e) {
            return false;
        }
    }    
}
