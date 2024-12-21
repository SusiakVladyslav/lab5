package org.example;

public class SmartCityManager {
    SmartCityManager cityManager = new SmartCityManager();

    District district1 = new District("Downtown");
    Building building1 = new Building("Park");
    Sensor sensor1 = new Sensor("Light Sensor", 50);

    building1.add(sensor1);
    district1.add(building1);
    cityManager.add(district1);

    cityManager.checkLighting("Downtown");
}