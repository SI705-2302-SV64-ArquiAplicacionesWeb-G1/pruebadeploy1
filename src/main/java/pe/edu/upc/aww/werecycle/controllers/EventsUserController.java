package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.EventsDTO;
import pe.edu.upc.aww.werecycle.dtos.EventsUserDTO;
import pe.edu.upc.aww.werecycle.entities.EventUser;
import pe.edu.upc.aww.werecycle.entities.Events;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IEventUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventsusercontroller")
public class EventsUserController {
    @Autowired
    private IEventUserService euS;

    @PostMapping
    public void registrar(@RequestBody EventsUserDTO dto) {
        ModelMapper m = new ModelMapper();
        EventUser eu = m.map(dto, EventUser.class);
        euS.insert(eu);
    }

    @GetMapping
    public List<EventsUserDTO> listar() {
        return euS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EventsUserDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ euS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody EventsUserDTO dto) {
        ModelMapper m = new ModelMapper();
        EventUser u = m.map(dto, EventUser.class);
        euS.insert(u);
    }

}
