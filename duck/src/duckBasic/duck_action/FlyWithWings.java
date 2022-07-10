package duckBasic.duck_action;

import duckBasic.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void performFly() {
        System.out.println("하늘을 날아다닙니다.");
    }
}
