package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ObservationPageObjects {


    @FindBy(xpath = "//android.widget.Button[@text='Observations']")
    public WebElement observationsTile;

    @FindBy(xpath = "//android.widget.TextView[@text='Observation']")
	 public WebElement observationPageTitle;

    @FindBy(xpath = "//android.view.View[@resource-id='moreObservations']//android.widget.Button")
    public WebElement viewMore;

    @FindBy(xpath = "//android.widget.Button[@text='back']")
    public WebElement back;

    @FindBy(xpath = "//android.view.View[@resource-id='observationSearch']//android.widget.EditText[@index='0']")
    public WebElement observationSearch;

    @FindBy(xpath = "(//android.view.View[@resource-id='observationCard'])[1]")
    public WebElement firstObservation;

    @FindBy(xpath = "//android.view.View[@resource-id='addEntity']/android.widget.Button")
    public WebElement addEnitityButton;

    @FindBy(xpath = "(//android.view.View[@resource-id='entityCard'])[1]")
    public WebElement defaultEntity;

    @FindBy(xpath = "//android.view.View[@resource-id='entitySearch']//android.widget.EditText")
    public WebElement enititySearch;


    @FindBy(xpath = "//android.widget.Button[@text='Add state']")
    public WebElement addState;

    @FindBy(xpath = "//android.view.View[@index='2']")
    public WebElement firstEntity;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id='itemTitle'])[1]")
  	 public WebElement observationNameOnObseravtionsCard;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id='itemSubTitle'])[1]")
  	 public WebElement programNameOnObseravtionsCard;

    @FindBy(xpath = "//android.widget.Button[@text='UPDATE PROFILE']")
    public WebElement updateProfile;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Observation\"]")
    public WebElement observationTxt;

    @FindBy(xpath = "//android.widget.Button[@text='Cancel CANCEL']")
    public WebElement cancel;

    @FindBy(xpath = "//android.widget.Button[@text='Add ADD']")
    public WebElement add;

    @FindBy(xpath = "//android.widget.Button[@text='search']")
    public WebElement searchButton;

    @FindBy(xpath = "(//android.view.View[@clickable='true'])[4]")
    public WebElement firstEntitys;

    @FindBy(xpath = "//android.widget.Button[@text='All']")
    public WebElement all;

    @FindBy(xpath = "//android.widget.Button[@text='In progress']")
    public WebElement inProgress;

    @FindBy(xpath = "//android.widget.Button[@text='Completed']")
    public WebElement completed;

   
    	@FindBy(xpath = "//android.widget.Button[@text='Observe again']")
    public WebElement observeAgain;

    @FindBy(xpath = "//android.widget.Button[@text='View entity report']")
    public WebElement viewEntityReport;

    @FindBy(xpath = "(//android.widget.Image[@index='3'])[1]")
    public WebElement verticalOutline;

    @FindBy(xpath = "//android.widget.Button[@text='EDIT']")
    public WebElement edit;

    @FindBy(xpath = "//android.widget.Button[@text='DELETE']")
    public WebElement delete;

    @FindBy(xpath = "//android.widget.Button[@@text='VIEW DETAILS']")
    public WebElement viewDetails;


    @FindBy(xpath = "//android.widget.TextView[@text='Alert']")
    public WebElement alertProfileTitle;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Observation With Rubrics')]")
    public WebElement observationWithRubric;

    @FindBy(xpath = "(//android.widget.TextView)[4] ")
    public WebElement firstEntityInList;


    @FindBy(xpath = "//android.widget.TextView[@text='Observation 1']")
    public WebElement firstObservationSubmission;

    @FindBy(xpath = "(//android.widget.Image[@text='ellipsis vertical outline'])[1]")
    public WebElement threeDotOnObservation;

    @FindBy(xpath = "//android.widget.Button[@text='EDIT']")
    public WebElement editObservationSubmission;

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    public WebElement deleteObservationSubmission;

    @FindBy(xpath = "//android.widget.Button[@text='Yes']")
    public WebElement observationSubmissionDeleteYes;

    @FindBy(xpath = "//android.widget.Button[@text='No']")
    public WebElement observationSubmissionDeleteNo;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Hp_tna_for_skill_and_mindset')]")
    public WebElement entityObservataionToDelete;

    @FindBy(xpath = "//android.widget.Image[@text='trash']")
    public WebElement deleteIconOnEntity;

    @FindBy(xpath = "//android.widget.TextView[@text='Add entity to observe']")
    public WebElement addEntityToObserveTitle;

    @FindBy(xpath = "//android.widget.Button[@text='Yes']")
    public WebElement entityDeleteConfirmationYes;

    @FindBy(xpath = "//android.widget.Button[@text='No']")
    public WebElement entityDeleteConfirmationNo;

  /*  @FindBy(xpath = "//android.widget.Button[@text='arrow forward Start Observation']")
    public WebElement startObservation;  */

    @FindBy(xpath = "//android.widget.Button[@text='eye View Observation']")
    public WebElement viewObservation;

    @FindBy(xpath = "//android.widget.Button[@text='Cancel']")
    public WebElement cancelObservation;

    @FindBy(xpath = "(//android.widget.RadioButton[contains(@text,'Google Forms')])[2]")
    public WebElement googleFormRadioOption;

    @FindBy(xpath = "//android.widget.Button[@text='Next']")
    public WebElement nextButtonOnQuestionPage;

    @FindBy(xpath = "//android.widget.Button[@text='back Back']")
    public WebElement backButtonOnQuestionPage;

    @FindBy(xpath = "//android.widget.Button[@text='back']")
    public WebElement backButtonOnTopOfQuestionPage;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Observation 1\"]")
    public WebElement observation1;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Observation 2\"]")
    public WebElement observation2;

    @FindBy(xpath = "(//android.view.View//android.view.View)[19]")
    public WebElement hpdomain;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Sb-23907 : Observation With Rubric Targeted -- Fd 249')]")
    public WebElement entityObservataionToDeleteAfterSubmission;

    @FindBy(xpath = "//android.widget.TextView[@text='Observation 2']")
    public WebElement secondObservationSubmission;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Obs Without Rubric - Fd 137')]")
    public WebElement entityObservataionWithoutRubric;

    @FindBy(xpath = "//android.widget.Button[@text='eye View Observation']")
    public WebElement viewObsercation;

    @FindBy(xpath = "//android.widget.Button[@text='Cancel']")
    public WebElement cancleObsercation;

    @FindBy(xpath = "//android.widget.TextView[@text='Domains']")
    public WebElement domainPageTitle;

    @FindBy(xpath = "(//android.view.View[@resource-id='domainCard'])[1]")
    public WebElement firstDomain;

    @FindBy(xpath = "(//android.view.View[@resource-id='domainCard'])[2]")
    public WebElement secondDomain;

    @FindBy(xpath = "//android.view.View[@resource-id='domainCriteria']")
    public WebElement domainCriteria;

    @FindBy(xpath = "(//android.view.View[@resource-id='domainCard'])[1]//(//android.widget.TextView[@text='Completed'])[1]")
    public WebElement domain1Completed;

    @FindBy(xpath = "(//android.view.View[@resource-id='domainCard'])[2]//(//android.widget.TextView[@text='Completed'])[2]")
    public WebElement domain2Completed;

    @FindBy(xpath = "(//android.view.View[@resource-id='domainCard'])[2]//android.widget.TextView[@text='Submitted']")
    public WebElement obsSubmittedStatusOnDomainCard;

    @FindBy(xpath = "//android.widget.TextView[@text='Planning & Execution']")
    public WebElement planningAndExecutionObservation;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement textInputForQuestionaries;

    @FindBy(xpath = "//android.widget.Button[@text='save Save']")
    public WebElement saveButtonForQuestionaries;

    @FindBy(xpath = "//android.widget.TextView[@text='In progress']")
    public WebElement inProgressStatus;

    //elements for chrome page
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/terms_accept\"]")
    public WebElement acceptButtonForChrome;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]")
    public WebElement yesIamInButtonForChrome;

    @FindBy(xpath = "(//android.widget.TextView)[3]")
    public WebElement addEntityPageObservationTitle;

    @FindBy(xpath = "(//android.widget.TextView)[9]")
    public WebElement observationListItemName;

    @FindBy(xpath = "//android.widget.TextView[contians(@text,\" + oname + \"")
    public WebElement observationListItemNamedynamic;

    @FindBy(xpath = "//android.widget.TextView[@text='Hp Domain']")
    public WebElement firstHpDomain;

    @FindBy(xpath = "//android.widget.TextView[@text='HP Domain']")
    public WebElement firstObservationUnderHpDomain;

    @FindBy(xpath = "//android.widget.Button[@text='Question map']")
    public WebElement questionMap;

    @FindBy(xpath = "//android.view.View[contains(@text,'1')]")
    public WebElement question1;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"ion-rb-40\"]")
    public WebElement firstRadioButtonForFirstQuestion;

    @FindBy(xpath = "//android.widget.Button[@text='All']")
    public WebElement AllTabForSubmission;

    @FindBy(xpath = "//android.widget.Button[@text='In progress']")
    public WebElement inProgressTabForSubmission;

    @FindBy(xpath = "//android.widget.Button[@text='Completed']")
    public WebElement completedTabForSubmission;

    @FindBy(xpath = "//android.view.View[contains(@text,'2')]")
    public WebElement question2;

    @FindBy(xpath = "//android.view.View[contains(@text,'3')]")
    public WebElement question3;

    @FindBy(xpath = "//android.view.View[contains(@text,'4')]")
    public WebElement question4;

    @FindBy(xpath = "//android.view.View[contains(@text,'5')]")
    public WebElement question5;

    @FindBy(xpath = "//android.view.View[contains(@text,'6')]")
    public WebElement question6;

    @FindBy(xpath = "//android.view.View[contains(@text,'7')]")
    public WebElement question7;

    @FindBy(xpath = "//android.view.View[contains(@text,'8')]")
    public WebElement question8;

    @FindBy(xpath = "//android.view.View[contains(@text,'9')]")
    public WebElement question9;

    @FindBy(xpath = "//android.view.View[contains(@text,'bulb')]")
    public WebElement bulbIcon;

    @FindBy(xpath = "(//android.view.View[contains(@text,'1')]//following::android.widget.Button)[1]")
    public WebElement dateFieldForQuestion1;

    @FindBy(xpath = "(//android.view.View[contains(@text,'2')]//following::android.widget.EditText)[1]")
    public WebElement inputTextForQuestion2;

    @FindBy(xpath = "(//android.view.View[contains(@text,'2')]//following::android.widget.EditText)[1]")
    public WebElement yesRadioButtonForQuestion3;

    //sqaa observation for not applicable testcase and search
    @FindBy(xpath = "(//android.widget.TextView[contains(@text,'Sqaa- For Testing')])[1]")
    public WebElement searchedObservation;

    @FindBy(xpath = "//android.widget.Button[contains(@text,'search')]")
    public WebElement addEntitySearchButton;

    @FindBy(xpath = " //android.widget.Button[contains(@text,'Add')]")
    public WebElement addEntityButton;

    @FindBy(xpath = "(//android.view.View[@resource-id='observationSubmissions'])[1]")
    public WebElement observationDefaultInstance1;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='itemTitle' and @text='Observation 2']")
    public WebElement observationInstance2;

  //android.widget.TextView[@resource-id='itemTitle' and @text='Observation 2']

    @FindBy(xpath = "//android.widget.Button[@text='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//android.widget.Button[@text='Start observation']")
    public WebElement startObservationButton;

    @FindBy(xpath = "//android.view.View[@resource-id='pageDateTypeQuestion']//android.widget.Button[@text='Capture']")
    public WebElement dateCaptureResponse;

    @FindBy(xpath = "(//android.view.View[@resource-id='pageMultipleTypeQuestion']//android.widget.CheckBox[1])[2]")
    public WebElement checkboxResponse;

    @FindBy(xpath = "(//android.view.View[@resource-id='pageRadioTypeQuestion']//android.widget.RadioButton[1])[2]")
    public WebElement radioButtonResponse;

    @FindBy(xpath = "//android.view.View[@resource-id='pageTextTypeQuestion']//android.widget.EditText")
    public WebElement textTypeResponse;

    @FindBy(xpath = "//android.widget.Button[@text='Submit the form']")
    public WebElement submitForm;

    @FindBy(xpath = "//android.view.View[@text='All']")
    public WebElement allTab;

    @FindBy(xpath = "//android.view.View[@text='In progress']")
    public WebElement inProgressTab;

    @FindBy(xpath = "//android.view.View[@text='Completed']")
    public WebElement completedTab;

    @FindBy(xpath = "//android.widget.Button[@text='Reports']")
    public WebElement reportsButton;




}
