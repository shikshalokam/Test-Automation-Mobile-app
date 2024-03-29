package com.shikshalokam.test;

import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.HomePageActions;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageActions;
import com.shikshalokam.pages.actions.ProgramsPageActions;
import com.shikshalokam.pages.actions.ProjectPageActions;
import com.shikshalokam.utils.gSheet.TestData;

public class ProjectPageTest {

	Map<String, String> loginPageTestData;
    Map<String, String> observationPageTestData;
    Map<String, String> projectPageTestData;

    String projectName;
    String projectDescription;

    public ProgramsPageActions getProgramsPageActions() throws Exception {
        return new ProgramsPageActions();
    }

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    public HomePageActions getHomePageActions() throws Exception {
        return new HomePageActions();
	}

    public ObservationPageActions getObservationPageActions() throws Exception {
        return new ObservationPageActions();
    }

    public ProjectPageActions getProjectPageActions() throws Exception {
    	return new ProjectPageActions();
    }

    // @BeforeMethod
    public void loginToTheApplication() throws Exception {
        System.out.println("loginToTheApplication");
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().userOnBoardingAsHTOfficial();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
    }



       /* getProjectPageActions().turnOffMobileData();
        getProjectPageActions().searchProjectAndVerify(projectName);
        getProjectPageActions().turnOnMobileData();*/


    @Test(description = "access all projects under assigned to me")
    @Author(name = "Manjunatha K")
    public void accessAllProjects() throws Exception {
    	loginToTheApplication();
        getProjectPageActions().clickOnProjectTile();
        getProjectPageActions().verifyProjectPageTitle();
        getProjectPageActions().clickOnAssignedToMeOption();
        getProjectPageActions().verifyProjectAssignedToMeTitle();
        getProjectPageActions().verifyLoadMoreProjectButton();
        getProjectPageActions().verifyListOfProjects();
    }

    @Test(description = "edit project details")
    @Author(name = "Manjunatha K")
    public void editProjectDetails() throws Exception {
        projectPageTestData = TestData.getFullGoogleSheetDataAsMapString("Project!A:B");
    	loginToTheApplication();
        getProjectPageActions().clickOnProjectTile();
        getProjectPageActions().verifyProjectPageTitle();
        getProjectPageActions().searchProject(projectPageTestData.get("projectToEdit"));
        getProjectPageActions().clickOnFirstProject();
        getProjectPageActions().clickOnEditIconOnProject();
        getProjectPageActions().clickOnEditOnProjectView();
        getProjectPageActions().enterProjectTitle(projectPageTestData.get("projectTitleToEdit"));
        getProjectPageActions().enterProjectDescription(projectPageTestData.get("projectDescriptionToEdit"));
        getProjectPageActions().clickOnSaveEditForProject();
        getProjectPageActions().verifyProjectViewTitle();
    }

    //--------------------------New Sanity Scripts--------------------------------//


    @Test(description = "-Verify when user clicks on Project tile, user should land on Project listing screen"
    		+ "-Verify user should see Search bar and user should be able to search the projects based on the filter selected"
    		+ "-Verify user should see 3 filters"
    		+ "-Verify user should see Load more projects option if there are >10 projects "
    		+ "-Verify program name is reflected along with the project name in the project tile" )
    @Author(name = "SHREEJITH")
    public void projectListingPage() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
          getLoginPageActions().clickOnLoginButton();
          getProjectPageActions().clickOnProjectTile();
          getProjectPageActions().verifyProjectListingPage();
          getProjectPageActions().verifyProjectCardContents();
    }

    @Test(description = ">Verify User Lands on Project Details Page clicking upon Any Project in Project listing Page" )
    @Author(name = "SHREEJITH")
    public void projectDetailsPage() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password"));
          getLoginPageActions().clickOnLoginButton();
          getProjectPageActions().clickOnProjectTile();
          getProjectPageActions().clickOnFirstProject();
          getProjectPageActions().verifyProjectDetailsPage();



    }
    @Test(description = "-Verify when user clicks on Project tile, user should land on Project listing screen"
    		+ "-Verify user should see Search bar and user should be able to search the projects based on the filter selected"
    		+ "-Verify user should see 3 filters"
    		+ "-Verify user should see Load more projects option if there are >10 projects "
    		+ "-Verify program name is reflected along with the project name in the project tile" )
    @Author(name = "SHREEJITH")
    public void teacherProjectListingPage() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("userTeacher"));
          getLoginPageActions().enterPassword(loginPageTestData.get("passwordTeacher"));
          getLoginPageActions().clickOnLoginButton();
          getHomePageActions().navigatingToTeacherHomePage();
          getHomePageActions().scrollToBrowseOtherCategories();
          getProjectPageActions().clickOnProjectTile();
          getProjectPageActions().verifyProjectListingPage();
          getProjectPageActions().verifyProjectCardContents();
    }

    @Test(description = ">Verify User Lands on Project Details Page clicking upon Any Project in Project listing Page" )
    @Author(name = "SHREEJITH")
    public void teacherProjectDetailsPage() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("userTeacher"));
          getLoginPageActions().enterPassword(loginPageTestData.get("passwordTeacher"));
          getLoginPageActions().clickOnLoginButton();
          getHomePageActions().navigatingToTeacherHomePage();
          getHomePageActions().scrollToBrowseOtherCategories();
          getProjectPageActions().clickOnProjectTile();
          getProjectPageActions().clickOnFirstProject();
          getProjectPageActions().verifyProjectDetailsPage();
          getProjectPageActions().clickOnStartImprovement();



    }

    @Test(description = "-To verify user is be able to create Project in online mode with all mandatory fields filled."
    		+ "-To verify user is able to sync the Project in online mode"
    		+ "-To Verify, User should able to Search the project in online mode"
    		+ "-To verify, user should be able to create subtask"
    		+ "-Verify by completing all tasks and subtasks,user should see that the Submit improvement button is activated "
    		+ "-Verify User should be able to submit the project successfully")
    @Author(name = "SHREEJITH")
    public void createSearchAndSubmitProject() throws Exception {
    	loginToTheApplication();
        getProjectPageActions().clickOnProjectTile();
        getProjectPageActions().verifyProjectPageTitle();
        getProjectPageActions().clickOnCreateByMeOption();
        getProjectPageActions().clickOnCreateNewProject();
        getProjectPageActions().clickOnDonotShareOption();
        projectPageTestData = TestData.getFullGoogleSheetDataAsMapString("Project!A:B");
        projectName = projectPageTestData.get("projectName") + RandomStringUtils.randomAlphabetic(3);
        getProjectPageActions().enterProjectTitle(projectName);
        projectDescription = projectPageTestData.get("projectDescription") + RandomStringUtils.randomAlphabetic(3);
        getProjectPageActions().enterProjectDescription(projectDescription);
        Thread.sleep(3000);
        getProjectPageActions().selectCategories();
        getProjectPageActions().clickOnTeachersCheckBox();
        getProjectPageActions().clickOnSubmitButton();
        getProjectPageActions().clickOnCreateTasksForYourProject();
        getProjectPageActions().verifyAddNewTaskPopUp();
        String taskdesc = projectPageTestData.get("taskDescription") ;
        getProjectPageActions().enterTaskDescription(taskdesc);
        getProjectPageActions().clickOnAddTask();

        getProjectPageActions().clickOnCreateAndContinue();
        getProjectPageActions().verifyProjectCreatedTitle();
        getProjectPageActions().clickOnContinueButton();
        getProjectPageActions().clickOnViewProject();
        getProjectPageActions().verifyProjectCreatedMsg();
        getProjectPageActions().clickOnViewProjectButton();
    	getProjectPageActions().verifySyncButtonStatus();
        getObservationPageActions().clickOnTopBackButton();
        Thread.sleep(4000);
        getProjectPageActions().searchVerifySelectProject(projectName);
        getProjectPageActions().clickOnDonotShareOption();

        getProjectPageActions().clickOnTaskDetails();
        getProjectPageActions().clickOnFirstTaskCard();
        getProjectPageActions().addSubtaskName();
        getProjectPageActions().verifyAddSubtaskButtonGotEnabled();
        getProjectPageActions().clickOnAddSubtaskButton();
        getProjectPageActions().verifySubtaskCreation();
        getProjectPageActions().clickOnSubtaskStatus();


        //getProjectPageActions().clickOnTaskStatusDropdown();
        getProjectPageActions().selectCompletedStatus();
        getProjectPageActions().clickOnOkButton();
       // Thread.sleep(3000);
        getObservationPageActions().clickOnTopBackButton();
        getProjectPageActions().verifySubmitImprovement();
        getProjectPageActions().clickOnSubmitImprovementButton();
        getProjectPageActions().verifyOnAddRemarksScreen();
        String remarks = projectPageTestData.get("remarks") ;
        getProjectPageActions().enterRemarks(remarks);
        getProjectPageActions().verifySubmitImprovementOnAddRemarksScreen();
        getProjectPageActions().clickOnSubmitImprovementButton();
        getProjectPageActions().verifySubmitImprovementPopUp();
        getProjectPageActions().clickOnSubmitButton();
        getProjectPageActions().verifyProjectSubmissionCompleted();
    }

    @Test(description = ">Verify join program pop up will appear when user clicks on the start improvement in project details page"
    		+ ">Verify after user clicks on join program button PII pop up will appear on the screen"
    		+ ">Verify when user clicks on share /Do not Share button PII pop up will close and toast message appears on the screen"
    		+ ">To verify, user should see the Start improvement pop up message post clicking on Task tile" )
    @Author(name = "SHREEJITH")
    public void projectStartImprovementJoinProgramPiiStartImprovement() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!H:I");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("project_user1"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password1"));
          getLoginPageActions().clickOnLoginButton();
          getProjectPageActions().clickOnProjectTile();
          getProjectPageActions().clickOnFirstProject();
        getProjectPageActions().clickOnStartImprovement();
          getProgramsPageActions().verifyJoinProgramPopUp();
          getProgramsPageActions().clickOnJoinProgramButtonOnPopUp();
          getProgramsPageActions().verifyPiiPopUp();
          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
          getProjectPageActions().verifyToastMessage();
          getProjectPageActions().clickOnTaskDetails();
          getProjectPageActions().clickOnFirstTaskCard();
          getProjectPageActions().verifyStartImprovementPopUp();




    }

    @Test(description = ">Verify join program pop up will appear when user clicks on the task in the task details page"
    		+ ">Verify after user clicks on join program button PII pop up will appear on the screen"
    		+ ">Verify when user clicks on share /Do not Share button PII pop up will close and toast message appears on the screen"
    		+ ">To verify, user should see the Start improvement pop up message post clicking on Task tile" )
    @Author(name = "SHREEJITH")
    public void projectTaskDeatailTabJoinProgramPiiStartImprovement() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!H:I");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("project_user2"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password2"));
          getLoginPageActions().clickOnLoginButton();
          getProjectPageActions().clickOnProjectTile();
          getProjectPageActions().clickOnFirstProject();
          getProjectPageActions().clickOnTaskDetails();
          getProjectPageActions().clickOnFirstTaskCard();
          getProgramsPageActions().verifyJoinProgramPopUp();
          getProgramsPageActions().clickOnJoinProgramButtonOnPopUp();
          getProgramsPageActions().verifyPiiPopUp();
          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
          getProjectPageActions().verifyToastMessage();
          getProjectPageActions().clickOnTaskDetails();
          getProjectPageActions().clickOnFirstTaskCard();
          getProjectPageActions().verifyStartImprovementPopUp();

    }

    @Test(description = "-To verify, After starting the project, user is able to see 'Certificate' tag on the project listing page in both Assigned to me & Discovered by me filter in the Project tile"
    		+ "-To verify, When user clicks on Start improvement button on the name edit pop up then user should land on the project view page"
    		+ "-To verify, user should be able to see the certificate once user met criteria" )
    @Author(name = "SHREEJITH")
    public void projectCertificateFlow() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!H:I");
    	  projectPageTestData = TestData.getFullGoogleSheetDataAsMapString("Project!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("certificateProjectUser"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password3"));
          getLoginPageActions().clickOnLoginButton();
          getProjectPageActions().clickOnProjectTile();
          getProjectPageActions().searchProject(projectPageTestData.get("certificateProject"));
          getProjectPageActions().verifyCertificateLabel();
          getProjectPageActions().clickOnFirstProject();
          getProjectPageActions().clickOnStartImprovement();
          getProgramsPageActions().clickOnJoinProgramButtonOnPopUp();
          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
          getProjectPageActions().clickOnStartImprovement();
          getProjectPageActions().verifyNameEditPopUp();
          getProjectPageActions().clickOnStartImprovement();
          getProjectPageActions().clickOnTaskDetails();
          getProjectPageActions().clickOnFirstTaskCard();
          getProjectPageActions().completeTask();
          getProjectPageActions().clickOnBackButton();
          getProjectPageActions().clickOnSecondTaskCard();
          getProjectPageActions().completeTask();
          getProjectPageActions().clickOnBackButton();
          getProjectPageActions().swipeUp();
          getProjectPageActions().clickOnLoadMoreTasks();
          getProjectPageActions().clickOnStartObservationOnTaskCard();
          getObservationPageActions().clickOnObservationInstance1();
          getObservationPageActions().clickOnStartButton();
          getObservationPageActions().completeObsWithoutRubric();
          getProjectPageActions().clickOnBackButton();
          getProjectPageActions().verifySubmitImprovement();
          getProjectPageActions().clickOnSubmitImprovementButton();
          getProjectPageActions().attachingProjectEvidences();
          getProjectPageActions().clickOnSubmitImprovementButton();
          getProjectPageActions().verifySubmitImprovementPopUp();
          getProjectPageActions().clickOnSubmitButton();
          getProjectPageActions().verifyProjectSubmissionCompleted();
          getProjectPageActions().verifyCertificateLogo();
          getProjectPageActions().clickOnCertificateLogo();
          getProjectPageActions().verifyLandedOnCertificateScreen();
          getProjectPageActions().verifyCertificateIsGenerated();

    }

    @Test(description = "-To verify, User should see 'Download' icon option "
    		+ "-To verify, Post clicking on Download icon, The project should get downloaded in download section" )
    @Author(name = "SHREEJITH")
    public void downloadProject() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
    	  projectPageTestData = TestData.getFullGoogleSheetDataAsMapString("Project!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("downloaduser"));
          getLoginPageActions().enterPassword(loginPageTestData.get("downloaduserpassword"));
          getLoginPageActions().clickOnLoginButton();
          getProjectPageActions().clickOnProjectTile();
          String downloadProject = projectPageTestData.get("certificateProject");
          getProjectPageActions().searchProject(projectPageTestData.get("certificateProject"));
          getProjectPageActions().clickOnFirstProject();
          getProjectPageActions().verifyDownloadIcon();
          getProjectPageActions().clickOnProjectDownloadIcon();
          getProjectPageActions().verifyIsProjectDownloaded();

          getProjectPageActions().clickOnBackButton();
          getProjectPageActions().clickOnBackButton();
          getHomePageActions().clickOnDownloadIcon();
          getProjectPageActions().VerifyProjectGotDownloaded(downloadProject);
          getProjectPageActions().deleteDownloadedProject();


    }

    @Test(description = "-To verify user should see 'Start observation' button on the task tile" )
    @Author(name = "SHREEJITH")
    public void observationMappedToATaskFlow() throws Exception {
    	  loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!H:I");
    	  projectPageTestData = TestData.getFullGoogleSheetDataAsMapString("Project!D:E");
    	  getLoginPageActions().userOnBoardingAsHTOfficial();
    	  getLoginPageActions().enterUserName(loginPageTestData.get("ObsMappedToTaskUser"));
          getLoginPageActions().enterPassword(loginPageTestData.get("password4"));
          getLoginPageActions().clickOnLoginButton();
          getProjectPageActions().clickOnProjectTile();
          getProjectPageActions().searchProject(projectPageTestData.get("certificateProject"));
          getProjectPageActions().clickOnFirstProject();
          getProjectPageActions().clickOnStartImprovement();
          getProgramsPageActions().clickOnJoinProgramButtonOnPopUp();
          getProgramsPageActions().clickOnDoNotShareButtonOnPiiPopup();
          getProjectPageActions().clickOnStartImprovement();
          getProjectPageActions().verifyNameEditPopUp();
          getProjectPageActions().clickOnStartImprovement();
          getProjectPageActions().clickOnTaskDetails();
          getProjectPageActions().swipeUp();
          getProjectPageActions().clickOnLoadMoreTasks();
          getProjectPageActions().verifyStartObservationButtonOnTaskCard();
          getProjectPageActions().clickOnStartObservationOnTaskCard();
          getObservationPageActions().clickOnObservationInstance1();
          getObservationPageActions().clickOnStartButton();
          getObservationPageActions().completeObsWithoutRubric();
          getProjectPageActions().clickOnBackButton();
          getProjectPageActions().swipeUp();
          getProjectPageActions().verifyViewReportButtonOnTaskCard();


    }





}
