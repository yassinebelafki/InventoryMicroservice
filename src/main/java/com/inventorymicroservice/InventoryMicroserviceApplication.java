package com.inventorymicroservice;

import com.inventorymicroservice.model.InventoryTable;
import com.inventorymicroservice.repository.InvetoryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class InventoryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryMicroserviceApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner loadData(InvetoryRepo invetoryRepo){
//		return args -> {
//			InventoryTable inventoryTable=InventoryTable.builder()
//					.skuCode("KOL5896")
//					.quantity(20)
//					.build();
//			InventoryTable inventoryTable1=InventoryTable.builder()
//					.skuCode("COMD292")
//					.quantity(15)
//					.build();
//			invetoryRepo.save(inventoryTable1);
//			invetoryRepo.save(inventoryTable);
//		};
//	}
}
