public class BasicWorker extends Employee{
    private String currentTask;
    public BasicWorker(String firstName, String lastName,double hourlySalary, double workHours, int sickDays, String currentTask){
        super(firstName,lastName,hourlySalary,workHours,sickDays);
        this.currentTask = currentTask;
    }
    public BasicWorker(){
        super("","",23.0,8.0,5);
        currentTask = "None";
    }

    public void setCurrentTask(String currentTask){
        this.currentTask = currentTask;
    }
    public String getCurrentTask() {
        return currentTask;
    }

    public void submitWork(){
        System.out.println(super.getFirstName()+ " " + super.getLastName()+ ", has completed: " + currentTask+"\n");
        currentTask = "None";
    }
    public String toString(){
        return "Employee ID: "+getClass().getSimpleName()+". Name: "+getFirstName()+" "+getLastName()+"\n" +
                "\t" + String.format("Hourly Pay: %.2f\n\tDaily Work Hours: %.2f", getHourlySalary(), getWorkHours())+"\n" +
                "\tSick Days: "+ getSickDays()+"\n" +
                "\tCurrent Task: "+getCurrentTask()+"\n";
    }

}
