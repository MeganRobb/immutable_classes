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
public class HOManagement {
    private String staffID;
    private String staffDescrip;
    private double staffDeductions;
    
     private HOManagement(){
   
    }
      private HOManagement(Builder builder){
        staffID=builder.staffID;
        staffDescrip=builder.staffDescrip;
        staffDeductions=builder.staffDeductions;
    }
      
    public static class Builder{
        private String staffID;
    private String staffDescrip;
    private double staffDeductions;
        
             
        public Builder(String staffID) {
            this.staffID = staffID;
        }
        
        public Builder staffDescrip(String value) {
            staffDescrip=value;
            return this;
        }
        
        public Builder staffDeductions(double value) {
            staffDeductions=value;
            return this;
        }
        
        public HOManagement build(){
            return new HOManagement(this);
        }
    }

    public String getStaffID() {
        return staffID;
    }

    public String getStaffDescrip() {
        return staffDescrip;
    }

    public double getStaffDeductions() {
        return staffDeductions;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.staffID != null ? this.staffID.hashCode() : 0);
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
        final HOManagement other = (HOManagement) obj;
        if ((this.staffID == null) ? (other.staffID != null) : !this.staffID.equals(other.staffID)) {
            return false;
        }
        return true;
    }
    
}
