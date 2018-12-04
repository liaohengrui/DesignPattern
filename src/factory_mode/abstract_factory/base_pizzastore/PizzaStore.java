package factory_mode.abstract_factory.base_pizzastore;

import factory_mode.abstract_factory.base_materialfactory.MaterialFactory;
import factory_mode.abstract_factory.base_pizza.Pizza;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/4
 */
public abstract class PizzaStore {
    MaterialFactory factory;

    public PizzaStore(MaterialFactory factory) {
        this.factory = factory;
    }

    public void oderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare(factory);
        pizza.whatIsMe();
        System.out.println("制作完毕");
    }

    public abstract Pizza createPizza();
}
