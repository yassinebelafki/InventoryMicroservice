package com.inventorymicroservice.controller;


import com.inventorymicroservice.dto.InventroyResponse;
import com.inventorymicroservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventroyResponse> inStock(@RequestParam("skuCode") List<String> skuCodes){
            return inventoryService.isItemsExist(skuCodes);
    }


}
