package simple_remote_control.command;

public interface Command {
    public void execute();
    public void undo();
}
