/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houserental;

/**
 *
 * @author Acer
 */
public class cRent {
    // house info
    private int flat;
    private int house;
    private Double cost;
    private Double NumberofRoom;
    private String location;

// access house info
    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getNumberofRoom() {
        return NumberofRoom;
    }

    public void setNumberofRoom(Double NumberofRoom) {
        this.NumberofRoom = NumberofRoom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
     
}
