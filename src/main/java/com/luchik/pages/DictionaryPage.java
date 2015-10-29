package com.luchik.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

@DefaultUrl("https://www.google.com.ua")
public class DictionaryPage extends PageObject {

    @FindBy(id = "lst-ib")
    private WebElementFacade searchTerms;

    @FindBy(name = "btnG")
    private WebElementFacade lookupButton;

    @FindBy(id = "cwmcwd")
    private WebElementFacade calculator;



    @FindBy(id = "cwbt06")
    private WebElementFacade number;

    @FindBy(id = "cwos")
    private WebElementFacade result;

    @FindBy(className = "cwcd cwbbc")
    private WebElement ButtonBlock;

    @FindBy(css=".cwcd.cwbbc")
    private WebElement allButton;


    public void openCalculator() {
        searchTerms.sendKeys("1-1");
        lookupButton.click();
        waitFor(ExpectedConditions.visibilityOf(calculator));
    }

    public void clean() {
        number.click();
    }

    public String getTextResult() {
        result.getText();
        return result.getText();
    }


    public void enterExpressionByKeyboard(String expression) {
        Actions enterByKeyboard = new Actions(getDriver());
        enterByKeyboard.sendKeys(result, expression.replaceAll("\\s", ""), Keys.ENTER).perform();
    }

    public void enterExpressionByButtons(String button) {
        List<WebElement> buttonsArray = allButton.findElements(By.cssSelector("div>div>div>span"));
        for (WebElement b : buttonsArray) {
            if (b.getText().equals(button)) {
                b.click();
            }
        }
    }

    public void enterExpression(String button) {
        char[] arraySymbol=button.toCharArray();
        for (int i=0;i<arraySymbol.length;i++){
            enterExpressionByButtons(Character.toString(arraySymbol[i]));
        }
    }

}

