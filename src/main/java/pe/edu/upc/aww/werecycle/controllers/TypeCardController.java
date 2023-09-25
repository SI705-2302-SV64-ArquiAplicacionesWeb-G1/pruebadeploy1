package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.PurchaseRequestDTO;
import pe.edu.upc.aww.werecycle.dtos.TypeCardDTO;
import pe.edu.upc.aww.werecycle.dtos.TypeRecursoDTO;
import pe.edu.upc.aww.werecycle.entities.PurchaseRequest;
import pe.edu.upc.aww.werecycle.entities.TypeCard;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IPymentMethodService;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ITypeCardService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/typeCardController")
public class TypeCardController {
    @Autowired
    private ITypeCardService tsR;

    @PostMapping
    public void registrar(@RequestBody TypeCardDTO dto) {
        ModelMapper m = new ModelMapper();
        TypeCard c = m.map(dto, TypeCard.class);
        tsR.insert(c);
    }

    @GetMapping
    public List<TypeCardDTO> listar() {
        return tsR.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,TypeCardDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ tsR.delete(id);
    }
}
