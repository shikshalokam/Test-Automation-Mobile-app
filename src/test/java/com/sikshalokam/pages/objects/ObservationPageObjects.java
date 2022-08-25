package com.sikshalokam.pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ObservationPageObjects {


    @FindBy(xpath = "//android.widget.Button[@text='Observation']")
    public MobileElement observation;

    @FindBy(xpath = "//android.widget.Button[@text='VIEW MORE']")
    public MobileElement viewMore;

    @FindBy(xpath = "//android.widget.Button[@text='back']")
    public MobileElement back;

    @FindBy(xpath = "//android.widget.EditText[@index='0']")
    public MobileElement search;

    @FindBy(xpath = "//android.view.View[@index='2']")
    public MobileElement firstObservation;

    @FindBy(xpath = "//android.widget.Button[@text='Add state']")
    public MobileElement addState;

    @FindBy(xpath = "//android.view.View[@index='2']")
    public MobileElement firstEntity;

    @FindBy(xpath = "//android.widget.Button[@text='UPDATE PROFILE']")
    public MobileElement updateProfile;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Observation\"]")
    public MobileElement observationTxt;

    @FindBy(xpath = "//android.widget.Button[@text='Cancel CANCEL']")
    public MobileElement cancel;

    @FindBy(xpath = "//android.widget.Button[@text='Add ADD']")
    public MobileElement add;

    @FindBy(xpath = "//android.widget.EditText[@clickable='true']")
    public MobileElement searchEntity;

    @FindBy(xpath = "//android.widget.Button[@text='search']")
    public MobileElement searchButton;

    @FindBy(xpath = "(//android.view.View[@clickable='true'])[4]")
    public MobileElement firstEntitys;

    @FindBy(xpath = "//android.widget.Button[@text='All']")
    public MobileElement all;

    @FindBy(xpath = "//android.widget.Button[@text='In progress']")
    public MobileElement inProgress;

    @FindBy(xpath = "//android.widget.Button[@text='Completed']")
    public MobileElement completed;

    @FindAll({
    	@FindBy(xpath = "//android.widget.Button[@text='Observe again']"),
    	@FindBy(xpath = "//android.widget.Button[@text='Observe Again']")
	})
    public MobileElement observeAgain;

    @FindBy(xpath = "//android.widget.Button[@text='View entity report']")
    public MobileElement viewEntityReport;

    @FindBy(xpath = "(//android.widget.Image[@index='3'])[1]")
    public MobileElement verticalOutline;

    @FindBy(xpath = "//android.widget.Button[@text='EDIT']")
    public MobileElement edit;

    @FindBy(xpath = "//android.widget.Button[@text='DELETE']")
    public MobileElement delete;

    @FindBy(xpath = "//android.widget.Button[@@text='VIEW DETAILS']")
    public MobileElement viewDetails;


    @FindBy(xpath = "//android.widget.TextView[@text='Alert']")
    public MobileElement alertProfileTitle;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Observation With Rubrics')]")
    public MobileElement observationWithRubric;

    @FindBy(xpath = "(//android.widget.TextView)[4] ")
    public MobileElement firstEntityInList;


    @FindBy(xpath = "//android.widget.TextView[@text='Observation 1']")
    public MobileElement firstObservationSubmission;

    @FindBy(xpath = "(//android.widget.Image[@text='ellipsis vertical outline'])[1]")
    public MobileElement threeDotOnObservation;

    @FindBy(xpath = "//android.widget.Button[@text='EDIT']")
    public MobileElement editObservationSubmission;

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    public MobileElement deleteObservationSubmission;

    @FindBy(xpath = "//android.widget.Button[@text='Yes']")
    public MobileElement observationSubmissionDeleteYes;

    @FindBy(xpath = "//android.widget.Button[@text='No']")
    public MobileElement observationSubmissionDeleteNo;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Hp_tna_for_skill_and_mindset')]")
    public MobileElement entityObservataionToDelete;

    @FindBy(xpath = "//android.widget.Image[@text='trash']")
    public MobileElement deleteIconOnEntity;

    @FindBy(xpath = "//android.widget.TextView[@text='Add entity to observe']")
    public MobileElement addEntityToObserveTitle;

    @FindBy(xpath = "//android.widget.Button[@text='Yes']")
    public MobileElement entityDeleteConfirmationYes;

    @FindBy(xpath = "//android.widget.Button[@text='No']")
    public MobileElement entityDeleteConfirmationNo;

    @FindBy(xpath = "//android.widget.Button[@text='arrow forward Start Observation']")
    public MobileElement startObservation;

    @FindBy(xpath = "//android.widget.Button[@text='eye View Observation']")
    public MobileElement viewObservation;

    @FindBy(xpath = "//android.widget.Button[@text='Cancel']")
    public MobileElement cancelObservation;

    @FindBy(xpath = "(//android.widget.RadioButton[contains(@text,'Google Forms')])[2]")
    public MobileElement googleFormRadioOption;

    @FindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement nextButtonOnQuestionPage;

    @FindBy(xpath = "//android.widget.Button[@text='back Back']")
    public MobileElement backButtonOnQuestionPage;

    @FindBy(xpath = "//android.widget.Button[@text='back']")
    public MobileElement backButtonOnTopOfQuestionPage;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Observation 1\"]")
    public MobileElement observation1;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Observation 2\"]")
    public MobileElement observation2;
    
    @FindBy(xpath = "(//android.view.View//android.view.View)[15]")
    public MobileElement firstDomain;

    @FindBy(xpath = "(//android.view.View//android.view.View)[19]")
    public MobileElement hpdomain;

    ///


    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Sb-23907 : Observation With Rubric Targeted -- Fd 249')]")
    public MobileElement entityObservataionToDeleteAfterSubmission;


    @FindBy(xpath = "//android.widget.TextView[@text='Observation 2']")
    public MobileElement secondObservationSubmission;


    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Obs Without Rubric - Fd 137')]")
    public MobileElement entityObservataionWithoutRubric;


    @FindBy(xpath = "//android.widget.Button[@text='eye View Observation']")
    public MobileElement viewObsercation;

    @FindBy(xpath = "//android.widget.Button[@text='Cancel']")
    public MobileElement cancleObsercation;


    @FindBy(xpath = "//android.widget.TextView[@text='Domains']")
    public MobileElement domainPageTitle;


    @FindBy(xpath = "//android.widget.TextView[@text='Domain 2']")
    public MobileElement secondDomain;

    @FindBy(xpath = "//android.widget.TextView[@text='Domain 3']")
    public MobileElement thirdDomain;

    @FindBy(xpath = "//android.widget.TextView[@text='Domain 4']")
    public MobileElement fourthDomain;

    @FindBy(xpath = "//android.widget.TextView[@text='Planning & Execution']")
    public MobileElement planningAndExecutionObservation;

    @FindBy(xpath = "//android.widget.EditText")
    public MobileElement textInputForQuestionaries;

    @FindBy(xpath = "//android.widget.Button[@text='save SAVE']")
    public MobileElement saveButtonForQuestionaries;

    @FindBy(xpath = "//android.widget.TextView[@text='In progress']")
    public MobileElement inProgressStatus;

    //elements for chrome page
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/terms_accept\"]")
    public MobileElement acceptButtonForChrome;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]")
    public MobileElement yesIamInButtonForChrome;

    @FindBy(xpath = "(//android.widget.TextView)[3]")
    public MobileElement addEntityPageObservationTitle;

    @FindBy(xpath = "(//android.widget.TextView)[9]")
    public MobileElement observationListItemName;

    @FindBy(xpath = "//android.widget.TextView[contians(@text,\" + oname + \"")
    public MobileElement observationListItemNamedynamic;

    @FindBy(xpath = "//android.widget.TextView[@text='Hp Domain']")
    public MobileElement firstHpDomain;

    @FindBy(xpath = "//android.widget.TextView[@text='HP Domain']")
    public MobileElement firstObservationUnderHpDomain;

    @FindBy(xpath = "//android.widget.Button[@text='Question map']")
    public MobileElement questionMap;

    @FindBy(xpath = "//android.view.View[contains(@text,'1')]")
    public MobileElement question1;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"ion-rb-40\"]")
    public MobileElement firstRadioButtonForFirstQuestion;

    @FindBy(xpath = "//android.widget.Button[@text='All']")
    public MobileElement AllTabForSubmission;

    @FindBy(xpath = "//android.widget.Button[@text='In progress']")
    public MobileElement inProgressTabForSubmission;

    @FindBy(xpath = "//android.widget.Button[@text='Completed']")
    public MobileElement completedTabForSubmission;

    @FindBy(xpath = "//android.view.View[contains(@text,'2')]")
    public MobileElement question2;

    @FindBy(xpath = "//android.view.View[contains(@text,'3')]")
    public MobileElement question3;

    @FindBy(xpath = "//android.view.View[contains(@text,'4')]")
    public MobileElement question4;

    @FindBy(xpath = "//android.view.View[contains(@text,'5')]")
    public MobileElement question5;

    @FindBy(xpath = "//android.view.View[contains(@text,'6')]")
    public MobileElement question6;

    @FindBy(xpath = "//android.view.View[contains(@text,'7')]")
    public MobileElement question7;

    @FindBy(xpath = "//android.view.View[contains(@text,'8')]")
    public MobileElement question8;

    @FindBy(xpath = "//android.view.View[contains(@text,'9')]")
    public MobileElement question9;

    @FindBy(xpath = "//android.view.View[contains(@text,'bulb')]")
    public MobileElement bulbIcon;

    @FindBy(xpath = "(//android.view.View[contains(@text,'1')]//following::android.widget.Button)[1]")
    public MobileElement dateFieldForQuestion1;

    @FindBy(xpath = "(//android.view.View[contains(@text,'2')]//following::android.widget.EditText)[1]")
    public MobileElement inputTextForQuestion2;

    @FindBy(xpath = "(//android.view.View[contains(@text,'2')]//following::android.widget.EditText)[1]")
    public MobileElement yesRadioButtonForQuestion3;

    //sqaa observation for not applicable testcase and search
    @FindBy(xpath = "(//android.widget.TextView[contains(@text,'Sqaa- For Testing')])[1]")
    public MobileElement searchedObservation;
    
    @FindBy(xpath = "//android.widget.Button[contains(@text,'search')]")
    public MobileElement addEntitySearchButton;
}
