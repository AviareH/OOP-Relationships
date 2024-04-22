public class BasicWorker extends Employee{
    private String currentTask;
    public BasicWorker(String firstName, String lastName,double hourlySalary, double workHours, int sickDays, String currentTask){
        super(firstName,lastName,hourlySalary,workHours,sickDays);
        this.currentTask = currentTask;
    }
    public BasicWorker(){
        super("","",23.0,8.0,5);
    }

    public void setCurrentTask(String currentTask){
        this.currentTask = currentTask;
    }
    public String getCurrentTask() {
        return currentTask;
    }

    public void submitWork(){
        System.out.println(super.getFirstName()+ " " + super.getLastName()+ ", has completed: " + currentTask);
        currentTask = "";
    }
}
