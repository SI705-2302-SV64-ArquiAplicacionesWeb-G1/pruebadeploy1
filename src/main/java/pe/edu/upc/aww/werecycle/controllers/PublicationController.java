package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.EventsDTO;
import pe.edu.upc.aww.werecycle.dtos.PublicationDTO;
import pe.edu.upc.aww.werecycle.dtos.PublicationLikesDTO;
import pe.edu.upc.aww.werecycle.entities.Publication;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUPublicationService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PublicationController")
public class PublicationController {
    @Autowired
    private IUPublicationService pU;

    @PostMapping
    public void registrar(@RequestBody PublicationDTO dto) {
        ModelMapper m = new ModelMapper();
        Publication pu = m.map(dto, Publication.class);
        pU.insert(pu);

    }

    @GetMapping
    public List<PublicationDTO> listar() {
        return pU.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicationDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{idPublication}")
    public void eliminar(@PathVariable("idPublication")Integer idPublication){
        pU.delete(idPublication);
    }
    @PutMapping
    public void modificar(@RequestBody PublicationDTO dto){
        ModelMapper m = new ModelMapper();
        Publication p = m.map(dto,Publication.class);
        pU.insert(p);
    }

    @PostMapping("/buscarFecha")
    public List<PublicationDTO> buscarFecha(@RequestBody LocalDate datePublication) {
        return pU.findBydatePublication(datePublication).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicationDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscarTitulo")
    public List<PublicationDTO> buscarTitulo(@RequestParam String title) {
        return pU.findBytitle(title).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicationDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscarportypo")
    public List<PublicationDTO> publicacionPorTipo(@RequestParam String typeRecursotype) {
        List<Publication> publications = pU.findByPublicationByType(typeRecursotype);
        return publications.stream().map(publication -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(publication, PublicationDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidaTypeVideo")
    public Integer cantidadPublicacionVideo(){
        return pU.CountPublicationByType();
    }


    @GetMapping("/Publicacion-con-mas-like")
    public List<PublicationLikesDTO> findPublicationWithMostLikes() {
        return pU.findPublicationsWithMostLikes().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicationLikesDTO.class);
        }).collect(Collectors.toList());
    }
}
