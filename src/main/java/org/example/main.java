package org.example;

public class main {
    public static void main(String[] args) {
        SmartCityManager cityManager = new SmartCityManager();

        District district1 = new District("District1");

        Building park1 = new Building("Park");
        Sensor lightSensor1 = new Sensor("Light Sensor", 30);

        Building road1 = new Building("Road");
        Sensor trafficSensor1 = new Sensor("Traffic Sensor", 7);

        Building residentBuilding1 = new Building("Resident Building");
        Sensor temperatureSensor1 = new Sensor("Temperature Sensor", 15);

        cityManager.add(district1);

        district1.add(park1);
        park1.add(lightSensor1);

        district1.add(road1);
        road1.add(trafficSensor1);

        district1.add(residentBuilding1);
        road1.add(temperatureSensor1);

        cityManager.checkLighting("District1");
        cityManager.checkTrafficJam("District1");
        cityManager.checkTemperature("District1");
    }
}

