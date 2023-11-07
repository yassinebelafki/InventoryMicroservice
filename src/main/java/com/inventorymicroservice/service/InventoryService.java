package com.inventorymicroservice.service;


import com.inventorymicroservice.dto.InventroyResponse;
import com.inventorymicroservice.model.InventoryTable;
import com.inventorymicroservice.repository.InvetoryRepo;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.ast.tree.from.StandardTableGroup;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InvetoryRepo invetoryRepo;


    @Transactional(readOnly = true)
    public List<InventroyResponse> isItemsExist(List<String> skuCodes)
    {
         return invetoryRepo.findBySkuCodeIn(skuCodes).stream()
                .map(
                        inventoryTable -> {
                            return InventroyResponse.builder()
                                    .skuCode(inventoryTable.getSkuCode())
                                    .isExist(inventoryTable.getQuantity()>0)
                                    .build();
                        }
                ).toList();
    }


    public List<InventoryTable> getAllProduct() {
        return invetoryRepo.findAll();
    }
}
