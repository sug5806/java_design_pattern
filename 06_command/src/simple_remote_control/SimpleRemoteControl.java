package simple_remote_control;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setSlot(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
