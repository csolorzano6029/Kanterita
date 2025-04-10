package com.canterita.challenge.backend.test.rest;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.service.IOrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/orders")
public class OrderDetailsController {

    @Autowired
    private IOrderDetailsService orderDetailsService;

    @CrossOrigin("http://localhost:3000")
    @GetMapping(value = "/{idOrder}/details")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<OrderDetailsEntity> orderId(@PathVariable("idOrder") Long id) {
        return this.orderDetailsService.orderId(id);
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping(value = "/details")
    public ArrayList<OrderDetailsEntity> showDetails() {
        return orderDetailsService.showDetails();
    }

    @CrossOrigin("http://localhost:3000")
    @PostMapping(value = "/{id}/details")
    public OrderDetailsEntity saveInformationDetails(@RequestBody OrderDetailsDto order, @PathVariable("id") Long id) {
        return this.orderDetailsService.saveInformationDetails(order, id);
    }

    @GetMapping(value = "/paginate/{orderId}")
    public Page<OrderDetailsEntity> getOrderDetails(
            @PathVariable Long orderId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        return orderDetailsService.getOrderDetails(orderId, page, size);
    }
}
