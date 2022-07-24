package duck.duckBasic.duck_action;

public class Quack implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("꽉꽉");
    }
}
