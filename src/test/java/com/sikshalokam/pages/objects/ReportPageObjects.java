package com.sikshalokam.pages.objects;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class ReportPageObjects {

	/**  already declared in loginpage objects @FindBy(xpath = "//android.widget.Button[@text='Reports']")
	 public MobileElement reportsTile; **/
	 
	 @FindBy(xpath="(//android.widget.TextView[contains(@text,'Observation Reports')])[1]")
	 public MobileElement ObservationReportsTile;
	 
	 @FindBy(xpath="(//android.widget.TextView[contains(@text,'Observation Reports')])[1]")
	 public MobileElement ObservationReportsTitle;
	 
	 @FindBy(xpath="(//android.widget.TextView[contains(@text,'Survey Reports')])[1]")
	 public MobileElement SurveyReportsTile;

	 @FindBy(xpath="(//android.widget.TextView[contains(@text,'Improvement Reports')])[1]")
	 public MobileElement ImprovementReportsTile;
	 
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'School Safety March')]")
	 public MobileElement schoolSafetyMarchReport;
	 
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Parent Child')]")
	 public MobileElement parentChildObservationReport;
	 
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Hp_tna_for_school_head')]")
	 public MobileElement HpSchoolHeadReport;
	 
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Observation With Rubrics')]")
	 public MobileElement ObservationWithRubricReport;
	 
	 @FindBy(xpath="//android.widget.Button[@text='QUESTIONS']")
	 public MobileElement questionsTab;
	 
	 @FindBy(xpath="//android.widget.Button[@text='CRITERIA']")
	 public MobileElement criteriaTab;
	 
	 @FindBy(xpath="//android.widget.Button[@text='options Filter']")
	 public MobileElement filterOption;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='back']")
	 public MobileElement backButtonOnTopPage;
	 
	 @FindBy(xpath = "(//android.widget.TextView[contains(@text,'Survey')])[1]")
	 public MobileElement surveyTitle;
	 
	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Survey For Testing')]")
	 public MobileElement surveyForTesting;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Project overview']")
	 public MobileElement projectOverviewButton;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Task overview']")
	 public MobileElement taskOverviewButton;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Category overview']")
	 public MobileElement categoryOverview;
	 
}
