/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.model.stockTransfers;

/**
 *
 * @author student
 */
public class Transfers {
    private String storeID;
    private String storeGoinTo;
    private double quantity;
    
     private Transfers(){
   
    }
      private Transfers(Builder builder){
        storeID=builder.storeID;
        storeGoinTo=builder.storeGoinTo;
        quantity=builder.quantity;
        
    }
      
    public static class Builder{
       private String storeID;
    private String storeGoinTo;
    private double quantity;
        
             
        public Builder(String staffID) {
            this.storeID = staffID;
        }
        
        public Builder storeGoinTo(String value) {
            storeGoinTo=value;
            return this;
        }
        
        public Builder quantity(double value) {
            quantity=value;
            return this;
        }
        
        public Transfers build(){
            return new Transfers(this);
        }
    }

    public String getStoreID() {
        return storeID;
    }

    public String getStoreGoinTo() {
        return storeGoinTo;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.storeID != null ? this.storeID.hashCode() : 0);
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
        final Transfers other = (Transfers) obj;
        if ((this.storeID == null) ? (other.storeID != null) : !this.storeID.equals(other.storeID)) {
            return false;
        }
        return true;
    }
    
    
    
}
