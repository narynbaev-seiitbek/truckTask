package com.company.repository;

import com.company.models.Truck;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class TruckRepository {

    Map<Integer, Truck> truckMap = new HashMap<>();

    public TruckRepository() throws FileNotFoundException {
        Gson gson = new Gson();
        try {
            JsonReader jsonReader = new JsonReader(
                    new FileReader("src/com.company/trucks.json"));
        }catch ()


    }
}
