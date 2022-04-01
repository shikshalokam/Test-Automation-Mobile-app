package com.sikshalokam.report;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.sikshalokam.annotation.Author;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 * 
 * @author: Sunil H N Date: 13/02/2022 Purpose: overloaded methods as we use it
 *          for send information to report
 * 
 */

public class ExtentTestManager {

	private static ExtentTest extentTest;
	public static ExtentReports extentReports;

	public static void InitReport() {
		debugLogger().info("On InitReports");
		extentReports = ExtentManager.getExtent();
	}

	public synchronized static ExtentTest createTest(String name, String description, String deviceId) {
		extentTest = extentReports.createTest(name, description).assignCategory(deviceId);
		return extentTest;
	}

	public synchronized static ExtentTest createTest(String name, String deviceId) {
		extentTest = extentReports.createTest(name).assignCategory(deviceId);
		return extentTest;
	}

	public synchronized static ExtentTest createTest(String name, String deviceId, Author author) {
		extentTest = extentReports.createTest(name).assignCategory(deviceId).assignAuthor(author.name());
		return extentTest;
	}

	public synchronized static ExtentTest createTest(String name, String description, String deviceId, Author author) {
		String testName = name.substring(0, 1).toUpperCase() + name.substring(1);
		extentTest = extentReports.createTest(testName, description).assignCategory(deviceId)
				.assignAuthor(author.name());
		return extentTest;

	}
}
