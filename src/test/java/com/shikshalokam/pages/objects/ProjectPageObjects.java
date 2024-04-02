package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;



public class ProjectPageObjects {

	 @FindBy(xpath="//android.widget.Button[contains(@text,'English')]")
	 public WebElement englishLanguageOption;

	 @FindBy(xpath = "//android.widget.Button[@text='Projects']")
	 public WebElement projectTile;

	 @FindBy(xpath = "//android.widget.TextView[@text='Projects']")
	 public WebElement projectPageTitle;

	 @FindBy(xpath = "//android.view.View[@text='Assigned to me']")
	 public WebElement assignedToMeOption;

	 @FindBy(xpath = "//android.widget.TextView[@text='Projects assigned to me']")
	 public WebElement projectsAssignedToMeTitle;

	 @FindBy(xpath = "//android.view.View[@text='Discovered by me']")
	 public WebElement discoverdByMeOption;

	 @FindBy(xpath = "//android.view.View[@text='Created by me']")
	 public WebElement createdByMeOption;

	 @FindBy(xpath = "//android.widget.EditText[@index='0']")
	 public WebElement projectSearchBox;

	 @FindBy(xpath = "(//android.view.View[@resource-id='projectsCard'])[1]")
	 public WebElement firstProject;

	 @FindBy(xpath = "(//android.view.View[@resource-id='projectsCard'])[2]")
	 public WebElement secondProject;

	 @FindBy(xpath = "//android.widget.TextView[@index='0']")
	 public WebElement projectList;

	 @FindBy(xpath = "//android.widget.TextView[@text='Create New Project']")
	 public WebElement createNewProject;

	 @FindBy(xpath = "//android.widget.TextView[@text='Create tasks for your project']")
	 public WebElement createTasksForYourProject;

	 @FindBy(xpath = "//android.widget.TextView[@text='Add New Task']")
	 public WebElement addNewTaskPopUp;

	 @FindBy(xpath = "//android.widget.Button[@text='Add task']")
	 public WebElement addTaskButton;

	 @FindAll({
	 @FindBy(xpath = "//android.widget.Button[@text='Load more projects']"),
	@FindBy(xpath = "(//android.widget.Button)[2]")
	 })
	 public WebElement loadMoreProjects;

	 @FindBy(xpath = "//android.widget.CheckBox[@resource-id='ion-cb-0']")
	 public WebElement checkBoxToShare;

	 @FindBy(xpath = "//android.widget.Button[@text='Share']")
	 public WebElement shareOption;

	 @FindBy(xpath = "//android.widget.Button[@text='Do not share']")
	 public WebElement doNotShareOption;

	 //change xpth according to parent child
	 @FindBy(xpath = "(//android.widget.EditText)[1]")
	 public WebElement projectTitleInput;

	 @FindBy(xpath = "(//android.widget.EditText)[2]")
	 public WebElement projectDescriptionInput;

	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Select category(s)')]")
	 public WebElement selectCategories;

	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Teachers')])[2]")
	 public WebElement teachersCategory;

	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Students')])[2]")
	 public WebElement studentsCategory;

	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Infrastructure')])[2]")
	 public WebElement infrastructureCategory;

	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Community')])[2]")
	 public WebElement communityCategory;

	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Education Leader')])[2]")
	 public WebElement eduLeadersCategory;

	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'School Process')])[2]")
	 public WebElement schoolProcessCategory;

	 @FindBy(xpath = "(//android.widget.CheckBox[contains(@text,'Others')])[2]")
	 public WebElement othersCategory;

	 @FindBy(xpath = "//android.widget.Button[@text='Submit']")
	 public WebElement submitButton;

	 @FindBy(xpath = "//android.widget.Button[@text='Cancel']")
	 public WebElement cancelButton;

	 @FindAll({
		 @FindBy(xpath = "//android.widget.Button[@text='Create and continue']"),
		 @FindBy(xpath = "//android.widget.Button[@text='Create and Continue']")
	 })
	 public WebElement createAndContinueButton;

	 @FindBy(xpath = "//android.widget.TextView[@text='Project Created']")
	 public WebElement projectCreatedTitle;

	 @FindBy(xpath ="//android.widget.Button[@text='Continue']")
	 public WebElement continueOption;

	 @FindBy(xpath = "//android.widget.Button[@text='Edit']")
	 public WebElement editOption;

	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Your Project has been created successfully')]")
	 public WebElement succesMsg;

	 @FindAll({
		 @FindBy(xpath = "//android.widget.TextView[@text='View project']"),
		 @FindBy(xpath = "//android.widget.TextView[@text='View Project']")
	 })
	 public WebElement viewProjectsButton;

	 @FindBy(xpath = "//android.widget.TextView[contains(@text,'Your Project has been created successfully')]")
	 public WebElement successMsg;

	 @FindAll({
		 @FindBy(xpath = "//android.widget.Button[@text='View project']"),
		 @FindBy(xpath = "//android.widget.Button[@text='View Project']")
	 })
	 public WebElement viewProjectsButtonoNPopup;

	 //s is Capital inside text
	 @FindBy(xpath = "//android.widget.Button[@text='sync circle Synced']")
	 public WebElement syncOption;

	 @FindBy(xpath = "(//android.widget.TextView[@index='0'])[6]")
	 public WebElement searchedProject;

	 @FindBy(xpath = "(//android.widget.TextView[@index=0])[4]")
	 public WebElement projectNameOnDetailsPage;

	 @FindBy(xpath = "(//android.widget.TextView[@index=1])[1]")
	 public WebElement programNameOnDetailsPage;

	 @FindBy(xpath = "//android.widget.Button[@text='Start improvement']")
	 public WebElement startImprovementButton;

	 @FindBy(xpath = "//android.widget.Button[@text='Submit improvement']")
	 public WebElement submitImprovement;

	 @FindBy(xpath = "//android.widget.TextView[@text='Add remarks']")
	 public WebElement addRemarksScreen;

	 @FindBy(xpath = "//android.widget.Button[contains(@text,'cloud download')]")
     public WebElement downloadIcon;

     @FindBy(xpath = "//android.widget.Button[contains(@text,'share')]")
     public WebElement shareIcon;

     @FindBy(xpath = "//android.widget.Button[contains(@text,'create Edit')]")
     public WebElement editIcon;

     @FindBy(xpath = "//android.widget.Button[contains(@text,'folder open Files')]")
     public WebElement filesIcon;

     @FindBy(xpath = "//android.widget.Button[contains(@text,'checkmark circle')]")
     public WebElement checkmarkDownloadIcon;

     @FindBy(xpath = "(//android.view.View)[32]")
     public WebElement firstSearchedProject;

     @FindBy(xpath = "//android.widget.Button[contains(@text,'Dont Sync')]")
     public WebElement dontSyncOption;

     @FindBy(xpath = "//android.widget.Button[contains(@text,'Sync & Share')]")
     public WebElement syncAndShareOption;

     @FindBy(xpath = "//android.widget.TextView[@text='Share']")
     public WebElement sharePlatformTitle;

     @FindBy(id = "android:id/content_preview_filename")
     public WebElement previewFileName;

     @FindBy(xpath = "//android.widget.TextView[@text='Gmail']")
     public WebElement whatsAppPlatformOption;

     @FindBy(xpath = "//android.widget.TextView[@text='Gmail']")
     public WebElement gmailPlatformOption;

     @FindBy(xpath = "(//android.widget.Image[contains(@text,'create')])[1]")
     public WebElement createEditIconOnProjectView;

     @FindBy(xpath = "//android.widget.Button[@text='Save edits']")
     public WebElement EditSaveButtonForProject;

     @FindBy(xpath = "//android.view.View[@text='Project view']")
     public WebElement projectViewTitle;

     @FindBy(xpath = "//android.view.View[@text='Project details']")
     public WebElement projectDetailsTab;

     @FindBy(xpath = "//android.view.View[@text='Task details']")
     public WebElement taskDetailsTab;

     @FindBy(xpath = "//android.widget.TextView[contains(@text,'Task 2')]")
     public WebElement task2;

     @FindBy(xpath = "//android.view.View[@text='Select Status']")
     public WebElement selectStatus;

     @FindBy(xpath = "//android.widget.Button[@text='back']")
	 public WebElement BackButton;

     @FindBy(xpath = "(//android.widget.TextView[@resource-id='itemTitle'])[1]")
   	 public WebElement projectNameOnProjectCard;

     @FindBy(xpath = "(//android.widget.TextView[@resource-id='itemSubTitle'])[1]")
   	 public WebElement programNameOnProjectCard;

     @FindBy(xpath = "//android.widget.TextView[@text='View task details']")
   	 public WebElement viewTaskDetails;

     @FindBy(xpath = "(//android.widget.Button[@text='Not Started'])[1]")
   	 public WebElement statusDropdown;

     @FindBy(xpath = "//android.widget.RadioButton[@text='Completed']")
   	 public WebElement completedStatus;

     @FindBy(xpath = "//android.widget.Button[@text='OK']")
   	 public WebElement okButton;

    @FindBy(xpath = "(//android.widget.EditText)[1]")
     public WebElement remarksTextField;

    @FindBy(xpath = "//android.widget.TextView[@text='Submit improvement']")
    public WebElement submitImprovementPopUp;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Congratulations!')]")
    public WebElement ProjectCompletionMsg;

    @FindBy(xpath = "//android.widget.Button[@text='images Gallery']")
    public WebElement gallery;

    @FindBy(xpath = "(//android.view.View[@resource-id='taskCard'])[1]")
    public WebElement firstTaskCard;

    @FindBy(xpath = "(//android.view.View[@resource-id='taskCard'])[2]")
    public WebElement secondTaskCard;

    @FindBy(xpath = "(//android.view.View[@resource-id='taskCard'])[3]")
    public WebElement thirdTaskCard;
    
    @FindBy(xpath = "(//android.view.View[@resource-id='taskCard'])[4]")
    public WebElement fourthTaskCard;

    @FindBy(xpath = "//android.view.View[@resource-id='sb-generic-toast']")
    public WebElement toastMsg;

    @FindBy(xpath = "//android.widget.TextView[@text='Start improvement ?']")
    public WebElement startImprovementPopUp;

    @FindBy(xpath = "//android.widget.TextView[@text='You must click on the Start improvement button to access and edit the project details.']")
    public WebElement StartImpPopUpMainContent;

    @FindBy(xpath = "//android.widget.TextView[@text='Click on the Start improvement to get complete access to the content']")
    public WebElement StartImpPopUpSubContent;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id='certificate'])[1]")
    public WebElement certificateLabel;

    @FindBy(xpath = "//android.widget.TextView[@text='Confirm profile name']")
    public WebElement nameEditPopUp;

    @FindBy(xpath = "//android.view.View[@resource-id='addSubtask']")
    public WebElement addSubtaskButton;

    @FindBy(xpath = "//android.widget.Image/android.widget.TextView[@resource-id='certTitle']")  //Req for UEL
    public WebElement generatedCertificate;

    @FindBy(xpath = "//android.view.View[@resource-id='moreTasks']")
    public WebElement loadMoreTasks;

    @FindBy(xpath = "(//android.view.View[@resource-id='subtaskCard'])[1]//android.widget.Button//android.widget.Button")
    public WebElement subtask1Status;

    @FindBy(xpath = "//android.widget.Button[@text='Add files']")
    public WebElement addfileButton;

    @FindBy(xpath = "(//android.widget.CheckBox)[1]")
    public WebElement checkbox;

    @FindBy(xpath = "//android.widget.Button[@text='Upload']")
    public WebElement uploadButton;

    @FindBy(xpath = "//android.widget.Button[@text='link outline Links']")
    public WebElement linkAttachment;

    @FindBy(xpath = "//android.view.View[@resource-id='link']//android.widget.EditText")
    public WebElement addLinkTextfield;

    @FindBy(xpath = "//android.widget.Button[@text='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//android.widget.Button[@text='Attach files']")
    public WebElement attachFilesButton;

    @FindBy(xpath = "//android.view.View[@resource-id='startObservation']")
    public WebElement startObservationButtonOnTaskCard;

    @FindBy(xpath = "//android.view.View[@resource-id='projectActions']//android.widget.Button[@text='ribbon Certificate']")
    public WebElement certificateLogo;

    @FindBy(xpath = "//android.widget.TextView[@text='Certificate']")
    public WebElement certificateScreen;

    @FindBy(xpath = "//android.view.View[@resource-id='subtaskNameField']/android.widget.EditText")
    public WebElement addSubTaskNameField;


    @FindBy(xpath = "//android.view.View[@resource-id='subtaskCard']")
    public WebElement subtaskCard;

    @FindBy(xpath = "(//android.widget.TextView[@index=0])[5]")
    public WebElement downloadedProjectName;

    @FindBy(xpath = "//android.widget.Button[contains(@text,'Delete ')]")
    public WebElement deleteButton;

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    public WebElement deleteButtonOnPopup;

    @FindBy(xpath = "//android.widget.Button[@text='View reports']")
    public WebElement viewReportsButtonOnTaskCard;
    
    @FindBy(xpath = "//android.widget.TextView[@text='Import Project']")
    public WebElement importProjectPopup;
    
    @FindBy(xpath = "//android.widget.Button[@text='Yes']")
    public WebElement yesButton;
    
    
    
    //android.widget.TextView[@text='Import Project']



}
