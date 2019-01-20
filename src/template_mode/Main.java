package template_mode;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/1/20
 */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage beverage1 = new Tea();
        CaffeineBeverage beverage2 = new Coffee();

        beverage1.prepareRecipe();
        System.out.println("-------------------");
        beverage2.prepareRecipe();

    }
}
