package simple_remote_control;

// 커맨드 패턴 클라이언트
public class RemoteControlTest {
    public static void main(String[] args) {
        // 인보커 역할을 하여 필요한 작업을 요청할때 사용할 커맨드 객체를 인자로 전달받음
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        // 요청을 받아 처리할 리시버
        Light light = new Light();

        // 커맨드 객체를 생성하여 리시버 전달
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        // 커맨드 객체를 인보커에게 전달
        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
