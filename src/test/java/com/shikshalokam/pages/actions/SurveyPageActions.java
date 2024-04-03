package com.shikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.SurveyPageObjects;
import com.shikshalokam.utils.logger.Logger;

public class SurveyPageActions {
	 SurveyPageObjects surveyPageObjects = new SurveyPageObjects();
	 
	  public SurveyPageActions() throws Exception {
	        PageFactory.initElements(ShikshaLokamClient.get().driver(), surveyPageObjects);
	    }
	 
	  //******************Actions*********************************************************//
	    public void clickOnSurveysTile() throws Exception {
	        ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(surveyPageObjects.surveysTile);
	        Logger.logAndReportInfo("Clicked on the Surveys tile");
	    }
	    
	    //**************************Verify*************************************************//
	    public void verifySurveyListingPage() throws Exception {
	        ShikshaLokamClient.get().gestures().waitForElementToAppear(surveyPageObjects.surveyPageTitle);
	        Logger.logAndReportPass("Landed on Survey Listing Page .");
	        ShikshaLokamClient.get().gestures().isDisplayed(surveyPageObjects.surveyPageTitle);
	      
	        ShikshaLokamClient.get().gestures().isDisplayed(surveyPageObjects.BackButton);
	        ShikshaLokamClient.get().gestures().isDisplayed(surveyPageObjects.firstSurvey);
	        Logger.logAndReportPass("List of Project Displayed Successfully.");
	    }
	    
	    public void verifySurveyCardContents() throws Exception {
	      	ShikshaLokamClient.get().gestures().isDisplayed(surveyPageObjects.surveyNameOnSurveyCard);
	      	Logger.logAndReportInfo("Survey Name is displayed on Survey card.");
	        String FirstSurveyName = ShikshaLokamClient.get().gestures().getText(surveyPageObjects.surveyNameOnSurveyCard);
	        Logger.logAndReportInfo("First Survey Name : " + FirstSurveyName);
	        ShikshaLokamClient.get().gestures().isDisplayed(surveyPageObjects.validityOnSurveyCard);
	        Logger.logAndReportInfo("Survey validity is displayed on Survey card.");
	        String SurveyValidity = ShikshaLokamClient.get().gestures().getText(surveyPageObjects.validityOnSurveyCard);
	        Logger.logAndReportInfo("First Survey's Validity :" + SurveyValidity);

	       }
}
