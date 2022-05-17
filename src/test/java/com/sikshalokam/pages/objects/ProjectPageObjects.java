package com.sikshalokam.pages.objects;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class ProjectPageObjects {

	 @FindBy(xpath="//android.widget.Button[contains(@text,'English')]")
	 public MobileElement englishLanguageOption;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Projects']")
	 public MobileElement projectTile;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Projects']")
	 public MobileElement projectPageTitle;
	 
	 @FindBy(xpath = "//android.view.View[@text='Assigned to me']")
	 public MobileElement assignedToMeOption;
	 
	 @FindBy(xpath = "//android.view.View[@text='Discovered by me']")
	 public MobileElement discoverdByMeOption;
	 
	 @FindBy(xpath = "//android.view.View[@text='Created by me']")
	 public MobileElement createdByMeOption;
	 
	 @FindBy(xpath = "//android.widget.EditText[@index='0']")
	 public MobileElement projectSearchBox;
	 
	 @FindBy(xpath = "//android.widget.TextView[@index='0'])[4])")
	 public MobileElement firstProject;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Create New Project']")
	 public MobileElement createNewProject;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='LOAD MORE PROJECTS']")
	 public MobileElement loadMoreProjects;
	 
	 @FindBy(xpath = "//android.widget.CheckBox[@resource-id='ion-cb-0']")
	 public MobileElement checkBoxToShare;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Share']")
	 public MobileElement shareOption;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Do not share']")
	 public MobileElement doNotShareOption;
	 
	 //change xpth according to parent child
	 @FindBy(xpath = "(//android.widget.EditText)[1]")
	 public MobileElement projectTitleInput;
	 
	 @FindBy(xpath = "(//android.widget.EditText)[2]")
	 public MobileElement projectDescriptionInput;
	 
	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Select category(s)')]")
	 public MobileElement selectCategories;
	 
	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Teachers')])[2]")
	 public MobileElement teachersCategory;
	 
	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Students')])[2]")
	 public MobileElement studentsCategory;
	 
	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Infrastructure')])[2]")
	 public MobileElement infrastructureCategory;
	 
	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Community')])[2]")
	 public MobileElement communityCategory;
	 
	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Education Leader')])[2]")
	 public MobileElement eduLeadersCategory;
	 
	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'School Process')])[2]")
	 public MobileElement schoolProcessCategory;
	 
	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Others')])[2]")
	 public MobileElement othersCategory;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
	 public MobileElement submitButton;
			 
	 @FindBy(xpath = "//android.widget.Button[@text='CANCEL']")
	 public MobileElement cancelButton;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='CREATE AND CONTINUE']")
	 public MobileElement createAndContinueButton;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Project Created']")
	 public MobileElement projectCreatedTitle;
	 
	 @FindBy(xpath ="//android.widget.Button[@text='CONTINUE']")
	 public MobileElement continueOption;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='EDIT']")
	 public MobileElement editOption;
	 
	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Your Project has been created successfully')]")
	 public MobileElement succesMsg;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='View Project']")
	 public MobileElement viewProjectsButton;
	 
	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Your Project has been created successfully')]")
	 public MobileElement successMsg;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='VIEW PROJECT']")
	 public MobileElement viewProjectsButtonoNPopup;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='sync circle Synced']")
	 public MobileElement syncOption;
	
	 @FindBy(xpath = "(//android.widget.TextView[@index='0'])[4]")
	 public MobileElement searchedProject;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Start improvement']")
	 public MobileElement startImprovement;
	 
	 @FindBy(xpath = "//android.widget.Button[contains(@text,'cloud download')]")
     public MobileElement downloadIcon;
    
     @FindBy(xpath = "//android.widget.Button[contains(@text,'share')]")
     public MobileElement shareIcon;
    
     @FindBy(xpath = "//android.widget.Button[contains(@text,'create Edit')]")
     public MobileElement editIcon;
     
     @FindBy(xpath = "//android.widget.Button[contains(@text,'folder open Files')]")
     public MobileElement filesIcon;
    
     @FindBy(xpath = "//android.widget.Button[contains(@text,'checkmark circle')]")
     public MobileElement checkmarkDownloadIcon;
	    
     @FindBy(xpath = "(//android.view.View)[29]")
     public MobileElement firstSearchedProject;
     
     @FindBy(xpath = "//android.widget.Button[contains(@text,'DONT SYNC')]")
     public MobileElement dontSyncOption;
     
     @FindBy(xpath = "//android.widget.Button[contains(@text,'SYNC & SHARE')]")
     public MobileElement syncAndShareOption;
     
     @FindBy(xpath = "//android.widget.TextView[@text='Share']")
     public MobileElement sharePlatformTitle;
     
     @FindBy(id = "android:id/content_preview_filename")
     public MobileElement previewFileName;
     
     @FindBy(xpath = "//android.widget.TextView[@text='Gmail']")
     public MobileElement whatsAppPlatformOption;
     
     @FindBy(xpath = "//android.widget.TextView[@text='Gmail']")
     public MobileElement gmailPlatformOption;
     
     @FindBy(xpath = "")
     public MobileElement g;
     
     
}
