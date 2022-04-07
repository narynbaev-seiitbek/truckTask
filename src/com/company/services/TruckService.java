package com.company.services;

import com.company.models.Truck;
import com.company.repository.TruckRepository;

import java.io.FileNotFoundException;
import java.util.List;

public class TruckService {

    private  TruckRepository truckRepository;

    public TruckService() throws FileNotFoundException {
        truckRepository = new TruckRepository();
    }

    public List<Truck> findAlltrucks() {
        return truckRepository.getA
    }
}
