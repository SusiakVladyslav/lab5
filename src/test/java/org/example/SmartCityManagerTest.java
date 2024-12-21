package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmartCityManagerTest {
    @Test
    void testBuidlingAddedToTheDistrict() {
        SmartCityManager cityManager = new SmartCityManager();

        District district = new District("Downtown");
        Building building = new Building("Park");

        district.add(building);
        cityManager.add(district);
        district.getBuildingNames();

        assertEquals("Park", district.getBuildingNames(), "getBuildingNames didn't show the expect buildings");
    }

    @Test
    void testSensorAddedToTheBuilding() {
        SmartCityManager cityManager = new SmartCityManager();

        District district = new District("Downtown");
        Building building = new Building("Park");
        Sensor sensor1 = new Sensor("Light Sensor", 45);

        building.add(sensor1);
        district.add(building);
        cityManager.add(district);
        district.getSensorNames();

        assertEquals("Light Sensor", district.getSensorNames(), "getSensorNames didn't show the expect buildings");
    }

    @Test
    void testCityLightingNotification() {
        SmartCityManager cityManager = new SmartCityManager();

        District district = new District("Downtown");
        Building building = new Building("Park");
        Sensor sensor1 = new Sensor("Light Sensor", 45);

        building.add(sensor1);
        district.add(building);
        cityManager.add(district);

        assertNotEquals("Notification", cityManager.checkLighting("Downtown"),"Error, checkLighting send a notification when it shouldn't");
    }
}