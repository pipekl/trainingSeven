import details.Engine;
import professions.Driver;
import vehicles.Car;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Driver driver1 = new Driver("John", 20, 40);
        Engine engine1 = new Engine(300, "VW");
        Car car1 = new Car ("Toyota", "Camry", 1200, driver1, engine1);

        car1.start();
        car1.stop();
        car1.turnRight();
        car1.turnLeft();

        Car.printInfo(car1);
    }
}
