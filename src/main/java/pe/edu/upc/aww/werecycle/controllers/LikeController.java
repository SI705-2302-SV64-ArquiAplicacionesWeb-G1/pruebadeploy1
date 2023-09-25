package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.LikeDTO;

import pe.edu.upc.aww.werecycle.dtos.QuantityOfLikeForPublicationDTO;
import pe.edu.upc.aww.werecycle.entities.Likes;

import pe.edu.upc.aww.werecycle.serviceinterfaces.ILikeService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/likes")
public class LikeController {

    @Autowired
    private ILikeService lS;

    @PostMapping
    public void registrar(@RequestBody LikeDTO dto){
        ModelMapper m = new ModelMapper();
        Likes u =m.map(dto, Likes.class);
        lS.insert(u);
    }
    @GetMapping

    public List<LikeDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LikeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{idLike}")
    public void eliminar(@PathVariable ("idLike") Integer idLike){
        lS.delete(idLike);
    }

    @PutMapping
    public void modificar(@RequestBody LikeDTO dto){
        ModelMapper m = new ModelMapper();
        Likes u =m.map(dto, Likes.class);
        lS.insert(u);
    }

    @GetMapping("/cantidaDeLikesPorPublicacion")
    List<QuantityOfLikeForPublicationDTO>cantidaDeLikesPorPublicacion(){
        List<String[]>mpLista = lS.QuantityOfLikeForPublication();
        List<QuantityOfLikeForPublicationDTO> mpListaDTO =new ArrayList<>();
        for (String[]data: mpLista){
            QuantityOfLikeForPublicationDTO mpDTO = new QuantityOfLikeForPublicationDTO();
            mpDTO.setQuantityOfLikes(Integer.parseInt(data[0]));
            mpDTO.setNamePublication(data[1]);
            mpListaDTO.add(mpDTO);
        }
        return mpListaDTO;
    }

}
