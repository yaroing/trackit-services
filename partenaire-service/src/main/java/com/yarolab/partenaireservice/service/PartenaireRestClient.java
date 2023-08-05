package com.yarolab.partenaireservice.service;

import com.yarolab.partenaireservice.models.Partenaire;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface PartenaireRestClient {
    @GetMapping(path="/partenaires/{id}")
    Partenaire findPartenaireById(@PathVariable String id);
}
