package vehicles;

import details.Engine;
import professions.Driver;

public class SportCar extends Car {
    int maxSpeed;

    public SportCar(String carBrand, String carType, int weight, Driver driver, Engine engine) {
        super(carBrand, carType, weight, driver, engine);
    }
}
