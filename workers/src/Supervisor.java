public class Supervisor extends BasicWorker{
    private String department;
    public Supervisor(String firstName, String lastName,double hourlySalary, double workHours, int sickDays, String currentTask, String department){
        super(firstName,lastName,hourlySalary,workHours,sickDays,currentTask);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    public void callTeamMeeting(){
        System.out.println("Supervisor "+ super.getFirstName()+ " "+ super.getLastName() +", has called a meeting for "+ department + ". Attendance is mandatory");
    }
}
