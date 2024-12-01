package payroll.management.system;
import payroll.management.system.Department;
import payroll.management.system.Person;
import payroll.management.system.Position;
import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    /**
     *
     * @author Hajra
     */
    public class Employee extends Person implements Serializable{
      private Department department;
      private Position position;

        //constructor
        public Employee(Department department, Position position, int id, String name, int age, String address,
                String email, String phonenumber) {     
            super(id, name, age, address, email, phonenumber);
            this.department = department;
            this.position = position;
           
        }  
        
        //getters
        public Department getDepartment(){
            return department;
        }
    
        public Position getPosition(){
            return position;
        }
        
        //setters
        public void setDepartment(Department department){
          this.department = department;  
        }
        
        public void setPosition(Position position){
          this.position = position;  
        }
        
    @Override    
    public String toString(){
        return super.toString() + "\nDepartment:\n" + department + "\nPosition:\n" + position;
} 

    int getid() {
        return id; //To change body of generated methods, choose Tools | Templates.
    }

   
    }
   

  

