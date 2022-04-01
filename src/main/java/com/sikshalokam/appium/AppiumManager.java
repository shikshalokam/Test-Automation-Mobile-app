package com.sikshalokam.appium;

import com.sikshalokam.constants.IAutoConst;
import com.sikshalokam.utils.prop.PropUtlis;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 *
 * @author: Sunil H N Date: 12/02/2022 Purpose: To initilize all the required
 * variables and set driver instance
 */

@SuppressWarnings("rawtypes")
public class AppiumManager {

    private static final ThreadLocal<AppiumDriver<?>> appiumDriver = new ThreadLocal<>();
    private final String IP_ADDRESS = "127.0.0.1";
    public URL endurl;
    private AppiumDriverLocalService appiumDriverLocalService;
    private URL endpoint;
    private DesiredCapabilities desiredCapabilities;
    private AppiumDriver driver;

    public AppiumManager() {
    }


    public static void setDriverToThreadLocal(AppiumDriver<?> driver) {
        debugLogger().info("On SetDriverToThreadLocal");
        appiumDriver.set(driver);
    }

    public static AppiumDriver<?> getAppiumDriver() {
        debugLogger().info("On GetAppiumDriver");
        return appiumDriver.get();
    }

    public void createDriver(String mode, String testName, String className) throws Exception {
        debugLogger().info("On Create Driver...");
        this.setLocalCapabilities(mode, testName, className);
        this.setDriver(mode);
    }


    public URL startAppiumServer() throws Exception {
        try {
            File logFile = new File(IAutoConst.APPIUM_LOG);
            logFile.createNewFile();
            int serverPort = AppiumManagerUtils.getFreePort();
            File fileJS = new File(AppiumManagerUtils.getAppiumJSPath());
            File nodeJSPath = new File(AppiumManagerUtils.getNodePath());
            AppiumServiceBuilder appiumServiceBuilder = new AppiumServiceBuilder();
            appiumServiceBuilder.withAppiumJS(fileJS);
            appiumServiceBuilder.usingDriverExecutable(nodeJSPath);
            appiumServiceBuilder.withIPAddress(IP_ADDRESS);
            appiumServiceBuilder.usingPort(serverPort);
            appiumServiceBuilder.withLogFile(logFile);
            System.out.println("HERE");
            return this.startServer(appiumServiceBuilder);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return endpoint;
    }

    public URL startServer(AppiumServiceBuilder appiumServiceBuilder) throws Exception {
        try {
            appiumDriverLocalService = AppiumDriverLocalService.buildService(appiumServiceBuilder);
            appiumDriverLocalService.start();
            appiumDriverLocalService.clearOutPutStreams();
            if (appiumDriverLocalService.isRunning()) {
                debugLogger().info("Appium Server Started");
                this.endpoint = appiumDriverLocalService.getUrl();
                endurl = appiumDriverLocalService.getUrl();
                debugLogger().info("Endpoint " + this.endpoint);
                debugLogger().info("**************************************************************");
                debugLogger().info("$$$$$$$$$$$$$$$$$$$$$ APPIUM SERVER STARTED $$$$$$$$$$$$$$$$$$");
                debugLogger().info("**************************************************************");
                return this.endpoint;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return endpoint;
    }

    public void setDriver(String mode) throws Exception {
        if (mode.equalsIgnoreCase("local")) {
            debugLogger().info("selected Mode On SetDriver" + mode);
            debugLogger().info("***********************Running in LOCAL*****************************");
            debugLogger().info("endpoint " + appiumDriverLocalService.getUrl());
            this.driver = new AndroidDriver(this.endpoint, this.desiredCapabilities);
            AppiumManager.setDriverToThreadLocal(this.driver);
        } else {
            throw new Exception("Mode not matched");
        }
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    public void stopAppiumServer() {
        this.appiumDriverLocalService.stop();
        debugLogger().info("**************************************************************");
        debugLogger().info("$$$$$$$$$$$$$$$$$$$$$ APPIUM SERVER STOPPED $$$$$$$$$$$$$$$$$$");
        debugLogger().info("**************************************************************");

    }


    private DesiredCapabilities setLocalCapabilities(String mode, String testName, String className) throws Exception {
        debugLogger().info("On setLocalCapabilities");
        if (mode.equalsIgnoreCase("local")) {
            System.out.println("CLass " + className);
            if (className.equalsIgnoreCase("ObservationLinkTest")) {
                desiredCapabilities = PropUtlis.getDesiredCapabilities("chrome", IAutoConst.CAPS);
            } else {
                desiredCapabilities = PropUtlis.getDesiredCapabilities("local", IAutoConst.CAPS);
            }
            String operatingSystem = System.getProperty("os.name");
            if (operatingSystem.contains("Windows")) {
                debugLogger().info("Running in Windows");
                desiredCapabilities.setCapability("chromedriverExecutable", IAutoConst.CHROME_DRIVER + ".exe");
            }
            if (operatingSystem.contains("Linux")) {
                debugLogger().info("Running in Linux");
            }
            debugLogger().info("*************** Desired Capabilities ******************:");
            debugLogger().info(desiredCapabilities.toString());
            debugLogger().info("*************** Desired Capabilities ******************:");
        }
        return this.desiredCapabilities;
    }


    public void quitDriver() throws Exception {
        if (this.driver != null) {
            debugLogger().info("On QuitDriver");
            Process process = Runtime.getRuntime().exec("adb shell am force-stop preprod.diksha.app");
            process.waitFor();
            debugLogger().info("***************************QUTTING**************************");
        }
    }

}
