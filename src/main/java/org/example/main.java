package org.example;

public class main {
    public static void main(String[] args) {
        SmartCityManager cityManager = new SmartCityManager();

        District district1 = new District("Downtown");
        Building building1 = new Building("Park");
        Sensor lightSensor = new Sensor("Light Sensor", 30);

        building1.add(lightSensor);
        district1.add(building1);
        cityManager.add(district1);

        cityManager.checkLighting("Downtown");
    }
}

