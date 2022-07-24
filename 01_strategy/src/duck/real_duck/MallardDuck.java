package duck.real_duck;

import duck.duckBasic.Duck;
import duck.duckBasic.duck_action.FlyWithWings;
import duck.duckBasic.duck_action.Quack;

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
