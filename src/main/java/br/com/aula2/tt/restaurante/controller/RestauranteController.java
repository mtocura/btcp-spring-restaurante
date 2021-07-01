package br.com.aula2.tt.restaurante.controller;

import br.com.aula2.tt.restaurante.dao.MesaDAO;
import br.com.aula2.tt.restaurante.dto.MesaDTO;
import br.com.aula2.tt.restaurante.entities.Mesa;
import br.com.aula2.tt.restaurante.entities.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/aula2/tt")
public class RestauranteController {

    MesaDAO mesaDAO = new MesaDAO();

    @PostMapping("/mesa")
    public ResponseEntity<?> mesa(@RequestBody Mesa mesa, UriComponentsBuilder uriBuilder) {
        Mesa m = mesaDAO.addMesa(mesa);

        URI uri = uriBuilder.path("/aula2/tt/mesa/{id}").buildAndExpand(m.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/mesa")
    public ResponseEntity<?> getAllMesas() {
        return ResponseEntity.ok(mesaDAO.getAllMesas());
    }

    @GetMapping("/mesa/{id}")
    public ResponseEntity<?> getPedidosMesa(@PathVariable long id) {
        MesaDTO mesaDTO = mesaDAO.findMesaById(id);

        if(mesaDTO != null) {
            return ResponseEntity.ok(mesaDTO);
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/mesa/{id}/checkout")
    public ResponseEntity<?> checkout(@PathVariable long id) {
        MesaDTO res = mesaDAO.fecharConta(id);

        if(res != null) {
            return ResponseEntity.ok(res);
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/caixa")
    public ResponseEntity<?> saldo() {
        return ResponseEntity.ok(mesaDAO.caixa());
    }
}
