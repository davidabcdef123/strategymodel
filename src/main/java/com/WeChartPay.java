package com;

/**
 * Created by sc on 2018/11/3.
 */
public class WeChartPay implements Payment{
    @Override
    public Paystate pay() {
        System.out.println("欢迎使用微信支付");
        return new Paystate(200,"成功","123");
    }
}
