package com.example.routepredictor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.routepredictor.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Driver findByBusNumber(String busNumber);
}
