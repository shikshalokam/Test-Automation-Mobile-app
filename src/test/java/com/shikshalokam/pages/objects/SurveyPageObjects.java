package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SurveyPageObjects {
	
	 @FindBy(xpath = "//android.widget.Button[@text='Surveys']")
	   public WebElement surveysTile;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Survey']")
	 public WebElement surveyPageTitle;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='back']")
	 public WebElement BackButton;
	 
	 @FindBy(xpath = "(//android.view.View[@resource-id='surveyCard'])[1]")
	 public WebElement firstSurvey;
	 
     @FindBy(xpath = "(//android.widget.TextView[@resource-id='itemTitle'])[1]")
   	 public WebElement surveyNameOnSurveyCard;
     
     @FindBy(xpath = "(//android.widget.TextView[@resource-id='itemSubTitle'])[1]")
   	 public WebElement validityOnSurveyCard;
     



}
