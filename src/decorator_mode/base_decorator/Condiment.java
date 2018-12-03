package decorator_mode.base_decorator;

import decorator_mode.base_component.Drinks;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/3
 */
public abstract class Condiment extends Drinks {
    private Drinks drinks;

    public Condiment(Drinks drinks) {
        this.drinks = drinks;
    }
}
