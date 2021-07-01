package br.com.aula2.tt.restaurante.entities;

import java.math.BigDecimal;

public class Caixa {
    private Long id;
    private BigDecimal saldo;
    private BigDecimal valor;
    private Pedido pedido;

    public Caixa(Long id, BigDecimal saldo, BigDecimal valor, Pedido pedido) {
        this.id = id;
        this.saldo = saldo;
        this.valor = valor;
        this.pedido = pedido;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Pedido getPedido() {
        return pedido;
    }
}
