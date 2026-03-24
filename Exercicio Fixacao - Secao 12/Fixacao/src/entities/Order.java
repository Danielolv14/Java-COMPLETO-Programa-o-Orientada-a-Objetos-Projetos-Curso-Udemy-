package entities;

import entities.enums.status;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private status OrderStatus;

    ArrayList<OrderItem> Orders = new ArrayList<>();

    public Order(Date moment, status orderStatus, ArrayList<OrderItem> orders) {
        this.moment = moment;
        OrderStatus = orderStatus;
        Orders = orders;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public status getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(status orderStatus) {
        OrderStatus = orderStatus;
    }

    public ArrayList<OrderItem> getOrders() {
        return Orders;
    }

    public void addItem(OrderItem s){
        Orders.add(s);
    }

    public void removeItem(OrderItem s){
        Orders.remove(s);
    }

    public double total(){
        double sum = 0;
        for(OrderItem d : Orders){
            sum = sum + d.subTotal();
        }
        return sum;
    }


}
