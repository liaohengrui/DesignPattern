package adapter_mode.adapter;

import adapter_mode.adaptee.Turkey;
import adapter_mode.target.Duck;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/20
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey ;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
