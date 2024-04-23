import java.util.ArrayList;

public class Manager extends Supervisor{
    private double bonus;
    private int managedFloor;
    public ArrayList<Employee> requestedFireEmployees = new ArrayList<Employee>();

    public Manager(String firstName, String lastName,double hourlySalary, double workHours, int sickDays, String currentTask, String department,double bonus, int managedFloor){
        super(firstName,lastName,hourlySalary,workHours,sickDays,currentTask,department);
        this.bonus = bonus;
        this.managedFloor = managedFloor;

    }
    public Manager(){
        super("","",32.0,8.0,5,"","");
        bonus = 0.0;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setManagedFloor(int managedFloor) {
        this.managedFloor = managedFloor;
    }
    public int getManagedFloor() {
        return managedFloor;
    }
    public double getBonus() {
        return bonus;
    }

    public ArrayList<Employee> getRequestedFireEmployees() {
        return requestedFireEmployees;
    }

    public void callFloorMeeting(){
        System.out.println("Manager "+ super.getFirstName()+ " "+ super.getLastName() +" has called a meeting for: Floor "+ managedFloor + ". Attendance is mandatory\n");
    }
    public void fireWorkerRequest(int index, ArrayList<Employee> list){
        Employee employee = list.get(index);
        System.out.println("Manager "+ super.getFirstName()+ " "+ super.getLastName()+ " has put in a official fire request for employee: " + employee.getFirstName()+ " " + employee.getLastName()+"\n");
        list.remove(index);
        requestedFireEmployees.add(employee);
    }
    public String toString(){
        return "Employee ID: "+getClass().getSimpleName()+". Name: "+getFirstName()+" "+getLastName()+"\n" +
                "\t" + String.format("Hourly Pay: %.2f\n\tDaily Work Hours: %.2f", getHourlySalary(), getWorkHours())+"\n" +
                "\tSick Days: "+ getSickDays()+"\n" +
                "\tCurrent Task: "+getCurrentTask()+"\n" +
                "\t" +String.format("Bonus: %.2f", getBonus())+"\n" +
                "\tManaged Floor: "+getManagedFloor()+"\n";
    }

}
