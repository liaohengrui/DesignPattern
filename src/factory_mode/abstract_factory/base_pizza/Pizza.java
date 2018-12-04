package factory_mode.abstract_factory.base_pizza;

import factory_mode.abstract_factory.base_materialfactory.MaterialFactory;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/4
 */
public class Pizza {
    String potato;
    String milk;
    String vegetables;

    public void whatIsMe() {
        System.out.println(potato + milk + vegetables + "构成了我");
    }

    ;

    public void cut() {
        System.out.println("切碎pizza");
    }

    public void bake() {
        System.out.println("烘烤Pizza");
    }

    public void prepare(MaterialFactory factory) {
        potato = factory.getPotato();
        milk = factory.getMilk();
        vegetables = factory.getVegetables();

    }
}
