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
public class YearlyTarget {
    private String storeID;
    private double yearlySales;
    private double yearlyTarget;
  
    
     private YearlyTarget(){
   
    }
      private YearlyTarget(Builder builder){
        storeID=builder.storeID;
        yearlySales=builder.yearlySales;
        yearlyTarget=builder.yearlyTarget;
        
    }
      
    public static class Builder{
        private String storeID;
        private double yearlySales;
        private double yearlyTarget;
  
             
        public Builder(String storeID) {
            this.storeID = storeID;
        }
        
        public Builder yearlySales(double value) {
            yearlySales=value;
            return this;
        }
        
        public Builder yearlyTarget(double value) {
            yearlyTarget=value;
            return this;
        }
       
        public YearlyTarget build(){
            return new YearlyTarget(this);
        }
    }

    public String getStoreID() {
        return storeID;
    }

    public double getYearlySales() {
        return yearlySales;
    }

    public double getYearlyTarget() {
        return yearlyTarget;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.storeID != null ? this.storeID.hashCode() : 0);
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
        final YearlyTarget other = (YearlyTarget) obj;
        if ((this.storeID == null) ? (other.storeID != null) : !this.storeID.equals(other.storeID)) {
            return false;
        }
        return true;
    }
    
    
}
