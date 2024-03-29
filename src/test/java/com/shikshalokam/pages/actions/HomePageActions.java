package com.shikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.HomePageObjects;
import com.shikshalokam.pages.objects.ProfilePageObjects;
import com.shikshalokam.utils.logger.Logger;



public class HomePageActions {

	HomePageObjects homePageObjects = new HomePageObjects();
	ProfilePageObjects profilePageObjects = new ProfilePageObjects();

    public HomePageActions() throws Exception {
        PageFactory.initElements(ShikshaLokamClient.get().driver(), homePageObjects);
        PageFactory.initElements(ShikshaLokamClient.get().driver(), profilePageObjects);
    }

    //******************* Actions ************************************************//

    public void clickOnProgramsTile() throws Exception {
        ShikshaLokamClient.get().gestures().click(homePageObjects.programs);
        Logger.logAndReportInfo("Clicked On Programs Tile. ");
        Thread.sleep(3000);
    }

    public void clickOnProfileIcon() throws Exception {
        ShikshaLokamClient.get().gestures().click(homePageObjects.profileMenu);
        Logger.logAndReportInfo("Clicked On Profile Icon . ");
        Thread.sleep(3000);
    }
    public void clickOnHomeIcon() throws Exception {
        ShikshaLokamClient.get().gestures().click(homePageObjects.homeMenu);
        Logger.logAndReportInfo("Clicked On Home Icon . ");
        Thread.sleep(3000);
    }

    public void clickOnHamburgerMenu() throws Exception {
        ShikshaLokamClient.get().gestures().click(homePageObjects.hamburgerMenu);
        Logger.logAndReportInfo("Clicked On Hamburger Menu . ");
        Thread.sleep(3000);
    }
    public void clickOnTryNewSunbirdExperience() throws Exception {
        ShikshaLokamClient.get().gestures().click(homePageObjects.tryNewSunbirdExperience);
        Logger.logAndReportInfo("Clicked On Try new SUNBIRD experience . ");
        Thread.sleep(3000);
    }

    public void clickOnSwitchToNewExperienceButton() throws Exception {
        ShikshaLokamClient.get().gestures().click(homePageObjects.switchToNewExperience);
        Logger.logAndReportInfo("Clicked On SWITCH TO NEW EXPERIENCE . ");
        Thread.sleep(5000);
    }

    public void scrollToBrowseOtherCategories() throws Exception {
    	ShikshaLokamClient.get().gestures().swipeUp();
        ShikshaLokamClient.get().gestures().isDisplayed(homePageObjects.browseOtherCategorySection);
        Logger.logAndReportInfo("Scrolled to 'Browse Other Categories' section ");
        Thread.sleep(5000);
    }

    public void clickOnDownloadIcon() throws Exception {
        ShikshaLokamClient.get().gestures().click(homePageObjects.downloadsMenu);
        Logger.logAndReportInfo("clicked on the download icon. ");
    }

    public void clickOnDeleteDownloadedProject() throws Exception {
    	ShikshaLokamClient.get().gestures().click(homePageObjects.deleteOption);
    	Logger.logAndReportInfo("clicked on the delete button option");
    }

    public void clickOnDeleteOnPopup() throws Exception {
    	ShikshaLokamClient.get().gestures().click(homePageObjects.deleteOption);
    	Logger.logAndReportInfo("clicked on the delete button option from popup");
    }

    public void navigatingToTeacherHomePage() throws Exception {
  	clickOnProfileIcon();
  	ShikshaLokamClient.get().gestures().click(profilePageObjects.EditRole);
	Logger.logAndReportInfo("Clicked on the Edit Button");
	ShikshaLokamClient.get().gestures().click(profilePageObjects.submitOnContentPreferencePage);
	Logger.logAndReportInfo("Clicked on the Submit button on conent preference selection page");
	Thread.sleep(3000);

	clickOnHomeIcon();
	clickOnHamburgerMenu();
	clickOnTryNewSunbirdExperience();

     // clickOnSwitchToNewExperienceButton();
      }

    //******************* Verify ************************************************//
    public void verifyDownloadsPage() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(homePageObjects.downloadsTitle);
    	Logger.logAndReportPass("downloads title is displayed succesfully.");
    }

    public void verifyNoDownloadsYet() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(homePageObjects.NoDownloadsText);
    	Logger.logAndReportPass("There are no downloads in the section.");
    }

    public void verifyProgramsTile() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(homePageObjects.programs);
        Logger.logAndReportInfo("Programs Tile is Present. ");
    }
}
