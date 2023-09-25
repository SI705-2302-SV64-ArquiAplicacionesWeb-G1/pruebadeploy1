package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.FrequentQuestionsDTO;
import pe.edu.upc.aww.werecycle.dtos.UserQuestionsDTO;
import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;
import pe.edu.upc.aww.werecycle.entities.UserQuestions;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IFrequentQuestionsService;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUserQuestionsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/userquestionscontroller")
public class UserQuestionsController {
    @Autowired
    private IUserQuestionsService uS;

    @PostMapping
    public void registrar(@RequestBody UserQuestionsDTO dto) {
        ModelMapper m = new ModelMapper();
        UserQuestions uq = m.map(dto, UserQuestions.class);
        uS.insert(uq);
    }

    @GetMapping
    public List<UserQuestionsDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserQuestionsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ uS.delete(id);
    }
}
