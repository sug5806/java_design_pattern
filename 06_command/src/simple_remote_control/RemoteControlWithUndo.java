package simple_remote_control;

import simple_remote_control.command.Command;
import simple_remote_control.command.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommandList;
    Command[] offCommandList;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommandList = new Command[7];
        offCommandList = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommandList[i] = noCommand;
            offCommandList[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand) {
        onCommandList[slotNumber] = onCommand;
        offCommandList[slotNumber] = offCommand;
    }

    public void pressOnButton(int slotNumber) {
        onCommandList[slotNumber].execute();
        undoCommand = onCommandList[slotNumber];
    }

    public void pressOffButton(int slotNumber) {
        offCommandList[slotNumber].execute();
        undoCommand = offCommandList[slotNumber];
    }

    public void pressUndoButton() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n-----------------리모컨-----------------\n");
        for (int i = 0; i < onCommandList.length; i++) {
            stringBuilder.append("[slot ").append(i).append("] ")
                    .append(onCommandList[i].getClass().getName())
                    .append("     ")
                    .append(offCommandList[i].getClass().getName())
                    .append("\n");

        }

        return stringBuilder.toString();
    }
}
