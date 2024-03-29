package com.shikshalokam.listners;

import static com.shikshalokam.utils.logger.DebugLogger.debugLogger;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.shikshalokam.annotation.Author;
import com.shikshalokam.appium.AppiumManager;
import com.shikshalokam.appium.GlobalSession;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.constants.IAutoConst;
import com.shikshalokam.report.ExtentManager;
import com.shikshalokam.report.ExtentTestManager;
import com.shikshalokam.report.ShikshaLokamReport;

/**
 * @author: Sunil H N Date: 03/05/2021 Purpose: initilize and start appium
 * server
 */

public class TestListeners implements ITestListener {

    public static String mode;
    int count = 0;

    @Override
	public void onTestStart(ITestResult result) {
        try {
            String className = result.getMethod().getTestClass().getName();
            String testName = result.getMethod().getMethodName() + "";
            debugLogger().info(className.substring(21));
            debugLogger().info("*********************onTestStart********************* " + testName);
            Author author = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Author.class);
            String description = result.getMethod().getDescription();
            ExtentTest testReport = ExtentTestManager.createTest(testName, description, "OnePlus7", author);
            ShikshaLokamReport.setExtentTest(testReport);
            GlobalSession.get().getAppiumManager().createDriver("local", testName, className.substring(21));
            ShikshaLokamClient.setShikshaLokamClient(new ShikshaLokamClient(AppiumManager.getAppiumDriver()));
        } catch (Exception e) {
            debugLogger().error("Exception onTestStart: " + e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
	public void onTestSuccess(ITestResult result) {
        try {
            debugLogger().info("@onTestSuccess");
            ShikshaLokamReport.getExtentTest().log(Status.PASS, result.getMethod().getMethodName() + " Passed");
            GlobalSession.get().getAppiumManager().quitDriver();
        } catch (Exception e) {
            debugLogger().error("Exception onTestSuccess: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
	public void onTestFailure(ITestResult result) {
        try {
            debugLogger().error("OnTestFailure");
            debugLogger().error(result.getThrowable().toString());
            String base64img = ShikshaLokamClient.get().getScreenShot().captureBase64();
            ShikshaLokamReport.getExtentTest().fail(
                    result.getMethod().getMethodName() + " Failed " + result.getThrowable().getLocalizedMessage(),
                    MediaEntityBuilder.createScreenCaptureFromBase64String(base64img).build());
            GlobalSession.get().getAppiumManager().quitDriver();
        } catch (Exception e) {
            debugLogger().error("Exception onTestFailure: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override

    public void onStart(ITestContext context) {
        try {
            debugLogger().info("*********************onStart********************* mode " + mode);
            IAnnotation.enableTests();
            GlobalSession.set(new GlobalSession());
            AppiumManager appiumManager = new AppiumManager();
            if (true) {
                GlobalSession.get().setAppiumManager(appiumManager);
                try {
                    if (mode == null || mode.equalsIgnoreCase(IAutoConst.MODE_LOCAL)) {
                        debugLogger().info("Running in local");
                        appiumManager.startAppiumServer();
                    }
                } catch (Exception e) {
                    debugLogger().error("Exception onStart: " + e.getMessage());
                    e.printStackTrace();
                }
            }
            ExtentTestManager.InitReport();
        } catch (Exception e) {
            e.printStackTrace();
            debugLogger().error("Exception onStart: " + e.getMessage());
        }
    }

    @Override
	public void onFinish(ITestContext context) {
        try {
            debugLogger().info("*********************onFinish*********************");
            GlobalSession.get().getAppiumManager().stopAppiumServer();
            ExtentManager.getExtent().flush();
        } catch (Exception e) {
            debugLogger().error("Exception onFinish: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
