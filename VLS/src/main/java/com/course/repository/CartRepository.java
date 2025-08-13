package com.course.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.course.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Integer> {
    List<CartEntity> findByLoginId(String loginId);
}
