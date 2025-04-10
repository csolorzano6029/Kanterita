package com.canterita.challenge.backend.test.rest;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.model.OrderEntity;
import com.canterita.challenge.backend.test.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public OrderDto getOrder(@PathVariable Long id) {
        return orderService.getOrder(id);
    }

    @GetMapping()
    public ArrayList<OrderEntity> showOrders() {
        return orderService.showOrders();
    }

    @PostMapping()
    public OrderEntity saveOrder(@RequestBody OrderDto order) {
        return this.orderService.saveOrder(order);
    }

}
