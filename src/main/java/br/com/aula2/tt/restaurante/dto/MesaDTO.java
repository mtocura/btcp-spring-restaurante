package br.com.aula2.tt.restaurante.dto;

import br.com.aula2.tt.restaurante.dao.MesaDAO;
import br.com.aula2.tt.restaurante.entities.Mesa;
import br.com.aula2.tt.restaurante.entities.Pedido;

import java.math.BigDecimal;
import java.util.List;

public class MesaDTO {
    private List<PedidoDTO> pedidos;

    public MesaDTO() {
    }

    public MesaDTO(List<PedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }
}
