package com.borllor.pattern.behavior.strategy;

/**
 * Created by borllor on 2017/11/26.
 */
public class TravelByFlight implements TravelBy {
    public void take() {
        System.out.println("我们坐飞机去...");
    }
}
