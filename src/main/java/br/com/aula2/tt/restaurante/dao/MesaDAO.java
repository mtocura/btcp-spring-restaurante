package br.com.aula2.tt.restaurante.dao;

import br.com.aula2.tt.restaurante.dto.MesaDTO;
import br.com.aula2.tt.restaurante.entities.Mesa;
import br.com.aula2.tt.restaurante.entities.Pedido;
import br.com.aula2.tt.restaurante.entities.Prato;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MesaDAO {
    private static List<Mesa> mesas = new ArrayList<>();

    public List<Mesa> getAllMesas() {
        return mesas;
    }

    public MesaDTO findMesaById(long id) {
        Optional<Mesa> mesaOptional = mesas.stream().filter(m -> m.getId() == id).findFirst();

        if(mesaOptional.isPresent()) {
            return new MesaDTO(mesaOptional.get());
        }

        return null;
    }

    public Mesa addMesa(Mesa mesa) {
        long id = (long) mesas.size() + 1;
        mesa.setId(id);
        mesa.setPedidos(mesa.getPedidos().stream().map(pedido -> new Pedido((long) Math.random() * 100, id,
                pedido.getPratos().stream().map(prato -> new Prato((long) Math.random() * 100, prato.getPreco(), prato.getDescricao(), prato.getQuantidade())).collect(Collectors.toList()),
                this.totalPedidos(pedido.getPratos()))).collect(Collectors.toList()));
        mesa.setValorTotal(this.totalMesa(mesa.getPedidos()));
        mesas.add(mesa);

        return mesas.get(mesas.size() - 1);
    }

    public double totalPedidos(List<Prato> pratos) {
        double value = 0.0;

        for(Prato p : pratos) {
            value += p.getPreco() * p.getQuantidade();
        }

        return value;
    }

    public double totalMesa(List<Pedido> pedidos) {
        double value = 0.0;

        for(Pedido p : pedidos) {
            value += p.getTotal();
        }

        return value;
    }

    public void addPedidoMesa(Pedido pedido, Mesa mesa) {
        Optional<Mesa> mesaOptional = mesas.stream().filter(m -> m.getId() == mesa.getId()).findFirst();

        if(mesaOptional.isPresent()) {
            mesaOptional.get().getPedidos().add(pedido);
        }
    }

    public Double valorTotalConsumido(Mesa mesa) {
        Optional<Mesa> mesaOptional = mesas.stream().filter(m -> m.getId() == mesa.getId()).findFirst();

        if(mesaOptional.isPresent()) {
           return mesaOptional.get().getValorTotal();
        }

        return null;
    }
}
