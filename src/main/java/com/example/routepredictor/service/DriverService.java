package com.example.routepredictor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.routepredictor.model.Driver;
import com.example.routepredictor.repository.DriverRepository;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public void registerDriver(Driver driver) {
        driverRepository.save(driver);  // Save into DB
    }

    public Driver authenticate(String busNumber, String password) {
        Driver driver = driverRepository.findByBusNumber(busNumber);
        if (driver != null && driver.getPassword().equals(password)) {
            return driver;
        }
        return null;
    }
}
