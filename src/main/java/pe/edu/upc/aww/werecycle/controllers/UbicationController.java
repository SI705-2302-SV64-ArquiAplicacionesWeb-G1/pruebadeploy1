package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.UbicationDTO;
import pe.edu.upc.aww.werecycle.entities.Ubication;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUbicationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ubications")
public class UbicationController {
    @Autowired
    private IUbicationService uS;

    @PostMapping
    public void registrar (@RequestBody UbicationDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Ubication u = m.map(dto, Ubication.class);
        uS.insert(u);
    }
    @GetMapping
    public List<UbicationDTO>listar(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UbicationDTO.class);
        }).collect(Collectors.toList());
    }
}
