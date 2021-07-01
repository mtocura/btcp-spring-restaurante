package br.com.aula2.tt.restaurante.entities;

import java.math.BigDecimal;
import java.util.List;

public class Mesa {
    private Long id;
    private List<Pedido> pedidos;
    private Double valorTotal;

    public Mesa(Long id, List<Pedido> pedidos, Double valorTotal) {
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

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
