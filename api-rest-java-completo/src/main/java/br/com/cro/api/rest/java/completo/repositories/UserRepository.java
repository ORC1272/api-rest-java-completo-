package br.com.cro.api.rest.java.completo.repositories;


import br.com.cro.api.rest.java.completo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
