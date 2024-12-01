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
public class Department {
    public int deptId;
    public String deptName;
    
    public Department(int deptId, String deptName){
        this.deptId = deptId;
        this.deptName = deptName;
    }
    
    //getters
    public int getDeptId(){
        return deptId;
    }
    
    public String getDeptName(){
        return deptName;
    }
    
    //setters
    public void setDeptId(){
        this.deptId = deptId;
    }
    
    public void setDeptName(){
        this.deptName = deptName;
    }
    
    @Override
    public String toString(){
        return "Department Id:" + deptId + "\nDepartment Name:" + deptName;
    }
}
