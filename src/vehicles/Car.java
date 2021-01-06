package vehicles;

import details.Engine;
import professions.Driver;

public class Car {
    String carBrand;
    String carType;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String carBrand, String carType, int weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start () {
        System.out.println("Поехали");
    }

    public void stop () {
        System.out.println("Остановились");
    }

    public void turnRight () {
        System.out.println("Повернули направо");
    }

    public void turnLeft () {
        System.out.println("Повернули налево");
    }

    public static void printInfo(Car car) {
        System.out.println(car);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carType='" + carType + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
