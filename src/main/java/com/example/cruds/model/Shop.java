package com.example.cruds.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "shops")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(nullable = false)
    private String shopName;

    @NotNull
    @Column(nullable = false)
    private String shopStreet;

    @NotNull
    @Column(nullable = false)
    private String shopLocation;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopStreet() {
        return shopStreet;
    }

    public void setShopStreet(String shopStreet) {
        this.shopStreet = shopStreet;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }
}




