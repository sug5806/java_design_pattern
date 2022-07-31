package simple_remote_control.garage;

public class GarageDoor {
    public void up() {
        System.out.println("차고 문이 열렸습니다.");
    }

    public void down() {
        System.out.println("차고 문이 닫혔습니다.");
    }

    public void stop() {
        System.out.println("차고 문을 멈춥니다. ");
    }

    public void lightOn() {
        System.out.println("차고의 불을 켭니다.");
    }

    public void lightOff() {
        System.out.println("차고의 불을 끕니다.");
    }
}
