package simple_remote_control;

import simple_remote_control.garage.GarageDoor;
import simple_remote_control.garage.GarageDoorCloseCommand;
import simple_remote_control.garage.GarageDoorOpenCommand;
import simple_remote_control.light.Light;
import simple_remote_control.light.LightOffCommand;
import simple_remote_control.light.LightOnCommand;
import simple_remote_control.stereoAudio.StereoAudio;
import simple_remote_control.stereoAudio.StereoOffCommand;
import simple_remote_control.stereoAudio.StereoOnWithCDCommand;

public class RemoteLoader {

    public static void main(String[] args) {
        // 인보커
        RemoteControl remoteControl = new RemoteControl();

        // 리시버
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();
        StereoAudio stereoAudio = new StereoAudio();

        // 커맨드 객체에 리시버 전달
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereoAudio);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereoAudio);

        // 인보커에 커맨드 객체 세팅
        remoteControl.setCommand(0, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(1, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.pressOnButton(0);
        remoteControl.pressOffButton(0);
        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(1);
        remoteControl.pressOnButton(2);
        remoteControl.pressOffButton(2);


    }
}
