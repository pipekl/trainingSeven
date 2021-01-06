import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Василий", "Петров", "юридический", 4.5);
        Student student2 = new Student("Федр", "Иванов", "медицинский", 5);
        Student student3 = new Student("Петр", "Смирнов", "юридический", 3.3);

        Aspirant aspirant1 = new Aspirant("Инокентий", "Караваев", "инженер", 5, "Желуди");
        Aspirant aspirant2 = new Aspirant("Адександр", "Попов", "биологический", 4.3, "Желуди");
        Aspirant aspirant3 = new Aspirant("Дмитрий", "Груздь", "бухгалтер", 2.1, "Желуди");

        Student[] array = {student1, student2, student3, aspirant1, aspirant2, aspirant3};

        for (Student student : array) {
            System.out.println(student.firstName + " " + student.lastName +": " + student.getScholarship());
        }
    }
}
