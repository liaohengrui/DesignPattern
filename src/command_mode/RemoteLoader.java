package command_mode;

import command_mode.concrete_command.LightOFFCommand;
import command_mode.concrete_command.LightOnCommand;
import command_mode.invoker.RemoteControl;
import command_mode.receiver.Light;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/8
 */
public class RemoteLoader {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand();
        LightOFFCommand lightOffCommand = new LightOFFCommand();
        lightOnCommand.setLight(light);
        lightOffCommand.setLight(light);

        RemoteControl control = new RemoteControl();
        control.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println(control);
        control.onButtonWasPushed(0);
        control.offButtonWasPushed(0);
        control.undoButtonWasPushed();
    }
}
