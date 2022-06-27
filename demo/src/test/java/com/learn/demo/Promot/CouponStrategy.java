package com.learn.demo.Promot;

public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠卷，课程价格直接减免优惠卷面值抵扣");
    }
}
