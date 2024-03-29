package com.shikshalokam.client;

import static com.shikshalokam.utils.logger.DebugLogger.debugLogger;

import com.aventstack.extentreports.ExtentTest;
import com.shikshalokam.constants.IAutoConst;
import com.shikshalokam.report.ShikshaLokamReport;
import com.shikshalokam.utils.asserts.Asserts;
import com.shikshalokam.utils.gSheet.GoogleSheet;
import com.shikshalokam.utils.gestures.Gestures;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;
import com.shikshalokam.utils.screenshot.ScreenShot;

import io.appium.java_client.AppiumDriver;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 *
 * @author: Sunil H N Date: 07/02/2022 Purpose: set driver and access utils
 * packages
 */
@SuppressWarnings("rawtypes")
public class ShikshaLokamClient {

    private static final ThreadLocal<ShikshaLokamClient> shikshalokamClient = new ThreadLocal<>();
    private Asserts asserts;
    private Gestures gestures;
    private GoogleSheet googleSheet;
    private Logger logger;
    private PropUtlis propUtils;
    private ScreenShot screenShot;
    private final AppiumDriver appiumDriver;

    public ShikshaLokamClient(AppiumDriver appiumDriver) {
        debugLogger().info("On Constructor ShikshaLokamClient");
        this.appiumDriver = appiumDriver;
    }

   public static void setShikshaLokamClient(ShikshaLokamClient slClient) {
       debugLogger().info("On SetGoodWorkerClient");
      shikshalokamClient.set(slClient);
    }



  public static ShikshaLokamClient get() {
	  System.out.println(shikshalokamClient);
        return shikshalokamClient.get();

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
        return ShikshaLokamReport.getExtentTest();
    }

    public Gestures gestures() {
        if (this.gestures == null) {
            this.gestures = new Gestures(this.appiumDriver);
            debugLogger().info("On Gestures");
           // System.out.println(this.gestures);
        }
        return this.gestures;
    }




}
