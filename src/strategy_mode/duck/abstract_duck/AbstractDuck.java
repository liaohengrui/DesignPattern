package strategy_mode.duck.abstract_duck;

import strategy_mode.duck_behavior.interfact_behavior.FlyBehavior;
import strategy_mode.duck_behavior.interfact_behavior.QuackBehavior;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/19
 */
public abstract class AbstractDuck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        //使用算法簇实现
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


    /**
     * 此处没必要独立出来,外观是是死的,
     * 所以子类实现下就行,
     * 没必要,写个算法簇
     */
    public abstract void display();

    /**
     * 此处也不用独立出来
     * 并且写死,因为基本所有子类都要用这个方法,
     * 且不会改变
     */
    public void swim() {
        System.out.println("所有鸭子都会游泳");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
