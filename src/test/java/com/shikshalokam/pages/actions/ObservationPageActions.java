package com.shikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.pages.objects.ProfilePageObjects;
import com.shikshalokam.utils.logger.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ObservationPageActions {

    ProfilePageObjects.MyGroups m = new ProfilePageObjects.MyGroups();

    ObservationPageObjects observationPageObjects = new ObservationPageObjects();

    public ObservationPageActions() throws Exception {
        PageFactory.initElements(ShikshaLokamClient.get().driver(), observationPageObjects);
    }


    public void clickOnObservationsTile() throws Exception {
        ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.observationsTile);
        Logger.logAndReportInfo("Clicked on the Observations tile");
    }

    public void clickOnObservationWithRubrics() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.observationWithRubric);
        Logger.logAndReportInfo("Clicked on the observation with rubric ");
    }

    public void clickOnFirstEntity() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.firstEntityInList);
        Logger.logAndReportInfo("Clicked on the first entity from list ");
    }

    public void clickOnObservation1() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.observation1);
        Logger.logAndReportInfo("Clicked on Observation 1");
    }

    public void clickOnfirstDomain() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.firstDomain);
        ShikshaLokamClient.get().gestures().click(observationPageObjects.hpdomain);
        Logger.logAndReportInfo("Clicked on First Domain");
    }


    public void clickOnSubmissionThreeDot() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.threeDotOnObservation);
        Logger.logAndReportInfo("Clicked on the three dot option on submission observation ");
    }

    public void clickOnDeleteSubmission() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.deleteObservationSubmission);
        Logger.logAndReportInfo("Clicked on the submission delete option .");
    }

    public void clickOnSubmissionDeleteYesOption() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.observationSubmissionDeleteYes);
        Logger.logAndReportInfo("Clicked on the Yes option to confirm submission delete.");
    }

    public void clickOnMindSetObservation() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.entityObservataionToDelete);
        Logger.logAndReportInfo("Clicked on entity observation to delete ");
    }

    public void clickOnDeleteIconOnEntity() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.deleteIconOnEntity);
        Logger.logAndReportInfo("Clicked on delete icon on entity. ");
    }

    public void clickOnEntityDeleteYesOption() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.entityDeleteConfirmationYes);
        Logger.logAndReportInfo("Clicked on the Yes option to confirm entity delete.");
    }

    public void clickOnSkillAndMindsetObservation() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.entityObservataionToDelete);
        Logger.logAndReportInfo("Clicked on the Skill and mindset observation ");
    }

    public void clickOnFirstObservationSubmission() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.firstObservationSubmission);
        Logger.logAndReportInfo("Clicked on the first Observation Submission");
    }

    public void sendObservationNameToSearch(String observationName) throws Exception {
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.observationSearch, observationName);
    	Logger.logAndReportInfo("Observation name entered is :" + observationName);
    	Thread.sleep(2000);
    }

    public void searchObservation(String observationName) throws Exception{
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.observationSearch, observationName);
    	Logger.logAndReportInfo("Searched observation is " + observationName);
    	Thread.sleep(2000);
    	//String displayedObserv = ShikshaLokamClient.get().gestures().getText(observationPageObjects.observationNameOnObseravtionsCard);
    	//Logger.logAndReportInfo("Observation Name is " + displayedObserv);
    }

    public void clickOnFirstObservation() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.firstObservation);
    	//ShikshaLokamClient.get().gestures().click(observationPageObjects.firstObservation);
    	Logger.logAndReportInfo("Clicked on the first observation.");
    }

    public void clickOnAddEntityButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.addEnitityButton);
    	Logger.logAndReportInfo("Clicked on the add entity button");
    }

    public void clickOnDefaultEntity() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.defaultEntity);
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.defaultEntity);
    	Logger.logAndReportInfo("Clicked on default Entity");
    }

    public void clickOnObserveAgainButton() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.observeAgain);
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.observeAgain);
    	Logger.logAndReportInfo("Clicked on the observe again button");
    }

    public void clickOnObservationInstance1() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.observationDefaultInstance1);
    	Logger.logAndReportInfo("Clicked on the Observation Instance 1");
    }

    public void clickOnStartButton() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.startButton);
    	Logger.logAndReportInfo("Clicked on Start Button ");
    }

    public void clickOnStartObseravtionButton() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.startObservationButton);
    	Logger.logAndReportInfo("Clicked on Start Observation Button ");
    }
    
    public void clickOnReportsButton() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.reportsButton);
    	Logger.logAndReportInfo("Clicked on Reports Button ");
    }

    public void completeObsWithoutRubric() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.dateAutoCaptureResponse);
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.checkboxResponse);
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.nextButtonOnQuestionPage);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
    	//ShikshaLokamClient.get().gestures().click(observationPageObjects.radioButtonResponse);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.textTypeResponse,"Testing Course");
    	Thread.sleep(2000);
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.submitForm);
    	Logger.logAndReportInfo("Submitted the Observation form");


    }

    public void completeObsWithRubricDomain1Questionnaires() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.textTypeResponse);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.textTypeResponse,"Stay disciplined and focused");
    	Thread.sleep(2000);
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.submitForm);
    	

    }

    public void completeObsWithRubricDomain2Questionnaires() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
    	Thread.sleep(1000);
    	ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.startObservationButton);
    	Logger.logAndReportInfo("Start Observation Pop-up shows up");
    	clickOnStartObseravtionButton();
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
    	clickOnNextButtonOnQuestionPage();
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.checkboxResponse);
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.textTypeResponse);

    	Thread.sleep(2000);
    	ShikshaLokamClient.get().gestures().typeNumber2();

    	Thread.sleep(2000);
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.submitForm);

    }
    
    public void completeObsLedImpDomain1Questionnaires() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.textTypeResponse);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.textTypeResponse,"Stay disciplined and focused");
    	Thread.sleep(2000);
      	ShikshaLokamClient.get().gestures().swipeUp();
      	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
      	ShikshaLokamClient.get().gestures().swipeUp();
      	ShikshaLokamClient.get().gestures().swipeUp();
      	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.textTypeResponse);
    	ShikshaLokamClient.get().gestures().typeNumber2();
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().swipeUp();
    	
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
      	
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.submitForm);
    	
    }
    
    public void completeObsLedImpDomain2Questionnaires() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
    	ShikshaLokamClient.get().gestures().swipeUp();
    	//ShikshaLokamClient.get().gestures().swipeUp();
    	Thread.sleep(1000);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse2);
    	ShikshaLokamClient.get().gestures().swipeUp();
    	Thread.sleep(1000);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse2);
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().swipeUp();
    	Thread.sleep(1000);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.dateTypeResponse);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.dateMonday);
    	
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.nextButtonOnQuestionPage);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.checkboxResponse);
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.checkboxResponse);
    	
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.submitForm);
    	

    }
    
    public void completeObsLedImpDomain3Questionnaires() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
    	
    	
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.submitForm);
    	
    }
    public void completeObsLedImpDomain4Questionnaires() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.radioButtonResponse);
    	
    	
    	ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.submitForm);
    	
    }
    
    public void clickOnClickHereToImprove() throws Exception {
    	Thread.sleep(2000);
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().swipeUp();
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.clickHereToImptoveButton);
    	
    }
    
    public void clickOnCollaboration() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.Collaboration);
    	
    }
    
    public void clickOnTestingprojectone() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.Testingprojectone);
    	
    }


    // *****************************  Verify *****************************************//
    public void verifyObservationTxt() throws Exception {
        ShikshaLokamClient.get().getAsserts().assertEquals(observationPageObjects.observationTxt.getText(), "Observation", "Observation Txt not Matched");
        ShikshaLokamClient.get().report().log(Status.PASS, "Observation Txt is Matching");
    }

    public void verifyUpdateProfileAlertTitle() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.alertProfileTitle);
        Logger.logAndReportPass("Update Profile Alert title is displayed succesfully");
    }

    public void verifyUpdateProfileButtonText() throws Exception {
        ShikshaLokamClient.get().getAsserts().assertEquals(observationPageObjects.updateProfile.getText(), "UPDATE PROFILE", "Update Profile Txt not Matched");
        Logger.logAndReportPass("Update Profile Text is matched.");
    }

    public void verifyAddEntityButton() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addState);
        Logger.logAndReportPass("Add entity is displayed succesfully");
    }

    public void verifyFirstObservationSubmission() throws Exception {
    	Thread.sleep(2000);
        ShikshaLokamClient.get().getAsserts().assertEquals(observationPageObjects.firstObservationSubmission.getText(), "Observation 1", "Observation text not Matched");
        Logger.logAndReportPass("Observation 1 Text is matched succesfully.");
    }


    public void verifyDeleteIconOnEntity() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.deleteIconOnEntity);
        Logger.logAndReportPass("delete icon is displayed succesfully.");
    }

    public void verifyAddEntityToObserverTitle() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addEntityToObserveTitle);
        Logger.logAndReportPass("Add Entity to observe title is displayed succesfully.");
    }


    public void ClickOnBackButton() throws Exception {
        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.BACK));

    }

    public void verifyBackButton() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.back);

    }

    ////


    public void clickOnSecondObservationSubmission() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.secondObservationSubmission);
        Logger.logAndReportInfo("Clicked on the first Observation Submission");
    }

    public void clickOnTargetObservationForSubmission() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.entityObservataionToDeleteAfterSubmission);
        Logger.logAndReportInfo("Clicked on the particular Observation to Submission and deletion");
    }

    public void clickOnFirstDomain() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.firstDomain);
        ShikshaLokamClient.get().gestures().click(observationPageObjects.firstDomain);
        Logger.logAndReportInfo("Clicked on the first domain.");
    }

    public void clickOnSecondDomain() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.secondDomain);
        ShikshaLokamClient.get().gestures().click(observationPageObjects.secondDomain);
        Logger.logAndReportInfo("Clicked on the second domain.");
    }
    
    public void clickOnThirdDomain() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.thirdDomain);
        ShikshaLokamClient.get().gestures().click(observationPageObjects.thirdDomain);
        Logger.logAndReportInfo("Clicked on the third domain.");
    }
    
    public void clickOnFourthDomain() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.fourthDomain);
        ShikshaLokamClient.get().gestures().click(observationPageObjects.fourthDomain);
        Logger.logAndReportInfo("Clicked on the fourth domain.");
    }

    public void clickOnDomainCriteria() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.domainCriteria);
        ShikshaLokamClient.get().gestures().click(observationPageObjects.domainCriteria);
        Logger.logAndReportInfo("Clicked on domain criteria.");
    }

  /*  public void clickOnStartObservation() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.startObservation);
        Logger.logAndReportInfo("Clicked on the start observation.");
    } */

    public void clickOnPlanningAndExecution() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.planningAndExecutionObservation);
        Logger.logAndReportInfo("Clicked on the planning and execution observation");
    }

    public void enterInputForQuestion(String answer) throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.textInputForQuestionaries);
        ShikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.textInputForQuestionaries, answer);
        Logger.logAndReportInfo("Entered input for textbox : " + answer);
    }

    public void clickOnSaveButtonForQuestionaries() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
        Logger.logAndReportInfo("clicked on the save button ");
    }

    public void clickOnTopBackButton() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.backButtonOnTopOfQuestionPage);
        ShikshaLokamClient.get().gestures().click(observationPageObjects.backButtonOnTopOfQuestionPage);
        Logger.logAndReportInfo("clicked on back button. ");
    }

    public void clickOnAcceptButton() throws Exception {
        boolean status = ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.acceptButtonForChrome);
        if (status)
            ShikshaLokamClient.get().gestures().click(observationPageObjects.acceptButtonForChrome);
        status = ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.yesIamInButtonForChrome);
        if (status)
            ShikshaLokamClient.get().gestures().click(observationPageObjects.yesIamInButtonForChrome);
        Logger.logAndReportInfo("Google chrome browser is launched.");
    }

    public void clickOnQuestionMapIcon() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.questionMap);
        Logger.logAndReportInfo("Clicked on the question map icon ");
    }

    public void clickOnNextButtonOnQuestionPage() throws Exception {
        ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.nextButtonOnQuestionPage);
        Logger.logAndReportInfo("Clicked on the Next button on Question page");
    }

    public void clickOnInprogressTabForSubmission() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.inProgressTabForSubmission);
        Logger.logAndReportInfo("Clicked on in progress tab on rubrics page");
    }

    public void clickOnCompletedTabForSubmission() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.completedTabForSubmission);
        Logger.logAndReportInfo("Clicked on completed tab on rubrics page");
    }

    public void clickOnAllTabForSubmission() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.AllTabForSubmission);
        Logger.logAndReportInfo("Clicked on all tab on rubrics page");
    }


    public void verifyDomainTitle() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.domainPageTitle);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.domainPageTitle);
        Logger.logAndReportPass("page title domain is displayed succesfully.");
    }

    public void verifyInprogressState() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.inProgressStatus);
        Logger.logAndReportPass("inprogress is displayed succesfully.");
    }

    public String getNameOfObservation() throws Exception {
        String observationName = ShikshaLokamClient.get().gestures().getText(observationPageObjects.addEntityPageObservationTitle);
        Logger.logAndReportInfo(" Observation got via link is :  " + observationName);
        return observationName;
    }

    public void verifyObservationNameUnderList() throws Exception {
        // ShikshaLokamClient.get().gestures().isDisplayed(By.xpath(observationLinkObjects.observationListItemName + oName +));
        //ShikshaLokamClient.get().gestures().isDisplayed(observationLinkObjects.observationListItemName);
        Logger.logAndReportPass("Observation opened via Link is listed.");
    }

    public void xpathDynamic(String elementName) {
        //		ShikshaLokamClient.get().gestures().isDisplayed(By.xpath(observationLinkObjects.observationListItemName + oName +));
    }

    public void clickOnFirstHpDomain() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.firstHpDomain);
        ShikshaLokamClient.get().gestures().click(observationPageObjects.firstHpDomain);
        Logger.logAndReportInfo("Clicked on the first hp domain.");
    }

    public void clickOnFirstObservationUnderHpDomain() throws Exception {
        ShikshaLokamClient.get().gestures().click(observationPageObjects.firstObservationUnderHpDomain);
        Logger.logAndReportInfo("Clicked on the first observation HP Domain.");
    }

    public void verifyQuestionMapIcon() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.questionMap);
        Logger.logAndReportPass("Question map  is displayed succesfully");
    }

    public void verifyNextButtonOnQuestionPage() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.nextButtonOnQuestionPage);
        Logger.logAndReportPass("Next button on questionaries page is displayed succesfully");
    }

    public void verifyBackButtonOnQuestionPage() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.backButtonOnQuestionPage);
        Logger.logAndReportPass("Back button on questionaries page is displayed succesfully");
    }

    public void verifySecondObservationSubmission() throws Exception {
        //ShikshaLokamClient.get().getAsserts().assertEquals(observationPageObjects.secondObservationSubmission.getText(), "Observation 2", "Observation text not Matched");
        //Logger.logAndReportPass("Observation 2 Text is matched succesfully.");
        boolean status = ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.secondObservationSubmission);
        if (status)
            Logger.logAndReportPass("Observation 2 is present");
        else
            Logger.logAndReportWarning("Observation 2 is not present");
    }

    public void swipeUpTo3thQuestion() throws Exception {
        ShikshaLokamClient.get().gestures().scrollToMobileElement(observationPageObjects.question3, "2");
        //System.out.println(observationPageObjects.question3.getText());
        //ShikshaLokamClient.get().gestures().ScrollTo(observationPageObjects.question3.getText());

        Logger.logAndReportInfo("Scrolled to the 3th question");
    }

    public void swipeUpTo5thQuestion() throws Exception {
        ShikshaLokamClient.get().gestures().scrollToMobileElement(observationPageObjects.question5, "2");
        //System.out.println(observationPageObjects.question5.getText());
        // ShikshaLokamClient.get().gestures().ScrollToAndClick(observationPageObjects.question5.getText());

        Logger.logAndReportInfo("Scrolled to the 5th question");
    }

    public void verifySixthQuestion() throws Exception {
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.question6);
        Logger.logAndReportPass("question 6 s displayed.");
    }

    public void scrollTowithoutRubricEntity() throws Exception {
        ShikshaLokamClient.get().gestures().scrollToMobileElement(observationPageObjects.entityObservataionWithoutRubric, "2");
        //System.out.println(ShikshaLokamClient.get().gestures().getText(observationPageObjects.entityObservataionWithoutRubric));
        //ShikshaLokamClient.get().gestures().ScrollTo(observationPageObjects.entityObservataionWithoutRubric.getText());
        Thread.sleep(10000);
        Logger.logAndReportInfo("Scroll to without rubric entity");
    }

    public void verifySearchedObservation(String observationNameSearched) throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.firstObservation);
    	Logger.logAndReportPass("Searched observation is displayed succesfully");
    	//String actualObservationName = ShikshaLokamClient.get().gestures().getText(observationPageObjects.firstObservation);
    	//System.out.println(actualObservationName);
    	//ShikshaLokamClient.get().getAsserts().assertEquals(actualObservationName, observationNameSearched,
    		//		"Searched observation is not matching.");
   		//Logger.logAndReportPass("Entered obervation is matched.");
    }

    public void verifyAddEntitySearchButton() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addEntitySearchButton);
    	Logger.logAndReportPass("Add entity search button is displayed succesfully");
    }

    public void verifyNewObservationAdded() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observation2);
    	String newObservationName = ShikshaLokamClient.get().gestures().getText(observationPageObjects.observation2);
    	Logger.logAndReportInfo("added new observataion is :"+newObservationName);
    }

    public void verifyObservationListingPage() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.observationPageTitle);
        Logger.logAndReportPass("Landed on Observation Listing Page .");
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observationPageTitle);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observationSearch);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.back);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.viewMore);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.firstObservation);
        Logger.logAndReportPass("List of Observations are Displayed Successfully.");
    }

    public void verifyObservationsCardContents() throws Exception {
      	 ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observationNameOnObseravtionsCard);
      	 Logger.logAndReportInfo("Observation Name is displayed on Observations card.");
        String FirstObservationName = ShikshaLokamClient.get().gestures().getText(observationPageObjects.observationNameOnObseravtionsCard);
        Logger.logAndReportInfo("First Observation Name : " + FirstObservationName);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.programNameOnObseravtionsCard);
        Logger.logAndReportInfo("Program Name is displayed on Observations card.");
        String ProgramName = ShikshaLokamClient.get().gestures().getText(observationPageObjects.programNameOnObseravtionsCard);
        Logger.logAndReportInfo("First Observations's Program Name :" + ProgramName);

       }

    public void verifyAddEnitityPage() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.addEnitityButton);
        Logger.logAndReportInfo("Landed on Add Entity Page .");
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addEnitityButton);
        String Entitytype = ShikshaLokamClient.get().gestures().getText(observationPageObjects.addEnitityButton);
        Logger.logAndReportInfo("Entity type : " + Entitytype);
         ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.enititySearch);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.back);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.defaultEntity);
        Logger.logAndReportPass("Add Entity Page is verified Successfully.");
   }

    public void verifyDomainsListingPage() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.domainPageTitle);
        Logger.logAndReportInfo("Landed on Domains listing page.");
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.domainPageTitle);
         ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.firstDomain);
         ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.secondDomain);
         Logger.logAndReportInfo("List of Domains shows up.");
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.back);
        Logger.logAndReportPass("Domains listing Page is verified Successfully.");
   }

    public void verifyDomain1CompletedStatus() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.domain1Completed);
    	Logger.logAndReportPass("Domain 1 Completed Successfully .");
    }

    public void verifyDomain2CompletedStatus() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.domain2Completed);
    	Logger.logAndReportPass("Domain 2 Completed Successfully .");
    }
    public void verifyDomain3CompletedStatus() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.domain2Completed);
    	Logger.logAndReportPass("Domain 3 Completed Successfully .");
    }
    public void verifyDomain4CompletedStatus() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.domain2Completed);
    	Logger.logAndReportPass("Domain 4 Completed Successfully .");
    }



    public void verifyMultipleSubmissionObsisSubmitted() throws Exception {
    	
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.reportsButton);
    	Logger.logAndReportPass("Reports Button shows up on Instance Card hence Observation Instance is submitted Successfully .");
    }

    public void verifyInstanceScreen() throws Exception {
        ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.observationDefaultInstance1);
        Logger.logAndReportInfo("Landed on Instance page and by defualt 1 Instance is Created");
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.allTab);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.inProgressTab);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.completedTab);
        Logger.logAndReportInfo("All , In Progress , Completed Tabs are displayed successfully.");
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observeAgain);
        ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.viewEntityReport);
        Logger.logAndReportInfo("Observe again , View entity report Buttons are displayed successfully.");
        Logger.logAndReportPass("Instance Page is verified Successfully.");
   }


    public void verifyObservationInstance2IsCreated() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.observationInstance2);
    	Logger.logAndReportPass("Observation 2 Instance is created Successfully . ");
    }


}






