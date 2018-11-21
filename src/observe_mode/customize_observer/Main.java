package observe_mode.customize_observer;

import observe_mode.customize_observer.observer.CurrentDisplayObserver;
import observe_mode.customize_observer.subject.WeatherData;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/20
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData("今日天气晴");
        CurrentDisplayObserver observer = new CurrentDisplayObserver(weatherData);
        weatherData.notifyObserver();
        weatherData.info = "今日天气阴";
        weatherData.notifyObserver();


    }
}
