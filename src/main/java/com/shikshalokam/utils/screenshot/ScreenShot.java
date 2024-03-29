package com.shikshalokam.utils.screenshot;

import static com.shikshalokam.utils.logger.DebugLogger.debugLogger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.shikshalokam.report.ShikshaLokamReport;

public class ScreenShot {

	private WebDriver driver;

	public ScreenShot(WebDriver driver) {
		this.driver = driver;
	}

//	public void screenshot() throws WebDriverException, Exception {
//		debugLogger().info("screenshot");
//		String base64Screenshot = "data:image/png;base64,"
//				+ ((TakesScreenshot) ShikshaLokamClient.get().driver()).getScreenshotAs(OutputType.BASE64);
//		ShikshaLokamReport.getExtentTest().log(Status.INFO, base64Screenshot);
//
//	}

	public void screenshot() throws Exception {
		debugLogger().info("screenshot");
		TakesScreenshot newScreen = (TakesScreenshot) driver;
		String scnShot = newScreen.getScreenshotAs(OutputType.BASE64);
		ShikshaLokamReport.getExtentTest().info(
				"Captured ScreenShot",
				MediaEntityBuilder.createScreenCaptureFromBase64String(scnShot).build());

	}

	public String captureBase64() {
		TakesScreenshot newScreen = (TakesScreenshot) driver;
		String scnShot = newScreen.getScreenshotAs(OutputType.BASE64);
		return "data:image/jpg;base64, " + scnShot;
	}

}
