package com.sikshalokam.client;

import com.aventstack.extentreports.ExtentTest;
import com.sikshalokam.constants.IAutoConst;
import com.sikshalokam.report.SikshaLokamReport;
import com.sikshalokam.utils.asserts.Asserts;
import com.sikshalokam.utils.gSheet.GoogleSheet;
import com.sikshalokam.utils.gestures.Gestures;
import com.sikshalokam.utils.logger.Logger;
import com.sikshalokam.utils.prop.PropUtlis;
import com.sikshalokam.utils.screenshot.ScreenShot;
import io.appium.java_client.AppiumDriver;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 *
 * @author: Sunil H N Date: 07/02/2022 Purpose: set driver and access utils
 * packages
 */
@SuppressWarnings("rawtypes")
public class SikshaLokamClient {

    private static final ThreadLocal<SikshaLokamClient> sikshalokamClient = new ThreadLocal<>();
    private Asserts asserts;
    private Gestures gestures;
    private GoogleSheet googleSheet;
    private Logger logger;
    private PropUtlis propUtils;
    private ScreenShot screenShot;
    private final AppiumDriver appiumDriver;

    public SikshaLokamClient(AppiumDriver appiumDriver) {
        debugLogger().info("On Constructor SikshaLokamClient");
        this.appiumDriver = appiumDriver;
    }

    public static void setSikshaLokamClient(SikshaLokamClient slClient) {
        debugLogger().info("On SetGoodWorkerClient");
        sikshalokamClient.set(slClient);
    }

    public static SikshaLokamClient get() {
        return sikshalokamClient.get();

    }

    public AppiumDriver driver() throws Exception {
        if (this.appiumDriver == null) {
            debugLogger().info("On Driver");
            return this.appiumDriver;
        }
        return this.appiumDriver;
    }

    public Asserts getAsserts() {
        if (this.asserts == null) {
            this.asserts = new Asserts(this.appiumDriver);
            debugLogger().info("On GetAsserts");
        }
        return asserts;
    }

    public GoogleSheet getGoogleSheet() {
        if (this.googleSheet == null) {
            this.googleSheet = new GoogleSheet();
            debugLogger().info("On GetGoogleSheet");
        }
        return googleSheet;
    }

    public Logger logger() {
        try {
            if (this.logger == null) {
                this.logger = new Logger(IAutoConst.APP_LOG);
                debugLogger().info("On GetLogUtlis");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return logger;
    }

    public PropUtlis getPropUtils() {
        debugLogger().info("On GetPropUtils");
        if (this.propUtils == null) {
            this.propUtils = new PropUtlis();
        }
        return propUtils;
    }

    public ScreenShot getScreenShot() throws Exception {
        debugLogger().info("on GetScreenShot");
        if (this.screenShot == null) {
            this.screenShot = new ScreenShot(this.appiumDriver);
        }
        return screenShot;
    }

    public ExtentTest report() {
        return SikshaLokamReport.getExtentTest();
    }

    public Gestures gestures() {
        if (this.gestures == null) {
            this.gestures = new Gestures(this.appiumDriver);
            debugLogger().info("On Gestures");
        }
        return this.gestures;
    }


}
