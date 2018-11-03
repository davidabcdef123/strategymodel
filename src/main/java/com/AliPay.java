package com;

/**
 * Created by sc on 2018/11/3.
 */
public class AliPay implements Payment {
    @Override
    public Paystate pay() {
        System.out.println("欢迎使用alipay");
        return new Paystate(200,"成功","ok");
    }
}
