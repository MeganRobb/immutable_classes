/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.config;

import com.meganrobb.immutable_classes.service.crud.BootsCrudService;
import com.meganrobb.immutable_classes.service.crud.DailyTargetsCRudService;
import com.meganrobb.immutable_classes.service.crud.HOEmployeesCrudService;
import com.meganrobb.immutable_classes.service.crud.Impl.BootsCrudServiceImpl;
import com.meganrobb.immutable_classes.service.crud.Impl.DailyTargetsCrudServiceImpl;
import com.meganrobb.immutable_classes.service.crud.Impl.HOEmployeesCrudServiceImpl;
import com.meganrobb.immutable_classes.service.crud.Impl.LocalStoresCrudServiceImpl;
import com.meganrobb.immutable_classes.service.crud.Impl.SellingSandalsCrudServiceImpl;
import com.meganrobb.immutable_classes.service.crud.Impl.StaffSalesCrudServiceImpl;
import com.meganrobb.immutable_classes.service.crud.Impl.SuppliersCrudServiceImpl;
import com.meganrobb.immutable_classes.service.crud.Impl.TransferCrudServiceImpl;
import com.meganrobb.immutable_classes.service.crud.LocalStoresCrudService;
import com.meganrobb.immutable_classes.service.crud.SellingSandalsCrudService;
import com.meganrobb.immutable_classes.service.crud.StaffSalesCrudService;
import com.meganrobb.immutable_classes.service.crud.SuppliersCrudService;
import com.meganrobb.immutable_classes.service.crud.TransferCrudService;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author student
 */
public class AppConfig {
    @Bean(name = "bootsCrudService")
    public BootsCrudService getBootsCrudService(){
        return new BootsCrudServiceImpl();
    }
    
    @Bean(name = "DailTargetsCRudService")
    public DailyTargetsCRudService getDailyTargetsCRudService(){
        return new DailyTargetsCrudServiceImpl();
    }
    @Bean(name = "HOEmployeesCrudService")
    public HOEmployeesCrudService getHOEmployeesCrudService(){
        return new HOEmployeesCrudServiceImpl();
    }
    @Bean(name = "LocalStoresCrudService")
    public LocalStoresCrudService getLocalStoresCrudService(){
        return new LocalStoresCrudServiceImpl();
    }
    @Bean(name = "SellingSandalsCrudService")
    public SellingSandalsCrudService getSellingSandalsCrudService(){
        return new SellingSandalsCrudServiceImpl();
    }
    @Bean(name = "StaffSalesCrudService")
    public StaffSalesCrudService getStallSalesCrudService(){
        return new StaffSalesCrudServiceImpl();
    }
    @Bean(name = "SuppliersCrudService")
    public SuppliersCrudService getSuppliersCrudService(){
        return new SuppliersCrudServiceImpl();
    }
    @Bean(name = "TransferCrudService")
    public TransferCrudService getTransferCrudService(){
        return new TransferCrudServiceImpl();
    }
    
}
