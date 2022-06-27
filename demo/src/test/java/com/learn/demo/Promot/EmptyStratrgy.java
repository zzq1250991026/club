package com.learn.demo.Promot;

public class EmptyStratrgy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
