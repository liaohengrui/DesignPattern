package factory_mode.factory_method.base_pizza;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/4
 */
public abstract class Pizza {

    public abstract void whatIsMe();

    public void cut() {
        System.out.println("切碎pizza");
    }

    public void bake() {
        System.out.println("烘烤Pizza");
    }

    public void prepare() {
        whatIsMe();
        cut();
        bake();
    }
}
