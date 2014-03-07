/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.model.salaries;

/**
 *
 * @author student
 */
public class StoreFullTime {
    private String staffID;
    private double staffRate;
    private double staffHours;
    private double staffDeductions;
    
     private StoreFullTime(){
   
    }
      private StoreFullTime(Builder builder){
        staffID=builder.staffID;
        staffRate=builder.staffRate;
        staffHours=builder.staffHours;
        staffDeductions=builder.staffDeductions;
        
    }
      
    public static class Builder{
        private String staffID;
        private double staffRate;
        private double staffHours;
        private double staffDeductions;
        
             
        public Builder(String staffID) {
            this.staffID = staffID;
        }
        
        public Builder staffRate(double value) {
            staffRate=value;
            return this;
        }
        
        public Builder staffHours(double value) {
            staffHours=value;
            return this;
        }
        public Builder staffDeductions(double value) {
            staffDeductions=value;
            return this;
        }
        public StoreFullTime build(){
            return new StoreFullTime(this);
        }
    }

    public String getStaffID() {
        return staffID;
    }

    public double getStaffRate() {
        return staffRate;
    }

    public double getStaffHours() {
        return staffHours;
    }

    public double getStaffDeductions() {
        return staffDeductions;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (this.staffID != null ? this.staffID.hashCode() : 0);
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
        final StoreFullTime other = (StoreFullTime) obj;
        return !((this.staffID == null) ? (other.staffID != null) : !this.staffID.equals(other.staffID));
    }
    
    
}
