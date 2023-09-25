package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.EventsUserDTO;
import pe.edu.upc.aww.werecycle.dtos.PurchaseRequestDTO;
import pe.edu.upc.aww.werecycle.entities.EventUser;
import pe.edu.upc.aww.werecycle.entities.PurchaseRequest;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IPurchaseRequestService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/purchaseRequestController")
public class PurchaseRequestController {
    @Autowired
    private IPurchaseRequestService prS;

    @PostMapping
    public void registrar(@RequestBody PurchaseRequestDTO dto) {
        ModelMapper m = new ModelMapper();
        PurchaseRequest pr = m.map(dto, PurchaseRequest.class);
        prS.insert(pr);
    }

    @GetMapping
    public List<PurchaseRequestDTO> listar() {
        return prS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,PurchaseRequestDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ prS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody PurchaseRequestDTO dto) {
        ModelMapper m = new ModelMapper();
        PurchaseRequest pu = m.map(dto, PurchaseRequest.class);
        prS.insert(pu);
    }
}
