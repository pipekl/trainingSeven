package vehicles;

import details.Engine;
import professions.Driver;

public class Lorry extends Car{
    int weightUp;

    public Lorry(String carBrand, String carType, int weight, Driver driver, Engine engine) {
        super(carBrand, carType, weight, driver, engine);
    }
}
