/*
Write a java program to maintain the list of Employees who works in the organization. Follow the below given design to develop the above program:
Design a class Employee with EmpId, EmpName & EmpDesignation as private attributes. It contains a parameterized constructor to initialize all the data 
members of class. It also comprises the Getter methods for all the private fields.Design a main class comprising main method. The main class comprises  
an array of Employee object which needs to be initialized with the command line input.It displays the information of Employees from the array using loop.
*/
import java.util.Scanner;

//Creating an employee
class Employee{
    private int empId;
    private String empName, empDesignation;
    Employee(int empId, String empName, String empDestination){
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDestination;
    }
    void setEmpId(int empId){
        this.empId =empId;
    }
    void setEmpName(String name){
        this.empName =name;
    }
    void setEmpDesignation (String empDesignation){
        this.empDesignation =empDesignation;
    }
    int getEmpId(){
        return this.empId;
    }
    String getEmpName(){
        return this.empName;
    }
    String getEmpDesignation(){
        return this.empDesignation;
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner sc= null;
        try{
        sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int num = sc.nextInt();
        // creating array of employees
        Employee[] employee=new Employee[num];
        for (int i=0; i<num; i++){
            System.out.println("Enter Employee id");
            int id = sc.nextInt();
            System.out.println("Enter Employee Name");
            String name = sc.next();
            System.out.println("Enter Employee Designation");
            String designation = sc.next();
            employee[i] = new Employee(id,name,designation);
        }
        // printlning all the employees
        for (Employee emp:employee) {
            System.out.println("Employee ID: "+emp.getEmpId()+"\nEmployee Name: "+emp.getEmpName()+"\nDesignation: "+emp.getEmpDesignation());
        }
        }
        finally{
            if(sc!=null)
            sc.close();
        }
    }
}
