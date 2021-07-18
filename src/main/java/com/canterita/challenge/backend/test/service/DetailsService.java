package com.canterita.challenge.backend.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.DetailsEntity;
import com.canterita.challenge.backend.test.repository.DetailsRepositoryEntity;

@Service
public class DetailsService implements IDetailsService{
    @Autowired
	public DetailsRepositoryEntity orderDetailsRepository;
	public DetailsEntity orderDetailsEntity;
    @Override
	public OrderDetailsDto getOrderDetails(Long idOrder) {
		return orderDetailsRepository.findById(idOrder)
				.map(orderDetail -> new OrderDetailsDto(orderDetail.getId(), orderDetail.getIdOrder(), orderDetail.getDetail(), orderDetail.getAmount(), orderDetail.getUnitPrice(),orderDetail.getTotalDetail()))
				.orElse(null);
	}

	public DetailsEntity saveDetails(OrderDetailsDto orderDetail, Long id){
		orderDetailsEntity = new DetailsEntity();
               
		orderDetailsEntity.setIdOrder(id);
		orderDetailsEntity.setDetail(orderDetail.getDetail());
		orderDetailsEntity.setAmount(orderDetail.getAmount());
		orderDetailsEntity.setUnitPrice(orderDetail.getUnitPrice());
		orderDetailsEntity.setTotalDetail(orderDetail.getTotalDetail());
		return orderDetailsRepository.save(orderDetailsEntity);
	}
	public ArrayList<DetailsEntity>showDetails(){
		return (ArrayList<DetailsEntity>) orderDetailsRepository.findAll();
	}

	public ArrayList<DetailsEntity> getByIdOrder(Long id){
		return orderDetailsRepository.findByidOrder(id);
	}

	public boolean delete(Long id){
		try{
			orderDetailsRepository.deleteById(id);
		return true;

		}catch(Exception err){
			return false;
		}
	}
}
