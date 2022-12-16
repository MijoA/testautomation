package hu.masterfield.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    SelenideElement logo = $(byClassName("toolbar-element"));



    public void controlHomePage() throws InterruptedException {
        logo.shouldBe(Condition.visible).shouldBe(Condition.enabled);
        Thread.sleep(7000);
    }
}
