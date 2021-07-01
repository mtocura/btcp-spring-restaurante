package br.com.aula2.tt.restaurante.dto;

import br.com.aula2.tt.restaurante.entities.Mesa;
import br.com.aula2.tt.restaurante.entities.Pedido;

import java.math.BigDecimal;
import java.util.List;

public class MesaDTO {
    private List<Pedido> pedidos;
    private BigDecimal valorConsumido;

    public MesaDTO(List<Pedido> pedidos, BigDecimal valorConsumido) {
        this.pedidos = pedidos;
        this.valorConsumido = valorConsumido;
    }

    public MesaDTO(Mesa mesa) {
        this.pedidos = mesa.getPedidos();
        this.valorConsumido = mesa.getValorTotal();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public BigDecimal getValorConsumido() {
        return valorConsumido;
    }
}
