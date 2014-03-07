/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.model.sales;

/**
 *
 * @author student
 */
public class StaffSales {
     private String staffID;
    private double dailySales;
    private double staffQuantity;
    
     private StaffSales(){
   
    }
      private StaffSales(Builder builder){
        staffID=builder.staffID;
        dailySales=builder.dailySales;
        staffQuantity=builder.staffQuantity;
        
    }
      
    public static class Builder{
        private String staffID;
        private double dailySales;
        private double staffQuantity;
        
       
        
        
        public Builder(String staffID) {
            this.staffID = staffID;
        }
        
        public Builder dailySales(double value) {
            dailySales=value;
            return this;
        }
        
        public Builder staffQuantity(double value) {
            staffQuantity=value;
            return this;
        }
        public StaffSales build(){
            return new StaffSales(this);
        }
    }

    public String getStaffID() {
        return staffID;
    }

    public double getDailySales() {
        return dailySales;
    }

    public double getStaffQuantity() {
        return staffQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.staffID != null ? this.staffID.hashCode() : 0);
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
        final StaffSales other = (StaffSales) obj;
        if ((this.staffID == null) ? (other.staffID != null) : !this.staffID.equals(other.staffID)) {
            return false;
        }
        return true;
    }
    
    
    
}
