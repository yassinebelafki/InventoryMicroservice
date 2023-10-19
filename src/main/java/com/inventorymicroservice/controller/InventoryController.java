package com.inventorymicroservice.controller;


import com.inventorymicroservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;


    @GetMapping("{skuCode}")
    @ResponseStatus(HttpStatus.OK)
    public boolean inStock(@PathVariable("skuCode") String skuCode){
            return inventoryService.isItemExist(skuCode);
    }


}
