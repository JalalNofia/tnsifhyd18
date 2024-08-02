package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Shop;
import com.si.demo.repository.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService {
@Autowired
ShopRepository r1;

@Override
public Shop save(Shop shop) {
	// TODO Auto-generated method stub
	return r1.save(shop);
}

@Override
public List<Shop> fetchShopList() {
	// TODO Auto-generated method stub
	return r1.findAll();
}

@Override
public Shop fetchShopById(Long shopId) {
	// TODO Auto-generated method stub
	return r1.findById(shopId).get();
}

@Override
public void deleteShopById(Long shopId) {
	// TODO Auto-generated method stub
	r1.deleteById(shopId);
}

@Override
public Shop updateShop(Long shopId, Shop shop) {
	// TODO Auto-generated method stub
	Shop shopDB = r1.findById(shopId).get();

    if(Objects.nonNull(shop.getName()) &&
    !"".equalsIgnoreCase(shop.getName())) {
        shopDB.setName(shop.getName());
    }

	return r1.save(shopDB);


}

}
