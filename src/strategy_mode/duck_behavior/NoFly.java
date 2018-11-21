package strategy_mode.duck_behavior;

import strategy_mode.duck_behavior.interfact_behavior.FlyBehavior;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/19
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不能飞翔");
    }
}
