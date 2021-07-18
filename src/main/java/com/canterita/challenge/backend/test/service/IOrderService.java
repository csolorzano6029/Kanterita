package com.canterita.challenge.backend.test.service;

import java.util.ArrayList;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.model.OrderEntity;


public interface IOrderService {
	
	public OrderDto getOrder(Long id);
	public OrderEntity saveOrder(OrderEntity order);
	public boolean delete(Long id);
	public ArrayList<OrderEntity> showOrders();

}
