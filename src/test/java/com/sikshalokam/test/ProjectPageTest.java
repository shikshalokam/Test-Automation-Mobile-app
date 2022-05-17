package com.sikshalokam.test;

import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageActions;
import com.sikshalokam.pages.actions.ProjectPageActions;
import com.sikshalokam.utils.gSheet.TestData;

public class ProjectPageTest {

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
    public void createProject() throws Exception {
    	loginToTheApplication();
        getProjectPageActions().clickOnProjectTab();
        getProjectPageActions().verifyProjectPageTitle();
        getProjectPageActions().clickOnCreateByMeOption();
        getProjectPageActions().clickOnCreateNewProject();
        getProjectPageActions().clickOnDonotShareOption();
        projectPageTestData = TestData.getFullGoogleSheetDataAsMapString("Project!A:B");
        projectName = projectPageTestData.get("projectName") + RandomStringUtils.randomAlphabetic(3);
        getProjectPageActions().enterProjectTitle(projectName);
        projectDescription = projectPageTestData.get("projectDescription") + RandomStringUtils.randomAlphabetic(3);
        getProjectPageActions().enterProjectDescription(projectDescription);
        getProjectPageActions().selectCategories();
        getProjectPageActions().clickOnTeachersCheckBox();
        getProjectPageActions().clickOnSubmitButton();
        getProjectPageActions().clickOnCreateAndContinue();
        getProjectPageActions().verifyProjectCreatedTitle();
        getProjectPageActions().clickOnContinueButton();
        getProjectPageActions().clickOnViewProject();
        getProjectPageActions().verifyProjectCreatedMsg();
        getProjectPageActions().clickOnViewProjectButton();
    	getProjectPageActions().verifySyncButtonStatus();
        getObservationPageActions().clickOnTopBackButton();
        Thread.sleep(4000);
        getProjectPageActions().searchProjectAndVerify(projectName);
       /** getProjectPageActions().turnOffMobileData();
        getProjectPageActions().searchProjectAndVerify(projectName);
        getProjectPageActions().turnOnMobileData();**/
    }
    
}
