package com.yarolab.partenaireservice.service;

import com.yarolab.partenaireservice.models.Section;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CORE-SERVICE")
public interface SectionRestClient {
    @GetMapping(path="/sections/{id}")
    Section findSectionById(@PathVariable Long id);
}
