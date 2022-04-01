package com.sikshalokam.appium;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 *
 * @author: Sunil H N Date: 11/02/2022 Purpose: Assign driver instance to Global sessions
 *
 */

public class GlobalSession {


    private static final ThreadLocal<GlobalSession> globalSession = new ThreadLocal<>();
    private AppiumManager appiumManager;

    public static void set(GlobalSession globalSession) {
        GlobalSession.globalSession.set(globalSession);
    }

    public static GlobalSession get() {
        debugLogger().info("On GetAppiumManger Global");
        return globalSession.get();
    }

    public AppiumManager getAppiumManager() {
        return this.appiumManager;
    }

    public void setAppiumManager(AppiumManager appiumManager) {
        debugLogger().info("SetAppiumManager Global");
        this.appiumManager = appiumManager;
    }


}
