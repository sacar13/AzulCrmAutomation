package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.pages.PortalPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

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
        BrowserUtils.waitForPageToLoad(5);
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
        //BrowserUtils.waitForPageToLoad(2);
    }

    @Then("the user should be able to send the message")
    public void the_user_should_be_able_to_send_the_message() {
        Assert.assertTrue("the message is not displayed",portalPage.msgResultElement.isDisplayed());
    }

    @When("the user clicks the like button on the reviewers' comments.")
    public void the_user_clicks_the_like_button_on_the_reviewers_comments() {
        portalPage.commentLikeButton.click();
        //BrowserUtils.waitFor(1);
    }

    @Then("the user should be able see the comment-like icon on the screen")
    public void the_user_should_be_able_see_the_comment_like_icon_on_the_screen() {
        Assert.assertTrue(portalPage.commentLikeIcon.isDisplayed());
    }

    @Then("the user to clicks the reply button on any other reviewers' comments.")
    public void the_user_to_clicks_the_reply_button_on_any_other_reviewers_comments() {
        portalPage.replyButton.click();
    }

    @When("the user clicks on reviewers' icon on any Employee post")
    public void the_user_clicks_on_reviewers_icon_on_any_Employee_post() throws InterruptedException {
        portalPage.revieverIcon.click();
        Thread.sleep(5);
        BrowserUtils.waitForPageToLoad(2);

    }

    @When("the user clicks on the first reviewers' name")
    public void the_user_clicks_on_the_first_reviewers_name() {
        portalPage.firstVisitorElement.click();
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("the user should be able to visit the reviewers' profile")
    public void the_user_should_be_able_to_visit_the_reviewers_profile() {
        String currentWindowHandle = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles();
        for(String each : windowHandles){
            if (!each.equals(currentWindowHandle)){
                Driver.get().switchTo().window(each);
            }
        }
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("titles are not equal","hr6@cybertekschool.com",actualTitle);

        Driver.get().switchTo().window(currentWindowHandle);
    }

    @When("the clicks the star icon on the first employees post")
    public void the_clicks_the_star_icon_on_the_first_employees_post() {
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(portalPage.starIconBefore);
    }

    @Then("the user should be able add the favorites")
    public void the_user_should_be_able_add_the_favorites() {
        //Assert.assertTrue("Star icon is not changed",portalPage.starIconBefore.isDisplayed());
        portalPage.searchBtn.click();
        portalPage.favoriteElement.click();
        BrowserUtils.waitFor(5);
        List<String> elementsText = BrowserUtils.getElementsText(portalPage.favariteList);
        Assert.assertTrue(elementsText.contains("hr14@cybertekschool.com"));
    }












}
