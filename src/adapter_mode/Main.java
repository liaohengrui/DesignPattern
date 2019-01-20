package adapter_mode;

import adapter_mode.adaptee.Turkey;
import adapter_mode.adapter.TurkeyAdapter;
import adapter_mode.target.Duck;
import adapter_mode.target.MallardDuck;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/20
 */
public class Main {
    public static void main(String[] args) {
        Turkey turkey = new Turkey();
        Duck turkeyDuck = new TurkeyAdapter(turkey);
        Duck duck = new MallardDuck();
        testFly(turkeyDuck);
        testFly(duck);
    }

    static void testFly(Duck duck) {
        duck.fly();
    }
}
