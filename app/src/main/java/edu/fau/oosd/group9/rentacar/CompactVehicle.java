package edu.fau.oosd.group9.rentacar;

public class CompactVehicle implements CarInterface {

    String price = "$20/day";
    String vehicleClass = "Compact";

    @Override
    public String getVehicleClass() {
        return vehicleClass;
    }

    @Override
    public String getPrice() {
        return price;
    }
}