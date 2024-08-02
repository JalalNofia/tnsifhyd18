package com.si.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Shop;
import com.si.demo.service.ShopService;

@RestController
public class ShopController {
@Autowired
ShopService s1;
@PostMapping("/shops")
public Shop saveShop(@RequestBody Shop shop) {
   
    return s1.save(shop);
}

@GetMapping("/shops")
public List<Shop> fetchShop() {
    //LOGGER.info("Inside fetchItemList of ItemController");
    return s1.fetchShopList();
}
@GetMapping("/shops/{id}")
public Shop fetchShopById(@PathVariable("id") Long shopId)
        {
    return s1.fetchShopById(shopId);
}
@DeleteMapping("/shops/{id}")
public String deleteShopById(@PathVariable("id") Long shopId) {
    s1.deleteShopById(shopId);
    return " deleted Successfully!!";
}
@PutMapping("/shops/{id}")
public Shop updateShop(@PathVariable("id") Long shopId,
                                   @RequestBody Shop shop) {
    return s1.updateShop(shopId,shop);
}




}
