package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "(//a[@class='bx-ilike-text'])[2]")
    public WebElement commentLikeButton;

    @FindBy(xpath = "//span[@data-reaction='like']")
    public WebElement commentLikeIcon;

    @FindBy(xpath = "//a[@class='feed-com-reply feed-com-reply-Y']")
    public WebElement replyButton;

    @FindBy(xpath = "//span[@class='feed-content-view-cnt']")
    public WebElement revieverIcon;

    @FindBy(xpath = "//span[@class='bx-contentview-popup-name-new']")
    public WebElement firstVisitorElement;

    @FindBy(xpath ="(//div[@title='Add to favorites'])[1]")
    public WebElement starIconBefore;

    @FindBy(xpath = "//div[@title='Remove from favorites']")
    public WebElement starIconAfter;

    @FindBy(className = "main-ui-filter-search-filter")
    public WebElement searchBtn;

    @FindBy(xpath = "//span[text()='Favorites']")
    public WebElement favoriteElement;

    @FindBy(xpath = "//a[@class='feed-post-user-name']")
    public List<WebElement> favariteList;


}
