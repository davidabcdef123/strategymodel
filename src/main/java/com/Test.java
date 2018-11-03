package com;

/**
 * Created by sc on 2018/11/3.
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setAmount(100);
        order.setId(1);
        order.setOrderNum("11111111112222222aaaaaaaa");
        order.pay(PayType.ALI_PAY.getPayment());
    }
}
