package com.shikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.HomePageActions;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ProfilePageActions;
import com.shikshalokam.pages.actions.ProgramsPageActions;
import com.shikshalokam.utils.gSheet.TestData;
import com.shikshalokam.utils.logger.Logger;

public class ProgramsPageTest {
	 Map<String, String> loginPageTestData;
	 Map<String, String> programPageTestData;


	    public LoginPageAction getLoginPageActions() throws Exception {
	        return new LoginPageAction();
	    }
		public ProgramsPageActions getProgramsPageActions() throws Exception {
	        return new ProgramsPageActions();
	    }
		public HomePageActions getHomePageActions() throws Exception {
	        return new HomePageActions();
		}
		public ProfilePageActions getProfilePageActions() throws Exception {
	        return new ProfilePageActions();
	    }

	    @Test(description = "- To verify, when user clicks on program tile, user should land on Program listing screen and user should see list of programs"+
	    "-To verify, User should should see header content , program tiles, etc  on Program Listing Page"
	    		+ "-To verify, User should see following contents on each Program tile "
	    		+ "-To verify, user should be able to see the Searched result")
	    @Author(name = "SHREEJITH")
	    public void programsListingPage() throws Exception {
	        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
	        getLoginPageActions().userOnBoardingAsHTOfficial();
	        getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
	        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
	        getLoginPageActions().clickOnLoginButton();
	        getLoginPageActions().verifyProgramsTile();
	        getLoginPageActions().clickOnProgramsTile();
	        getProgramsPageActions().verifyProgramListingPage();
	        getProgramsPageActions().verifyProgramCardContents();

	    }

	    @Test(description = "-To verify, user should land on Program Details page, when clicked on a program "
	    +"-Verify if user is able to view the 'Join program' button in the program details page"
	    +"-Verify if user is able to view the filters in the program details page")
	    @Author(name = "SHREEJITH")
	    public void programDetailsPage() throws Exception {
	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
	          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
	          getLoginPageActions().clickOnLoginButton();
	          getLoginPageActions().clickOnProgramsTile();
	          getProgramsPageActions().clickOnProgramSearchField();
	          getProgramsPageActions().searchForProgram(programPageTestData.get("NewProgramWithJoinProgram"));
	          getProgramsPageActions().clickOnFirstProgram();
	          getProgramsPageActions().verifyProgramDetailsPage();
	    }

	    @Test(description = "Verify PII pop-up comes up after clicking on 'Join program' button"
	   	+ "-Verify that the PII pop-up is displayed as expected result"
	    +"-Verify the PII consent pop-up comes up, when user revists the same program, in which user had not given consent to Share or Do not share, on PII consent Pop-up " )
	    @Author(name = "SHREEJITH")
	    public void piiPopUp() throws Exception {
	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!F:G");
	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	  getLoginPageActions().enterUserName(loginPageTestData.get("Pii_User"));
	          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
	          getLoginPageActions().clickOnLoginButton();
	          getLoginPageActions().clickOnProgramsTile();
	          getProgramsPageActions().clickOnProgramSearchField();
	          getProgramsPageActions().searchForProgram(programPageTestData.get("PiiPopUpProgram"));
	          getProgramsPageActions().clickOnFirstProgram();
	          getProgramsPageActions().clickOnJoinProgram();
	          getProgramsPageActions().verifyPiiPopUp();
	          getProgramsPageActions().clickBack();
	          Thread.sleep(2000);
	          getProgramsPageActions().clickOnProgramSearchField();
	          getProgramsPageActions().searchForProgram(programPageTestData.get("PiiPopUpProgram"));
	          getProgramsPageActions().clickOnFirstProgram();
	          getProgramsPageActions().verifyPiiPopUp();
	          Logger.logAndReportPass("PII consent pop-up shows up, when user revists the same program");


	    }

	    @Test(description = "-Verify join Program Pop-up comes up, on clicking on any resouses on Program details page "
	    		+ "-Verify that 'Join program' pop up contains following details:1. Pop up heading 2. Body text 3. Join program button")
	    	    @Author(name = "SHREEJITH")
	    	    public void joinProgramPopUp() throws Exception {
	    	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
	    	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
	    	          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
	    	          getLoginPageActions().clickOnLoginButton();
	    	          getLoginPageActions().clickOnProgramsTile();
	    	          getProgramsPageActions().clickOnProgramSearchField();
	    	          getProgramsPageActions().searchForProgram(programPageTestData.get("JoinProgramPopUpProgram"));
	    	          getProgramsPageActions().clickOnFirstProgram();
	    	          getProgramsPageActions().clickOnFirstResourceCollapseCardAndSelectfirstResource();
	    	          getProgramsPageActions().verifyJoinProgramPopUp();

	    }
	    @Test(description = "-Verify if user is able to click on 'Do not share' button and views the expected result "
	    +"-Verify that user is able to see a message below the description in Place of Join Program button"
	    +"-Verify user is able to see Profile data sharing Dropdown at the bottom of the program details page for joined Program only"
	    +"-Verify when user has joined the program, join program pop up will not appear when user clicks on the resources (Project/Observation/Survey) "
	    +"-Verify if user clicks on the resources (Project/Observation/Survey) then user is taken to resource page" )
	    @Author(name = "SHREEJITH")
	    public void doNotShareConsentAndJoinProgram() throws Exception {
	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!F:G");
	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	  getLoginPageActions().enterUserName(loginPageTestData.get("Pii_User"));
	          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
	          getLoginPageActions().clickOnLoginButton();
	          getLoginPageActions().clickOnProgramsTile();
	          getProgramsPageActions().clickOnProgramSearchField();
	          getProgramsPageActions().searchForProgram(programPageTestData.get("Pii_DoNotShare_Consent_Program"));
	          getProgramsPageActions().clickOnFirstProgram();
	          getProgramsPageActions().clickOnJoinProgram();
	          getProgramsPageActions().verifyPiiPopUp();
	          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
	          getProgramsPageActions().verifyYourdatasettinghasbeenupdatedsuccessfullyToastMessage();
	          getProgramsPageActions().verifyYouHaveJoinedThisProgramMsg();
	          getProgramsPageActions().verifyProfileDataSharing();
	          getProgramsPageActions().clickOnFirstResourceCollapseCardAndSelectfirstResource();
	          getProgramsPageActions().verifyLandedOnResourceDetailsPageDirectly();
	    }

	    @Test(description = "-Verify if user is able to click on 'Share' button and views the expected result "
	    +"-Verify that user is able to see a message below the description in Place of Join Program button"
		+"-Verify user is able to see Profile data sharing Dropdown at the bottom of the program details page for joined Program only"
	    +"-Verify when user has joined the program, join program pop up will not appear when user clicks on the resources (Project/Observation/Survey) "
	    +"-Verify if user clicks on the resources (Project/Observation/Survey) then user is taken to resource page" )
	    @Author(name = "SHREEJITH")
	    public void shareConsentAndJoinProgram() throws Exception {
	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!F:G");
	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	  getLoginPageActions().enterUserName(loginPageTestData.get("Pii_User"));
	          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
	          getLoginPageActions().clickOnLoginButton();
	          getLoginPageActions().clickOnProgramsTile();
	          getProgramsPageActions().clickOnProgramSearchField();
	          getProgramsPageActions().searchForProgram(programPageTestData.get("Pii_Share_Consent_Program"));
	          getProgramsPageActions().clickOnFirstProgram();
	          getProgramsPageActions().clickOnJoinProgram();
	          getProgramsPageActions().verifyPiiPopUp();
	          getProgramsPageActions().checkTheCheckBoxOnPiiPopup();
	          getProgramsPageActions().clickShareButtonOnPiiPopup();
	          getProgramsPageActions().verifyYourdatasettinghasbeenupdatedsuccessfullyToastMessage();
	          getProgramsPageActions().verifyYouHaveJoinedThisProgramMsg();
	          getProgramsPageActions().verifyProfileDataSharing();
	          getProgramsPageActions().clickOnFirstResourceCollapseCardAndSelectfirstResource();
	          getProgramsPageActions().verifyLandedOnResourceDetailsPageDirectly();
	    }

	    @Test(description = "- To verify, when user clicks on program tile, user should land on Program listing screen and user should see list of programs"+
	    	    "-To verify, User should should see header content , program tiles, etc  on Program Listing Page"
	    	    		+ "-To verify, User should see following contents on each Program tile "
	    	    		+ "-To verify, user should be able to see the Searched result")
	   @Author(name = "SHREEJITH")
	   public void teacherUserProgramsListingPage() throws Exception {
	    	   loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
	    	   getLoginPageActions().userOnBoardingAsHTOfficial();
	           getLoginPageActions().enterUserName(loginPageTestData.get("userTeacher"));
	           getLoginPageActions().enterPassword(loginPageTestData.get("passwordTeacher"));
	           getLoginPageActions().clickOnLoginButton();
	           getHomePageActions().navigatingToTeacherHomePage();
	           getHomePageActions().scrollToBrowseOtherCategories();
	           getLoginPageActions().verifyProgramsTile();
	    	   getLoginPageActions().clickOnProgramsTile();
	    	   getProgramsPageActions().verifyProgramListingPage();
	    	   getProgramsPageActions().verifyProgramCardContents();

	    	    }

	    @Test(description = "-To verify, user should land on Program Details page, when clicked on a program "
	    	    +"-Verify if user is able to view the 'Join program' button in the program details page"
	    	    +"-Verify if user is able to view the filters in the program details page")
	    	    @Author(name = "SHREEJITH")
	    	    public void teacherUserProgramDetailsPage() throws Exception {
	    	   loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
	    	   programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	   getLoginPageActions().userOnBoardingAsHTOfficial();
	           getLoginPageActions().enterUserName(loginPageTestData.get("userTeacher"));
	           getLoginPageActions().enterPassword(loginPageTestData.get("passwordTeacher"));
	           getLoginPageActions().clickOnLoginButton();
	           getHomePageActions().navigatingToTeacherHomePage();
	           getHomePageActions().scrollToBrowseOtherCategories();
	    	   getLoginPageActions().clickOnProgramsTile();
	    	   getProgramsPageActions().clickOnProgramSearchField();
	    	   getProgramsPageActions().searchForProgram(programPageTestData.get("NewProgramTeacherWithJoinProgram"));
	    	   getProgramsPageActions().clickOnFirstProgram();
	    	   getProgramsPageActions().verifyProgramDetailsPage();

	    	    }

	    @Test(description = "Verify PII pop-up comes up after clicking on 'Join program' button"
	    	   	+ "-Verify that the PII pop-up is displayed as expected result"
	    	    +"-Verify the PII consent pop-up comes up, when user revists the same program, in which user had not given consent to Share or Do not share, on PII consent Pop-up " )
	    	    @Author(name = "SHREEJITH")
	    	    public void teacherPiiPopUp() throws Exception {
	    	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!F:G");
	    	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	    	  getLoginPageActions().enterUserName(loginPageTestData.get("Pii_User_Teacher"));
	    	          getLoginPageActions().enterPassword(loginPageTestData.get("password_Teacher"));
	    	          getLoginPageActions().clickOnLoginButton();
	    	          getHomePageActions().navigatingToTeacherHomePage();
	   	              getHomePageActions().scrollToBrowseOtherCategories();
	    	          getLoginPageActions().clickOnProgramsTile();
	    	          getProgramsPageActions().clickOnProgramSearchField();
	    	          getProgramsPageActions().searchForProgram(programPageTestData.get("PiiPopUpProgramTeacher"));
	    	          getProgramsPageActions().clickOnFirstProgram();
	    	          getProgramsPageActions().clickOnJoinProgram();
	    	          getProgramsPageActions().verifyPiiPopUp();
	    	          getProgramsPageActions().clickBack();
	    	          Thread.sleep(2000);
	    	          getProgramsPageActions().clickOnProgramSearchField();
	    	          getProgramsPageActions().searchForProgram(programPageTestData.get("PiiPopUpProgramTeacher"));
	    	          getProgramsPageActions().clickOnFirstProgram();
	    	          getProgramsPageActions().verifyPiiPopUp();
	    	          Logger.logAndReportPass("PII consent pop-up shows up, when user revists the same program");


	    	    }

	    @Test(description = "-Verify join Program Pop-up comes up, on clicking on any resouses on Program details page "
	    		+ "-Verify that 'Join program' pop up contains following details:1. Pop up heading 2. Body text 3. Join program button")
	    	    @Author(name = "SHREEJITH")
	    	    public void teacherJoinProgramPopUp() throws Exception {
	    	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
	    	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	    	  getLoginPageActions().enterUserName(loginPageTestData.get("userTeacher"));
	    	          getLoginPageActions().enterPassword(loginPageTestData.get("passwordTeacher"));
	    	          getLoginPageActions().clickOnLoginButton();
	    	          getHomePageActions().navigatingToTeacherHomePage();
		   	           getHomePageActions().scrollToBrowseOtherCategories();
	    	          getLoginPageActions().clickOnProgramsTile();
	    	          getProgramsPageActions().clickOnProgramSearchField();
	    	          getProgramsPageActions().searchForProgram(programPageTestData.get("JoinProgramPopUpProgram_Teacher"));
	    	          getProgramsPageActions().clickOnFirstProgram();
	    	          getProgramsPageActions().clickOnFirstResourceCollapseCardAndSelectfirstResource();
	    	          getProgramsPageActions().verifyJoinProgramPopUp();

	    }

	    @Test(description = "-Verify if user is able to click on 'Do not share' button and views the expected result "
	    	    +"-Verify that user is able to see a message below the description in Place of Join Program button"
	    	    +"-Verify user is able to see Profile data sharing Dropdown at the bottom of the program details page for joined Program only"
	    	    +"-Verify when user has joined the program, join program pop up will not appear when user clicks on the resources (Project/Observation/Survey) "
	    	    +"-Verify if user clicks on the resources (Project/Observation/Survey) then user is taken to resource page" )
	    	    @Author(name = "SHREEJITH")
	    	    public void teacherDoNotShareConsentAndJoinProgram() throws Exception {
	    	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!F:G");
	    	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	    	  getLoginPageActions().enterUserName(loginPageTestData.get("Pii_User_Teacher"));
	    	          getLoginPageActions().enterPassword(loginPageTestData.get("password_Teacher"));
	    	          getLoginPageActions().clickOnLoginButton();
	    	          getHomePageActions().navigatingToTeacherHomePage();
	   	           getHomePageActions().scrollToBrowseOtherCategories();
	    	          getLoginPageActions().clickOnProgramsTile();
	    	          getProgramsPageActions().clickOnProgramSearchField();
	    	          getProgramsPageActions().searchForProgram(programPageTestData.get("Pii_DoNotShare_Consent_Program_Teacher"));
	    	          getProgramsPageActions().clickOnFirstProgram();
	    	          getProgramsPageActions().clickOnJoinProgram();
	    	          getProgramsPageActions().verifyPiiPopUp();
	    	          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
	    	          getProgramsPageActions().verifyYourdatasettinghasbeenupdatedsuccessfullyToastMessage();
	    	          getProgramsPageActions().verifyYouHaveJoinedThisProgramMsg();
	    	          getProgramsPageActions().verifyProfileDataSharing();
	    	          getProgramsPageActions().clickOnFirstResourceCollapseCardAndSelectfirstResource();
	    	          getProgramsPageActions().verifyLandedOnResourceDetailsPageDirectly();
	    	    }

	    @Test(description = "-Verify if user is able to click on 'Share' button and views the expected result "
	    	    +"-Verify that user is able to see a message below the description in Place of Join Program button"
	    		+"-Verify user is able to see Profile data sharing Dropdown at the bottom of the program details page for joined Program only"
	    	    +"-Verify when user has joined the program, join program pop up will not appear when user clicks on the resources (Project/Observation/Survey) "
	    	    +"-Verify if user clicks on the resources (Project/Observation/Survey) then user is taken to resource page" )
	    	    @Author(name = "SHREEJITH")
	    	    public void teacherShareConsentAndJoinProgram() throws Exception {
	    	    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!F:G");
	    	    	  programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	    	  getLoginPageActions().userOnBoardingAsHTOfficial();
	    	    	  getLoginPageActions().enterUserName(loginPageTestData.get("Pii_User_Teacher"));
	    	          getLoginPageActions().enterPassword(loginPageTestData.get("password_Teacher"));
	    	          getLoginPageActions().clickOnLoginButton();
	    	          getHomePageActions().navigatingToTeacherHomePage();
	   	              getHomePageActions().scrollToBrowseOtherCategories();
	    	          getLoginPageActions().clickOnProgramsTile();
	    	          getProgramsPageActions().clickOnProgramSearchField();
	    	          getProgramsPageActions().searchForProgram(programPageTestData.get("Pii_Share_Consent_Program_Teacher"));
	    	          getProgramsPageActions().clickOnFirstProgram();
	    	          getProgramsPageActions().clickOnJoinProgram();
	    	          getProgramsPageActions().verifyPiiPopUp();
	    	          getProgramsPageActions().checkTheCheckBoxOnPiiPopup();
	    	          getProgramsPageActions().clickShareButtonOnPiiPopup();
	    	          getProgramsPageActions().verifyYourdatasettinghasbeenupdatedsuccessfullyToastMessage();
	    	          getProgramsPageActions().verifyYouHaveJoinedThisProgramMsg();
	    	          getProgramsPageActions().verifyProfileDataSharing();
	    	          getProgramsPageActions().clickOnFirstResourceCollapseCardAndSelectfirstResource();
	    	          getProgramsPageActions().verifyLandedOnResourceDetailsPageDirectly();
	    	    }

















	 /*   @Test(description = "")
	    @Author(name = "SHREEJITH")
	    public void scrolltoProgram() throws Exception {
	    	 loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
	    	 programPageTestData = TestData.getFullGoogleSheetDataAsMapString("Program!A:B");
	    	getLoginPageActions().userOnBoardingAsHTOfficial();
	    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
	          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
	          getLoginPageActions().clickOnLoginButton();
	          Thread.sleep(10000);
	          getLoginPageActions().clickOnProgramsTile();
	          Thread.sleep(5000);
	          getProgramsPageActions().scrolltoProgram();
	          getProgramsPageActions().clickOnProgramMahadevan();
	    } */
}
