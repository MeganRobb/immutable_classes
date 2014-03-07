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
public class Handbags {
    private String stockID;
    private String handbagColor;
    
    
     private Handbags(){
   
    }
      private Handbags(Builder builder){
        stockID=builder.stockID;
        handbagColor=builder.handbagColor;
        
        
    }
      
    public static class Builder{
       private String stockID;
    private String handbagColor;
   
        
             
        public Builder(String staffID) {
            this.stockID = staffID;
        }
        
        public Builder handbagColor(String value) {
            handbagColor=value;
            return this;
        }
        
        public Handbags build(){
            return new Handbags(this);
        }
    }

    public String getStockID() {
        return stockID;
    }

    public String getHandbagColor() {
        return handbagColor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.stockID != null ? this.stockID.hashCode() : 0);
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
        final Handbags other = (Handbags) obj;
        if ((this.stockID == null) ? (other.stockID != null) : !this.stockID.equals(other.stockID)) {
            return false;
        }
        return true;
    }
    
    
}
