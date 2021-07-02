package br.com.aula2.tt.restaurante.dto;

import java.util.List;

public class PedidoResponseDTO {
    private List<PratoDTO> pratos;
    private Double total;

    public PedidoResponseDTO() {}

    public PedidoResponseDTO(List<PratoDTO> pratos, Double total) {
        this.pratos = pratos;
        this.total = total;
    }

    public List<PratoDTO> getPratos() {
        return pratos;
    }

    public void setPratos(List<PratoDTO> pratos) {
        this.pratos = pratos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
