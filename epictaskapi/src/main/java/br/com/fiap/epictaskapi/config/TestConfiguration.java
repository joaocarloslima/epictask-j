package br.com.fiap.epictaskapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.repository.TaskRepository;

@Configuration
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    TaskRepository repository;

    @Override
    public void run(String... args) throws Exception {
       
        repository.saveAll(List.of(
            new Task("BD", "modelar o banco"), 
            new Task("Prototipo", "prototipar as telas"),
            new Task("Bug", "prototipar as telas"),
            new Task("Nova funcionalidade", "prototipar as telas"),
            new Task("Testes", "prototipar as telas"),
            new Task("Deploy", "prototipar as telas"),
            new Task("Login", "prototipar as telas"),
            new Task("Logout", "prototipar as telas"),
            new Task("Outro bug", "prototipar as telas")

        ));        
    }
    
}
