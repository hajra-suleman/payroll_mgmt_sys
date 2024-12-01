package payroll.management.system;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hajra
 *
**/
    
public class Person implements Serializable {
    protected String name;
    protected int id;
    protected int age;
    protected String address;
    protected String email;
    protected String phonenumber;
                    
    //public constructor
    public Person(int id, String name, int age, String address, String email, String phonenumber){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phonenumber = phonenumber;
    }
    
    //getters
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phonenumber;
    }
    
    //Setters
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhoneNumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    
    @Override
    public String toString(){
        return "ID:" + id + "\n" + "Name:" + name + "\n" + "Age:" + age + "\nAddress:" + address + "\nEmail:" + email
                + "\nPhone Number:" + phonenumber;
    }
}
