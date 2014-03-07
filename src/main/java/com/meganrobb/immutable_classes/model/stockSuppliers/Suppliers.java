/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.model.stockSuppliers;

/**
 *
 * @author student
 */
public class Suppliers {
     private String supplierID;
    private String supplierName;
    private String supplierLOcation;
    
     private Suppliers(){
   
    }
      private Suppliers(Builder builder){
        supplierID=builder.supplierID;
        supplierName=builder.supplierName;
        supplierLOcation=builder.supplierLOcation;
        
    }
      
    public static class Builder{
       private String supplierID;
    private String supplierName;
    private String supplierLOcation;
        
             
        public Builder(String staffID) {
            this.supplierID = staffID;
        }
        
        public Builder supplierName(String value) {
            supplierName=value;
            return this;
        }
        
        public Builder supplierLOcation(String value) {
            supplierLOcation=value;
            return this;
        }
        
        public Suppliers build(){
            return new Suppliers(this);
        }
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierLOcation() {
        return supplierLOcation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.supplierID != null ? this.supplierID.hashCode() : 0);
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
        final Suppliers other = (Suppliers) obj;
        if ((this.supplierID == null) ? (other.supplierID != null) : !this.supplierID.equals(other.supplierID)) {
            return false;
        }
        return true;
    }
    

    
}
