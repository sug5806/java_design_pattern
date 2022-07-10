import duckBasic.Duck;
import real_duck.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        duck.performFly();
        duck.performQuack();

        duck.display();
        duck.swim();
    }
}
