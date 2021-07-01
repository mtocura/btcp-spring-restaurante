package br.com.aula2.tt.restaurante.dto;

import java.math.BigDecimal;

public class CaixaDTO {
    private BigDecimal saldo;

    public CaixaDTO(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
