import java.util.ArrayList;

public abstract class OutsideJob implements Job{
    double salary;
    String startShift;
    String endShift;
    ArrayList<Person> outSideWorkers = new ArrayList<>();
//    salary, startShift, endShift

    // Define OfficeJob constructor
    public OutsideJob(double salary, String startShift, String endShift) {
        System.out.println("Outside job initialized.");
        this.salary = salary;
        this.startShift = startShift;
        this.endShift = endShift;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getStartShift() {
        return startShift;
    }


    public void setStartShift(String startShift) {
        this.startShift = startShift;
    }

    @Override
    public String getEndShift() {
        return endShift;
    }

    public void setEndShift(String endShift) {
        this.endShift = endShift;
    }

    @Override
    public void printJobDescription() {
        System.out.println("Salary: "+ salary+ "Start shift: "+startShift+"End shift: "+endShift+this.getClass().getSimpleName());
    }

    // Print workeers
    @Override
    public void printWorkers() {
        for (Person worker: outSideWorkers) {
            System.out.println(worker);
        }
    }

    // Hire a person
    @Override
    public void hirePerson(Person person) {
        outSideWorkers.add(person);
    }

    // remove a work from ArrayList
    @Override
    public void firePerson(Person person) {
        outSideWorkers.remove(person);
    }
}
