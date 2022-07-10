package real_duck;

import duckBasic.Duck;
import duckBasic.duck_action.FlyWithWings;
import duckBasic.duck_action.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.quackBehavior = new Quack();
        super.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
