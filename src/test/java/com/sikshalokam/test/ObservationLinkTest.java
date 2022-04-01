package com.sikshalokam.test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.actions.ChromeActions;
import com.sikshalokam.pages.actions.ObservationPageActions;
import com.sikshalokam.utils.gSheet.TestData;
import org.testng.annotations.Test;

import java.util.Map;

public class ObservationLinkTest {

    Map<String, String> loginPageTestData;
    Map<String, String> observationPageTestData;
    Map<String, String> observationLinkTestData;

    public ChromeActions getChromeActions() throws Exception {
        return new ChromeActions();
    }

    public ObservationPageActions getObservationPageActions() throws Exception {
        return new ObservationPageActions();
    }


    @Test(description = "Verify Observation link from chrome ")
    @Author(name = "Sunil H N")
    public void verifyObservationTab() throws Exception {
        observationLinkTestData = TestData.getFullGoogleSheetDataAsMapString("ObservationLink!A:B");
        getChromeActions().enterUrl(observationLinkTestData.get("url"));
        getChromeActions().clickOnStartObservation();
        getObservationPageActions().clickOnFirstEntity();
        getObservationPageActions().clickOnObservation1();
        getObservationPageActions().clickOnfirstDomain();
        getChromeActions().clickOnStartObservation();
        SikshaLokamClient.get().gestures().swipeDown();
    }



    @Test(description = "Verify Observation Redirection flow ")
    @Author(name = "Sunil H N")
    public void VerifyObservationRedirection() throws Exception {
        observationLinkTestData = TestData.getFullGoogleSheetDataAsMapString("ObservationLink!A:B");
        getChromeActions().enterUrl(observationLinkTestData.get("url"));
        getChromeActions().clickOnStartObservation();
        getObservationPageActions().clickOnFirstEntity();
        getObservationPageActions().clickOnObservation1();
        getObservationPageActions().ClickOnBackButton();
        getObservationPageActions().verifyBackButton();
    }

///

    @Test(description = "Verify Observation link from chrome ")
    @Author(name = "Sunil H N")
    public void verifyObservationAddToListViaLink() throws Exception {
        observationLinkTestData = TestData.getFullGoogleSheetDataAsMapString("ObservationLink!A:B");
        getObservationPageActions().clickOnAcceptButton();
        getChromeActions().enterUrl(observationLinkTestData.get("url"));
        getChromeActions().clickOnStartObservation();
        Thread.sleep(10000);
        String observationName = getObservationPageActions().getNameOfObservation();
        getObservationPageActions().clickOnTopBackButton();
        getObservationPageActions().verifyObservationNameUnderList(); // need to pass observ name and verify
    }

    @Test(description = "Verify Observation link from chrome ")
    @Author(name = "Manjunatha K")
    public void verifyQuestioniarrePageAndNavigation() throws Exception {
        observationLinkTestData = TestData.getFullGoogleSheetDataAsMapString("ObservationLink!A:B");
        getObservationPageActions().clickOnAcceptButton();
        getChromeActions().enterUrl(observationLinkTestData.get("url"));
        getChromeActions().clickOnStartObservation();
        Thread.sleep(10000);
        getObservationPageActions().clickOnFirstEntity();
        getObservationPageActions().verifyFirstObservationSubmission();
        getObservationPageActions().clickOnFirstObservationSubmission();
        getObservationPageActions().verifyDomainTitle();
        getObservationPageActions().clickOnFirstHpDomain();
        getObservationPageActions().clickOnStartObservation();
        getObservationPageActions().clickOnFirstObservationUnderHpDomain();
        getObservationPageActions().verifyQuestionMapIcon();
        getObservationPageActions().verifyNextButtonOnQuestionPage();
        getObservationPageActions().clickOnNextButtonOnQuestionPage();
        getObservationPageActions().verifyBackButtonOnQuestionPage();
        getObservationPageActions().clickOnTopBackButton();
        getObservationPageActions().clickOnTopBackButton();
        getObservationPageActions().clickOnSubmissionThreeDot();
        getObservationPageActions().clickOnDeleteSubmission();
        getObservationPageActions().clickOnEntityDeleteYesOption();
    }

    @Test(description = "Verify Observation link from chrome ")
    @Author(name = "Manjunatha K")
    public void verifyQuestionsFormatsOnSubmssions() throws Exception {
        observationLinkTestData = TestData.getFullGoogleSheetDataAsMapString("ObservationLink!A:B");
        getObservationPageActions().clickOnAcceptButton();
        getChromeActions().enterUrl(observationLinkTestData.get("prepodquestionsformaturl"));
        getChromeActions().clickOnStartObservation();
        Thread.sleep(10000);
        getObservationPageActions().verifyQuestionMapIcon();
        //getObservationPageActions().swipeUpTo3thQuestion();
        getObservationPageActions().swipeUpTo5thQuestion();
        SikshaLokamClient.get().getScreenShot().screenshot();
    }
        /*home page steps to scroll
         * getObservationPageActions().clickOnTopBackButton();
        getObservationPageActions().clickOnObservationTab();
        getObservationPageActions().scrollTowithoutRubricEntity();
        SikshaLokamClient.get().getScreenShot().screenshot();*/



}
