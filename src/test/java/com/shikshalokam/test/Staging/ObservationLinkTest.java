package com.shikshalokam.test.Staging;

import java.util.Map;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.ChromeActions;
import com.shikshalokam.pages.actions.HomePageActions;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageActions;
import com.shikshalokam.pages.actions.ProjectPageActions;
import com.shikshalokam.test.LoginPageTest;
import com.shikshalokam.utils.gSheet.TestData;

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

    public ProjectPageActions getProjectPageActions() throws Exception {
    	return new ProjectPageActions();
    }

    public HomePageActions getHomePageActions() throws Exception {
    	return new HomePageActions();
    }

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    public LoginPageTest getLoginPageTest() throws Exception {
    	return new LoginPageTest();
    }

 //   @Test(description = "Verify Observation link from chrome ")
    @Author(name = "Manjunatha Kumar")
    public void verifyObservationTab() throws Exception {
        observationLinkTestData = TestData.getFullGoogleSheetDataAsMapString("ObservationLink!A:B");
        getLoginPageTest().loginToApplication();
        //getChromeActions().clickUrl(observationLinkTestData.get("url"));

        Thread.sleep(10000);
        //getHomePageActions().
        /** getChromeActions().clickOnStartObservation();
        getObservationPageActions().clickOnFirstEntity();
        getObservationPageActions().clickOnObservation1();
        getObservationPageActions().clickOnfirstDomain();
        getChromeActions().clickOnStartObservation();
        ShikshaLokamClient.get().gestures().swipeDown();
        **/
    }


}
