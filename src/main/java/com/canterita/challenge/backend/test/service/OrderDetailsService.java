package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderDetailsService implements IOrderDetailsService {
    @Autowired
    public OrderDetailsRepository orderDatailRepository;
    public OrderDetailsEntity detailsEntity;

    @Override
    public OrderDetailsDto extractOrderDetails(Long idOrder) {
        return orderDatailRepository.findById(idOrder)
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
        return orderDatailRepository.save(detailsEntity);
    }

    public ArrayList<OrderDetailsEntity> showDetails() {
        return (ArrayList<OrderDetailsEntity>) orderDatailRepository.findAll();
    }

    public ArrayList<OrderDetailsEntity> orderId(Long id) {
        return orderDatailRepository.findByidOrder(id);
    }

    public Page<OrderDetailsEntity> getOrderDetails(Long orderId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return orderDatailRepository.findByIdOrder(orderId, pageable);
    }
}
