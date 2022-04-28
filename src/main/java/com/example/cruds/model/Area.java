package com.example.cruds.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity

public class Area {

    @Id
    private int id;

    @NotNull
    @Column(nullable = false)
    private String Name;

    @NotNull
    @Column(nullable = false)
    private String Street;

    @NotNull
    @Column(nullable = false)
    private String Location;

    @OneToMany(targetEntity = Shop.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    private List<Shop> shops;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
}




