package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.TicketPurchaseDTO;
import pe.edu.upc.aww.werecycle.dtos.TypeCardDTO;
import pe.edu.upc.aww.werecycle.entities.TicketPurchase;
import pe.edu.upc.aww.werecycle.entities.TypeCard;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ITicketPurchaseService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tickerPurchasController")
public class TicketPurchaseController {
    @Autowired
    private ITicketPurchaseService tpS;

    @PostMapping
    public void registrar(@RequestBody TicketPurchaseDTO dto) {
        ModelMapper m = new ModelMapper();
        TicketPurchase t = m.map(dto, TicketPurchase.class);
        tpS.insert(t);
    }

    @GetMapping
    public List<TicketPurchaseDTO> listar() {
        return tpS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,TicketPurchaseDTO.class);
        }).collect(Collectors.toList());
    }
}
