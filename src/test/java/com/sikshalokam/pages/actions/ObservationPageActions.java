package com.sikshalokam.pages.actions;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.ObservationPageObjects;
import com.sikshalokam.pages.objects.ProfilePageObjects;
import com.sikshalokam.utils.logger.Logger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.interactions.internal.SingleKeyAction;
import org.openqa.selenium.support.PageFactory;

public class ObservationPageActions {

    ProfilePageObjects.MyGroups m = new ProfilePageObjects.MyGroups();

    ObservationPageObjects observationPageObjects = new ObservationPageObjects();

    public ObservationPageActions() throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(SikshaLokamClient.get().driver()), observationPageObjects);
    }


    public void clickOnObservationTab() throws Exception {

        SikshaLokamClient.get().gestures().waitAndClickElementisVisible(observationPageObjects.observation);
        //SikshaLokamClient.get().gestures().click(observationPageObjects.observation);
        Logger.logAndReportInfo("Clicked on the observation tab");
    }

    public void clickOnObservationWithRubrics() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.observationWithRubric);
        Logger.logAndReportInfo("Clicked on the observation with rubric ");
    }

    public void clickOnFirstEntity() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.firstEntityInList);
        Logger.logAndReportInfo("Clicked on the first entity from list ");
    }

    public void clickOnObservation1() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.observation1);
        Logger.logAndReportInfo("Clicked on Observation 1");
    }

    public void clickOnfirstDomain() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.firstDomain);
        SikshaLokamClient.get().gestures().click(observationPageObjects.hpdomain);
        Logger.logAndReportInfo("Clicked on First Domain");
    }


    public void clickOnSubmissionThreeDot() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.threeDotOnObservation);
        Logger.logAndReportInfo("Clicked on the three dot option on submission observation ");
    }

    public void clickOnDeleteSubmission() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.deleteObservationSubmission);
        Logger.logAndReportInfo("Clicked on the submission delete option .");
    }

    public void clickOnSubmissionDeleteYesOption() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.observationSubmissionDeleteYes);
        Logger.logAndReportInfo("Clicked on the Yes option to confirm submission delete.");
    }

    public void clickOnMindSetObservation() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.entityObservataionToDelete);
        Logger.logAndReportInfo("Clicked on entity observation to delete ");
    }

    public void clickOnDeleteIconOnEntity() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.deleteIconOnEntity);
        Logger.logAndReportInfo("Clicked on delete icon on entity. ");
    }

    public void clickOnEntityDeleteYesOption() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.entityDeleteConfirmationYes);
        Logger.logAndReportInfo("Clicked on the Yes option to confirm entity delete.");
    }

    public void clickOnSkillAndMindsetObservation() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.entityObservataionToDelete);
        Logger.logAndReportInfo("Clicked on the Skill and mindset observation ");
    }

    public void clickOnFirstObservationSubmission() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.firstObservationSubmission);
        Logger.logAndReportInfo("Clicked on the first Observation Submission");
    }

    public void sendObservationNameToSearch(String observationName) throws Exception {
    	SikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.search, observationName);
    	Logger.logAndReportInfo("Observation name entered is :" + observationName);
    	Thread.sleep(2000);
    }
    
    public String searchObservation(String observationName) throws Exception{
    	SikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.search, observationName);
    	Logger.logAndReportInfo("Searched observation is " + observationName);
    	Thread.sleep(2000);
    	String displayedObserv = SikshaLokamClient.get().gestures().getText(observationPageObjects.firstObservation);
    	return displayedObserv;
    }
    
    public void clickOnFirstObservation() throws Exception {
    	SikshaLokamClient.get().gestures().click(observationPageObjects.firstObservation);
    	Logger.logAndReportInfo("Clicked on the first observation.");
    }
    
    public void clickOnAddEntityButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(observationPageObjects.addState);
    	Logger.logAndReportInfo("Clicke on the add entity button");
    }
    
    public void clickOnObserveAgainButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(observationPageObjects.observeAgain);
    	Logger.logAndReportInfo("Clicked on the observe again button");
    }
    
    
    // *****************************  Verify *****************************************//
    public void verifyObservationTxt() throws Exception {
        SikshaLokamClient.get().getAsserts().assertEquals(observationPageObjects.observationTxt.getText(), "Observation", "Observation Txt not Matched");
        SikshaLokamClient.get().report().log(Status.PASS, "Observation Txt is Matching");
    }

    public void verifyUpdateProfileAlertTitle() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.alertProfileTitle);
        Logger.logAndReportPass("Update Profile Alert title is displayed succesfully");
    }

    public void verifyUpdateProfileButtonText() throws Exception {
        SikshaLokamClient.get().getAsserts().assertEquals(observationPageObjects.updateProfile.getText(), "UPDATE PROFILE", "Update Profile Txt not Matched");
        Logger.logAndReportPass("Update Profile Text is matched.");
    }

    public void verifyAddEntityButton() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addState);
        Logger.logAndReportPass("Add entity is displayed succesfully");
    }

    public void verifyFirstObservationSubmission() throws Exception {
        SikshaLokamClient.get().getAsserts().assertEquals(observationPageObjects.firstObservationSubmission.getText(), "Observation 1", "Observation text not Matched");
        Logger.logAndReportPass("Observation 1 Text is matched succesfully.");
    }


    public void verifyDeleteIconOnEntity() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.deleteIconOnEntity);
        Logger.logAndReportPass("delete icon is displayed succesfully.");
    }

    public void verifyAddEntityToObserverTitle() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addEntityToObserveTitle);
        Logger.logAndReportPass("Add Entity to observe title is displayed succesfully.");
    }


    public void ClickOnBackButton() throws Exception {
        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.BACK));

    }

    public void verifyBackButton() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.back);

    }

    ////


    public void clickOnSecondObservationSubmission() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.secondObservationSubmission);
        Logger.logAndReportInfo("Clicked on the first Observation Submission");
    }

    public void clickOnTargetObservationForSubmission() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.entityObservataionToDeleteAfterSubmission);
        Logger.logAndReportInfo("Clicked on the particular Observation to Submission and deletion");
    }

    public void clickOnFirstDomain() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.firstDomain);
        Logger.logAndReportInfo("Clicked on the first domain.");
    }

    public void clickOnStartObservation() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.startObservation);
        Logger.logAndReportInfo("Clicked on the start observation.");
    }

    public void clickOnPlanningAndExecution() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.planningAndExecutionObservation);
        Logger.logAndReportInfo("Clicked on the planning and execution observation");
    }

    public void enterInputForQuestion(String answer) throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.textInputForQuestionaries);
        SikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.textInputForQuestionaries, answer);
        Logger.logAndReportInfo("Entered input for textbox : " + answer);
    }

    public void clickOnSaveButtonForQuestionaries() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForQuestionaries);
        Logger.logAndReportInfo("clicked on the save button ");
    }

    public void clickOnTopBackButton() throws Exception {
        SikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.backButtonOnTopOfQuestionPage);
        SikshaLokamClient.get().gestures().click(observationPageObjects.backButtonOnTopOfQuestionPage);
        Logger.logAndReportInfo("clicked on back button. ");
    }

    public void clickOnAcceptButton() throws Exception {
        boolean status = SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.acceptButtonForChrome);
        if (status)
            SikshaLokamClient.get().gestures().click(observationPageObjects.acceptButtonForChrome);
        status = SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.yesIamInButtonForChrome);
        if (status)
            SikshaLokamClient.get().gestures().click(observationPageObjects.yesIamInButtonForChrome);
        Logger.logAndReportInfo("Google chrome browser is launched.");
    }

    public void clickOnQuestionMapIcon() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.questionMap);
        Logger.logAndReportInfo("Clicked on the question map icon ");
    }

    public void clickOnNextButtonOnQuestionPage() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.nextButtonOnQuestionPage);
        Logger.logAndReportInfo("Clicked on the Next button on Question page");
    }

    public void clickOnInprogressTabForSubmission() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.inProgressTabForSubmission);
        Logger.logAndReportInfo("Clicked on in progress tab on rubrics page");
    }

    public void clickOnCompletedTabForSubmission() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.completedTabForSubmission);
        Logger.logAndReportInfo("Clicked on completed tab on rubrics page");
    }

    public void clickOnAllTabForSubmission() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.AllTabForSubmission);
        Logger.logAndReportInfo("Clicked on all tab on rubrics page");
    }


    public void verifyDomainTitle() throws Exception {
        SikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.domainPageTitle);
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.domainPageTitle);
        Logger.logAndReportPass("page title domain is displayed succesfully.");
    }

    public void verifyInprogressState() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.inProgressStatus);
        Logger.logAndReportPass("inprogress is displayed succesfully.");
    }

    public String getNameOfObservation() throws Exception {
        String observationName = SikshaLokamClient.get().gestures().getText(observationPageObjects.addEntityPageObservationTitle);
        Logger.logAndReportInfo(" Observation got via link is :  " + observationName);
        return observationName;
    }

    public void verifyObservationNameUnderList() throws Exception {
        // SikshaLokamClient.get().gestures().isDisplayed(By.xpath(observationLinkObjects.observationListItemName + oName +));
        //SikshaLokamClient.get().gestures().isDisplayed(observationLinkObjects.observationListItemName);
        Logger.logAndReportPass("Observation opened via Link is listed.");
    }

    public void xpathDynamic(String elementName) {
        //		SikshaLokamClient.get().gestures().isDisplayed(By.xpath(observationLinkObjects.observationListItemName + oName +));
    }

    public void clickOnFirstHpDomain() throws Exception {
        SikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.firstHpDomain);
        SikshaLokamClient.get().gestures().click(observationPageObjects.firstHpDomain);
        Logger.logAndReportInfo("Clicked on the first hp domain.");
    }

    public void clickOnFirstObservationUnderHpDomain() throws Exception {
        SikshaLokamClient.get().gestures().click(observationPageObjects.firstObservationUnderHpDomain);
        Logger.logAndReportInfo("Clicked on the first observation HP Domain.");
    }

    public void verifyQuestionMapIcon() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.questionMap);
        Logger.logAndReportPass("Question map  is displayed succesfully");
    }

    public void verifyNextButtonOnQuestionPage() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.nextButtonOnQuestionPage);
        Logger.logAndReportPass("Next button on questionaries page is displayed succesfully");
    }

    public void verifyBackButtonOnQuestionPage() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.backButtonOnQuestionPage);
        Logger.logAndReportPass("Back button on questionaries page is displayed succesfully");
    }

    public void verifySecondObservationSubmission() throws Exception {
        //SikshaLokamClient.get().getAsserts().assertEquals(observationPageObjects.secondObservationSubmission.getText(), "Observation 2", "Observation text not Matched");
        //Logger.logAndReportPass("Observation 2 Text is matched succesfully.");
        boolean status = SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.secondObservationSubmission);
        if (status)
            Logger.logAndReportPass("Observation 2 is present");
        else
            Logger.logAndReportWarning("Observation 2 is not present");
    }

    public void swipeUpTo3thQuestion() throws Exception {
        SikshaLokamClient.get().gestures().scrollToMobileElement(observationPageObjects.question3, "2");
        //System.out.println(observationPageObjects.question3.getText());
        //SikshaLokamClient.get().gestures().ScrollTo(observationPageObjects.question3.getText());

        Logger.logAndReportInfo("Scrolled to the 3th question");
    }

    public void swipeUpTo5thQuestion() throws Exception {
        SikshaLokamClient.get().gestures().scrollToMobileElement(observationPageObjects.question5, "2");
        //System.out.println(observationPageObjects.question5.getText());
        // SikshaLokamClient.get().gestures().ScrollToAndClick(observationPageObjects.question5.getText());

        Logger.logAndReportInfo("Scrolled to the 5th question");
    }

    public void verifySixthQuestion() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.question6);
        Logger.logAndReportPass("question 6 s displayed.");
    }

    public void scrollTowithoutRubricEntity() throws Exception {
        SikshaLokamClient.get().gestures().scrollToMobileElement(observationPageObjects.entityObservataionWithoutRubric, "2");
        //System.out.println(SikshaLokamClient.get().gestures().getText(observationPageObjects.entityObservataionWithoutRubric));
        //SikshaLokamClient.get().gestures().ScrollTo(observationPageObjects.entityObservataionWithoutRubric.getText());
        Thread.sleep(10000);
        Logger.logAndReportInfo("Scroll to without rubric entity");
    }
    
    public void verifySearchedObservation(String observationNameSearched) throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.searchedObservation);
    	Logger.logAndReportPass("Searched observation is displayed succesfully");
    	String actualObservationName = SikshaLokamClient.get().gestures().getText(observationPageObjects.searchedObservation);
    	SikshaLokamClient.get().getAsserts().assertEquals(actualObservationName, observationNameSearched,
    				"Searched observation is not matching.");
    	System.out.println(actualObservationName);
   		Logger.logAndReportPass("Entered obervation is matched.");
    }
    
    public void verifyAddEntitySearchButton() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.addEntitySearchButton);
    	Logger.logAndReportPass("Add entity search button is displayed succesfully");
    }
    
    public void verifyNewObservationAdded() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observation2);
    	String newObservationName = SikshaLokamClient.get().gestures().getText(observationPageObjects.observation2);
    	Logger.logAndReportInfo("added new observataion is :"+newObservationName);
    }
}






