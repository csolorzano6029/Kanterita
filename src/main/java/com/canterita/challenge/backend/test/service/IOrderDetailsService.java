package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import org.springframework.data.domain.Page;

import java.util.ArrayList;

public interface IOrderDetailsService {
    public OrderDetailsDto extractOrderDetails(Long id);

    public ArrayList<OrderDetailsEntity> showDetails();

    public ArrayList<OrderDetailsEntity> orderId(Long id);

    public OrderDetailsEntity saveInformationDetails(OrderDetailsDto orderDetail, Long id);

    public Page<OrderDetailsEntity> getOrderDetails(Long orderId, int page, int size);
}
