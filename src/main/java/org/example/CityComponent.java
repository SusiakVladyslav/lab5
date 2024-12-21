package org.example;

interface CityComponent {
    void add(CityComponent component);
    void remove(CityComponent component);
    void displayInfo();
    int getData();
}
