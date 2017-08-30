package cn.com.yxb.springmvc.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/8/8.
 *
 * @author frank.
 */
public class DccSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private Object object = new Object();

    @Override
    public void registerObserver(Observer o) throws Exception {
        observers.add(o);
    }

    @Override
    public void execute() throws Exception {
        for (Observer observer : observers) {
            observer.sendOrders(object);
        }
    }
}
