package com.yarolab.coreservice;

import com.yarolab.coreservice.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Partenaire.class);
            restConfiguration.exposeIdsFor(Region.class);
            restConfiguration.exposeIdsFor(Section.class);
            restConfiguration.exposeIdsFor(Service.class);
            restConfiguration.exposeIdsFor(Transporteur.class);
        };
    };

}
