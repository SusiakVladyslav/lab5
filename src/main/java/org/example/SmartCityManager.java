package org.example;
import java.util.ArrayList;
import java.util.List;


class SmartCityManager {
    private List<CityComponent> districts = new ArrayList<>();
    private CityMediator mediator;

    public SmartCityManager() {
        this.mediator = new CityMediator();
    }

    public void add(CityComponent district) {
        districts.add(district);
    }

    public void checkLighting(String districtName) {
        for (CityComponent district : districts) {
            if (district instanceof District && ((District) district).getName().equals(districtName)) {
                mediator.checkLighting((District) district);
            }
        }
    }

    public List<CityComponent> getDistricts() {
        return districts;
    }
}
