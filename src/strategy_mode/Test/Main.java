package strategy_mode.Test;

import strategy_mode.duck.RedHeadDuck;
import strategy_mode.duck_behavior.FlyWithWind;
import strategy_mode.duck_behavior.QuackGuaGua;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/19
 */
public class Main {
    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck(new FlyWithWind(), new QuackGuaGua());
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
    }
}
