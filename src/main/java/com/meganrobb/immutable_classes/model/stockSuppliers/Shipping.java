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
public class Shipping {
     private String shipID;
    private String shipArrival;
    private double shipCost;
    private String shipName;
    
     private Shipping(){
   
    }
      private Shipping(Builder builder){
        shipID=builder.shipID;
        shipArrival=builder.shipArrival;
        shipCost=builder.shipCost;
        shipName=builder.shipName;
        
    }
      
    public static class Builder{
       private String shipID;
    private String shipArrival;
    private double shipCost;
    private String shipName;
        
             
        public Builder(String shipID) {
            this.shipID = shipID;
        }
        
        public Builder shipArrival(String value) {
            shipArrival=value;
            return this;
        }
        
        public Builder shipCost(double value) {
            shipCost=value;
            return this;
        }
        public Builder shipName(String value) {
            shipName=value;
            return this;
        }
        
        public Shipping build(){
            return new Shipping(this);
        }
    }

    public String getShipID() {
        return shipID;
    }

    public String getShipArrival() {
        return shipArrival;
    }

    public double getShipCost() {
        return shipCost;
    }

    public String getShipName() {
        return shipName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.shipID != null ? this.shipID.hashCode() : 0);
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
        final Shipping other = (Shipping) obj;
        if ((this.shipID == null) ? (other.shipID != null) : !this.shipID.equals(other.shipID)) {
            return false;
        }
        return true;
    }

    
}
