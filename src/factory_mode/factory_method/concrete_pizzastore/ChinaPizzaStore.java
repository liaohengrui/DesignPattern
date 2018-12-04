package factory_mode.factory_method.concrete_pizzastore;

import factory_mode.factory_method.base_pizza.Pizza;
import factory_mode.factory_method.base_pizzastore.PizzaStore;
import factory_mode.factory_method.concrete_pizza.ChinaPizza;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/4
 */
public class ChinaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza() {
        return new ChinaPizza();
    }

    public static void main(String[] args) {
        ChinaPizzaStore pizzaStore = new ChinaPizzaStore();
        pizzaStore.oderPizza();
    }
}
