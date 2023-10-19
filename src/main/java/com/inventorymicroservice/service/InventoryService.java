package com.inventorymicroservice.service;


import com.inventorymicroservice.repository.InvetoryRepo;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.ast.tree.from.StandardTableGroup;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InvetoryRepo invetoryRepo;


    @Transactional(readOnly = true)
    public boolean isItemExist(String skuCode){
        return invetoryRepo.findByskuCode(skuCode).isPresent();
    }






}
