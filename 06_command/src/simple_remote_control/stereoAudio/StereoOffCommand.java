package simple_remote_control.stereoAudio;

import simple_remote_control.command.Command;

public class StereoOffCommand implements Command {
    StereoAudio stereoAudio;

    public StereoOffCommand(StereoAudio stereoAudio) {
        this.stereoAudio = stereoAudio;
    }

    @Override
    public void execute() {
        stereoAudio.off();
    }

    @Override
    public void undo() {
        stereoAudio.on();
    }
}
