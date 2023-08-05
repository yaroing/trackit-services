package com.yarolab.partenaireservice.service;

import com.yarolab.partenaireservice.models.Catalogue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CATALOGUE-SERVICE")
public interface CatalogueRestClient {
    @GetMapping(path = "/catalogues/{id}")
    Catalogue findCatalogueById(@PathVariable Long id);
    @GetMapping(path = "/catalogues")
    PagedModel<Catalogue> allCatalogue();
}
