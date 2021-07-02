package br.com.aula2.tt.restaurante.dto;

import java.util.List;

public class MesaResponseDTO {
    private List<PedidoResponseDTO> pedidos;
    private Double valorTotal;

    public MesaResponseDTO() {
    }

    public MesaResponseDTO(List<PedidoResponseDTO> pedidos, Double valorTotal) {
        this.pedidos = pedidos;
        this.valorTotal = valorTotal;
    }

    public List<PedidoResponseDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoResponseDTO> pedidos) {
        this.pedidos = pedidos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
