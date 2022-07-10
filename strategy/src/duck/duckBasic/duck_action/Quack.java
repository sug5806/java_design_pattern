package duck.duckBasic.duck_action;

import duck.duckBasic.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("꽉꽉");
    }
}
