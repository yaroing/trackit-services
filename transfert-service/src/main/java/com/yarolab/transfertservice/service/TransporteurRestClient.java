package com.yarolab.transfertservice.service;

import com.yarolab.transfertservice.models.Section;
import com.yarolab.transfertservice.models.Transporteur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface TransporteurRestClient {
    @GetMapping(path="/transporteurs/{id}")
    Transporteur findTransporteurById(@PathVariable Long id);

}
