package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalPage extends BasePage{

    @FindBy(xpath = "//a[@class='bx-ilike-text']")
    public WebElement likeBtn;

    @FindBy(xpath = "//span[@title='Like']")
    public WebElement likeIcon;

    @FindBy(xpath = "//a[text()='Follow']")
    public WebElement followBtn;

    @FindBy(xpath = "//a[text()='Unfollow']")
    public WebElement unfollowBtn;

    @FindBy(xpath = "//span[@class='feed-inform-comments']")
    public WebElement commentElement;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement msgBoxElement;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-sm ui-btn-primary']")
    public WebElement sendButton;

    @FindBy(xpath ="//div[@class='feed-com-main-content feed-com-block-old feed-com-block-read']")
    public WebElement msgResultElement;

}
