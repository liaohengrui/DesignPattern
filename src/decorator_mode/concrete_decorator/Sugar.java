package decorator_mode.concrete_decorator;

import decorator_mode.base_component.Drinks;
import decorator_mode.base_decorator.Condiment;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/3
 */
public class Sugar extends Condiment {
    Drinks drinks;

    public Sugar(Drinks drinks) {
        super(drinks);
        this.drinks = drinks;
    }

    @Override
    public void getDescription() {
        System.out.println("加入糖");
        drinks.getDescription();
    }

    @Override
    public void cost() {
        System.out.println(0.5 + "+");
        drinks.cost();
    }
}
