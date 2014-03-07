/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.model.StoreStock;

/**
 *
 * @author student
 */
public class Boots {
    private String stockID;
    private String bootColor;
    private double bootSize;
    
     private Boots(){
   
    }
      private Boots(Builder builder){
        stockID=builder.stockID;
        bootColor=builder.bootColor;
        bootSize=builder.bootSize;
        
    }
      
    public static class Builder{
       private String stockID;
    private String bootColor;
    private double bootSize;
        
             
        public Builder(String staffID) {
            this.stockID = staffID;
        }
        
        public Builder bootColor(String value) {
            bootColor=value;
            return this;
        }
        
        public Builder bootSize(double value) {
            bootSize=value;
            return this;
        }
        
        public Boots build(){
            return new Boots(this);
        }
    }

    public String getStockID() {
        return stockID;
    }

    public String getBootColor() {
        return bootColor;
    }

    public double getBootSize() {
        return bootSize;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.stockID != null ? this.stockID.hashCode() : 0);
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
        final Boots other = (Boots) obj;
        if ((this.stockID == null) ? (other.stockID != null) : !this.stockID.equals(other.stockID)) {
            return false;
        }
        return true;
    }
    
    
}
