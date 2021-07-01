package br.com.aula2.tt.restaurante.entities;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private Long id;
    private Long idMesa;
    private List<Prato> pratos;
    private Double total;

    public Pedido(Long id, Long idMesa, List<Prato> pratos, Double total) {
        this.id = id;
        this.idMesa = idMesa;
        this.pratos = pratos;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public Long getIdMesa() {
        return idMesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public Double getTotal() {
        return total;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdMesa(Long idMesa) {
        this.idMesa = idMesa;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
