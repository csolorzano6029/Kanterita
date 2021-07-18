package com.canterita.challenge.backend.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.DetailsEntity;
import com.canterita.challenge.backend.test.repository.DetailsRepositoryEntity;

@Service
public class DetailsService implements IDetailsService {
    @Autowired
	public DetailsRepositoryEntity repositoryDetails;
	public DetailsEntity detailsEntity;
    @Override
	public OrderDetailsDto extractOrderDetails(Long idOrder) {
		return repositoryDetails.findById(idOrder)
				.map(details -> new OrderDetailsDto(details.getId(), details.getIdOrder(), details.getDetail(), details.getAmount(), details.getUnitPrice(),details.getTotalDetail()))
				.orElse(null);
	}

	public DetailsEntity saveInformationDetails(OrderDetailsDto details, Long id) {
		detailsEntity = new DetailsEntity();
               
		detailsEntity.setIdOrder(id);
		detailsEntity.setDetail(details.getDetail());
		detailsEntity.setAmount(details.getAmount());
		detailsEntity.setUnitPrice(details.getUnitPrice());
		detailsEntity.setTotalDetail(details.getTotalDetail());
		return repositoryDetails.save(detailsEntity);
	}
	public ArrayList<DetailsEntity>showDetails() {
		return (ArrayList<DetailsEntity>) repositoryDetails.findAll();
	}

	public ArrayList<DetailsEntity> orderId(Long id) {
		return repositoryDetails.findByidOrder(id);
	}

}
