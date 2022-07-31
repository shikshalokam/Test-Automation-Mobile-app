package com.sikshalokam.pages.actions;

import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.ChromeObjects;
import com.sikshalokam.utils.logger.Logger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ChromeActions {

    ChromeObjects chromeObjects = new ChromeObjects();

    public ChromeActions() throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(SikshaLokamClient.get().driver()), chromeObjects);
    }

    public void enterUrl(String url) throws Exception {
        SikshaLokamClient.get().gestures().click(chromeObjects.searchBox);
        new Actions(SikshaLokamClient.get().driver()).sendKeys(url).perform();
        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.ENTER));
        Logger.logAndReportInfo("Entered URL "+url);
    }

    public void clickOnStartObservation() throws Exception {
        Thread.sleep(3000);
        SikshaLokamClient.get().gestures().click(chromeObjects.startObservation);
        Logger.logAndReportInfo("Clicked on Start observation ");
        Thread.sleep(5000);
    }

    public void clickOnStartProject() throws Exception {
    	Thread.sleep(2000);
    	SikshaLokamClient.get().gestures().click(chromeObjects.startProject);
    	Logger.logAndReportInfo("Clicked on the start project. ");
    	Thread.sleep(2000);
    }
    
    public void clickUrl(String url) throws Exception {
        new Actions(SikshaLokamClient.get().driver()).sendKeys(url).perform();
        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.ENTER));
        Logger.logAndReportInfo("Entered URL "+url);
    }
}
