package com.learn.demo.Promot;

public class CashbackStratrgy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
