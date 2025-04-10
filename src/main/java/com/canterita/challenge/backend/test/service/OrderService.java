package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.model.OrderEntity;
import com.canterita.challenge.backend.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderDto getOrder(Long id) {
        return orderRepository.findById(id)
                .map(order -> new OrderDto(order.getId(), order.getNumber(), order.getClient(), order.getTotal(), order.getDateOrder()))
                .orElse(null);
    }

    public OrderEntity saveOrder(OrderDto order) {
        if (order == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The order cannot be empty");
        }

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(order.getId());
        orderEntity.setClient(order.getClient());
        orderEntity.setDateOrder(order.getDateOrder());
        orderEntity.setNumber(order.getNumber());
        orderEntity.setTotal(order.getTotal());


        return orderRepository.save(orderEntity);
    }

    public ArrayList<OrderEntity> showOrders() {
        return (ArrayList<OrderEntity>) orderRepository.findAll();
    }
}
