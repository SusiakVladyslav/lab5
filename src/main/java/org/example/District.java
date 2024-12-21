package org.example;

import java.util.ArrayList;
import java.util.List;

class District implements CityComponent {
    private String name;
    private List<CityComponent> components = new ArrayList<>();

    public District(String name) {
        this.name = name;
    }

    @Override
    public void add(CityComponent component) {
        components.add(component);
    }

    @Override
    public void remove(CityComponent component) {
        components.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("District: " + name);
        for (CityComponent component : components) {
            component.displayInfo();
        }
    }

    @Override
    public int getData() {
        return 0;
    }

    public List<CityComponent> getComponents() {
        return components;
    }

    public String getName() {
        return name;
    }

}