package pageobjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.baseclass;

public class mainPage extends baseclass
{
	
	public mainPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
  
  //news links
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[1]/div/div/div/div[2]/div/a")
  public WebElement newsno1;
  
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[2]/div/div/div/div[2]/div/a")
  public WebElement newsno2;
  
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[3]/div/div/div/div[2]/div/a")
  public WebElement newsno3;
  
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[4]/div/div/div/div[2]/div/a")
  public WebElement newsno4;
  
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[5]/div/div/div/div[2]/div/a")
  public WebElement newsno5;
  
  //TipTop
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[1]/div/div/div/div[2]/div/a")
  public WebElement tiptop1;
  
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[1]/div/div/div/div[2]/div/a")
  public WebElement tiptop2;
  
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[1]/div/div/div/div[2]/div/a")
  public WebElement tiptop3;
  
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[1]/div/div/div/div[2]/div/a")
  public WebElement tiptop4;
  @FindBy(xpath="//div[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div[1]/div/div/div/div[2]/div/a")
  public WebElement tiptop5;
  
  //user info links
  @FindBy(xpath="//*[@id='O365_MainLink_MePhoto']/div/div/div/div/div[2]")
  public WebElement userInfoIcon;
  
  @FindBy(id="mectrl_currentAccount_primary")
  public WebElement userInfoName;
  
  @FindBy(id="mectrl_currentAccount_secondary")
  public WebElement userInfoMail;
  
  //displayed news link
  @FindBy(xpath="//*[@id='4f7e87d5-f184-4501-8008-0ee4b0a38fcf']")
  public WebElement newAll;
  
  //description links
  @FindBy(xpath="//*[@id='title_text']")
  public WebElement newstitle;
  @FindBy(xpath="//div[@class='jg_z_9f38462c']")
  public WebElement authorname;
  @FindBy(xpath="//*[@id=\"spPageCanvasContent\"]/div/div/div/div/div/div/div[1]")
  public WebElement data;
  @FindBy(xpath="//*[@id='c6c4fb50-d4a7-4791-81f8-a4f069ac45f3']/div/div/div")
  public WebElement data2;
  
  //shareButton
  @FindBy(xpath="//*[@id='share']/span/i[2]")
  public WebElement shareicon;
//  
  @FindBy(xpath="//span[text()='Share page']")
  public WebElement sn1;
  @FindBy(xpath="//span[text()='Copy link to page']")
  public WebElement sn2;
  @FindBy(xpath="//span[text()='Send to email']")
  public WebElement sn3;
  
  //likeNviews
  public @FindBy(id="vpc_Page.CommentsWrapper.internal.2610b4b4-550c-4548-b431-aa3ab709c184")
	WebElement scroll;
  @FindBy(xpath="//*[@id='vpc_Page.CommentsWrapper.internal.2610b4b4-550c-4548-b431-aa3ab709c184']/div/div/aside/div/button/span/span/span")
  public List<WebElement> lNV;


  
  public @FindBy(xpath="//div[@class='jg_z_9f38462c']")
  WebElement authoR;
  public @FindBy(xpath="//*[@id=\"LPCPseudoTabbableElement\"]/div[1]/section/div[1]/div/div[1]/h1")
  WebElement authorsName;
  public @FindBy(xpath="//*[@id=\"LPCPseudoTabbableElement\"]/div[1]/section/div[1]/div/div[2]")
  WebElement authorsRole;

}
