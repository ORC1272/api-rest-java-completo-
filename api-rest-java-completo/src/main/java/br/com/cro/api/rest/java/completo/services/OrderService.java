package br.com.cro.api.rest.java.completo.services;

import br.com.cro.api.rest.java.completo.entities.Order;
import br.com.cro.api.rest.java.completo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();

    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();

    }
}