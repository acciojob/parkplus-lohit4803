package com.driver.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;
    private String address;

    @OneToMany(mappedBy = "parkingLot",cascade = CascadeType.ALL)
    private List<Spot> spotList = new ArrayList<>();

    public ParkingLot() {
    }

    public ParkingLot(int parkingLotId, String name, String address) {
        this.Id = parkingLotId;
        this.name = name;
        this.address = address;
    }

    public ParkingLot(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public ParkingLot(List<Spot> spotList) {
        this.spotList = spotList;
    }

    public void setId(int parkingLotId) {
        this.Id = parkingLotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Spot> getSpotList() {
        return spotList;
    }

    public void setSpotList(List<Spot> spotList) {
        this.spotList = spotList;
    }
}
