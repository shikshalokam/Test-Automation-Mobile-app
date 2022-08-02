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
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Projects assigned to me']")
	 public MobileElement projectsAssignedToMeTitle;
	 
	 @FindBy(xpath = "//android.view.View[@text='Discovered by me']")
	 public MobileElement discoverdByMeOption;
	 
	 @FindBy(xpath = "//android.view.View[@text='Created by me']")
	 public MobileElement createdByMeOption;
	 
	 @FindBy(xpath = "//android.widget.EditText[@index='0']")
	 public MobileElement projectSearchBox;
	 
	 @FindBy(xpath = "(//android.widget.TextView[@index='0'])[4]")
	 public MobileElement firstProject;
	 
	 @FindBy(xpath = "//android.widget.TextView[@index='0']")
	 public MobileElement projectList;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Create New Project']")
	 public MobileElement createNewProject;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Load more projects']")
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
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Submit']")
	 public MobileElement submitButton;
			 
	 @FindBy(xpath = "//android.widget.Button[@text='Cancel']")
	 public MobileElement cancelButton;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Create and continue']")
	 public MobileElement createAndContinueButton;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Project Created']")
	 public MobileElement projectCreatedTitle;
	 
	 @FindBy(xpath ="//android.widget.Button[@text='Continue']")
	 public MobileElement continueOption;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Edit']")
	 public MobileElement editOption;
	 
	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Your Project has been created successfully')]")
	 public MobileElement succesMsg;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='View project']")
	 public MobileElement viewProjectsButton;
	 
	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Your Project has been created successfully')]")
	 public MobileElement successMsg;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='View project']")
	 public MobileElement viewProjectsButtonoNPopup;
	 
	 //s is Capital inside text 
	 @FindBy(xpath = "//android.widget.Button[@text='sync circle Synced']")
	 public MobileElement syncOption;
	
	 @FindBy(xpath = "(//android.widget.TextView[@index='0'])[4]")
	 public MobileElement searchedProject;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Start improvement']")
	 public MobileElement startImprovement;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Submit improvement']")
	 public MobileElement submitImprovement;
	 
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
     
     @FindBy(xpath = "//android.widget.Button[contains(@text,'Dont sync')]")
     public MobileElement dontSyncOption;
     
     @FindBy(xpath = "//android.widget.Button[contains(@text,'Sync & share')]")
     public MobileElement syncAndShareOption;
     
     @FindBy(xpath = "//android.widget.TextView[@text='Share']")
     public MobileElement sharePlatformTitle;
     
     @FindBy(id = "android:id/content_preview_filename")
     public MobileElement previewFileName;
     
     @FindBy(xpath = "//android.widget.TextView[@text='Gmail']")
     public MobileElement whatsAppPlatformOption;
     
     @FindBy(xpath = "//android.widget.TextView[@text='Gmail']")
     public MobileElement gmailPlatformOption;
     
     @FindBy(xpath = "(//android.widget.Image[contains(@text,'create')])[1]")
     public MobileElement createEditIconOnProjectView;
     
     @FindBy(xpath = "//android.widget.Button[@text='Save edits']")
     public MobileElement EditSaveButtonForProject;
     
     @FindBy(xpath = "//android.view.View[@text='Project view']")
     public MobileElement projectViewTitle;
     
     @FindBy(xpath = "//android.view.View[@text='Project details']")     
     public MobileElement projectDetailsTab;
     
     @FindBy(xpath = "//android.view.View[@text='Task details']")
     public MobileElement taskDetailsTab;
     
     @FindBy(xpath = "//android.widget.TextView[@text='Task 1']")
     public MobileElement task1;
     
     @FindBy(xpath = "//android.view.View[@text='Select Status']")
     public MobileElement selectStatus;
     
     
}
