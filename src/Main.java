import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer(2000, "8:00", "5:00");

        TaxiDriver taxiDriver = new TaxiDriver(500, "7:00", "6:00");

        softwareEngineer.printJobDescription();
        taxiDriver.printJobDescription();

        Person tem = new Person("Temesghen", 26, 100);
        Person alpha = new Person("alpha", 25, 1300);
        Person babu = new Person("babu", 23, 1400);
        Person abdu = new Person("abdu", 21, 1600);
        Person huseyin = new Person("huseyin", 11, 500);
        Person emma = new Person("emma", 31, 550);
        Person veronic = new Person("veronic", 11, 1500);
        Person mellisa = new Person("mellisa", 31, 1500);
        Person erica = new Person("erica", 41, 1500);
        Person peter = new Person("peter", 23, 1500);

        ArrayList<Person> workers  = new ArrayList<>(List.of(tem, alpha, babu, abdu, huseyin, emma, veronic, mellisa, erica, peter));

    }
}