package br.com.cro.api.rest.java.completo.repositories;

import br.com.cro.api.rest.java.completo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
