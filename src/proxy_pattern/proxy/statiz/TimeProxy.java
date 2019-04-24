package proxy_pattern.proxy.statiz;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/4/24
 */
public class TimeProxy implements Flyable {
    Flyable bird;

    public TimeProxy(Flyable bird) {
        this.bird = bird;
    }

    @Override
    public void fly() {
        long start = System.currentTimeMillis();
        bird.fly();
        long end = System.currentTimeMillis();
        System.out.println("Fly time is" + (end - start));
    }
}
