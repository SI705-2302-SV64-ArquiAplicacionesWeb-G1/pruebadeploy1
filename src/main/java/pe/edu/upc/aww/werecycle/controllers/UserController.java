package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.UserDTO;
import pe.edu.upc.aww.werecycle.entities.Useror;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;
    @PostMapping
    public void registrar(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        Useror u =m.map(dto, Useror.class);
        uS.insert(u);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UserDTO>listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/user-por-id/{id}")
    public UserDTO findById(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        UserDTO dto=m.map(uS.findById(id),UserDTO.class);
        return dto;
    }
    @DeleteMapping("/{idUser}")
    public void eliminar(@PathVariable ("idUser") Integer idUser){
        uS.delete(idUser);
    }

    public void modificar(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        Useror u =m.map(dto,Useror.class);
        uS.insert(u);
    }

    @GetMapping("/user/{userName}")
    public List<UserDTO> findByUserName (@PathVariable("userName") String userName){
        return uS.findByUserName(userName).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

  /* @PostMapping("/{userId}/follow-event/{eventId}")
    public  ResponseEntity<String> followEvent(@PathVariable int userId, @PathVariable int eventId) {
        eS.followEvent(userId, eventId);
        return ResponseEntity.ok("Usuario ha seguido el evento exitosamente.");
    }

    @PostMapping("/{userId}/unfollow-event/{eventId}")
    public ResponseEntity<String> unfollowEvent(@PathVariable int userId, @PathVariable int eventId) {
        eS.unfollowEvent(userId, eventId);
        return ResponseEntity.ok("Usuario ha dejado de seguir el evento exitosamente.");
    }*/
}
