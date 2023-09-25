package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.TypeRecursoDTO;
import pe.edu.upc.aww.werecycle.entities.TypeRecurso;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUTypeRecursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TypeRecursoController")
public class TypeRecursoController {
    @Autowired
    private IUTypeRecursoService tY;

    @PostMapping
    public void registrar(@RequestBody TypeRecursoDTO dto) {
        ModelMapper m = new ModelMapper();
        TypeRecurso ty = m.map(dto, TypeRecurso.class);
        tY.insert(ty);

    }

    @GetMapping
    public List<TypeRecursoDTO> listar() {
        return tY.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TypeRecursoDTO.class);
        }).collect(Collectors.toList());
    }


}



