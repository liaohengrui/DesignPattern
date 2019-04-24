package proxy_pattern.proxy.dynamic;


/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/4/24
 */
public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying ...");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
