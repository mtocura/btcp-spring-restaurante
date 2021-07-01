package br.com.aula2.tt.restaurante.dto;

import java.math.BigDecimal;

public class CaixaDTO {
    private Double saldo;

    public CaixaDTO(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
