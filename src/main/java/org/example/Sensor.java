package org.example;

class Sensor implements CityComponent {
    private String name;
    private int data;

    public Sensor(String name, int data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public void add(CityComponent component) {
        throw new UnsupportedOperationException("Cannot add to a Sensor");
    }

    @Override
    public void remove(CityComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a Sensor");
    }

    @Override
    public void displayInfo() {
        System.out.println("    Sensor: " + name + ", Data: " + data);
    }

    @Override
    public int getData() {
        return data;
    }

    public String getName() {
        return name;
    }
}
