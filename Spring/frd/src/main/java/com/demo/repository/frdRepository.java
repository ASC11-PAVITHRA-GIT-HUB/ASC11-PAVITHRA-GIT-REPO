package com.demo.repository;

import com.demo.entity.frdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface frdRepository extends JpaRepository<frdEntity, Long> {
}
