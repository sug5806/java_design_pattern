package duck.duckBasic;

import duck.duckBasic.duck_action.FlyBehavior;
import duck.duckBasic.duck_action.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performQuack() {
        quackBehavior.performQuack();
    }

    public void performFly() {
        flyBehavior.performFly();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다.");
    }
}
