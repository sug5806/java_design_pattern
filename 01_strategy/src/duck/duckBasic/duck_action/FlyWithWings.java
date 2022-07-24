package duck.duckBasic.duck_action;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void performFly() {
        System.out.println("하늘을 날아다닙니다.");
    }
}
