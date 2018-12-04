package factory_mode.factory_method.concrete_pizza;

import factory_mode.factory_method.base_pizza.Pizza;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/4
 */
public class ChinaPizza extends Pizza {
    @Override
    public void whatIsMe() {
        System.out.println("中国版Pizza");
    }
}
