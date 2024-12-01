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
 */
public class Position implements Serializable {
    private int positionId;
    private String positionName;
    
    //public constructor
    public Position(int positionId, String positionName){
        this.positionId = positionId;
        this.positionName = positionName;
    }
    
    //getters
    public int getPositionId(){
        return positionId;
    }
    
    public String getPositionName(){
        return positionName;
    }
    
    //setters
    public void setPositionId(int positionId){
        this.positionId = positionId;
    }
    
    public void setPositionName(String positionName){
        this.positionName = positionName;
    }
    
    @Override
    public String toString(){
        return "Position Id:" + positionId + "\nPosition Name:" + positionName;
    }
}
