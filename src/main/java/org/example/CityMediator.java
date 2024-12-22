package org.example;

import java.util.Objects;

class CityMediator {
    public void checkLighting(District district) {
        for (CityComponent component : district.getComponents()) {
            if (component instanceof Building building) {
                for (CityComponent sensor : building.getSensors()) {
                    if ((sensor instanceof Sensor) && Objects.equals(((Sensor) sensor).getName(), "Light Sensor") && (sensor.getData() <= 50)) {
                        System.out.println(((Sensor) sensor).getName() +" in " + building.getName() + " is active.");
                    }
                }
            }
        }
    }

    public void checkTrafficJam(District district) {
        for (CityComponent component : district.getComponents()) {
            if (component instanceof Building building) {
                for (CityComponent sensor : building.getSensors()) {
                    if ((sensor instanceof Sensor)
                            && Objects.equals(((Sensor) sensor).getName(), "Traffic Sensor")
                            && (sensor.getData() > 5)) {
                        System.out.println(((Sensor) sensor).getName() + " in " + building.getName() + " detected heavy traffic. Traffic controllers are sent.");
                    }
                }
            }
        }
    }

    public void checkTemperature(District district) {
        for (CityComponent component : district.getComponents()) {
            if (component instanceof Building building) {
                for (CityComponent sensor : building.getSensors()) {
                    if ((sensor instanceof Sensor)
                            && Objects.equals(((Sensor) sensor).getName(), "Temperature Sensor")
                            && (sensor.getData() < 17)) {
                        System.out.println(((Sensor) sensor).getName() + " in " + building.getName() + " detected low temperature. Heaters are turned on.");
                    }
                }
            }
        }
    }

}

