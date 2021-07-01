package br.com.aula2.tt.restaurante.entities;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private Long id;
    private Mesa mesa;
    private List<Prato> pratos;
    private BigDecimal total;

    public Pedido(Long id, Mesa mesa, List<Prato> pratos, BigDecimal total) {
        this.id = id;
        this.mesa = mesa;
        this.pratos = pratos;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
