package br.com.cro.api.rest.java.completo.resources;

import br.com.cro.api.rest.java.completo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "11 937567676", "123abc");
        return ResponseEntity.ok().body(u);

    }
}
