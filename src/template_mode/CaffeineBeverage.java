package template_mode;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/20
 */
public abstract class CaffeineBeverage {


    abstract void brew();

    abstract void addCondiment();

    void boilWater() {
        System.out.println("水已经煮沸了");
    }

    void pourInCup() {
        System.out.println("倒入水杯");
    }

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiment();
        hook();
    }

    protected void hook() {
    }
}
