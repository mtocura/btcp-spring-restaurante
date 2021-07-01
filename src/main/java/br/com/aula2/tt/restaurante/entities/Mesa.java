package br.com.aula2.tt.restaurante.entities;

import java.math.BigDecimal;
import java.util.List;

public class Mesa {
    private Long id;
    private List<Pedido> pedidos;
    private BigDecimal valorTotal;

    public Mesa(Long id, List<Pedido> pedidos, BigDecimal valorTotal) {
        this.id = id;
        this.pedidos = pedidos;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}
