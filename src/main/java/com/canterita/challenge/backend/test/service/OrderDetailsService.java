package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.repository.DetailsRepositoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DetailsService implements IDetailsService {
    @Autowired
    public DetailsRepositoryEntity repositoryDetails;
    public OrderDetailsEntity detailsEntity;

    @Override
    public OrderDetailsDto extractOrderDetails(Long idOrder) {
        return repositoryDetails.findById(idOrder)
                .map(details -> new OrderDetailsDto(details.getId(), details.getIdOrder(), details.getDetail(), details.getAmount(), details.getUnitPrice(), details.getTotalDetail()))
                .orElse(null);
    }

    public OrderDetailsEntity saveInformationDetails(OrderDetailsDto details, Long id) {
        detailsEntity = new OrderDetailsEntity();

        detailsEntity.setIdOrder(id);
        detailsEntity.setDetail(details.getDetail());
        detailsEntity.setAmount(details.getAmount());
        detailsEntity.setUnitPrice(details.getUnitPrice());
        detailsEntity.setTotalDetail(details.getTotalDetail());
        return repositoryDetails.save(detailsEntity);
    }

    public ArrayList<OrderDetailsEntity> showDetails() {
        return (ArrayList<OrderDetailsEntity>) repositoryDetails.findAll();
    }

    public ArrayList<OrderDetailsEntity> orderId(Long id) {
        return repositoryDetails.findByidOrder(id);
    }

}
