package com.shikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.HomePageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.pages.objects.ProjectPageObjects;
import com.shikshalokam.utils.logger.Logger;

public class ProjectPageActions {

    ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    ProjectPageObjects projectPageObjects = new ProjectPageObjects();
    HomePageObjects homePageObjects = new HomePageObjects();

    String filepath = System.getProperty("user.dir");

    public ProjectPageActions() throws Exception {
        PageFactory.initElements(ShikshaLokamClient.get().driver(), projectPageObjects);
    }


    //******************Actions*********************************************************//
    public void clickOnProjectTile() throws Exception {
        ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.projectTile);
        Logger.logAndReportInfo("Clicked on the Project tile");
    }

    public void clickOnCreateByMeOption() throws Exception {
        ShikshaLokamClient.get().gestures().click(projectPageObjects.createdByMeOption);
        Logger.logAndReportInfo("Clicked on the Created by me option");
    }

    public void clickOnAssignedToMeOption() throws Exception {
        ShikshaLokamClient.get().gestures().click(projectPageObjects.assignedToMeOption);
        Logger.logAndReportInfo("Clicked on the assigned to me option");
    }

    public void clickOnCreateNewProject() throws Exception {
    	Thread.sleep(3000);
        ShikshaLokamClient.get().gestures().click(projectPageObjects.createNewProject);
        Logger.logAndReportInfo("Clicked on create new project");
    }

    public void clickOnDonotShareOption() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.doNotShareOption);
    	Logger.logAndReportInfo("Clicked on the Do not share option");
    }

    public void selectCheckBoxToShare() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.checkBoxToShare);
    	Logger.logAndReportInfo("Clicked on checkbox to enable share option");
    }

    public void clickOnShareOption() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.shareOption);
    	Logger.logAndReportInfo("Clicked on the Share option");
    }

    public void clickOnAddTask() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.addTaskButton);
    	Logger.logAndReportInfo("Clicked onAdd task Button");
    }

    public void enterProjectTitle(String projectTitle) throws Exception {
    	//ShikshaLokamClient.get().gestures().clear(projectPageObjects.projectTitleInput);
       // ShikshaLokamClient.get().gestures().click(projectPageObjects.projectTitleInput);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectTitleInput, projectTitle);
    	Logger.logAndReportInfo("Project title entered is : " + projectTitle);
    }

    public void enterProjectDescription(String projectDesc) throws Exception {
    	//ShikshaLokamClient.get().gestures().clear(projectPageObjects.projectDescriptionInput);
        //ShikshaLokamClient.get().gestures().click(projectPageObjects.projectDescriptionInput);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectDescriptionInput, projectDesc);
    	Logger.logAndReportInfo("entered project description is : " + projectDesc);
    }

    public void enterTaskDescription(String taskDescription) throws Exception {
    	//ShikshaLokamClient.get().gestures().clear(projectPageObjects.projectTitleInput);
        //ShikshaLokamClient.get().gestures().click(projectPageObjects.projectTitleInput);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectTitleInput, taskDescription);
    	Logger.logAndReportInfo("Task Description entered is : " + taskDescription);
    }

    public void enterRemarks(String Remarks) throws Exception {
    	//ShikshaLokamClient.get().gestures().clear(projectPageObjects.remarksTextField);
        //ShikshaLokamClient.get().gestures().click(projectPageObjects.remarksTextField);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.remarksTextField, Remarks);
    	Logger.logAndReportInfo("Remarks entered is : " + Remarks);
    }

    public void selectCategories() throws Exception {
    	//ShikshaLokamClient.get().gestures().click(projectPageObjects.selectCategories);
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.selectCategories);
    	Logger.logAndReportInfo("Clicked on the categroies.");
    }
    public void clickOnTeachersCheckBox() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.teachersCategory);
    	Logger.logAndReportInfo("Clicked on the teachers Category");
    }

    public void clickOnSubmitButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.submitButton);
    	Logger.logAndReportInfo("Clicked on the Submit Button");
    }

    public void clickOnCreateTasksForYourProject() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.createTasksForYourProject);
    	Logger.logAndReportInfo("Clicked on Create tasks for your project ");
    }
    public void clickOnCreateAndContinue() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.createAndContinueButton);
    	Logger.logAndReportInfo("Clicked on the create and contine option");
    }

    public void clickOnContinueButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.continueOption);
    	Logger.logAndReportInfo("Clicked on Continue option");
    }

    public void clickOnViewProject() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.viewProjectsButton);
    	Logger.logAndReportInfo("Clicked on the view project button. ");
    	Thread.sleep(4000);
    }

    public void clickOnViewProjectButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.viewProjectsButtonoNPopup);
    	Logger.logAndReportInfo("Clicked on the view project button on popup");
    }


    public void turnOffMobileData()  throws Exception {
    	ShikshaLokamClient.get().gestures().turnOffMobileData();
    	Logger.logAndReportInfo("Mobile Data is turned Off");
    }

    public void turnOnMobileData()  throws Exception {
    	ShikshaLokamClient.get().gestures().turnOnMobileData();
    	Logger.logAndReportInfo("Mobile Data is turned On");
    }

    public void clickOnStartImprovement() throws Exception {
    	Thread.sleep(2000);
    	boolean status = ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.startImprovementButton);
    	if(status)
    	{
    	 ShikshaLokamClient.get().gestures().click(projectPageObjects.startImprovementButton);
    	 Logger.logAndReportInfo("Clicked on the start improvement ");
    	}
    }

    public void clickOnProjectDownloadIcon() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.downloadIcon);
    	Logger.logAndReportInfo("Clicked on the download icon");
    }

    public void searchProject(String projectName) throws Exception{
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectSearchBox, projectName);
    	Logger.logAndReportInfo("Searched project is " + projectName);
    	Thread.sleep(2000);
    	/*String displayedProject = ShikshaLokamClient.get().gestures().getText(projectPageObjects.searchedProject);
    	return displayedProject; */
    }

    public void clickOnFirstProject() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.firstProject);
    	Logger.logAndReportInfo("Clicked on the first project");
    }
    public void clickOnSecondProject() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.secondProject);
    	Logger.logAndReportInfo("Clicked on the first project");
    }

    public void clickOnShareButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.shareIcon);
    	Logger.logAndReportInfo("Clicked on the share icon");
    }

    public void clickOnSyncAndShare() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.syncAndShareOption);
    	Logger.logAndReportInfo("Clicked on the sync and share option from popup window.");
    }

    public void clickOnEditIconOnProject() throws Exception {
    	Thread.sleep(2000);
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.editIcon);
    	Logger.logAndReportInfo("Clicked on the edit icon in project");
    }

    public void clickOnEditOnProjectView() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.createEditIconOnProjectView);
    	Logger.logAndReportInfo("Clicked on the edit icon in project view.");
    }

    public void clickOnSaveEditForProject() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.EditSaveButtonForProject);
    	Logger.logAndReportInfo("Clicked on the edit save button on project view");
    }

    public void clickOnTaskDetails() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.taskDetailsTab);
    	Logger.logAndReportInfo("Clicked on the task details tab");
    }

    public void clickOnFirstTaskCard() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.firstTaskCard);
    	Logger.logAndReportInfo("Clicked on first task");
    }

    public void completeTask() throws Exception {
    	attachingTaskEvidences();
    	Thread.sleep(3000);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.subtask1Status);
    	selectCompletedStatus();
    	clickOnOkButton();
    }


    public void clickOnSecondTaskCard() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.secondTaskCard);
    	Logger.logAndReportInfo("Clicked on second task");
    }

    public void clickOnThirdTaskCard() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.thirdTaskCard);
    	Logger.logAndReportInfo("Clicked on third task");
    }

    public void clickOnSubtaskStatus() throws Exception {
    	 ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.subtask1Status);
    	 Logger.logAndReportInfo("Clicked on Subtask Status dropdown");
    }


    public void clickOnViewTaskDetails() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.viewTaskDetails);
    	Logger.logAndReportInfo("Clicked on View task details ");
    }

    public void clickOnTaskStatusDropdown() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.statusDropdown);
    	Logger.logAndReportInfo("Clicked on Status Dropdown ");
    }

    public void selectCompletedStatus() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.completedStatus);
    	Logger.logAndReportInfo("Selected Completed Status ");
    }

    public void clickOnOkButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.okButton);
    	Logger.logAndReportInfo("Clicked on OK button ");
    	Thread.sleep(3000);
    }

    public void clickOnSubmitImprovementButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.submitImprovement);
    	Logger.logAndReportInfo("Clicked on Submit improvement button ");
    }


    public void clickOnTask2() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.task2);
    	Logger.logAndReportInfo("clicked on the task2 details");
    }

    public void clickOnBackButton() throws Exception {
    	Thread.sleep(3000);
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.BackButton);
    	Logger.logAndReportInfo("clicked on Back navigation");
    	Thread.sleep(3000);

    }
    public void clickOnLoadMoreTasks() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.loadMoreTasks);
    	Logger.logAndReportInfo("clicked on load more tasks");
    }

    public void swipeUp() throws Exception {
    	 ShikshaLokamClient.get().gestures().swipeUp();
    }

    public void attachingTaskEvidences() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.addfileButton);
    	Logger.logAndReportInfo("clicked on Add files Button");
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.checkbox);
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.uploadButton);
    	Logger.logAndReportInfo("clicked on Upload Button");
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.linkAttachment);
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.addLinkTextfield);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.addLinkTextfield,"link1");
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.saveButton);
    	Thread.sleep(5000);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.attachFilesButton);
    	Logger.logAndReportInfo("Attached Task evidence");

    }

    public void attachingProjectEvidences() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.linkAttachment);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.checkbox);
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.uploadButton);
    	Logger.logAndReportInfo("clicked on Upload Button");

    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.addLinkTextfield);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.addLinkTextfield,"projectevidence");
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.saveButton);
    	Thread.sleep(3000);
    	Logger.logAndReportInfo("Attached Project evidence");
    	//ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.submitImprovement);

    }

    public void clickOnStartObservationOnTaskCard() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.startObservationButtonOnTaskCard);
    	Logger.logAndReportInfo("clicked on Start Observation Button ");
    }

    public void clickOnCertificateLogo() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.certificateLogo);
    	Logger.logAndReportInfo("clicked on certificateLogo");
    }

    public void addSubtaskName() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.addSubTaskNameField);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.addSubTaskNameField, "Subtask1");
    	Logger.logAndReportInfo("Entered Subtask Name");
    }

    public void clickOnAddSubtaskButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.addSubtaskButton);
    	Logger.logAndReportInfo("clicked Add subtask Button");
    }

    public void deleteDownloadedProject() throws Exception {
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.deleteButton);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.deleteButtonOnPopup);

    }





  /*  public void fileUpload() throws Exception {
    	projectPageObjects.gallery.sendKeys(filepath+"\\File_Upload\\Shikshalokam.jpg");
    }  */

    //**************************Verify*************************************************//


    public void verifyProjectPageTitle() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectPageTitle);
        Logger.logAndReportPass("Project Page title is displayed succesfully");
    }



    public void verifySearchedProject(String projectNameSearched) throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.searchedObservation);
    	Logger.logAndReportPass("Searched project is displayed succesfully");
    	String actualObservationName = ShikshaLokamClient.get().gestures().getText(observationPageObjects.searchedObservation);
    	ShikshaLokamClient.get().getAsserts().assertEquals(actualObservationName, projectNameSearched,
    				"Searched Project is not matching.");
    	System.out.println(actualObservationName);
   		Logger.logAndReportPass("Entered project name is matched.");
    }

    public void verifyProjectCreatedTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectCreatedTitle);
    	Logger.logAndReportPass("Project Created title is displayed succesfully.");
    }

    public void verifyAddNewTaskPopUp() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.addNewTaskPopUp);
    	Logger.logAndReportPass("Add New Task - PopUp is displayed succesfully.");
    }

    public void verifyProjectCreatedMsg() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.succesMsg);
    	Logger.logAndReportPass("Project Created succesfully message is displayed.");
    }

    public void verifySubmitImprovementPopUp() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.submitImprovementPopUp);
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.submitImprovementPopUp);
    	Logger.logAndReportInfo("Submit improvement Pop-up shows up");
    }

    public void verifyProjectSubmissionCompleted() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.ProjectCompletionMsg);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.ProjectCompletionMsg);
       String completionMsg = ShikshaLokamClient.get().gestures().getText(projectPageObjects.ProjectCompletionMsg);
    	Logger.logAndReportPass("Project Submission Status -" +completionMsg);
    }


    //to match case sensitive the below method is used.
    public void searchVerifySelectProject(String projectName) throws Exception {
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectSearchBox, projectName);
    	Logger.logAndReportInfo("Searched project is " + projectName);
    	Thread.sleep(2000);
    	String displayedProject = ShikshaLokamClient.get().gestures().getText(projectPageObjects.searchedProject);
    	//ShikshaLokamClient.get().getAsserts().assertEquals(displayedProject, projectName,
			//	"Project name is not matching.");

    	ShikshaLokamClient.get().getAsserts().assertEquals(displayedProject, projectName,
	"Project name is not matching.");
    	Logger.logAndReportInfo("Searched Project is Matched and Displayed.");
    	ShikshaLokamClient.get().gestures().click(projectPageObjects.searchedProject);

    }

    public void VerifyProjectGotDownloaded(String downloadProject) throws Exception {

    	String downloadedProject = ShikshaLokamClient.get().gestures().getText(projectPageObjects.downloadedProjectName);

    	ShikshaLokamClient.get().getAsserts().assertEquals(downloadedProject, downloadProject,
	"Project is not downloaded");
    	Logger.logAndReportPass("Project is downloaded Successfully.");

    }


    public void verifySearchingProject(String projectNameSearched) throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.searchedObservation);
    	Logger.logAndReportPass("Searched project is displayed succesfully");
    	String actualObservationName = ShikshaLokamClient.get().gestures().getText(observationPageObjects.searchedObservation);
    	ShikshaLokamClient.get().getAsserts().assertEquals(actualObservationName, projectNameSearched,
    				"Searched Project is not matching.");
    	System.out.println(actualObservationName);
   		Logger.logAndReportPass("Entered project name is matched.");
    }

    public void verifySyncButtonStatus() throws Exception {
    	boolean syncStatus = ShikshaLokamClient.get().gestures().isEnabled(projectPageObjects.syncOption);
    	if(syncStatus)
    		Logger.logAndReportPass("Sync is Enabled.");
    	else
    		Logger.logAndReportWarning("Sync is Not Enabled.");
    }

    public void verifyIsProjectDownloaded() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.checkmarkDownloadIcon);
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.checkmarkDownloadIcon);
    	Logger.logAndReportPass("Project is downloaded.");
    }

    public void verifyStartImprovementButton() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.startImprovementButton);
    	Logger.logAndReportPass("Project view - Start improvement button is displayed succesfully.");
    }

    public void verifySharePlatformTitle() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.sharePlatformTitle);
        Logger.logAndReportPass("Share Platform Page title is displayed succesfully");
    }

    public void verifyWhatsAppPlatformOption() throws Exception {
        boolean status = ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.whatsAppPlatformOption);

        if(status)
        	Logger.logAndReportPass("Whatsapp platform option is displayed succesfully");
        else
        	Logger.logAndReportWarning("Whatsapp platform option is not displayed");
    }

    public void verifyGmailPlatformOption() throws Exception {
        boolean status = ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.gmailPlatformOption);
        if(status)
        	Logger.logAndReportPass("Gmail platform option is displayed succesfully");
        else
        	Logger.logAndReportWarning("Gmail platform option is not displayed");
    }

    public void verifyProjectAssignedToMeTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectsAssignedToMeTitle);
    	Logger.logAndReportPass("project assigned to me title is displayed succesfully");
    }

    public void verifyListOfProjects() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.firstProject);
    	Logger.logAndReportPass("List of projects are displayed");
    }

    public void verifyLoadMoreProjectButton() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.loadMoreProjects);
    	Logger.logAndReportPass("Load more project button displayed succesfully.");
    }

    public void verifyProjectViewTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectViewTitle);
    	Logger.logAndReportPass("Project view Title is displayed succesfully");
    }

    public void verifyNonEditModeInProject() throws Exception {
    	Boolean eleValue = ShikshaLokamClient.get().gestures().isEnabled(projectPageObjects.selectStatus);
    	if(eleValue) {
    		Logger.logAndReportPass("select status dropdown is in enabled mode" + eleValue);
    	} else {
    		Logger.logAndReportPass("select status dropdown is in disabled mode" + eleValue);
    	}

    }

    public void verifySubmitImprovement() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.submitImprovement);
    	ShikshaLokamClient.get().gestures().isEnabled(projectPageObjects.submitImprovement);
    	Logger.logAndReportPass("Submit improvement button is displayed and Enabled.");
    }

    public void verifySubmitImprovementOnAddRemarksScreen() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.submitImprovement);
    	ShikshaLokamClient.get().gestures().isEnabled(projectPageObjects.submitImprovement);
    	Logger.logAndReportPass("Submit improvement button is displayed and Enabled On Add remarks Screen.");
    }

    public void verifyOnAddRemarksScreen() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.addRemarksScreen);
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.addRemarksScreen);
    	Logger.logAndReportPass("Landed On Add remarks Screen.");
    }

    public void verifyProjectListingPage() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.projectPageTitle);
        Logger.logAndReportPass("Landed on Project Listing Page .");
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectPageTitle);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectSearchBox);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.assignedToMeOption);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.discoverdByMeOption);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.createdByMeOption);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectsAssignedToMeTitle);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.loadMoreProjects);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.BackButton);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.firstProject);
        Logger.logAndReportPass("List of Project Displayed Successfully.");
    }

    public void verifyProjectCardContents() throws Exception {
   	 ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectNameOnProjectCard);
   	 Logger.logAndReportInfo("Project Name is displayed on Project card.");
     String FirstProjectName = ShikshaLokamClient.get().gestures().getText(projectPageObjects.projectNameOnProjectCard);
     Logger.logAndReportInfo("First Project Name : " + FirstProjectName);
     ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.programNameOnProjectCard);
     Logger.logAndReportInfo("Program Name is displayed on Project card.");
     String ProgramName = ShikshaLokamClient.get().gestures().getText(projectPageObjects.programNameOnProjectCard);
     Logger.logAndReportInfo("First Project's Program Name :" + ProgramName);

    }

    public void verifyProjectDetailsPage() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.projectDetailsTab);
        Logger.logAndReportPass("Landed on Project Details Page .");
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectNameOnDetailsPage);
     	 Logger.logAndReportInfo("Project Name is displayed on Project Details Page.");
       String FirstProjectName = ShikshaLokamClient.get().gestures().getText(projectPageObjects.projectNameOnDetailsPage);
       Logger.logAndReportInfo("Project Name : " + FirstProjectName);
       ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.programNameOnDetailsPage);
    	 Logger.logAndReportInfo("Projects Program Name is displayed on Project Details Page.");
      String prgmName = ShikshaLokamClient.get().gestures().getText(projectPageObjects.programNameOnDetailsPage);
      Logger.logAndReportInfo("Project's Program Name : " + prgmName);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectDetailsTab);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.taskDetailsTab);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.startImprovementButton);
        ShikshaLokamClient.get().gestures().isEnabled(projectPageObjects.startImprovementButton);
        Logger.logAndReportInfo("Start improvement Button is Enabled By Default On Project Details Page .");

       }

    public void verifyToastMessage() throws Exception {
     ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.toastMsg);
     String toastmsg = ShikshaLokamClient.get().gestures().getText(projectPageObjects.toastMsg);
    		Logger.logAndReportInfo("Toast Message - "+toastmsg);
    }

    public void verifyStartImprovementPopUp() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.startImprovementPopUp);
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.startImprovementPopUp);
        String popUpheader = ShikshaLokamClient.get().gestures().getText(projectPageObjects.startImprovementPopUp);
        Logger.logAndReportInfo("Pop-up Header - " + popUpheader);

        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.StartImpPopUpMainContent);
        String popUpMainContent = ShikshaLokamClient.get().gestures().getText(projectPageObjects.StartImpPopUpMainContent);
        Logger.logAndReportInfo("Pop-up main content - " + popUpMainContent);

        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.StartImpPopUpSubContent);
        String popUpSubContent = ShikshaLokamClient.get().gestures().getText(projectPageObjects.StartImpPopUpSubContent);
        Logger.logAndReportInfo("Pop-up sub content - " + popUpSubContent);

        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.startImprovementButton);
        ShikshaLokamClient.get().gestures().isEnabled(projectPageObjects.startImprovementButton);
        Logger.logAndReportInfo("Start improvement Button is Enabled By Default On Project Details Page .");
        Logger.logAndReportPass("Start improvement Pop-up Shows up .");
       }

    public void verifyCertificateLabel() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.certificateLabel);
        Logger.logAndReportPass("Certificate Label is Displayed");
    }

    public void verifyNameEditPopUp() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.nameEditPopUp);
        Logger.logAndReportPass("Name Edit Pop-up shows up");
    }

    public void verifyCertificateLogo() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.certificateLogo);
        Logger.logAndReportPass("Certificate Logo is Displayed");
    }

    public void verifyLandedOnCertificateScreen() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.certificateScreen);
        Logger.logAndReportInfo("Landed On Certificate Screen");
    }

    public void verifyCertificateIsGenerated() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.generatedCertificate);
        Logger.logAndReportInfo("Certificate is Generated Successfully.");
    }

    public void verifyAddSubtaskButtonGotEnabled() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.addSubtaskButton);
    	ShikshaLokamClient.get().gestures().isEnabled(projectPageObjects.addSubtaskButton);
    	Logger.logAndReportPass("Add subtask got Enabled");
    }
    public void verifySubtaskCreation() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.subtaskCard);
    	Logger.logAndReportPass("Subtask Created Successfully");
    }

    public void verifyDownloadIcon() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.downloadIcon);
    	Logger.logAndReportPass("Download Icon is Displayed");
    }

    public void verifyStartObservationButtonOnTaskCard() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.startObservationButtonOnTaskCard);
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.startObservationButtonOnTaskCard);

    	Logger.logAndReportPass("start Observation Button is Displayed On Task Card");
    }

    public void verifyViewReportButtonOnTaskCard() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(projectPageObjects.viewReportsButtonOnTaskCard);
    	ShikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.viewReportsButtonOnTaskCard);

    	Logger.logAndReportPass("View reports Button is Displayed On Task Card");
    }

}
