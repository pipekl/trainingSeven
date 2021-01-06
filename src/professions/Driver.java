package professions;

public class Driver extends Person {
    String name;
    int experience;

    public Driver(String name, int experience, int age) {
        super(age);
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", age=" + age +
                '}';
    }
}
