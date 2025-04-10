package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.model.OrderEntity;

import java.util.ArrayList;


public interface IOrderService {

    public OrderDto getOrder(Long id);

    public OrderEntity saveOrder(OrderDto order);

    public ArrayList<OrderEntity> showOrders();
}
