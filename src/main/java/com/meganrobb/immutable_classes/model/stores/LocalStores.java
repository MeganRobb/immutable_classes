/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.model.stores;

/**
 *
 * @author student
 */
public class LocalStores {
    private String storeID;
    private String storeAddress;
    private String telephone;
    
     private LocalStores(){
   
    }
      private LocalStores(Builder builder){
        storeID=builder.storeID;
        storeAddress=builder.storeAddress;
        telephone=builder.telephone;
        
    }
      
    public static class Builder{
       private String storeID;
    private String storeAddress;
    private String telephone;
        
             
        public Builder(String staffID) {
            this.storeID = staffID;
        }
        
        public Builder storeAddress(String value) {
            storeAddress=value;
            return this;
        }
        
        public Builder telephone(String value) {
            telephone=value;
            return this;
        }
        
        public LocalStores build(){
            return new LocalStores(this);
        }
    }

    public String getStoreID() {
        return storeID;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.storeID != null ? this.storeID.hashCode() : 0);
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
        final LocalStores other = (LocalStores) obj;
        if ((this.storeID == null) ? (other.storeID != null) : !this.storeID.equals(other.storeID)) {
            return false;
        }
        return true;
    }
    
    
}
