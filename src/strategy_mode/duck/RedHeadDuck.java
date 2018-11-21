package strategy_mode.duck;

import strategy_mode.duck.abstract_duck.AbstractDuck;
import strategy_mode.duck_behavior.interfact_behavior.FlyBehavior;
import strategy_mode.duck_behavior.interfact_behavior.QuackBehavior;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/19
 */
public class RedHeadDuck extends AbstractDuck {
    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super.setFlyBehavior(flyBehavior);
        super.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("一直红头鸭");
    }


}
