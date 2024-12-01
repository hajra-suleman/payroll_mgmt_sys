package payroll.management.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hajra
 */
public class Salary {
    private int id;
    private double basicPay;
    private double allowances;
    private double deductions;
    
    public Salary(int id, double basicPay, double allowances, double deductions){
        this.id = id;
        this.allowances = allowances;
        this.basicPay = basicPay;
        this.deductions = deductions;
    }
    
    public double calculateNetSalary(){
        return basicPay + allowances - deductions;
    }
    
    //getters
    public int getId(){
        return id;
    }
    
    public double getBasicPay(){
        return basicPay;
    }
    
    public double getAllowances(){
        return allowances;
    }
     
    public double getDeductions(){
        return deductions;
    }
      
    //setters
    public void setId(int id){
        this.id = id;
    }
    
     public void setBasicPay(double basicPay){
        this.basicPay = basicPay;
    }
     
      public void setAllowances(double allowances){
        this.allowances = allowances;
    }
      
       public void setDeductions(double deductions){
        this.deductions = deductions;
    }
       
    @Override
    public String toString(){
        return "Salary Details:\n" + "Employee Id:\n" + id + "Basic Pay:\n" + basicPay + "Allowances:\n" 
                + allowances + "Deductions:\n" + deductions + "Net Salary:" + calculateNetSalary();
    }
}
