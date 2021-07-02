package br.com.aula2.tt.restaurante.dao;

import br.com.aula2.tt.restaurante.dto.*;
import br.com.aula2.tt.restaurante.entities.Caixa;
import br.com.aula2.tt.restaurante.entities.Mesa;
import br.com.aula2.tt.restaurante.entities.Pedido;
import br.com.aula2.tt.restaurante.entities.Prato;
import br.com.aula2.tt.restaurante.utils.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MesaDAO {
    private static List<Mesa> mesas = new ArrayList<>();
    private static List<Caixa> caixa = new ArrayList<>();

    public static Mesa mesaDtoToEntity(MesaDTO mesaDTO) {
        long id = Id.genrateIdMesa();
        return new Mesa(
                id,
                pedidoDtoToEntity(mesaDTO.getPedidos(), id),
                totalMesa(mesaDTO.getPedidos())
        );
    }

    public static MesaResponseDTO entityToMesaDTO(Mesa mesa) {
        return new MesaResponseDTO(
            entityToPedidoResponseDTO(mesa.getPedidos()),
            mesa.getValorTotal()
        );
    }

    public static List<MesaResponseDTO> entityToMesaDTO(List<Mesa> mesas) {
        List<MesaResponseDTO> mesaResponseDTOS = new ArrayList<>();

        for (Mesa mesa : mesas) {
            mesaResponseDTOS.add(entityToMesaDTO(mesa));
        }

        return mesaResponseDTOS;
    }

    public static Pedido pedidoDtoToEntity(PedidoDTO pedidoDTO, long idMesa) {
        return new Pedido(
                Id.genrateIdPedido(),
                idMesa,
                pratoDtoToEntity(pedidoDTO.getPratos()),
                totalPedidos(pedidoDTO.getPratos())
        );
    }

    public static List<Pedido> pedidoDtoToEntity(List<PedidoDTO> pedidoDTOS, long idMesa) {
        List<Pedido> pedidos = new ArrayList<>();

        for (PedidoDTO pedidoDTO : pedidoDTOS) {
            pedidos.add(pedidoDtoToEntity(pedidoDTO, idMesa));
        }

        return pedidos;
    }

    public static PedidoResponseDTO entityToPedidoResponseDTO(Pedido pedido) {
        return new PedidoResponseDTO(
                entityToPratoDTO(pedido.getPratos()),
                pedido.getTotal()
        );
    }

    public static List<PedidoResponseDTO> entityToPedidoResponseDTO(List<Pedido> pedidos) {
        List<PedidoResponseDTO> pedidoResponseDTOS = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            pedidoResponseDTOS.add(entityToPedidoResponseDTO(pedido));
        }

        return pedidoResponseDTOS;
    }

    public static Prato pratoDtoToEntity(PratoDTO pratoDTO) {
        return new Prato(
                Id.genrateIdPrato(),
                pratoDTO.getPreco(),
                pratoDTO.getDescricao(),
                pratoDTO.getQuantidade()
        );
    }

    public static PratoDTO entityToPratoDTO(Prato prato) {
        return new PratoDTO(
                prato.getPreco(),
                prato.getDescricao(),
                prato.getQuantidade()
        );
    }

    public static List<Prato> pratoDtoToEntity(List<PratoDTO> pratoDTOS) {
        List<Prato> pratos = new ArrayList<>();

        for (PratoDTO pratoDTO : pratoDTOS) {
            pratos.add(pratoDtoToEntity(pratoDTO));
        }

        return pratos;
    }

    public static List<PratoDTO> entityToPratoDTO(List<Prato> pratos) {
        List<PratoDTO> pratoDTOS = new ArrayList<>();

        for (Prato prato : pratos) {
            pratoDTOS.add(entityToPratoDTO(prato));
        }

        return pratoDTOS;
    }

    public List<MesaResponseDTO> getAllMesas() {
        return entityToMesaDTO(mesas);
    }

    public MesaResponseDTO findMesaById(long id) {
        Optional<Mesa> mesaOptional = mesas.stream().filter(m -> m.getId() == id).findFirst();

        if(mesaOptional.isPresent()) {
            return entityToMesaDTO(mesaOptional.get());
        }

        return null;
    }

    public Mesa addMesa(MesaDTO mesaDTO) {
        Mesa mesa = mesaDtoToEntity(mesaDTO);
        mesas.add(mesa);
        return mesa;
    }

    public MesaResponseDTO fecharConta(long id) {
        Optional<Mesa> mesaOptional = mesas.stream().filter(m -> m.getId() == id).findFirst();

        if(mesaOptional.isPresent()) {
            caixa.add(new Caixa((long) caixa.size() + 1, mesaOptional.get().getValorTotal()));
            mesaOptional.get().setPedidos(new ArrayList<>());
            return entityToMesaDTO(mesaOptional.get());
        }

        return null;
    }

    public CaixaDTO caixa() {
        return new CaixaDTO(Caixa.getSaldo());
    }

    private static double totalPedidos(List<PratoDTO> pratos) {
        double value = 0.0;

        for(PratoDTO p : pratos) {
            value += p.getPreco() * p.getQuantidade();
        }

        return value;
    }

    private static double totalMesa(List<PedidoDTO> pedidos) {
        double value = 0.0;

        for(PedidoDTO pedidoDTO : pedidos) {
            List<PratoDTO> pratos = pedidoDTO.getPratos();
            for(PratoDTO prato : pratos) {
                value += prato.getPreco() * prato.getQuantidade();
            }
        }

        return value;
    }
}
