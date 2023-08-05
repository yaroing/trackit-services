package com.yarolab.pointservice.service;

import com.yarolab.pointservice.models.Service;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CORE-SERVICE")
public interface ServiceRestClient {
    @GetMapping(path="/services/{id}")
    Service findServiceById(@PathVariable Long id);
}
