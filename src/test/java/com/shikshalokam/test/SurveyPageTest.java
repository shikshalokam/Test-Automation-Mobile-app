package com.shikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.HomePageActions;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageActions;
import com.shikshalokam.pages.actions.ProfilePageActions;
import com.shikshalokam.pages.actions.ProgramsPageActions;
import com.shikshalokam.pages.actions.SurveyPageActions;
import com.shikshalokam.utils.gSheet.TestData;

public class SurveyPageTest {
	
	Map<String, String> loginPageTestData;	

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
		
		 public ObservationPageActions getObservationPageActions() throws Exception {
		        return new ObservationPageActions();
		  }
		 
		 public SurveyPageActions getSurveyPageActions() throws Exception {
		        return new SurveyPageActions();
		  }
		
		 @Test(description = ">To verify, when user clicks on Surveys tile, user should land on Survey listing screen and user should see list of surveys"
		 		+ ">To verify, User should should see header content , surveys tiles on survey Listing Page"
		 		+ ">To verify, User should see following contents on each survey tile " )
		    @Author(name = "SHREEJITH")
		    public void surveyListingPage() throws Exception {
		    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
		    	  getLoginPageActions().userOnBoardingAsHTOfficial();
		    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
		          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
		          getLoginPageActions().clickOnLoginButton();
		          
		          getSurveyPageActions().clickOnSurveysTile();
		          getSurveyPageActions().verifySurveyListingPage();
		          getSurveyPageActions().verifySurveyCardContents();
		 }

}
