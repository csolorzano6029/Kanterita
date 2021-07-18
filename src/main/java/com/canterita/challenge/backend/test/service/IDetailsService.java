package com.canterita.challenge.backend.test.service;

import java.util.ArrayList;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.DetailsEntity;


public interface IDetailsService {
    public OrderDetailsDto getOrderDetails(Long id);
    public ArrayList<DetailsEntity> showDetails();
    public ArrayList<DetailsEntity> getByIdOrder(Long id);
    public DetailsEntity saveDetails(OrderDetailsDto orderDetail, Long id);
    public boolean delete(Long id);
    
}
