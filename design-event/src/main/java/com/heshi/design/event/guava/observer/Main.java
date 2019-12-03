package com.heshi.design.event.guava.observer;

/**
 * @author by fukun
 */
public class Main {
    public static void main(String args[]) {
        DataObserver1 observer1 = new DataObserver1();
        DataObserver2 observer2 = new DataObserver2();
        EventBusCenter.register(observer1);
        EventBusCenter.register(observer2);
        EventBusCenter.post("鹅鹅鹅，曲项向天歌");
        EventBusCenter.post(1234);

        EventBusCenter.unregister(observer2);
        EventBusCenter.post("白毛浮绿水");
        EventBusCenter.post(5678);
    }
}
