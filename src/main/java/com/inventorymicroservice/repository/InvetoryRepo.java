package com.inventorymicroservice.repository;

import com.inventorymicroservice.model.InventoryTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface InvetoryRepo extends JpaRepository<InventoryTable,Long> {
    Optional<InventoryTable> findBySkuCode(String skuCode);
    List<InventoryTable> findBySkuCodeIn(List<String> skuCodes);
}
