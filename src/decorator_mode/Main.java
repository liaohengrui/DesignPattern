package decorator_mode;

import decorator_mode.base_component.Drinks;
import decorator_mode.concrete_component.RedTea;
import decorator_mode.concrete_decorator.Milk;
import decorator_mode.concrete_decorator.Sugar;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/3
 */
public class Main {
    public static void main(String[] args) {
        Drinks drinks = new RedTea();
        drinks = new Milk(drinks);
        drinks = new Sugar(drinks);
        drinks.getDescription();
        drinks.cost();
    }
}
