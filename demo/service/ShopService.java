package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Shop;

public interface ShopService {

	Shop save(Shop shop);

	List<Shop> fetchShopList();

	Shop fetchShopById(Long shopId);

	void deleteShopById(Long shopId);

	Shop updateShop(Long shopId, Shop shop);

}
