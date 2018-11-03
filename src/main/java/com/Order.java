package com;

/**
 * Created by sc on 2018/11/3.
 */
public class Order {

    private int id;
    private String orderNum;
    private double amount;

    public Paystate pay(Payment payment){
        return payment.pay();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
