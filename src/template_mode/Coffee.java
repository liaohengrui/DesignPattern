package template_mode;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/20
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("烘焙咖啡豆");
    }

    @Override
    void addCondiment() {
        System.out.println("加入白糖");
    }
}
