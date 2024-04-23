import java.util.ArrayList;

public class CEO extends Manager{
    private String stockName;
    private int numberOfShares;
    public CEO(String firstName, String lastName,double hourlySalary, double workHours, int sickDays, String currentTask, String department,double bonus, int managedFloor,String stockName, int numberOfShares) {
        super(firstName,lastName,hourlySalary,workHours,sickDays,currentTask,department,bonus,managedFloor);
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
    }
    public CEO(){
        super("","",56.0,5.0,5,"","",0,0);
        stockName = "None";
        numberOfShares = 0;
    }
    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public int getNumberOfShares() {
        return numberOfShares;
    }
    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }
    public void callCompanyMeeting(){
        System.out.println("CEO "+ super.getFirstName()+ " "+ super.getLastName() +" has called a meeting for the whole company. Attendance is mandatory\n");
    }
    public void fireWorker(int index, ArrayList<Employee> list){
        Employee employee = list.get(index);
        System.out.println("CEO "+ super.getFirstName()+ " "+ super.getLastName()+ " has decided employee: " + employee.getFirstName()+ " " + employee.getLastName()+". Will be let go from the company");
        list.remove(index);

        employee = null;
    }
    public String toString(){
        return "Employee ID: "+getClass().getSimpleName()+". Name: "+getFirstName()+" "+getLastName()+"\n" +
                "\t" + String.format("Hourly Pay: %.2f\n\tDaily Work Hours: %.2f", getHourlySalary(), getWorkHours())+"\n" +
                "\tSick Days: "+ getSickDays()+"\n" +
                "\tCurrent Task: "+getCurrentTask()+"\n" +
                "\tBonus: "+getBonus()+"\n" +
                "\tStock Bonus: "+getStockName()+" - "+ getNumberOfShares()+"\n";
    }
}
