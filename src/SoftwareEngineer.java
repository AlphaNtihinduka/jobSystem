public class SoftwareEngineer extends OfficeJob{
    public SoftwareEngineer(double salary, String startShift, String endShift) {
        super(salary,startShift,endShift);
    }

    @Override
    public void printJobDescription() {
        System.out.println("Salary: "+ salary+ "Start shift: "+startShift+"End shift: "+ "Job: "+endShift+this.getClass().getSimpleName());
    }
}
