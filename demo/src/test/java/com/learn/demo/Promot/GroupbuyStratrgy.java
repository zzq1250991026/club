package com.learn.demo.Promot;

public class GroupbuyStratrgy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人团，全员享受团购价");
    }
}
