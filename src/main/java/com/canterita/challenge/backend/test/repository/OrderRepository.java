package com.canterita.challenge.backend.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.canterita.challenge.backend.test.model.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    public abstract Optional<OrderEntity> findById(Long id);
    default Optional<OrderEntity> getById(Long id){
    	return  findById(id);
    }
}
