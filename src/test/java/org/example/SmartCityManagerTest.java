package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmartCityManagerTest {

    @Test
    void testBuildlingAddedToTheDistrict() {
        SmartCityManager cityManager = new SmartCityManager();

        District district = new District("Downtown");
        Building building = new Building("Park");

        district.add(building);
        cityManager.add(district);

        boolean buildingFound = false;
        for (CityComponent component : district.getComponents()) {
            if (component instanceof Building && ((Building) component).getName().equals("Park")) {
                buildingFound = true;
                break;
            }
        }
        assertTrue(buildingFound, "Building 'Park' didn't get added to the district");
    }

    @Test
    void testSensorAddedToTheBuilding() {
        SmartCityManager cityManager = new SmartCityManager();

        District district = new District("Downtown");
        Building building = new Building("Park");
        Sensor sensor1 = new Sensor("Light Sensor", 45);

        cityManager.add(district);
        district.add(building);
        building.add(sensor1);

        boolean sensorFound = false;
        for (CityComponent component : building.getSensors()) {
            if (component instanceof Sensor && ((Sensor) component).getName().equals("Light Sensor")) {
                sensorFound = true;
                break;
            }
        }
        assertTrue(sensorFound, "Sensor 'Light Sensor' didn't get added to the building");
    }
}