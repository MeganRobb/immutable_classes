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
public class MonthlyTarget {
    private String storeID;
    private double monthlySales;
    private double monthlyTarget;
  
    
     private MonthlyTarget(){
   
    }
      private MonthlyTarget(Builder builder){
        storeID=builder.storeID;
        monthlySales=builder.monthlySales;
           monthlyTarget=builder.monthlyTarget;
            
    }
      
    public static class Builder{
        private String storeID;
        private double monthlySales;
        private double monthlyTarget;
        
             
        public Builder(String storeID) {
            this.storeID = storeID;
            
        }
        
        public Builder monthlySales(double value) {
            monthlySales=value;
            return this;
        }
        
        public Builder monthlyTarget(double value) {
            monthlyTarget=value;
            return this;
        }
       
        public MonthlyTarget build(){
            return new MonthlyTarget(this);
        }
    }

    public String getStoreID() {
        return storeID;
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    public double getMonthlyTarget() {
        return monthlyTarget;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + (this.storeID != null ? this.storeID.hashCode() : 0);
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
        final MonthlyTarget other = (MonthlyTarget) obj;
        return !((this.storeID == null) ? (other.storeID != null) : !this.storeID.equals(other.storeID));
    }
    
    
}
