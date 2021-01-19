package com.example.swarnhar2.test;

public class OrderData {
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPlaced() {
        return placed;
    }

    public void setPlaced(String placed) {
        this.placed = placed;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDestination() {
        return destination;
    }

    void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //     "number"     :  "# 1",
//             "placed"     :  "Dec 10th 2019 9:08 PM",
//             "destination":  "Uttar pradesh,Ghaziabad(Full Address)",
//             "status"     :  "Rejected"
    private String number;
    private String placed;
    private String destination;
    private String status;
    private String Description;

}
