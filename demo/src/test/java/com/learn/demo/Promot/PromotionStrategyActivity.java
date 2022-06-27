package com.learn.demo.Promot;

public class PromotionStrategyActivity {
    private PromotionStrategy promotionStrategy;
    public PromotionStrategyActivity(PromotionStrategy promotionStrategy){
         this.promotionStrategy=promotionStrategy;
    }
    public void execute(){
        promotionStrategy.doPromotion();
    }
}
