package observe_mode.jdk_observer;

import observe_mode.jdk_observer.observer.CurrentDisplayObserver;
import observe_mode.jdk_observer.observer.CurrentDisplayObserver2;
import observe_mode.jdk_observer.observer.CurrentDisplayObserver3;
import observe_mode.jdk_observer.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/21
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer observer = new CurrentDisplayObserver(weatherData);
        Observer observer2 = new CurrentDisplayObserver2(weatherData);
        Observer observer3 = new CurrentDisplayObserver3(weatherData);
        weatherData.measurementsChange("天气良好");
    }
}
