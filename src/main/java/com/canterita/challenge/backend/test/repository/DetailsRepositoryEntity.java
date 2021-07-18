package com.canterita.challenge.backend.test.repository;

import java.util.ArrayList;
import java.util.Optional;

import com.canterita.challenge.backend.test.model.DetailsEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepositoryEntity extends JpaRepository<DetailsEntity, Long> {
    public abstract ArrayList<DetailsEntity> findByidOrder(Long id);
    public abstract void save(Optional<DetailsEntity> optional);
}
