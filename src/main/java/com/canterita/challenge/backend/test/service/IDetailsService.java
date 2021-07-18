package com.canterita.challenge.backend.test.service;

import java.util.ArrayList;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.DetailsEntity;

public interface IDetailsService {
    public OrderDetailsDto extractOrderDetails(Long id);
    public ArrayList<DetailsEntity> showDetails();
    public ArrayList<DetailsEntity> orderId(Long id);
    public DetailsEntity saveInformationDetails(OrderDetailsDto orderDetail, Long id); 
}
