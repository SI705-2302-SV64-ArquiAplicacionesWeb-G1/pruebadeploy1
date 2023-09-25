package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.CartDTO;
import pe.edu.upc.aww.werecycle.entities.Cart;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ICartService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private ICartService cS;
    @PostMapping
    public void registrar(@RequestBody CartDTO dto){
        ModelMapper m = new ModelMapper();
        Cart c = m.map(dto,Cart.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CartDTO>listar(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,CartDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{idCart}")
    public void eliminar(@PathVariable("idCart") Integer idCart){
        cS.delete(idCart);
    }
}
