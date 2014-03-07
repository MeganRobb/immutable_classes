/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.model.sellingPrice;

/**
 *
 * @author student
 */
public class SellingSandals {
     private String stockID;
    private double sellingPrice;
    private double tax;
    private double costPrice;
    
     private SellingSandals(){
   
    }
      private SellingSandals(Builder builder){
        stockID=builder.stockID;
        sellingPrice=builder.sellingPrice;
        costPrice=builder.costPrice;
        tax=builder.tax;
        
    }
      
    public static class Builder{
       private String stockID;
    private double sellingPrice;
    private double tax;
    private double costPrice;
        
             
        public Builder(String stockID) {
            this.stockID = stockID;
        }
        
        public Builder sellingPrice(double value) {
            sellingPrice=value;
            return this;
        }
        public Builder tax(double value) {
            tax=value;
            return this;
        }
        
        public Builder costPrice(double value) {
            costPrice=value;
            return this;
        }
        
        
        public SellingSandals build(){
            return new SellingSandals(this);
        }
    }

    public String getStockID() {
        return stockID;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getTax() {
        return tax;
    }

    public double getCostPrice() {
        return costPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.stockID != null ? this.stockID.hashCode() : 0);
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
        final SellingSandals other = (SellingSandals) obj;
        if ((this.stockID == null) ? (other.stockID != null) : !this.stockID.equals(other.stockID)) {
            return false;
        }
        return true;
    }
    
}
