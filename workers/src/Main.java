public class Main {

    public static void main(String[] args) {
        BasicWorker employee1 = new BasicWorker("Jack","Smith",23.00,8.00,5,"Data Entry");
        System.out.println(employee1);
        employee1.submitWork();


        Supervisor employee2 = new Supervisor("Brian","O'Conner",28.00,8.00,7,"Supervising","Fiances");
        System.out.println(employee2);
        employee2.callTeamMeeting();


        Manager employee3 = new Manager("Kelly","Specter",31,8.00,8,"Contacting Subcontractors","None",3000.00,3);
        System.out.println(employee3);
        employee3.submitWork();
        employee3.callFloorMeeting();

        CEO employee4 = new CEO("Angie","Sobti",100,6.00,10,"Analyzing Data","None",9000,0,"AAPL",50);
        System.out.println(employee4);
        employee4.callCompanyMeeting();


        employee2.reportWorker(employee1,"Arriving to work drunk");
        employee3.fireWorkerRequest(0, employee2.reportedEmployees);
        employee4.fireWorker(0, employee3.requestedFireEmployees);

        System.out.println("\n\nEnd of The Day:\n");
        System.out.println(employee2.getFirstName()+" "+employee2.getLastName()+String.format(": \n\t$%.2f",employee2.calculatePay()));
        System.out.println(employee3.getFirstName()+" "+employee3.getLastName()+String.format(": \n\t$%.2f\n\t+%.2f",employee3.calculatePay(), employee3.getBonus()));
        System.out.println(employee4.getFirstName()+" "+employee4.getLastName()+String.format(": \n\t$%.2f\n\t+%.2f",employee4.calculatePay(), employee4.getBonus()));

    }
}