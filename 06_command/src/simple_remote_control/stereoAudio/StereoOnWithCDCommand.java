package simple_remote_control.stereoAudio;

import simple_remote_control.command.Command;

public class StereoOnWithCDCommand implements Command {
    StereoAudio stereoAudio;

    public StereoOnWithCDCommand(StereoAudio stereoAudio) {
        this.stereoAudio = stereoAudio;
    }

    @Override
    public void execute() {
        stereoAudio.on();
        stereoAudio.setCD();
        stereoAudio.setVolume(10);
    }

    @Override
    public void undo() {
        stereoAudio.off();
    }
}
