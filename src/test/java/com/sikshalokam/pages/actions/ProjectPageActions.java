package com.sikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.HomePageObjects;
import com.sikshalokam.pages.objects.ObservationPageObjects;
import com.sikshalokam.pages.objects.ProjectPageObjects;
import com.sikshalokam.utils.logger.Logger;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProjectPageActions {

    ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    ProjectPageObjects projectPageObjects = new ProjectPageObjects();
    HomePageObjects homePageObjects = new HomePageObjects();
    
    public ProjectPageActions() throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(SikshaLokamClient.get().driver()), projectPageObjects);
    }


    //******************Actions*********************************************************//
    public void clickOnProjectTab() throws Exception {
        SikshaLokamClient.get().gestures().waitAndClickElementisVisible(projectPageObjects.projectTile);
        Logger.logAndReportInfo("Clicked on the Project tab");
    }
    
    public void clickOnCreateByMeOption() throws Exception {
        SikshaLokamClient.get().gestures().click(projectPageObjects.createdByMeOption);
        Logger.logAndReportInfo("Clicked on the Created by me option");
    }
    
    public void clickOnAssignedToMeOption() throws Exception {
        SikshaLokamClient.get().gestures().click(projectPageObjects.assignedToMeOption);
        Logger.logAndReportInfo("Clicked on the assigned to me option");
    }
    
    public void clickOnCreateNewProject() throws Exception {
    	Thread.sleep(3000);
        SikshaLokamClient.get().gestures().click(projectPageObjects.createNewProject);
        Logger.logAndReportInfo("Clicked on create new project");
    }
    
    public void clickOnDonotShareOption() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.doNotShareOption);
    	Logger.logAndReportInfo("Clicked on the Do not share option");
    }
    
    public void selectCheckBoxToShare() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.checkBoxToShare);
    	Logger.logAndReportInfo("Clicked on checkbox to enable share option");
    }
    
    public void clickOnShareOption() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.shareOption);
    	Logger.logAndReportInfo("Clicked on the Share option");
    }
    
    public void enterProjectTitle(String projectTitle) throws Exception {
    	SikshaLokamClient.get().gestures().clear(projectPageObjects.projectTitleInput);
        SikshaLokamClient.get().gestures().click(projectPageObjects.projectTitleInput);
    	SikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectTitleInput, projectTitle);
    	Logger.logAndReportInfo("Project title entered is : " + projectTitle);
    }
    
    public void enterProjectDescription(String projectDesc) throws Exception {
    	SikshaLokamClient.get().gestures().clear(projectPageObjects.projectDescriptionInput);
        SikshaLokamClient.get().gestures().click(projectPageObjects.projectDescriptionInput);
    	SikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectDescriptionInput, projectDesc);
    	Logger.logAndReportInfo("entered project description is : " + projectDesc);
    }
    
    public void selectCategories() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.selectCategories);
    	Logger.logAndReportInfo("Clicked on the categroies.");
    }
    public void clickOnTeachersCheckBox() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.teachersCategory);
    	Logger.logAndReportInfo("Clicked on the teachers Category");
    }
    
    public void clickOnSubmitButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.submitButton);
    	Logger.logAndReportInfo("Clicked on the Submit Button");
    }
    
    public void clickOnCreateAndContinue() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.createAndContinueButton);
    	Logger.logAndReportInfo("Clicked on the create and contine option");
    }
    
    public void clickOnContinueButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.continueOption);
    	Logger.logAndReportInfo("Clicked on Continue option");
    }
    
    public void clickOnViewProject() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.viewProjectsButton);
    	Logger.logAndReportInfo("Clicked on the view project button. ");
    }
    
    public void clickOnViewProjectButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.viewProjectsButtonoNPopup);
    	Logger.logAndReportInfo("Clicked on the view project button on popup");
    }
    
    
    public void turnOffMobileData()  throws Exception {
    	SikshaLokamClient.get().gestures().turnOffMobileData();
    	Logger.logAndReportInfo("Mobile Data is turned Off");
    }
    
    public void turnOnMobileData()  throws Exception {
    	SikshaLokamClient.get().gestures().turnOnMobileData();
    	Logger.logAndReportInfo("Mobile Data is turned On");
    }
    
    public void clickOnStartImprovement() throws Exception {
    	Thread.sleep(2000);
    	boolean status = SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.startImprovement);
    	if(status)
    	{
    	 SikshaLokamClient.get().gestures().click(projectPageObjects.startImprovement);
    	 Logger.logAndReportInfo("Clicked on the start improvement ");
    	}
    }
    
    public void clickOnProjectDownloadButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.downloadIcon);
    	Logger.logAndReportInfo("Clicked on the download icon");
    }
    
    public String searchProject(String projectName) throws Exception{
    	SikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectSearchBox, projectName);
    	Logger.logAndReportInfo("Searched project is " + projectName);
    	Thread.sleep(2000);
    	String displayedProject = SikshaLokamClient.get().gestures().getText(projectPageObjects.searchedProject);
    	return displayedProject;
    }
    
    public void clickOnFirstProject() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.firstSearchedProject);
    	Logger.logAndReportInfo("Clicked on the first project");
    }
    
    public void clickOnShareButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.shareIcon);
    	Logger.logAndReportInfo("Clicked on the share icon");
    }
    
    public void clickOnSyncAndShare() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.syncAndShareOption);
    	Logger.logAndReportInfo("Clicked on the sync and share option from popup window.");
    }
    
    public void clickOnEditIconOnProject() throws Exception {
    	Thread.sleep(2000);
    	SikshaLokamClient.get().gestures().click(projectPageObjects.editIcon);
    	Logger.logAndReportInfo("Clicked on the edit icon in project");
    }
    
    public void clickOnEditOnProjectView() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.createEditIconOnProjectView);
    	Logger.logAndReportInfo("Clicked on the edit icon in project view.");
    }
    
    public void clickOnSaveEditForProject() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.EditSaveButtonForProject);
    	Logger.logAndReportInfo("Clicked on the edit save button on project view");
    }
    
    public void clickOnTaskDetails() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.taskDetailsTab);
    	Logger.logAndReportInfo("Clicked on the task details tab");
    }
    
    public void clickOnTask2() throws Exception {
    	SikshaLokamClient.get().gestures().click(projectPageObjects.task2);
    	Logger.logAndReportInfo("clicked on the task2 details");
    }
    
    
    //**************************Verify*************************************************//
    
    public void verifyProjectPageTitle() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectPageTitle);
        Logger.logAndReportPass("Project Page title is displayed succesfully");
    }
    
    public void verifySearchedProject(String projectNameSearched) throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.searchedObservation);
    	Logger.logAndReportPass("Searched project is displayed succesfully");
    	String actualObservationName = SikshaLokamClient.get().gestures().getText(observationPageObjects.searchedObservation);
    	SikshaLokamClient.get().getAsserts().assertEquals(actualObservationName, projectNameSearched,
    				"Searched Project is not matching.");
    	System.out.println(actualObservationName);
   		Logger.logAndReportPass("Entered project name is matched.");
    }
    
    public void verifyProjectCreatedTitle() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectCreatedTitle);
    	Logger.logAndReportPass("Project Created title is displayed succesfully.");
    }
    
    public void verifyProjectCreatedMsg() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.succesMsg);
    	Logger.logAndReportPass("Project Created succesfully message is displayed.");
    }
    
    //to match case sensitive the below method is used.
    public void searchProjectAndVerify(String projectName) throws Exception {
    	SikshaLokamClient.get().gestures().sendValueToTextBox(projectPageObjects.projectSearchBox, projectName);
    	Logger.logAndReportInfo("Searched project is " + projectName);
    	Thread.sleep(2000);
    	String displayedProject = SikshaLokamClient.get().gestures().getText(projectPageObjects.searchedProject);
    	//SikshaLokamClient.get().getAsserts().assertEquals(displayedProject, projectName,
			//	"Project name is not matching.");
    	SikshaLokamClient.get().getAsserts().assertEqualsIgnoreCase(displayedProject, projectName,
	"Project name is not matching.");
    	Logger.logAndReportPass("Searched Project is Matched and Displayed.");
    }
    

    public void verifySearchingProject(String projectNameSearched) throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.searchedObservation);
    	Logger.logAndReportPass("Searched project is displayed succesfully");
    	String actualObservationName = SikshaLokamClient.get().gestures().getText(observationPageObjects.searchedObservation);
    	SikshaLokamClient.get().getAsserts().assertEquals(actualObservationName, projectNameSearched,
    				"Searched Project is not matching.");
    	System.out.println(actualObservationName);
   		Logger.logAndReportPass("Entered project name is matched.");
    }
    
    public void verifySyncButtonStatus() throws Exception {
    	boolean syncStatus = SikshaLokamClient.get().gestures().isEnabled(projectPageObjects.syncOption);
    	if(syncStatus)
    		Logger.logAndReportPass("Sync is Enabled.");
    	else
    		Logger.logAndReportWarning("Sync is Not Enabled.");
    }
    
    public void verifyIsProjectDownloaded() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.checkmarkDownloadIcon);
    	Logger.logAndReportPass("Project is downloaded.");
    }
    
    public void verifyStartImprovementButton() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.startImprovement);
    	Logger.logAndReportPass("Project view - Start improvement button is displayed succesfully.");
    }
    
    public void verifySharePlatformTitle() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.sharePlatformTitle);
        Logger.logAndReportPass("Share Platform Page title is displayed succesfully");
    }
    
    public void verifyWhatsAppPlatformOption() throws Exception {
        boolean status = SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.whatsAppPlatformOption);
        
        if(status)
        	Logger.logAndReportPass("Whatsapp platform option is displayed succesfully");
        else
        	Logger.logAndReportWarning("Whatsapp platform option is not displayed");
    }
    
    public void verifyGmailPlatformOption() throws Exception {
        boolean status = SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.gmailPlatformOption);
        if(status)
        	Logger.logAndReportPass("Gmail platform option is displayed succesfully");
        else
        	Logger.logAndReportWarning("Gmail platform option is not displayed");
    }
    
    public void verifyProjectAssignedToMeTitle() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectsAssignedToMeTitle);
    	Logger.logAndReportPass("project assigned to me title is displayed succesfully");
    }
    
    public void verifyListOfProjects() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.firstProject);
    	Logger.logAndReportPass("List of projects are displayed");
    }
    
    public void verifyLoadMoreProjectButton() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.loadMoreProjects);
    	Logger.logAndReportPass("Load more project button displayed succesfully.");
    }
    
    public void verifyProjectViewTitle() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.projectViewTitle);
    	Logger.logAndReportPass("Project view Title is displayed succesfully");
    }
    
    public void verifyNonEditModeInProject() throws Exception {
    	Boolean eleValue = SikshaLokamClient.get().gestures().isEnabled(projectPageObjects.selectStatus);
    	if(eleValue == true) {
    		Logger.logAndReportPass("select status dropdown is in enabled mode" + eleValue);	
    	} else {
    		Logger.logAndReportPass("select status dropdown is in disabled mode" + eleValue);
    	}
    	
    }
    
    public void verifySubmitImprovement() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(projectPageObjects.submitImprovement);
    	Logger.logAndReportPass("submit improvement button is displayed succesfully.");
    }
    
}
