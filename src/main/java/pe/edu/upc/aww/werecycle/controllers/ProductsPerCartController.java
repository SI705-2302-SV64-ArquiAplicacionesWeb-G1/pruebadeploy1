package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.ProductsPerCartDTO;
import pe.edu.upc.aww.werecycle.entities.ProductsPerCart;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IProductsPerCartService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/productspercarts")
public class ProductsPerCartController {
    @Autowired
    private IProductsPerCartService ppCS;
    @PostMapping
    public void registrar(@RequestBody ProductsPerCartDTO dto){
        ModelMapper m = new ModelMapper();
        ProductsPerCart ppc = m.map(dto,ProductsPerCart.class);
        ppCS.insert(ppc);
    }
    @GetMapping
    public List<ProductsPerCartDTO>listar(){
        return ppCS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ProductsPerCartDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{idProducsPerCart}")
    public void eliminar(@PathVariable("idProducsPerCart") Integer idProducsPerCart){
        ppCS.delete(idProducsPerCart);
    }

    @GetMapping("/Sumaproductosporcarrito")
    public Integer Sumaproductosporcarrito() {return  ppCS.sumProductPerCart();}

}
