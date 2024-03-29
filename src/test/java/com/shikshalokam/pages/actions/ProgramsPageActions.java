package com.shikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.pages.objects.ProgramsPageObjects;
import com.shikshalokam.pages.objects.ProjectPageObjects;
import com.shikshalokam.utils.logger.Logger;


public class ProgramsPageActions {

	ProgramsPageObjects programsPageObjects = new ProgramsPageObjects();
	ProjectPageObjects projectPageObjects = new ProjectPageObjects();
	ObservationPageObjects observationPageObjects = new ObservationPageObjects();

public ProgramsPageActions() throws Exception {
	  PageFactory.initElements(ShikshaLokamClient.get().driver(), programsPageObjects);
	  PageFactory.initElements(ShikshaLokamClient.get().driver(), observationPageObjects);
	  PageFactory.initElements(ShikshaLokamClient.get().driver(), projectPageObjects);
	}




//***********************************Actions**********************************//

public void scrolltoProgram() throws Exception {
	//ShikshaLokamClient.get().gestures().scrollUpToMobileElement(programsPageObjects.programNalikali,"8");
	//ShikshaLokamClient.get().driver().findElementByXPath("new UiScrollable(new UiSelector()).scrollIntoview(text(\"Nali-Kali Staging Test\"));");
	ShikshaLokamClient.get().gestures().scrollUpToMobileElement(programsPageObjects.programMahadevan,"5");
	Logger.logAndReportInfo("scrolled to Mahadevan second program");
}
public void clickOnProgramMahadevan() throws Exception {
	ShikshaLokamClient.get().gestures().click(programsPageObjects.programMahadevan);
	Logger.logAndReportInfo("clicked On Mahadevan second program");
}
public void clickOnProgramSearchField() throws Exception {
	ShikshaLokamClient.get().gestures().click(programsPageObjects.programSearchBox);
}

public void searchForProgram(String programName) throws Exception {
ShikshaLokamClient.get().gestures().sendValueToTextBox(programsPageObjects.programSearchBox, programName);
Logger.logAndReportInfo("Program name entered is :" + programName);
Thread.sleep(2000);
}

public void clickOnFirstProgram() throws Exception {
	ShikshaLokamClient.get().gestures().click(programsPageObjects.firstProgramCard);
	Logger.logAndReportInfo("Clicked On first Program .");
	Thread.sleep(3000);
}
public void clickOnJoinProgram() throws Exception {
	ShikshaLokamClient.get().gestures().click(programsPageObjects.JoinprogramButtonOnProgramDetailsPage);
	Logger.logAndReportInfo("Clicked On Join Program .");
	Thread.sleep(3000);
}
public void clickOnJoinProgramButtonOnPopUp() throws Exception {
	ShikshaLokamClient.get().gestures().click(programsPageObjects.joinProgramButton);
	Logger.logAndReportInfo("Clicked On Join Program .");
	Thread.sleep(3000);
}

public void clickOnDoNotShareButtonOnPiiPopup() throws Exception {
	ShikshaLokamClient.get().gestures().click(programsPageObjects.DoNotShareButtonOnPiiPopUp);
	Logger.logAndReportInfo("Clicked On Do Not Share Button on Pii Pop-Up .");
	Thread.sleep(1000);
}

public void checkTheCheckBoxOnPiiPopup() throws Exception {
	ShikshaLokamClient.get().gestures().click(programsPageObjects.checkBoxOnPiiPopup);
	Logger.logAndReportInfo("Checked the checkbox on Pii Pop-Up .");
	Thread.sleep(1000);
}
public void clickBack() throws Exception {
	ShikshaLokamClient.get().gestures().clickBackButton();
	Logger.logAndReportInfo("Clicked on Android back button");

}

	public void clickShareButtonOnPiiPopup() throws Exception {
		ShikshaLokamClient.get().gestures().click(programsPageObjects.ShareButtonOnPiiPopUp);
		Logger.logAndReportInfo("Clicked On Share Button on Pii Pop-Up .");
		Thread.sleep(1000);
}

	public void clickOnFirstResourceCollapseCardAndSelectfirstResource() throws Exception {
		ShikshaLokamClient.get().gestures().click(programsPageObjects.firstResourceCollapsecard);
		Logger.logAndReportInfo("Clicked On first Resource Collapse card .");
		Thread.sleep(1000);
		ShikshaLokamClient.get().gestures().click(programsPageObjects.firstResource);
		Logger.logAndReportInfo("Clicked On first Resource .");
		Thread.sleep(2000);
}
//----------------------------------verify--------------------------------//

public void verifyProgramListingPage() throws Exception {
    ShikshaLokamClient.get().gestures().waitForElementToAppear(programsPageObjects.ExploreProgramsHeader);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.ExploreProgramsHeader);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.subTextBelowHearder);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.programSearchBox);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.BackButton);
    Logger.logAndReportPass("Landed on Programs Listing Page .");
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.firstProgramCard);
    Logger.logAndReportPass("List of Program cards Displayed Successfully.");
}

public void verifyProgramCardContents() throws Exception {
	 ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.firstProgramName);
	 Logger.logAndReportInfo("Program Name is displayed on program card.");
    String FirstProgramName = ShikshaLokamClient.get().gestures().getText(programsPageObjects.firstProgramName);
    Logger.logAndReportInfo("First Program Name : " + FirstProgramName);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.stateSectionOnProgramCard);
    Logger.logAndReportInfo("State : section is displayed on program card.");
    String StateName = ShikshaLokamClient.get().gestures().getText(programsPageObjects.stateNameOnFirstProgramCard);
    Logger.logAndReportInfo("State : " + StateName);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.recommendedForSectionOnProgramCard);
    Logger.logAndReportInfo("Recommended for : section is displayed on program card.");
    String RecommendedForRole = ShikshaLokamClient.get().gestures().getText(programsPageObjects.recommendedForRoleOnFirstProgramCard);
    Logger.logAndReportInfo("Recommended for : " + RecommendedForRole);
}

public void verifyJoinProgramButtonIsEnabledBydefault() throws Exception {
	 ShikshaLokamClient.get().gestures().isEnabled(programsPageObjects.JoinprogramButtonOnProgramDetailsPage);
	 Logger.logAndReportInfo("Join Program - Button is Enabled by Deafult .");

}
public void verifyProgramDetailsPage() throws Exception {
    ShikshaLokamClient.get().gestures().waitForElementToAppear(programsPageObjects.programNameOnDetailsPage);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.programNameOnDetailsPage);
    String programname = ShikshaLokamClient.get().gestures().getText(programsPageObjects.programNameOnDetailsPage);
    Logger.logAndReportInfo("Program Name - " + programname);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.programDescriptionOnDetailsPage);
    String programdescription = ShikshaLokamClient.get().gestures().getText(programsPageObjects.programDescriptionOnDetailsPage);
    Logger.logAndReportInfo("Program Description - " + programdescription);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.JoinprogramButtonOnProgramDetailsPage);
    verifyJoinProgramButtonIsEnabledBydefault();
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.BackButton);
    Logger.logAndReportPass("Landed on Programs Details Page .");
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.AllTabOnProgramDetailsPage);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.ProjectsTabOnProgramDetailsPage);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.ObservationsTabOnProgramDetailsPage);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.SurveysTabOnProgramDetailsPage);
    Logger.logAndReportPass("4 Tabs - All , Projects , Observations , Surveys are Displayed On Program Details Page.");
}

public void verifyPiiPopUp() throws Exception {
    ShikshaLokamClient.get().gestures().waitForElementToAppear(programsPageObjects.piiPopUp);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.piiPopUp);
    Thread.sleep(2000);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.userDeatilsOnPiiPopUp);
    String userdetails = ShikshaLokamClient.get().gestures().getText(programsPageObjects.userDeatilsOnPiiPopUp);
    Logger.logAndReportInfo("User details on Pii Pop-Up - " + userdetails);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.checkBoxOnPiiPopup);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.ShareButtonOnPiiPopUp);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.DoNotShareButtonOnPiiPopUp);
    Logger.logAndReportPass("Pii Pop-Up shows up .");

}
public void verifyJoinProgramPopUp() throws Exception {
    ShikshaLokamClient.get().gestures().waitForElementToAppear(programsPageObjects.joinProgramPopUp);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.joinProgramPopUp);
    String popUpHeader = ShikshaLokamClient.get().gestures().getText(programsPageObjects.joinProgramPopUp);
    Logger.logAndReportInfo("Pop-Up Header - " + popUpHeader);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.joinProgramContentMessage);
    String Msg = ShikshaLokamClient.get().gestures().getText(programsPageObjects.joinProgramContentMessage);
    Logger.logAndReportInfo("Join Program Pop-up Message - " + Msg);
    ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.joinProgramButton);
    ShikshaLokamClient.get().gestures().isEnabled(programsPageObjects.joinProgramButton);
    Logger.logAndReportInfo("Join program Button is Enabled By Default .");
    Logger.logAndReportPass("Join Program Pop-Up shows up .");

}

public void verifyYourdatasettinghasbeenupdatedsuccessfullyToastMessage() throws Exception {
	boolean toastmsg = ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.YourdatasettinghasbeenupdatedsuccessfullyToastMessage);
	if(toastmsg) {
		Logger.logAndReportInfo("Toast Message showed up as - Your data setting has been updated successfully  i.e User has joined Program Successfully .");
}else {
		ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.youhaveJoinedthisProgramMsg);
		Logger.logAndReportInfo("You have joined this Program, - Message is displayed in place of Join Program Button");
}
}

public void verifyYouHaveJoinedThisProgramMsg() throws Exception {
	 ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.youhaveJoinedthisProgramMsg);
	 Logger.logAndReportInfo("You have joined this Program, - Message is displayed in place of Join Program Button");
	 String expirydate = ShikshaLokamClient.get().gestures().getText(programsPageObjects.youhaveJoinedthisProgramMsg);
	    Logger.logAndReportInfo(expirydate);
}

public void verifyProfileDataSharing() throws Exception {
	 ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.ProfileDataSharingDropdown);
	 ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.ProfileDataSharingDropdownDownArrow);
	 Logger.logAndReportInfo("Profile data sharing Dropdown with Dropdown arrow - Shows up on program details page .");

}

/**public void verifyLandedOnResourceDetailsPageDirectly() throws Exception {

	boolean projectDetailsPage = ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectDetailsTab);
	if(projectDetailsPage) {
		Logger.logAndReportInfo("Join Program Pop-up didn't show up as user has already Joined Program , therefore Landed On 'Project Details' Page for Project Resource");
} else {
	boolean addEntityPage = ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addEntityButton);
	 if(addEntityPage) {
		Logger.logAndReportInfo("Join Program Pop-up didn't show up as user has already Joined Program , therefore Landed On 'Add Enity' Page for Observation Resource");
} else {
	boolean surveyQuestionnairePage = ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.progressBarOnSurveyquestionnaire);
	if (surveyQuestionnairePage) {
		Logger.logAndReportInfo("Join Program Pop-up didn't show up as user has already Joined Program , therefore Landed On 'Survey Questionnaire' Page for Survey Resource");
	}}

}}}
 * @throws Exception */

public void verifyLandedOnResourceDetailsPageDirectly() throws Exception {
    boolean conditionSatisfied = false;
    try {
        if (ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectDetailsTab)) {
            Logger.logAndReportPass("Join Program Pop-up didn't show up as the user has already joined the program. Landed on 'Project Details' Page for Project Resource");
            conditionSatisfied = true;
        }
    } catch (Exception e) {
        Logger.logAndReportInfo("Exception occurred while checking 'Project Details' page: " + e);
        // Handle the exception as needed, but allow execution to proceed
    }

    if (!conditionSatisfied) {
        try {
            boolean addEntityPage = ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addEntityButton);
            if (addEntityPage) {
                Logger.logAndReportPass("Join Program Pop-up didn't show up as the user has already joined the program. Landed On 'Add Entity' Page for Observation Resource");
                conditionSatisfied = true;
            }
        } catch (Exception e) {
            Logger.logAndReportInfo("Exception occurred while checking 'Add Entity' page: "+ e);
            // Handle the exception as needed, but allow execution to proceed
        }
    }

    if (!conditionSatisfied) {
        try {
            boolean surveyQuestionnairePage = ShikshaLokamClient.get().gestures().isDisplayed(programsPageObjects.progressBarOnSurveyquestionnaire);
            if (surveyQuestionnairePage) {
                Logger.logAndReportPass("Join Program Pop-up didn't show up as the user has already joined the program. Landed On 'Survey Questionnaire' Page for Survey Resource");
                conditionSatisfied = true;
            }
        } catch (Exception e) {
            Logger.logAndReportInfo("Exception occurred while checking 'Survey Questionnaire' page: " + e);
            // Handle the exception as needed, but allow execution to proceed
        }
    }

    // If none of the conditions are met or an exception occurred, log an error or handle the situation accordingly
    if (!conditionSatisfied) {
        Logger.logAndReportError("Unexpected page. Please check the application state.");
    }
}

}









