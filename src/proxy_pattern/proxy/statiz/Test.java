package proxy_pattern.proxy.statiz;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/4/24
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        TimeProxy proxy = new TimeProxy(bird);
        proxy.fly();
    }
}
