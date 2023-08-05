package com.yarolab.transfertservice.service;


import com.yarolab.transfertservice.models.Partenaire;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface PartenaireRestClient {
    @GetMapping(path="/partenaires/{id}")
    Partenaire findPartenaireById(@PathVariable String id);
}
