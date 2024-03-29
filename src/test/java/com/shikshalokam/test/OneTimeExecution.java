package com.shikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageActions;
import com.shikshalokam.pages.actions.ProfilePageActions;
import com.shikshalokam.pages.actions.ProjectPageActions;
import com.shikshalokam.utils.gSheet.TestData;

public class OneTimeExecution {

	Map<String, String> loginPageTestData;
    Map<String, String> observationPageTestData;
    Map<String, String> projectPageTestData;

    String projectName;
    String projectDescription;

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    public ObservationPageActions getObservationPageActions() throws Exception {
        return new ObservationPageActions();
    }

    public ProjectPageActions getProjectPageActions() throws Exception {
    	return new ProjectPageActions();
    }


    public ProfilePageActions getProfilePageActions() throws Exception {
    	return new ProfilePageActions();
    }

 // @BeforeMethod
    public void loginToTheApplication() throws Exception {
        System.out.println("loginToTheApplication");
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("loginUsers!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName4"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password4"));
        getLoginPageActions().clickOnLoginButton();
    }

    @Test(description = "create project via project tile")
    @Author(name = "Manjunatha K")
    public void loginAndFilllSubPersonDetails() throws Exception {
    	loginToTheApplication();
    	getProfilePageActions().clickOnSelectBoard();
    	getProfilePageActions().verifyBoardSelectionTitle();
    	getProfilePageActions().selectCBSEBoard();
    	getProfilePageActions().clickOnSubmitOnBoardPage();
    	getProfilePageActions().clickOnSaveButton();
    	getProfilePageActions().clickOnSelectSubRole();
    	getProfilePageActions().selectHTSubRole();
    	getProfilePageActions().clickOnSubmitOnBoardPage();
    	getProfilePageActions().clickOnSubmitOnContentPreferencePage();
    	Thread.sleep(2000);
    	getLoginPageActions().verifyHomePage();
    }
}
