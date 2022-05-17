package com.sikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageActions;
import com.sikshalokam.pages.actions.ProjectPageActions;
import com.sikshalokam.utils.gSheet.TestData;

public class ProjectPageTestOffline {
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
    
    // @BeforeMethod
    public void loginToTheApplication() throws Exception {
        System.out.println("loginToTheApplication");
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
    }
    
    @Test(description = "create project via project tile")
    @Author(name = "Manjunatha K")
    public void verifyShareProjectPlatform() throws Exception {
    	loginToTheApplication();
        getProjectPageActions().clickOnProjectTab();
        projectPageTestData = TestData.getFullGoogleSheetDataAsMapString("Project!A:B");
        getProjectPageActions().searchProject(projectPageTestData.get("offlineProjectName1"));
        getProjectPageActions().clickOnFirstProject();
        //getProjectPageActions().clickOnStartImprovement();
        getProjectPageActions().clickOnShareButton();
        getProjectPageActions().clickOnSyncAndShare();
        getProjectPageActions().verifySharePlatformTitle();
        getProjectPageActions().verifyWhatsAppPlatformOption();
        getProjectPageActions().verifyGmailPlatformOption();
    }
}
