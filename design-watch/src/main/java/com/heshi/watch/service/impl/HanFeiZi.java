package com.heshi.watch.service.impl;

import com.heshi.watch.service.IHanFeiZi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;

/**
 * @author by fukun
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    Logger logger = LoggerFactory.getLogger(HanFeiZi.class);

    @Override
    public void haveBreakfast() {
        logger.info("韩非子：开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        logger.info("韩非子：开始娱乐了...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }

}
