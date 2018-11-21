package observe_mode.jdk_observer.subject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.stream.Collectors;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/21
 */
public class WeatherData extends Observable {
    private String info;

    public String getInfo() {
        return info;
    }

    public void measurementsChange(String info) {
        this.info = info;
        setChanged();
        notifyObservers();

/*        List<String> list = Arrays.asList("12", "2");

        list.forEach(System.out::println);

        List<Integer> lengthList = list.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengthList);*/



    }
}
