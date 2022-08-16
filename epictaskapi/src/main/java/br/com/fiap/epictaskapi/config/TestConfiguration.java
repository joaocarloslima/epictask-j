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
       
        Task task1 = new Task("BD", "modelar o banco");
        Task task2 = new Task("Prototipo", "prototipar as telas");

        repository.saveAll(List.of(task1, task2));        
    }
    
}
