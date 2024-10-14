//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer(2000, "8:00", "5:00");

        TaxiDriver taxiDriver = new TaxiDriver(500, "7:00", "6:00");

        softwareEngineer.printJobDescription();
        taxiDriver.printJobDescription();
    }
}