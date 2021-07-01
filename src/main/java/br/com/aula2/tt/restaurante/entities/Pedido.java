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

    public void setId(Long id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
