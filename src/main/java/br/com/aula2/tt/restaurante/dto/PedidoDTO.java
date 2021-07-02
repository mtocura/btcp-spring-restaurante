package br.com.aula2.tt.restaurante.dto;

import java.util.List;

public class PedidoDTO {
    private List<PratoDTO> pratos;

    public PedidoDTO() {
    }

    public PedidoDTO(List<PratoDTO> pratos) {
        this.pratos = pratos;
    }

    public List<PratoDTO> getPratos() {
        return pratos;
    }

    public void setPratos(List<PratoDTO> pratos) {
        this.pratos = pratos;
    }
}
