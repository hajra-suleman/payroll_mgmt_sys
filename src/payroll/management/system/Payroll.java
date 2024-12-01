package payroll.management.system;


import payroll.management.system.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hajra
 */
public class Payroll {
    private Person employee;
    private double salary;
    private String payDate;
    private String payPeriod;
    
    public Payroll(Person employee, double salary, String payDate, String payPeriod){
        this.employee = employee;
        this.salary = salary;
        this.payDate = payDate;
        this.payPeriod = payPeriod;
    }
    
    //getters
    public Person getEmployee(){
        return employee;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getPayDate(){
        return payDate;
    }
    
    public String getPayPeriod(){
        return payPeriod;
    }
    
    //setters
    public void setEmployee(){
        this.employee = employee ;
    }
    
     public void setSalary(){
        this.salary = salary;
    }
     
      public void setPayDate(){
        this.payDate = payDate;
    }
      
       public void setPayPeriod(){
        this.payPeriod = payPeriod;
    }
       
    @Override
    public String toString(){
        return  "Payroll Details:\n" + "Employee:" + employee + "\nSalary:" + salary + "\nPayDate:" + payDate
                + "\nPayPeriod:" + payPeriod;      
    }
}
