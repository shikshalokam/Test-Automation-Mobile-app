package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ProgramsPageObjects {

	 @FindBy(xpath = "//android.widget.EditText[@index='0']")
	 public WebElement programSearchBox;

	 @FindBy(xpath = "//android.widget.TextView[@text='Explore Programs']")
	 public WebElement ExploreProgramsHeader;

	 @FindBy(xpath = "//android.widget.Button[@text='back']")
	 public WebElement BackButton;

	 @FindBy(xpath = "//android.widget.TextView[@text='View and participate in educational programs active in your location and designed for the role you selected']")
	 public WebElement subTextBelowHearder;

	 @FindBy(xpath = "(//android.view.View[@resource-id='programCard'])[1] ")
	 public WebElement firstProgramCard;

	  @FindBy(xpath = "(//android.widget.TextView[@index=0])[4]")
	 public WebElement firstProgramName;

	  @FindBy(xpath = "(//android.widget.TextView[@text='State :'])[1]")
		 public WebElement stateSectionOnProgramCard;

	  @FindBy(xpath = "(//android.widget.TextView[@index=2])[1]")
		 public WebElement stateNameOnFirstProgramCard;

	  @FindBy(xpath = "//android.widget.TextView[@text='Recommended for :']")
		 public WebElement recommendedForSectionOnProgramCard;

	  @FindBy(xpath = "(//android.widget.TextView[@index=4])[1]")
		 public WebElement recommendedForRoleOnFirstProgramCard;

	  @FindBy(xpath = "//android.widget.TextView[@resource-id='programTitle']")
	   public WebElement programNameOnDetailsPage;

	  @FindAll({
			 @FindBy(xpath = "//android.widget.TextView[@resource-id='programDescription']"),
			 @FindBy(xpath = "//android.view.View[@resource-id='programDescription']")
		 })
	  public WebElement programDescriptionOnDetailsPage;

	/*  @FindBy(xpath = "//android.widget.TextView[@index=1]")
	 public WebElement programDescriptionlessthan150characters;

	  @FindBy(xpath = "(//android.widget.TextView[@index=0])[4]")
		 public WebElement  programDescriptionmorethan150characters; */

	  @FindBy(xpath = "//android.view.View[@text='All']")
		 public WebElement AllTabOnProgramDetailsPage;

	  @FindBy(xpath = "//android.view.View[@text='Projects']")
		 public WebElement ProjectsTabOnProgramDetailsPage;

	  @FindBy(xpath = "//android.view.View[@text='Observations']")
		 public WebElement ObservationsTabOnProgramDetailsPage;

	  @FindBy(xpath = "//android.view.View[@text='Surveys']")
		 public WebElement SurveysTabOnProgramDetailsPage;

	  @FindAll({
			 @FindBy(xpath = "//android.view.View[@resource-id='programJoinButton']"),
			 @FindBy(xpath = "//android.widget.Button[@text='Join program']")
		 })
		 public WebElement JoinprogramButtonOnProgramDetailsPage;

	   /*  @FindBy(xpath = "(//android.view.View[@index=1])[4]")     //program cards - resource id to be provided by dev
		 public WebElement firstProgram;  */

	     @FindBy(xpath = "//android.view.View[@text='Consent to share details']")
		 public WebElement piiPopUp;

	     @FindBy(xpath = "//android.widget.TextView[contains(@text,'User name')]")
		 public WebElement userDeatilsOnPiiPopUp;

	     @FindBy(xpath = "(//android.widget.CheckBox)[1]")
		 public WebElement checkBoxOnPiiPopup;

	     @FindBy(xpath = "//android.widget.Button[@text='Do not share']")
		 public WebElement DoNotShareButtonOnPiiPopUp;

	     @FindBy(xpath = "//android.widget.Button[@text='Share']")
		 public WebElement ShareButtonOnPiiPopUp;

	     @FindBy(xpath = "//android.view.View[@text='Your data setting has been updated successfully']")
		 public WebElement YourdatasettinghasbeenupdatedsuccessfullyToastMessage ;

	     @FindBy(xpath = "//android.widget.TextView[contains(@text,'You have joined this program,')]")
		 public WebElement youhaveJoinedthisProgramMsg;

	     @FindBy(xpath = "//android.widget.TextView[@text='Profile data sharing']")
		 public WebElement ProfileDataSharingDropdown;

	     @FindBy(xpath = "//android.widget.Image[@text='arrow down circle outline'] ")
		 public WebElement ProfileDataSharingDropdownDownArrow;

	     @FindBy(xpath = "(//android.view.View[@resource-id='resourceCard'])[1]")
		 public WebElement firstResourceCollapsecard;

	     @FindBy(xpath = "(//android.view.View[@resource-id='resourceItemCard'])[1]")
		 public WebElement firstResource;

	     @FindBy(xpath = "//android.widget.TextView[contains(@text,'0 / ')]")
		 public WebElement progressBarOnSurveyquestionnaire;

	     @FindBy(xpath = "//android.widget.Button[@text='Load more']")
	     public WebElement loadMoreButton;

	     @FindBy(xpath = "//android.widget.TextView[@text='Mahadevan second program']")
	     public WebElement programMahadevan;

	     @FindBy(xpath = "//android.widget.TextView[@text='Join Program ?']")
	     public WebElement joinProgramPopUp;

	     @FindBy(xpath = "//android.widget.TextView[contains(@text,'Please join')]")
	     public WebElement joinProgramContentMessage;

	     @FindBy(xpath = "//android.widget.Button[@text='Join program']")
	     public WebElement joinProgramButton;



	   //android.widget.TextView[@text='Join Program ?']
	   //android.widget.TextView[contains(@text,'Please join')]
	   //android.widget.Button[@text='Join program']



}
