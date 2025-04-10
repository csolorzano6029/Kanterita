package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;

import java.util.ArrayList;

public interface IDetailsService {
    public OrderDetailsDto extractOrderDetails(Long id);

    public ArrayList<OrderDetailsEntity> showDetails();

    public ArrayList<OrderDetailsEntity> orderId(Long id);

    public OrderDetailsEntity saveInformationDetails(OrderDetailsDto orderDetail, Long id);
}
