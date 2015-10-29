package com.luchik.jbehave;

import com.luchik.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;


    @BeforeScenario      //the user is on the Google home page input text '1-1'
    public void givenTheGoogle() {
        endUser.is_the_home_page();
        endUser.enter1();
    }


    @Given("the user clear the board in the calculator")
    public void givenTheUserIsOnTheGoogle() {
        endUser.cleanResult();

    }

    @When("the user input '$data'")
    public void whenTheUsernterDataFromKeyBoard(String data) {
        endUser.inputFromKey(data);
    }

    @When("the user performs using button 'numberButton'")
    public void whenTheUsernterDataUsingData(String numberButton) {
        endUser.clicButtonByHandExpression(numberButton);
    }

    @Then("they should see the definition '$result'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String result) {
        endUser.should_see_definition(result);
    }
}
