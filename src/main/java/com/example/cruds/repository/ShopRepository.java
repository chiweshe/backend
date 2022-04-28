package com.example.cruds.repository;

import com.example.cruds.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Long> {

    List<Shop> findById(Integer id);

    List<Shop>findShopByShopLocation(int id, String shopLocation);

    List<Shop> findShopByShopLocation(String shopLocation);
}
