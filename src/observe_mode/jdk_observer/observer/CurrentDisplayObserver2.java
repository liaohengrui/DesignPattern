package observe_mode.jdk_observer.observer;

import observe_mode.jdk_observer.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/21
 */
public class CurrentDisplayObserver2 implements Observer {
    Observable observable;
    String info;

    public CurrentDisplayObserver2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            info = weatherData.getInfo();
            display();
        }
    }

    private void display() {
        System.out.println(info + "2");
    }
}
