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
public class StoreSales {
    private String storeID;
    private double dailySales;
    private double dailyQuantity;
    
     private StoreSales(){
   
    }
      private StoreSales(Builder builder){
        storeID=builder.storeID;
        dailySales=builder.dailySales;
        dailyQuantity=builder.dailyQuantity;
        
    }
      
    public static class Builder{
        private String storeID;
        private double dailySales;
        private double dailyQuantity;
        
       
        
        
        public Builder(String storeID) {
            this.storeID = storeID;
        }
        
        public Builder dailySales(double value) {
            dailySales=value;
            return this;
        }
        
        public Builder dailyQuantity(double value) {
            dailyQuantity=value;
            return this;
        }
        public StoreSales build(){
            return new StoreSales(this);
        }
    }

    public String getStoreID() {
        return storeID;
    }

    public double getDailySales() {
        return dailySales;
    }

    public double getDailyQuantity() {
        return dailyQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.storeID != null ? this.storeID.hashCode() : 0);
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
        final StoreSales other = (StoreSales) obj;
        if ((this.storeID == null) ? (other.storeID != null) : !this.storeID.equals(other.storeID)) {
            return false;
        }
        return true;
    }
    
    
}
