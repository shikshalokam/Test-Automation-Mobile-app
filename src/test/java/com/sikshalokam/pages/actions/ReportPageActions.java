package com.sikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.HomePageObjects;
import com.sikshalokam.pages.objects.LoginPageObjects;
import com.sikshalokam.pages.objects.ObservationPageObjects;
import com.sikshalokam.pages.objects.ProjectPageObjects;
import com.sikshalokam.pages.objects.ReportPageObjects;
import com.sikshalokam.utils.logger.Logger;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReportPageActions {
	
	LoginPageObjects loginPageObjects = new LoginPageObjects();
	ReportPageObjects reportPageObjects = new ReportPageObjects();
    
    
    public ReportPageActions() throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(SikshaLokamClient.get().driver()), reportPageObjects);
    }


    //******************Actions*********************************************************//
    
    public void clickOnObservationReportsTile() throws Exception {
    	SikshaLokamClient.get().gestures().click(reportPageObjects.ObservationReportsTile);
    	Logger.logAndReportInfo("Clicked on the observation reports tile.");
    }
    
    public void clickOnSchoolSafetyMarchObservation() throws Exception {
    	SikshaLokamClient.get().gestures().click(reportPageObjects.schoolSafetyMarchReport);
    	Logger.logAndReportInfo("Clicked on the School safety march report.");
    }
    
    public void clickOnParentChildObservation() throws Exception {
    	SikshaLokamClient.get().gestures().click(reportPageObjects.parentChildObservationReport);
    	Logger.logAndReportInfo("Clicked on the parent child observation report");
    }
    
    public void clickOnbackArrowOnTopPage() throws Exception {
    	SikshaLokamClient.get().gestures().click(reportPageObjects.backButtonOnTopPage);
    	Logger.logAndReportInfo("Clicked on the back button on top of Page.");
    }
    
    public void clickOnSurveryReportsTile() throws Exception {
    	SikshaLokamClient.get().gestures().waitForElementToAppear(reportPageObjects.SurveyReportsTile);
    	SikshaLokamClient.get().gestures().click(reportPageObjects.SurveyReportsTile);
    	Logger.logAndReportInfo("Clicked on the survey reports tile.");
    }
    
    public void clickOnSurveyForTestingReport() throws Exception {
    	SikshaLokamClient.get().gestures().click(reportPageObjects.surveyForTesting);
    	Logger.logAndReportInfo("Clicked on the survey for testing report.");
    }
    
    public void clickOnImprovementReportsTile() throws Exception {
    	SikshaLokamClient.get().gestures().click(reportPageObjects.ImprovementReportsTile);
    	Logger.logAndReportInfo("Clicked on the improvements reports tile.");
    }
    
    
  //******************Verify*********************************************************//
    public void verifyReportsTile() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.reportsTile),"Reports tile is not displayed.");
        Logger.logAndReportPass("Reports Tile is displayed succesfully.");
    }

    public void verifyObservationReportsTile() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.ObservationReportsTile),"Observation Reports tile is not displayed.");
        Logger.logAndReportPass("Observation Reports Tile is displayed succesfully.");
    } 
    
    public void verifySurveyReportsTile() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.SurveyReportsTile),"Survey Reports tile is not displayed.");
        Logger.logAndReportPass("Survey Reports Tile is displayed succesfully.");
    } 
    
    public void verifyImprovementReportsTile() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.ImprovementReportsTile),"Improvement Reports tile is not displayed.");
        Logger.logAndReportPass("Improvement Reports Tile is displayed succesfully.");
    } 
    
    public void verifyObservationReportsTitle() throws Exception {
    	Thread.sleep(2000);
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.ObservationReportsTitle),"Observation Reports title is not displayed.");
        Logger.logAndReportPass("Observation Reports Title is displayed succesfully.");
    }
    
    public void verifySchoolSafetyMarchObservation() throws Exception {
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.schoolSafetyMarchReport),"School Safety March observation is not displayed.");
        Logger.logAndReportPass("School Safety March observation is displayed succesfully.");
    }
    
    public void verifyParentChildObservation() throws Exception {
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.parentChildObservationReport),"Parent child observation is not displayed.");
        Logger.logAndReportPass("Parent child observation is displayed succesfully.");
    }
    
    public void verifyQuestionsTabInReport() throws Exception {
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.questionsTab),"Question tab on observation report is not displayed.");
        Logger.logAndReportPass("Question Tab on observation report is displayed succesfully.");
    }
    
    public void verifyCriteriaTabInReport() throws Exception {
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.criteriaTab),"Criteria tab on observation report is not displayed.");
        Logger.logAndReportPass("Criteria Tab on observation report is displayed succesfully.");
    }
    
    public void verifyFilterInReport() throws Exception {
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.filterOption),"Filter option on observation report is not displayed.");
        Logger.logAndReportPass("Filter option on observation report is displayed succesfully.");
    }
    
    public void verifySurveyPageTitle() throws Exception {
    	Thread.sleep(2000);
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.surveyTitle),"Survey title is not displayed.");
        Logger.logAndReportPass("Survey title  is displayed succesfully.");
    }
    
    public void verifySurveyForTesting() throws Exception {
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.surveyForTesting),"survey for testing report is not displayed.");
        Logger.logAndReportPass("Survey report for testing report is displayed succesfully.");
    }
    
    public void verifyProjectOverview() throws Exception {
    	Thread.sleep(2000);
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.projectOverviewButton),"project overview button is not displayed.");
        Logger.logAndReportPass("project overview button is displayed succesfully.");
    }
    
    public void verifyTaskOverview() throws Exception {
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.taskOverviewButton),"Task overview button is not displayed.");
        Logger.logAndReportPass("Task overview button is displayed succesfully.");
    }
    
    public void verifyCategoryOverview() throws Exception {
    	Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.categoryOverview),"Category overview button is not displayed.");
        Logger.logAndReportPass("Category overview button is displayed succesfully.");
    }
}
