package factory_mode.abstract_factory.concrete_pizzastore;


import factory_mode.abstract_factory.base_materialfactory.MaterialFactory;
import factory_mode.abstract_factory.base_pizza.Pizza;
import factory_mode.abstract_factory.base_pizzastore.PizzaStore;
import factory_mode.abstract_factory.material_factory.ChinaMaterialFactory;
import factory_mode.factory_method.concrete_pizza.ChinaPizza;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/4
 */
public class ChinaPizzaStore extends PizzaStore {

    public ChinaPizzaStore(MaterialFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza() {
        return new Pizza();
    }

    public static void main(String[] args) {
        ChinaPizzaStore pizzaStore = new ChinaPizzaStore(new ChinaMaterialFactory());
        pizzaStore.oderPizza();
    }
}
