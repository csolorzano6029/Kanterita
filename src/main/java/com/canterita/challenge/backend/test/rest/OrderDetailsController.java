package com.canterita.challenge.backend.test.rest;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.service.IDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/orders")
public class DetailsController {

    @Autowired
    private IDetailsService detailsService;

    @CrossOrigin("http://localhost:3000")
    @GetMapping(value = "/{idOrder}/details")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<OrderDetailsEntity> orderId(@PathVariable("idOrder") Long id) {
        return this.detailsService.orderId(id);
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping(value = "/details")
    public ArrayList<OrderDetailsEntity> showDetails() {
        return detailsService.showDetails();
    }

    @CrossOrigin("http://localhost:3000")
    @PostMapping(value = "/{id}/details")
    public OrderDetailsEntity saveInformationDetails(@RequestBody OrderDetailsDto order, @PathVariable("id") Long id) {
        return this.detailsService.saveInformationDetails(order, id);
    }
}
