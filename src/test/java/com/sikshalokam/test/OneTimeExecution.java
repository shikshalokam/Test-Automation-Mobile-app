package com.sikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageActions;
import com.sikshalokam.pages.actions.ProfilePageActions;
import com.sikshalokam.pages.actions.ProjectPageActions;
import com.sikshalokam.utils.gSheet.TestData;

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
        getLoginPageActions().enterUserName(loginPageTestData.get("userName3"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password3"));
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
