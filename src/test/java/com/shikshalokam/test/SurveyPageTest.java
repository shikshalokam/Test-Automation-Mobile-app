package com.shikshalokam.test;

import com.shikshalokam.pages.actions.HomePageActions;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ProfilePageActions;
import com.shikshalokam.pages.actions.ProgramsPageActions;

public class SurveyPageTest {
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

}
