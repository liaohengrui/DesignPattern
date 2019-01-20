package template_mode;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/20
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("茶杯浸泡");
    }

    @Override
    void addCondiment() {
        System.out.println("加入牛奶");
    }

    @Override
    protected void hook() {
        System.out.println("这是中国传统的茶");
    }
}
