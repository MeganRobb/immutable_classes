/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.model.targets;

/**
 *
 * @author student
 */
public class DailyTarget {
    private String storeID;
    private double dailySales;
    private double dailyTarget;
  
    
     private DailyTarget(){
   
    }
      private DailyTarget(Builder builder){
        storeID=builder.storeID;
        dailySales=builder.dailySales;
        dailyTarget=builder.dailyTarget;
    }
      
    public static class Builder{
        private String storeID;
    private double dailySales;
    private double dailyTarget;
        
             
        public Builder(String storeID) {
            this.storeID = storeID;
        }
        
        public Builder dailySales(double value) {
            dailySales=value;
            return this;
        }
        
        public Builder dailyTarget(double value) {
            dailyTarget=value;
            return this;
        }
       
        public DailyTarget build(){
            return new DailyTarget(this);
        }
    }

    public String getStoreID() {
        return storeID;
    }

    public double getDailySales() {
        return dailySales;
    }

    public double getDailyTarget() {
        return dailyTarget;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.storeID != null ? this.storeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DailyTarget other = (DailyTarget) obj;
        return !((this.storeID == null) ? (other.storeID != null) : !this.storeID.equals(other.storeID));
    }
    

    
}
