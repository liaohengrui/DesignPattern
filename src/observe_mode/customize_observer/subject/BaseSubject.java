package observe_mode.customize_observer.subject;

import observe_mode.customize_observer.observer.BaseObserver;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/20
 */
public interface BaseSubject {
    void notifyObserver();

    void removeObserver(BaseObserver observer);

    void registerObserver(BaseObserver observer);
}
