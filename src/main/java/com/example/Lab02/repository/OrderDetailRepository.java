package com.example.Lab02.repository;

import com.example.Lab02.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{
}
