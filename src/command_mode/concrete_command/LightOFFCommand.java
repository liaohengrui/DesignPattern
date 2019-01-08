package command_mode.concrete_command;

import command_mode.base_command.Command;
import command_mode.receiver.Light;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/8
 */
public class LightOFFCommand implements Command {
    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void exculate() {
        light.lightOFF();
    }

    @Override
    public void undo() {
        light.lightOn();
    }
}
