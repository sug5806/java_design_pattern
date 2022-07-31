package simple_remote_control;

import simple_remote_control.command.Command;
import simple_remote_control.command.NoCommand;

public class RemoteControl {
    Command[] onCommandList;
    Command[] offCommandList;

    public RemoteControl() {
        onCommandList = new Command[7];
        offCommandList = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommandList[i] = noCommand;
            offCommandList[i] = noCommand;
        }
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand) {
        onCommandList[slotNumber] = onCommand;
        offCommandList[slotNumber] = offCommand;
    }

    public void pressOnButton(int slotNumber) {
        onCommandList[slotNumber].execute();
    }

    public void pressOffButton(int slotNumber) {
        offCommandList[slotNumber].execute();
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
