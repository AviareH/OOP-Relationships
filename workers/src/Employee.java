import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;
public class Employee {
    private String firstName;
    private String lastName;
    private double hourlySalary;
    private double workHours;
    private int sickDays;

    private LocalTime startTime;
    private LocalTime endTime;

    public Employee(String firstName, String lastName,double hourlySalary, double workHours, int sickDays){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlySalary = hourlySalary;
        this.workHours = workHours;
        this.sickDays = sickDays;
    }
    public Employee(){
        firstName = "";
        lastName = "";
        hourlySalary = 23.0;
        workHours = 8.0;
        sickDays = 5;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setHourlySalary(double hourlySalary){
        this.hourlySalary = hourlySalary;
    }
    public void setWorkHours(double workHours) {this.workHours = workHours;}
    public void setSickDays(int sickDays){
        this.sickDays = sickDays;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getHourlySalary(){
        return hourlySalary;
    }
    public double getWorkHours(){
        return workHours;
    }
    public int getSickDays(){
        return sickDays;
    }

    public double calculatePay(){
        return hourlySalary*workHours;
    }
}
