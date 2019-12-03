package com.heshi.design.event.guava.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @author by fukun
 */
public class DataObserver1 {

    @Subscribe
    public void func(String msg) {
        System.out.println("DataObserver1:" + msg);
    }
}
