package br.com.cro.api.rest.java.completo.config;

import br.com.cro.api.rest.java.completo.entities.User;
import br.com.cro.api.rest.java.completo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "11 977777777", "a1b24444" );
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "11 988888888", "c1d24444" );


        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
