package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.PurchaseRequestDTO;
import pe.edu.upc.aww.werecycle.dtos.PymentMethodDTO;
import pe.edu.upc.aww.werecycle.entities.PurchaseRequest;
import pe.edu.upc.aww.werecycle.entities.PymentMethod;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IPymentMethodService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pymentMethodController")
public class PymentMethodController {
    @Autowired
    private IPymentMethodService pmS;

    @PostMapping
    public void registrar(@RequestBody PymentMethodDTO dto) {
        ModelMapper m = new ModelMapper();
        PymentMethod pm = m.map(dto, PymentMethod.class);
        pmS.insert(pm);
    }

    @GetMapping
    public List<PymentMethodDTO> listar() {
        return pmS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,PymentMethodDTO.class);
        }).collect(Collectors.toList());
    }

}
