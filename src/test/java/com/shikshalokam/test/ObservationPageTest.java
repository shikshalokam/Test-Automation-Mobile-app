package com.shikshalokam.test;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageActions;
import com.shikshalokam.pages.actions.ProgramsPageActions;
import com.shikshalokam.pages.actions.ProjectPageActions;
import com.shikshalokam.utils.gSheet.TestData;

public class ObservationPageTest {

    Map<String, String> loginPageTestData;
    Map<String, String> observationPageTestData;

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    public ObservationPageActions getObservationPageActions() throws Exception {
        return new ObservationPageActions();
    }
    public ProgramsPageActions getProgramsPageActions() throws Exception {
        return new ProgramsPageActions();
    }
    public ProjectPageActions getProjectPageActions() throws Exception {
    	return new ProjectPageActions();
    }

    //@BeforeMethod
    public void loginToTheApplication() throws Exception {
        System.out.println("loginToTheApplication");
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();

    }


   // @Test(description = "Verify Observation is able to open")
    @Author(name = "Sunil H N")
    public void verifyObservationTabViaLink() throws Exception {
        WebElement e = ShikshaLokamClient.get().driver().findElement(By.id("com.android.chrome:id/search_box_text"));
        e.click();
        Actions action = new Actions(ShikshaLokamClient.get().driver());
        action.sendKeys("https://preprod.ntp.net.in/manage-learn/create-observation/2ba0cdc1284729331d296bf3ad118f5a").perform();
        Thread.sleep(3000);
        Thread.sleep(3000);
        ShikshaLokamClient.get().driver().findElement(By.xpath("//android.view.View[@content-desc=\"Start Observation\"]/android.widget.Button")).click();
        Thread.sleep(6000);

    }

    //removed from execution list
    @Test(description = "Verify Observation is able to open")
    @Author(name = "Sunil H N")
    public void verifyObservationTab() throws Exception {
    	Thread.sleep(10000);
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().userOnBoardingAsHTOfficial();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationsTile();
       // getObservationPageActions().verifyObservationTxt();

    }

    @Test(description = "Verify Entity List in Observation")
    @Author(name = "Sunil H N")
    public void VerifyObservationTabAndEntityList() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationsTile();
        getObservationPageActions().verifyObservationTxt();
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        getObservationPageActions().sendObservationNameToSearch(observationPageTestData.get("multpleRubricsObservationName"));
        getObservationPageActions().clickOnFirstObservation();
        getObservationPageActions().verifyAddEntityButton();
        getObservationPageActions().clickOnAddEntityButton();
        getObservationPageActions().verifyAddEntitySearchButton();
    }


    @Test(description = "Verify Observation")
    @Author(name = "Sunil H N")
    public void AddNewObservation() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationsTile();
        getObservationPageActions().verifyObservationTxt();
        getObservationPageActions().sendObservationNameToSearch(observationPageTestData.get("observationNameToAddNewObservation"));
        Thread.sleep(5000);
        getObservationPageActions().clickOnFirstObservation();
        getObservationPageActions().clickOnFirstEntity();
        getObservationPageActions().verifyFirstObservationSubmission();
        getObservationPageActions().clickOnObserveAgainButton();
        getObservationPageActions().verifyNewObservationAdded();
        //cleanup steps for next run
        getObservationPageActions().clickOnSubmissionThreeDot();
        getObservationPageActions().clickOnDeleteSubmission();
        getObservationPageActions().clickOnSubmissionDeleteYesOption();
    }



    //TC_31,32,33
    @Test(description = "Search Observation via keyword and check not applicable option")
    @Author(name = "Manjunatha K")
    public void verifySearchingObservationviaKeywords() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationsTile();
        getObservationPageActions().sendObservationNameToSearch(observationPageTestData.get("observationNameToSearch"));
        getObservationPageActions().verifySearchedObservation(observationPageTestData.get("observationNameToSearch"));

    }

    //--------------------------New Sanity Scripts--------------------------------//


    @Test(description = "-Verify that user with a specific role can access observation form targeted to the user or observation link opened by clicking on the observation tile on the homescreen" )
    @Author(name = "SHREEJITH")
    public void observationsListingPage() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
          getLoginPageActions().clickOnLoginButton();
          getObservationPageActions().clickOnObservationsTile();
          getObservationPageActions().verifyObservationListingPage();
          getObservationPageActions().verifyObservationsCardContents();
    }

    @Test(description = ">To verify , user should be able to search for an observation"
    		+ ">Verify that an admin user can can access the 'observation with/Without rubric' from the observation tile"
    		+ ">Verify if user is able to see search bar in the observation entity screen"
    		+ ">To verify, User should see \"Add Entity\" button in an entiry screen" )
    @Author(name = "SHREEJITH")
    public void obsWithRubricAddEntityPage() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
          getLoginPageActions().clickOnLoginButton();
          getObservationPageActions().clickOnObservationsTile();
          Thread.sleep(2000);

          observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
          getObservationPageActions().searchObservation(observationPageTestData.get("ObsWithRubricsSingleSubmission"));
          getObservationPageActions().clickOnFirstObservation();
          getObservationPageActions().verifyAddEnitityPage();


    }

    @Test(description = ">To verify , user should be able to search for an observation"
    		+">Verify that an admin user can can access the 'observation Without rubric' from the observation tile"
    		+">Verify if user is able to see search bar in the observation entity screen"
    		+">To verify, User should see \"Add Entity\" button in an entiry screen" )
    @Author(name = "SHREEJITH")
    public void obsWithoutRubricAddEntityPage() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
          getLoginPageActions().clickOnLoginButton();
          getObservationPageActions().clickOnObservationsTile();
          Thread.sleep(2000);

          observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
          getObservationPageActions().searchObservation(observationPageTestData.get("ObsWithOutRubric"));
          getObservationPageActions().clickOnFirstObservation();
          getObservationPageActions().verifyAddEnitityPage();
    }

    @Test(description = "" )
    @Author(name = "SHREEJITH")
    public void submitSingleSubmissionObsWithRubric() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!J:K");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("obsRubricSingleSubUser"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password1"));
          getLoginPageActions().clickOnLoginButton();
          getObservationPageActions().clickOnObservationsTile();
          Thread.sleep(2000);

          observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
          getObservationPageActions().searchObservation(observationPageTestData.get("ObsWithRubricsSingleSubmission"));
          getObservationPageActions().clickOnFirstObservation();
          getObservationPageActions().clickOnDefaultEntity();

          getProgramsPageActions().verifyJoinProgramPopUp();
          getProgramsPageActions().clickOnJoinProgramButtonOnPopUp();
          getProgramsPageActions().verifyPiiPopUp();
          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
          getObservationPageActions().clickOnDefaultEntity();

          getObservationPageActions().verifyDomainsListingPage();
          getObservationPageActions().clickOnFirstDomain();
          getObservationPageActions().clickOnDomainCriteria();
          getObservationPageActions().clickOnStartButton();
          getObservationPageActions().completeObsWithRubricDomain1Questionnaires();
          getObservationPageActions().verifyDomain1CompletedStatus();

          getObservationPageActions().clickOnSecondDomain();
          getObservationPageActions().clickOnDomainCriteria();
          getObservationPageActions().completeObsWithRubricDomain2Questionnaires();
          getObservationPageActions().verifyDomain2CompletedStatus();



    }

    @Test(description = "" )
    @Author(name = "SHREEJITH")
    public void submitMultipleSubmissionObsWithRubric() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!J:K");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("obsRubricMultipleSubUser"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password2"));
          getLoginPageActions().clickOnLoginButton();
          getObservationPageActions().clickOnObservationsTile();
          Thread.sleep(2000);

          observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
          getObservationPageActions().searchObservation(observationPageTestData.get("ObsWithRubricsMultipleSubmission"));
          getObservationPageActions().clickOnFirstObservation();
          getObservationPageActions().clickOnDefaultEntity();

          getProgramsPageActions().verifyJoinProgramPopUp();
          getProgramsPageActions().clickOnJoinProgramButtonOnPopUp();
          getProgramsPageActions().verifyPiiPopUp();
          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
          getObservationPageActions().clickOnDefaultEntity();  

          getObservationPageActions().verifyInstanceScreen();
          getObservationPageActions().clickOnObservationInstance1();

          getObservationPageActions().verifyDomainsListingPage();
          getObservationPageActions().clickOnFirstDomain();
          getObservationPageActions().clickOnDomainCriteria();
          getObservationPageActions().clickOnStartButton();
          getObservationPageActions().completeObsWithRubricDomain1Questionnaires();
          getObservationPageActions().verifyDomain1CompletedStatus();

          getObservationPageActions().clickOnSecondDomain();
          getObservationPageActions().clickOnDomainCriteria();
          getObservationPageActions().completeObsWithRubricDomain2Questionnaires();
          getObservationPageActions().verifyDomain2CompletedStatus();
          getObservationPageActions().clickOnTopBackButton();
         
          getObservationPageActions().verifyMultipleSubmissionObsisSubmitted();

          getObservationPageActions().clickOnObserveAgainButton();
          getObservationPageActions().verifyObservationInstance2IsCreated();



    }
    @Test(description = "" )
    @Author(name = "SHREEJITH")
    public void submitObsWithoutRubric() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!J:K");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("obsWoRubricUser"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password3"));
          getLoginPageActions().clickOnLoginButton();
          getObservationPageActions().clickOnObservationsTile();
          Thread.sleep(2000);

          observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
          getObservationPageActions().searchObservation(observationPageTestData.get("ObsWithOutRubric"));
          getObservationPageActions().clickOnFirstObservation();
          getObservationPageActions().clickOnDefaultEntity();

          getProgramsPageActions().verifyJoinProgramPopUp();
          getProgramsPageActions().clickOnJoinProgramButtonOnPopUp();
          getProgramsPageActions().verifyPiiPopUp();
          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
          getObservationPageActions().clickOnDefaultEntity(); 

         getObservationPageActions().verifyInstanceScreen();
          getObservationPageActions().clickOnObservationInstance1();
          getObservationPageActions().clickOnStartButton();
          getObservationPageActions().completeObsWithoutRubric(); 
          getObservationPageActions().verifyMultipleSubmissionObsisSubmitted();

          getObservationPageActions().clickOnObserveAgainButton();
          getObservationPageActions().verifyObservationInstance2IsCreated();


}}
