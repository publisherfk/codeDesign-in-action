package com.heshi.design.event.guava.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @author by fukun
 */
public class DataObserver2 {

    @Subscribe
    public void func(Integer msg) {
        System.out.println("DataObserver2:" + msg);
    }
}
