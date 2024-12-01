/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.management.system;
import java.util.Scanner;

/**
 *11
 * @author Hajra
 */
public class PayrollManagementSystem {
    static Employee[] employees = new Employee[20];
    static Salary[] salaries = new Salary[20];
    static int employeecount = 0;
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

        while(true){
            EmployeeManagementMenu();    
        }
    }
    public static void EmployeeManagementMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== Employee Menu ===========");
        System.out.println("1. Create new employee");
        System.out.println("2. View existing employee data");
        System.out.println("3. Update employee data");
        System.out.println("4. Delete employee data");
        System.out.println("0.Exit");
        System.out.println("Enter Selection:");
        int selection = sc.nextInt();

        switch(selection) {
            case 0:
                ExitProgram();
                break;
            case 1:
                Employee e = CreateEmployee();
                employees[employeecount] = e;
                employeecount++;
                //System.out.println(e.toString());
                break;
            case 2:
                ViewEmployee();
                break;
            case 3:
                UpdateEmployee();
                break;
            case 4:
                DeleteEmployee();
                break;
            case 5:
                createEmployeeSalary();
                break;
            default:
                System.out.print("Invalid selection.Please try again.");
        }
    }

    //function for input
    //access modifier, return type, function name
    public static Employee CreateEmployee() {
        System.out.print("Create Employee >>>\n");
        //scanner for input
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter employee id:");
        int id = myObj.nextInt();

        System.out.print("Enter employee name:");
        String name = myObj.next();

        System.out.print("Enter employee age:");
        int age = myObj.nextInt();

        System.out.print("Enter employee address:");
        String address = myObj.next();

        System.out.print("Enter employee email:");
        String email = myObj.next();

        System.out.print("Enter employee phone number:");
        String phonenumber = myObj.next();
        
        myObj.nextLine();

        System.out.print("Enter department id:");
        int deptId = myObj.nextInt();
        myObj.nextLine();
        
        System.out.print("Enter Department Name:");
        String deptName = myObj.next();
        Department department = new Department(deptId, deptName);
        
        System.out.print("Enter position id:");
        int positionId = myObj.nextInt();
        
        System.out.print("Enter position Name:");
        String positionName =myObj.next();
        Position position = new Position(positionId, positionName);
        
        Employee e = new Employee(department, position, id, name, age, address, email, phonenumber);

        return e;
    }  

    public static Salary CreateSalary(int employeeId){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter basic pay:");
        double basicPay = myObj.nextDouble();
        System.out.println("Enter allowances:");
        double allowances = myObj.nextDouble();
        System.out.println("Enter deductions:");
        double deductions = myObj.nextDouble();
        
           return new Salary(employeeId, basicPay, allowances, deductions);     
    }
    
    public static void ViewEmployee (){
         Scanner myObj = new Scanner(System.in);

         System.out.print("Enter employee id:");
        int id = myObj.nextInt();

        for(int i=0; i < employeecount; i++){
            if(id == employees[i].id) {
                // print it
                System.out.println(employees[i]);
                return;
            }     
        }
        // print employee not found
        System.out.println("Employee not found!");
    }

    public static void UpdateEmployee(){
        Scanner myObj = new Scanner(System.in);
        int employee_index = -1;

        System.out.print("Enter employee id:");
        int id = myObj.nextInt();

        for(int i=0; i < employeecount; i++){
            if(id == employees[i].id) {
                System.out.println("Stored employee data:");
                System.out.println(employees[i]);
                employee_index = i;
            }
        }

        if(employee_index != -1) { // employee found
            System.out.println("Update employee data:");

            System.out.print("Enter employee name:");
            String name = myObj.next();
            if(name.compareTo("") != 0)
                employees[employee_index].name = name;

            System.out.print("Enter employee age:");
            int age = myObj.nextInt();
            if(age != employees[employee_index].age)
                employees[employee_index].age = age;

            System.out.print("Enter employee address:");
            String address = myObj.next();
            if(address.compareTo("") != 0)
                employees[employee_index].address = address;

            System.out.print("Enter employee email:");
            String email = myObj.next();
            if(email.compareTo("") != 0)
                employees[employee_index].email = email;

            System.out.print("Enter employee phone number:");
            String phonenumber = myObj.next();
            if(phonenumber.compareTo("") != 0)
                employees[employee_index].phonenumber = phonenumber;

        } else {
            System.out.println("Employee not found!");
        }
    }

    public static void DeleteEmployee(){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter employee id:");
        int id = myObj.nextInt();

        for(int i=0; i<employeecount; i++){
            if(id == employees[i].id){
                for(int j=i; j<employeecount-1; j++){
                    employees[j] = employees[j+1];
                    salaries[j] = salaries[j+1];
                }
                employees[employeecount-1] = null;
                salaries[employeecount-1] = null;
                employeecount--;
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
                 System.out.println("Employee not found!");
    }
    
    public static void createEmployeeSalary(){
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter employee id to create salary:");
        int id = myObj.nextInt();
        
        Salary s = CreateSalary(id);
        for(int i=0; i<employeecount; i++){
            if(id == employees[i].getid())
                salaries[i] = s;
            System.out.println("Salary created successfully for employee id:" + id );
            return;
        }
            System.out.println("Employee not found!");
    }
        
public static void viewEmployeeSalary(){
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter employee id to view salary:");
        int id = myObj.nextInt();
        
        for(int i=0; i<employeecount; i++){
            if( id == employees[i].getid()){
                if(salaries[i] != null){
                    System.out.println(salaries[i]);
                }       else{
                    System.out.println("Salary not created for this employee.");
                        }  
                    return;
            }
        }  
        System.out.println("Employee not found!");
}
                    

            
    public static void ExitProgram(){
        System.out.println("Exiting program ...");
        System.exit(0);
    }
    }


