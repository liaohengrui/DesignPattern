package strategy_mode.duck_behavior;

import strategy_mode.duck_behavior.interfact_behavior.QuackBehavior;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/19
 */
public class QuackGuaGua implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱的叫");
    }
}
