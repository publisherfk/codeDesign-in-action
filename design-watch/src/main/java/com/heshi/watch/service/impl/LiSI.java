package com.heshi.watch.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @author by fukun
 */
public class LiSI implements Observer {
    Logger logger = LoggerFactory.getLogger(LiSI.class);

    @Override
    public void update(Observable observable, Object context) {
        logger.info("李斯：观察到韩非子活动，开始向老板汇报了...");
        reportToQiShiHuang(context);
        logger.info("李斯：汇报完毕...");
    }

    private void reportToQiShiHuang(Object context) {
        logger.info("李斯：报告，秦老板!韩非子有活动了-->{}", context);
    }

}
