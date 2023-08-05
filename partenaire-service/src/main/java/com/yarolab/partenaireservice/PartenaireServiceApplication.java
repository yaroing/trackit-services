package com.yarolab.partenaireservice;

import com.yarolab.partenaireservice.entities.DetailsRequete;
import com.yarolab.partenaireservice.entities.Requete;
import com.yarolab.partenaireservice.entities.Stock;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableFeignClients
public class PartenaireServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartenaireServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Requete.class);
            restConfiguration.exposeIdsFor(DetailsRequete.class);
            restConfiguration.exposeIdsFor(Stock.class);
        };
    };

}
