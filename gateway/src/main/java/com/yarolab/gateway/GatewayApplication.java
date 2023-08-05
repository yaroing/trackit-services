package com.yarolab.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    //@Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->r.path("/catalogues/**").uri("lb://CATALOGUE-SERVICE"))
                .route(r->r.path("/partenaires/**").uri("lb://CORE-SERVICE"))
                .route(r->r.path("/regions/**").uri("lb://CORE-SERVICE"))
                .route(r->r.path("/sections/**").uri("lb://CORE-SERVICE"))
                .route(r->r.path("/services/**").uri("lb://CORE-SERVICE"))
                .route(r->r.path("/transporteurs/**").uri("lb://CORE-SERVICE"))
                .route(r->r.path("/requetes/**").uri("lb://PARTENAIRE-SERVICE"))
                .route(r->r.path("/stocks/**").uri("lb://PARTENAIRE-SERVICE"))
                .route(r->r.path("/detailsrequetes/**").uri("lb://PARTENAIRE-SERVICE"))
                .route(r->r.path("/requetes/**").uri("lb://POINT-SERVICE"))
                .route(r->r.path("/stocks/**").uri("lb://POINT-SERVICE"))
                .route(r->r.path("/actions/**").uri("lb://TRANSFERT-SERVICE"))
                .route(r->r.path("/articles/**").uri("lb://TRANSFERT-SERVICE"))
                .route(r->r.path("/transferts/**").uri("lb://TRANSFERT-SERVICE"))


                .build();
    }

    @Bean
    public DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc,
                                                               DiscoveryLocatorProperties dlp){
        return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
    }

}
