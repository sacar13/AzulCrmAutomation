package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.pages.PortalPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class PortalStepDefs {

    LoginPage loginPage = new LoginPage();
    PortalPage portalPage=new PortalPage();

    @Given("the user logged in")
    public void the_user_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        loginPage.login(username,password);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("the titles are not equal","Portal",actualTitle);
    }

    @When("the user to clicks the like button on any Employee post")
    public void the_user_to_clicks_the_like_button_on_any_Employee_post() {
        portalPage.likeBtn.click();
        BrowserUtils.waitForPageToLoad(2);

    }

    @Then("the user should be able see the like icon on the screen")
    public void the_user_should_be_able_see_the_like_icon_on_the_screen() {
        Assert.assertTrue("like icon is not displayed",portalPage.likeIcon.isDisplayed());

    }

    @Then("the user clicks the follow button on any Employee post")
    public void the_user_clicks_the_follow_button_on_any_Employee_post() {
        portalPage.followBtn.click();
    }

    @Then("the user should be able see the follow button changed as unfollow")
    public void the_user_should_be_able_see_the_follow_button_changed_as_unfollow() {
        Assert.assertTrue("unfollow button is not displayed",portalPage.unfollowBtn.isDisplayed());
    }

    @Then("the user to clicks the comment button on any Employee post")
    public void the_user_to_clicks_the_comment_button_on_any_Employee_post() {
        portalPage.commentElement.click();
        BrowserUtils.waitForPageToLoad(2);

    }

    @Then("the user type {string} into the comment box")
    public void the_user_type_into_the_comment_box(String message) {
        Driver.get().switchTo().frame(0);
        portalPage.msgBoxElement.sendKeys(message);
        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitForPageToLoad(2);

    }

    @Then("the user clicks the send button")
    public void the_user_clicks_the_send_button() {
        portalPage.sendButton.click();
        BrowserUtils.waitForPageToLoad(2);
    }

    @Then("the user should be able to send the message")
    public void the_user_should_be_able_to_send_the_message() {
        Assert.assertTrue("the message is not displayed",portalPage.msgResultElement.isDisplayed());
    }

}
