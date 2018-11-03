package com;

/**
 * Created by sc on 2018/11/3.
 */
public enum PayType {

    ALI_PAY(new AliPay()),WE_CHART_PAY(new WeChartPay());

    private Payment payment;
    PayType(Payment payment) {
        this.payment=payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
