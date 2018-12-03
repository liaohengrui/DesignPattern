package decorator_mode.concrete_component;

import decorator_mode.base_component.Drinks;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/3
 */
public class RedTea extends Drinks {
    @Override
    public void getDescription() {
        System.out.println("我是红茶");
    }

    @Override
    public void cost() {
        System.out.println(2);
    }
}
