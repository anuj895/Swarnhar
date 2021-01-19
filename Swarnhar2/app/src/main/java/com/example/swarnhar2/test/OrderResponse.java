package com.example.swarnhar2.test;

import java.util.ArrayList;
import java.util.List;

public class OrderResponse {
    private List<OrderData> order=new ArrayList<> ();

    public List<OrderData> getOrder() {
        return order;
    }

    public void setOrder(List<OrderData> order) {
        this.order = order;
    }
}
