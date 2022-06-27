package com.learn.demo.Promot;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class PromotionTestN {
    @Test
    public void PromotionTest(){
        PromotionStrategyActivity activity618=new PromotionStrategyActivity(new CouponStrategy());
        PromotionStrategyActivity activity11=new PromotionStrategyActivity(new CashbackStratrgy());
        activity618.execute();
        activity11.execute();
        Map<String, PromotionStrategy> promotionStrategyMap=new HashMap<>();
        promotionStrategyMap.containsKey("");
    }
}
