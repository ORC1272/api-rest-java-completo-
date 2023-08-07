package br.com.cro.api.rest.java.completo.resources;

import br.com.cro.api.rest.java.completo.entities.User;
import br.com.cro.api.rest.java.completo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
//        User u = new User(1L, "Maria", "maria@gmail.com", "11 937567676", "123abc");
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
