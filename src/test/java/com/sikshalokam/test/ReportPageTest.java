package com.sikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageActions;
import com.sikshalokam.pages.actions.ProjectPageActions;
import com.sikshalokam.pages.actions.ReportPageActions;
import com.sikshalokam.utils.gSheet.TestData;

public class ReportPageTest {

	Map<String, String> loginPageTestData;
    Map<String, String> observationPageTestData;
    Map<String, String> projectPageTestData;
    
    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    public ObservationPageActions getObservationPageActions() throws Exception {
        return new ObservationPageActions();
    }

    public ReportPageActions getReportPageActions() throws Exception {
    	return new ReportPageActions();
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
    
    @Test(description = "verify report tile and types")
    @Author(name = "Manjunatha K")
    public void verifyReportTileAndTypes() throws Exception {
    	loginToTheApplication();
    	getLoginPageActions().verifyReportsTile();
    	getLoginPageActions().clickOnReportsTile();
    	getReportPageActions().verifyObservationReportsTitle();
    	getReportPageActions().verifySurveyReportsTile();
    	getReportPageActions().verifyImprovementReportsTile();
    	getReportPageActions().clickOnObservationReportsTile();
    	getReportPageActions().verifyObservationReportsTitle();
    	getReportPageActions().verifySchoolSafetyMarchObservation();
    	getReportPageActions().clickOnSchoolSafetyMarchObservation();
    	getReportPageActions().verifySchoolSafetyMarchObservation();
    	getReportPageActions().verifyQuestionsTabInReport();
    	getReportPageActions().verifyCriteriaTabInReport();
    	getReportPageActions().verifyFilterInReport();
    	getReportPageActions().clickOnbackArrowOnTopPage();
    	getReportPageActions().clickOnbackArrowOnTopPage();
    	getReportPageActions().clickOnSurveryReportsTile();
    	getReportPageActions().verifySurveyPageTitle();
    	getReportPageActions().verifySurveyForTesting();
    	getReportPageActions().clickOnSurveyForTestingReport();
    	getReportPageActions().verifySurveyForTesting();
    	getReportPageActions().verifyFilterInReport();
    	getReportPageActions().clickOnbackArrowOnTopPage();
    	getReportPageActions().clickOnbackArrowOnTopPage();
    	getReportPageActions().clickOnImprovementReportsTile();
    	getReportPageActions().verifyProjectOverview();
    	getReportPageActions().verifyTaskOverview();
    	getReportPageActions().verifyCategoryOverview();
    }
    
    @Test(description = "verify report tile and types")
    @Author(name = "Manjunatha K")
    public void verifyReportTileAndTypesInStaging() throws Exception {
    	loginToTheApplication();
    	getLoginPageActions().verifyReportsTile();
    	getLoginPageActions().clickOnReportsTile();
    	getReportPageActions().verifyObservationReportsTitle();
    	getReportPageActions().verifySurveyReportsTile();
    	getReportPageActions().verifyImprovementReportsTile();
    	getReportPageActions().clickOnObservationReportsTile();
    	getReportPageActions().verifyObservationReportsTitle();
    	getReportPageActions().verifyParentChildObservation();
    	getReportPageActions().clickOnParentChildObservation();
    	getReportPageActions().verifyParentChildObservation();
    	getReportPageActions().verifyQuestionsTabInReport();
    	getReportPageActions().verifyCriteriaTabInReport();
    	getReportPageActions().verifyFilterInReport();
    	getReportPageActions().clickOnbackArrowOnTopPage();
    	getReportPageActions().clickOnbackArrowOnTopPage();
    	getReportPageActions().clickOnSurveryReportsTile();
    	getReportPageActions().verifySurveyPageTitle();
    	getReportPageActions().verifySurveyForTesting(); // changes need to do after data is available in staging
    	getReportPageActions().clickOnSurveyForTestingReport();
    	getReportPageActions().verifySurveyForTesting();
    	getReportPageActions().verifyFilterInReport();
    	getReportPageActions().clickOnbackArrowOnTopPage();
    	getReportPageActions().clickOnbackArrowOnTopPage();
    	getReportPageActions().clickOnImprovementReportsTile();
    	getReportPageActions().verifyProjectOverview();
    	getReportPageActions().verifyTaskOverview();
    	getReportPageActions().verifyCategoryOverview();
    }
}
