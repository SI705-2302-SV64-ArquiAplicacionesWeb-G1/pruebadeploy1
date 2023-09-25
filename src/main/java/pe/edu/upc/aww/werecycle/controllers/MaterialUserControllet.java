package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.MaterialUserDTO;
import pe.edu.upc.aww.werecycle.entities.MaterialUser;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUMaterialUser;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/MaterialUserControllet")
public class MaterialUserControllet {
    @Autowired
    private IUMaterialUser mU;

    @PostMapping
    public void registrar(@RequestBody MaterialUserDTO dto) {
        ModelMapper m = new ModelMapper();
        MaterialUser mu = m.map(dto, MaterialUser.class);
        mU.insert(mu);
    }

    @GetMapping
    public List<MaterialUserDTO> listar() {
        return mU.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MaterialUserDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody MaterialUserDTO dto){
        ModelMapper m = new ModelMapper();
        MaterialUser U =m.map(dto,MaterialUser.class);
        mU.insert(U);
    }
}
