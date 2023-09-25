package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.CommentDTO;

import pe.edu.upc.aww.werecycle.dtos.QuantityOfCommentsForPublicationDTO;
import pe.edu.upc.aww.werecycle.entities.Comment;

import pe.edu.upc.aww.werecycle.serviceinterfaces.ICommentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private ICommentService cS;
    @PostMapping
    public void registrar(@RequestBody CommentDTO dto){
        ModelMapper m = new ModelMapper();
        Comment u =m.map(dto, Comment.class);
        cS.insert(u);
    }
    @GetMapping
    public List<CommentDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CommentDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{idComment}")
    public void eliminar(@PathVariable ("idComment") Integer idComment){
        cS.delete(idComment);
    }

    @PutMapping
    public void modificar(@RequestBody CommentDTO dto){
        ModelMapper m = new ModelMapper();
        Comment u =m.map(dto,Comment.class);
        cS.insert(u);
    }
    @GetMapping("/cantidaDeComentariosPorPublicacion")
    List<QuantityOfCommentsForPublicationDTO>cantidaDeComentariosPorPublicacion(){
        List<String[]>mpLista = cS.QuantityOfCommentsForPublication();
        List<QuantityOfCommentsForPublicationDTO> mpListaDTO =new ArrayList<>();
        for (String[]data: mpLista){
            QuantityOfCommentsForPublicationDTO mpDTO = new QuantityOfCommentsForPublicationDTO();
            mpDTO.setQuantityOfComments(Integer.parseInt(data[0]));
            mpDTO.setNamePublication(data[1]);
            mpListaDTO.add(mpDTO);
        }
        return mpListaDTO;
    }
}
