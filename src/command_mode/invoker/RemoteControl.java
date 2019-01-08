package command_mode.invoker;

import command_mode.base_command.Command;
import command_mode.concrete_command.NoCommand;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/8
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command command = new NoCommand();

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].exculate();
        command = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].exculate();
        command = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        command.undo();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n---- Remote Control ----\n");
        for (int i = 0; i < 7; i++) {
            buffer.append("[slot" + i + "]" + onCommands[i].getClass().getSimpleName() + "     " + offCommands[i].getClass()
                    .getSimpleName() + "\n");
        }
        return buffer.toString();
    }
}
