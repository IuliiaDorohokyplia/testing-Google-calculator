package com.luchik.steps;

import com.luchik.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;


public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;


    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void enter1() {
        dictionaryPage.openCalculator();
    }

    public void cleanResult() {
        dictionaryPage.clean();
    }
    @Step
    public void inputFromKey(String keyword) {
        dictionaryPage.enterExpressionByKeyboard(keyword);
    }

    @Step
    public void should_see_definition(String definition) {
        assertEquals(definition, dictionaryPage.getTextResult());
    }

    @Step
    public void clicButtonByHandExpression(String button2) {
        dictionaryPage.enterExpression(button2);
    }

}