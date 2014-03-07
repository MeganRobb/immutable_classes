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
public class HOEmployees {
    private String staffID;
    private String staffDescrip;
    private double staffDeductions;
    
     private HOEmployees(){
   
    }
      private HOEmployees(Builder builder){
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
        
        public HOEmployees build(){
            return new HOEmployees(this);
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
        int hash = 7;
        hash = 37 * hash + (this.staffID != null ? this.staffID.hashCode() : 0);
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
        final HOEmployees other = (HOEmployees) obj;
        if ((this.staffID == null) ? (other.staffID != null) : !this.staffID.equals(other.staffID)) {
            return false;
        }
        return true;
    }
    
    
}
