package br.com.aula2.tt.restaurante.entities;

import br.com.aula2.tt.restaurante.dto.CaixaDTO;

public class Caixa {
    private Long id;
    private static double saldo = 0.0;
    private Double valor;

    public Caixa(Long id, Double valor) {
        this.id = id;
        this.valor = valor;
        saldo += valor;
    }

    public Long getId() {
        return id;
    }

    public static double getSaldo() {
        return saldo;
    }

    public CaixaDTO getValor() {
        return new CaixaDTO(Caixa.getSaldo());
    }
}
