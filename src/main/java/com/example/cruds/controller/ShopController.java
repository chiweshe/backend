package com.example.cruds.controller;

import com.example.cruds.Service.ShopService;
import com.example.cruds.model.Shop;
import com.example.cruds.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {
    @Autowired
    ShopService shopService;

    @Autowired
    private ShopRepository shopRepository;

//get all shops in database
    @GetMapping("/shops")
    public List<Shop> getShop(){
        return shopRepository.findAll();
    }


//list shops in a certain location

    @GetMapping("/getshopByLocation/{shopLocation}")
    public List<Shop> get(@PathVariable("shopLocation") String shopLocation){
        return shopService.getShopLocation(shopLocation);
    }
    @PostMapping("/save")
    public String saveShop(@RequestBody Shop shop){
        shopRepository.save(shop);
        return "Save...";
    }


}
