package observe_mode.customize_observer.observer;

import observe_mode.customize_observer.subject.BaseSubject;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/11/20
 */
public class CurrentDisplayObserver implements BaseObserver {
    String info;
    BaseSubject subject;

    public CurrentDisplayObserver(BaseSubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String info) {
        this.info = info;
        display();
    }

    public void display() {
        System.out.println("当前天气" + info);
    }

}
