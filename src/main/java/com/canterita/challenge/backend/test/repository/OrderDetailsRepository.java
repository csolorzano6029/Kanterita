package com.canterita.challenge.backend.test.repository;

import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Long> {

    public abstract ArrayList<OrderDetailsEntity> findByidOrder(Long id);

    public abstract void save(Optional<OrderDetailsEntity> optional);

    public abstract Page<OrderDetailsEntity> findByIdOrder(Long orderId, Pageable pageable);
}
