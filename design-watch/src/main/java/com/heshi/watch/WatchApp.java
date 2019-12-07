package com.heshi.watch;

import com.heshi.watch.service.impl.HanFeiZi;
import com.heshi.watch.service.impl.LiSI;

/**
 * @author by fukun
 */
public class WatchApp {
    public static void main(String args[]) throws InterruptedException {
        LiSI liSI = new LiSI();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSI);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
