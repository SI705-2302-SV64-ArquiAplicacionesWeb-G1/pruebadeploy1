package pe.edu.upc.aww.werecycle.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.RecursoDTO;
import pe.edu.upc.aww.werecycle.entities.Recurso;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IURecursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/RecursoCenterController")
public class RecursoCenterController {
    @Autowired
    private IURecursoService rE;

    @PostMapping
    public void registrar(@RequestBody RecursoDTO dto) {
        ModelMapper m = new ModelMapper();
        Recurso re = m.map(dto, Recurso.class);
        rE.insert(re);
    }

    @GetMapping
    public List<RecursoDTO> listar() {
        return rE.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RecursoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id_Recurso}")
    public void eliminar(@PathVariable("id_Recurso") Integer id_Recurso){
        rE.delete(id_Recurso);
    }


}
