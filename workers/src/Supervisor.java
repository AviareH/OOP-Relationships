import java.util.ArrayList;
public class Supervisor extends BasicWorker{
    private String department;
    public ArrayList<Employee> reportedEmployees = new ArrayList<Employee>();

    public Supervisor(String firstName, String lastName,double hourlySalary, double workHours, int sickDays, String currentTask, String department){
        super(firstName,lastName,hourlySalary,workHours,sickDays,currentTask);
        this.department = department;
    }
    public Supervisor(){
        super("","",28.0,8.0,5,"");
        department = "None";
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void callTeamMeeting(){
        System.out.println("Supervisor "+ super.getFirstName()+ " "+ super.getLastName() +" has called a meeting for: "+ department + ". Attendance is mandatory\n");
    }

    public void reportWorker(Employee employee, String reason){
        System.out.println("Supervisor "+ super.getFirstName()+ " "+ super.getLastName() +" has reported employee: "+employee.getFirstName() + " "+ employee.getLastName() + " for: " +reason+"\n");
        reportedEmployees.add(employee);
    }
    public String toString(){
        return "Employee ID: "+getClass().getSimpleName()+". Name: "+getFirstName()+" "+getLastName()+"\n" +
                "\t" + String.format("Hourly Pay: %.2f\n\tDaily Work Hours: %.2f", getHourlySalary(), getWorkHours())+"\n" +
                "\tSick Days: "+ getSickDays()+"\n" +
                "\tCurrent Task: "+getCurrentTask()+"\n" +
                "\tDepartment : "+getDepartment()+"\n";
    }
}
