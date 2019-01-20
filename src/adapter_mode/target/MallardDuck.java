package adapter_mode.target;

import adapter_mode.target.Duck;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/20
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("鸭子飞了");
    }
}
