package com.company.services;

import com.company.models.Driver;
import com.company.repository.DriverRepository;

import java.util.List;

public class DriverService {

    private DriverRepository driverRepository = new DriverRepository();

    public List<Driver> findAllDrivers() {
        return driverRepository.getAllDrivers();
    }
}
