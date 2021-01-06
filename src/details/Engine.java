package details;

public class Engine {
    int power;
    String production;

    public Engine(int power, String production) {
        this.power = power;
        this.production = production;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", production='" + production + '\'' +
                '}';
    }
}
