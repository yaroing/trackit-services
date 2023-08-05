package com.yarolab.transfertservice;

import com.yarolab.transfertservice.entities.Action;
import com.yarolab.transfertservice.entities.Article;
import com.yarolab.transfertservice.entities.Transfert;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableFeignClients
public class TransfertServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransfertServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Action.class);
            restConfiguration.exposeIdsFor(Article.class);
            restConfiguration.exposeIdsFor(Transfert.class);
        };
    };

}
