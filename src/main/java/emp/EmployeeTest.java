package emp;

import java.io.*;

public class EmployeeTest {
    public static void main(String []args){
        Employee empOne = new Employee("Jack Jones");
        Employee empTwo = new Employee("Jackie Chan");

        empOne.empAge(13);
        empOne.empDesignation("Chiefing");
        empOne.empSalary(50000);
        empOne.printEmployee();

        empTwo.empAge(20);
        empTwo.empDesignation("Ballin'");
        empTwo.empSalary(50000);
        empTwo.printEmployee();
    }
}
