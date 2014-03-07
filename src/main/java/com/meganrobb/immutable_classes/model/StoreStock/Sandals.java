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
public class Sandals {
     private String stockID;
    private String sandalColor;
    private double sandalSize;
    
     private Sandals(){
   
    }
      private Sandals(Builder builder){
        stockID=builder.stockID;
        sandalColor=builder.sandalColor;
        sandalSize=builder.sandalSize;
        
    }
      
    public static class Builder{
       private String stockID;
    private String sandalColor;
    private double sandalSize;
        
             
        public Builder(String staffID) {
            this.stockID = staffID;
        }
        
        public Builder sandalColor(String value) {
            sandalColor=value;
            return this;
        }
        
        public Builder sandalSize(double value) {
            sandalSize=value;
            return this;
        }
        
        public Sandals build(){
            return new Sandals(this);
        }
    }

    public String getStockID() {
        return stockID;
    }

    public String getSandalColor() {
        return sandalColor;
    }

    public double getSandalSize() {
        return sandalSize;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.stockID != null ? this.stockID.hashCode() : 0);
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
        final Sandals other = (Sandals) obj;
        if ((this.stockID == null) ? (other.stockID != null) : !this.stockID.equals(other.stockID)) {
            return false;
        }
        return true;
    }
    
    
}
