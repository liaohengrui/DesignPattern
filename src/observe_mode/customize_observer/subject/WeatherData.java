package observe_mode.customize_observer.subject;

import observe_mode.customize_observer.observer.BaseObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/20
 */
public class WeatherData implements BaseSubject {
    List<BaseObserver> observers = new ArrayList<>();
    public String info;

    @Override
    public void notifyObserver() {
        for (BaseObserver observer : observers) {
            observer.update(info);
        }
    }

    @Override
    public void removeObserver(BaseObserver observer) {
    }

    @Override
    public void registerObserver(BaseObserver observer) {
        observers.add(observer);
        System.out.println("订阅成功");
    }

    public WeatherData(String info) {
        this.info = info;
        notifyObserver();
    }
}
