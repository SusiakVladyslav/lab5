package org.example;

import java.util.ArrayList;
import java.util.List;

class Building implements CityComponent {
    private String name;
    private List<CityComponent> sensors = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    @Override
    public void add(CityComponent component) {
        sensors.add(component);
    }

    @Override
    public void remove(CityComponent component) {
        sensors.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("  Building: " + name);
        for (CityComponent sensor : sensors) {
            sensor.displayInfo();
        }
    }

    @Override
    public int getData() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public List<CityComponent> getSensors() {
        return sensors;
    }
}