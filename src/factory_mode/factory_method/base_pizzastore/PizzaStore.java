package factory_mode.factory_method.base_pizzastore;

import factory_mode.factory_method.base_pizza.Pizza;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/4
 */
public abstract class PizzaStore {
    public void oderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        System.out.println("制作完毕");
    }

    public abstract Pizza createPizza();
}
