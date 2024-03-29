package com.shikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.HomePageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.pages.objects.ProfilePageObjects;
import com.shikshalokam.pages.objects.ProjectPageObjects;
import com.shikshalokam.utils.logger.Logger;

public class ProfilePageActions {

	ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    ProjectPageObjects projectPageObjects = new ProjectPageObjects();
    HomePageObjects homePageObjects = new HomePageObjects();
    ProfilePageObjects profilePageObjects = new ProfilePageObjects();


    public ProfilePageActions() throws Exception {
        PageFactory.initElements(ShikshaLokamClient.get().driver(), profilePageObjects);
    }


    //******************Actions*********************************************************//

    public void clickOnEditRole() throws Exception {
    	ShikshaLokamClient.get().gestures().click(profilePageObjects.EditRole);
    	Logger.logAndReportInfo("Clicked on the Edit Button");
    }
    public void clickOnSelectBoard() throws Exception {
    	ShikshaLokamClient.get().gestures().click(profilePageObjects.selectBoard);
    	Logger.logAndReportInfo("Clicked on the select board option");
    }

    public void selectCBSEBoard() throws Exception {
    	ShikshaLokamClient.get().gestures().click(profilePageObjects.cbseOrNcertRadioButton);
    	Logger.logAndReportInfo("Clicked on the CBSE/NCERT board radio button option");
    }

    public void clickOnSubmitOnBoardPage() throws Exception {
    	ShikshaLokamClient.get().gestures().click(profilePageObjects.submitOnBoardSelectPage);
    	Logger.logAndReportInfo("Clicked on the Submit button on board selection page");
    }

    public void clickOnSaveButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(profilePageObjects.saveButton);
    	Logger.logAndReportInfo("Clicked on the Save Button ");
    }

    public void clickOnSelectSubRole() throws Exception {
    	ShikshaLokamClient.get().gestures().click(profilePageObjects.selectSubRoleDropDwn);
    	Logger.logAndReportInfo("Clicked on the select sub role dropdown");
    }

    public void selectHTSubRole() throws Exception {
    	ShikshaLokamClient.get().gestures().click(profilePageObjects.HTRole);
    	Logger.logAndReportInfo("Clicked on the HT subrole");
    }
    public void clickOnSubmitOnContentPreferencePage() throws Exception {
    	ShikshaLokamClient.get().gestures().click(profilePageObjects.submitOnContentPreferencePage);
    	Logger.logAndReportInfo("Clicked on the Submit button on conent preference selection page");
    }
    //**************************Verify*************************************************//

    public void verifyBoardSelectionTitle() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(profilePageObjects.boardTitle);
        Logger.logAndReportPass("Board title is displayed succesfully");
    }

    public void verifyChooseContentPreferenceTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(profilePageObjects.chooseContentPreferenceTitle);
    	Logger.logAndReportPass("Choose content preference title is displayed succesfully.");
    }

    public void verifySelectSubRoleTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(profilePageObjects.selectSubRoleTitle);
    	Logger.logAndReportPass("Select subrole title is displayed successfully.");
    }
}
