package com.example.be.repository;

import com.example.be.model.BusType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBusTypeRepository extends JpaRepository<BusType, Integer> {
    @Query(value = "select * from bus_type", nativeQuery = true)
    List<BusType> findAll();
}
