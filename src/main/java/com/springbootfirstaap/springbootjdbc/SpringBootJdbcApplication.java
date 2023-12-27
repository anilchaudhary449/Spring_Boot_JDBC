package com.springbootfirstaap.springbootjdbc;

import com.springbootfirstaap.springbootjdbc.model.Alien;
import com.springbootfirstaap.springbootjdbc.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(SpringBootJdbcApplication.class, args);

        Alien alien1=context.getBean(Alien.class);

        alien1.setId(11111);
        alien1.setName("Anil");
        alien1.setTech("java");

        AlienRepo alienRepo1=context.getBean(AlienRepo.class);
        alienRepo1.save(alien1);

        System.out.println(alienRepo1.findAll());
    }

}
