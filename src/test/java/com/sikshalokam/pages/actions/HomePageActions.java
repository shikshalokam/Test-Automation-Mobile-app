package com.sikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.HomePageObjects;
import com.sikshalokam.utils.logger.Logger;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePageActions {

	HomePageObjects homePageObjects = new HomePageObjects();

    public HomePageActions() throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(SikshaLokamClient.get().driver()), homePageObjects);
    }
    
    //******************* Actions ************************************************//
    
    public void clickOnDownloadIcon() throws Exception {
        SikshaLokamClient.get().gestures().click(homePageObjects.downloadsMenu);
        Logger.logAndReportInfo("clicked on the download icon. ");
    }
    
    
    public void clickOnDeleteDownloadedProject() throws Exception {
    	SikshaLokamClient.get().gestures().click(homePageObjects.deleteOption);
    	Logger.logAndReportInfo("clicked on the delete button option");
    }
    
    public void clickOnDeleteOnPopup() throws Exception {
    	SikshaLokamClient.get().gestures().click(homePageObjects.deleteOption);
    	Logger.logAndReportInfo("clicked on the delete button option from popup");
    }
    
    //******************* Verify ************************************************//
    public void verifyDownloadsPage() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(homePageObjects.downloadsTitle);
    	Logger.logAndReportPass("downloads title is displayed succesfully.");
    }
    
    public void verifyNoDownloadsYet() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(homePageObjects.NoDownloadsText);
    	Logger.logAndReportPass("There are no downloads in the section.");
    }
}
