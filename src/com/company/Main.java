package com.company;

import com.company.enums.State;
import com.company.models.Driver;
import com.company.models.Truck;
import com.company.services.DriverService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {



    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path PATH = Paths.get("./trucks");
    public static final Path PATH2 = Paths.get("./drivers");

    public static void main(String[] args) {

        final DriverService driverService = new DriverService();
        driverService.findAllDrivers().forEach(System.out::println);

//        Driver driver1 = new Driver(1,"Ulan");
//        Driver driver2 = new Driver(2,"Emosia");
//        Driver driver3 = new Driver(3,"Bekmamat");
//        Driver[] drivers = {driver1,driver2,driver3};
//
//        Truck truck1 = new Truck(1,"Honda",driver1, State.BASE);
//        Truck truck2 = new Truck(2,"BMW",driver2,State.BASE);
//        Truck truck3 = new Truck(3,"Kamaz",driver3,State.BASE);
//        Truck[] trucks = {truck1,truck2,truck3};
//
//
//        String json = GSON.toJson(trucks);
//        String json2 = GSON.toJson(drivers);
//        writeTrucks(json);
//        writeDrivers(json2);


    }

    public static void writeTrucks(String obj) {
        try {
            Path write = Paths.get(String.valueOf(PATH));
            Files.writeString(write, obj, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDrivers(String a) {
        try {
            Path write = Paths.get(String.valueOf(PATH2));
            Files.writeString(write, a, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}
