package decorator_mode.concrete_component;

import decorator_mode.base_component.Drinks;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/3
 */
public class GreenTea extends Drinks {
    @Override
    public void getDescription() {
        System.out.println("我是绿茶");
    }

    @Override
    public void cost() {
        System.out.println(2.5);
    }
}
