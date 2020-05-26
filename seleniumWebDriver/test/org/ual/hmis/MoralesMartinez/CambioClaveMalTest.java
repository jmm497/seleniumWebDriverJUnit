// Generated by Selenium IDE
package org.ual.hmis.MoralesMartinez;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CambioClaveMalTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//ChromeOptions chromeOptions = new ChromeOptions();
			//chromeOptions.setHeadless(true);
		    //driver = new ChromeDriver(chromeOptions);
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setHeadless(true);
		    driver = new FirefoxDriver(firefoxOptions);
		    
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    //driver.quit();
  }
  @Test
  public void cambioClaveMal() {
    driver.get("https://practica9web20200525143751.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1296, 1400));
    
    assertThat(driver.findElement(By.linkText("Register")).getText(), is("Register"));
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys("123-Abc");
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("123-Abc");
    assertThat(driver.findElement(By.id("registerSubmit")).getText(), is("Register"));
    driver.findElement(By.id("registerSubmit")).click();
    assertThat(driver.findElement(By.id("confirm-link")).getText(), is("Click here to confirm your account"));
    driver.findElement(By.id("confirm-link")).click();
    driver.findElement(By.cssSelector("html")).click();
    
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("123-Abc");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello "+vars.get("emailrandom").toString()+ "!")).click();
    assertThat(driver.findElement(By.id("change-password")).getText(), is("Password"));
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).clear();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("abc");
    driver.findElement(By.id("Input_NewPassword")).click();
    driver.findElement(By.id("Input_NewPassword")).clear();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("Abc-123");
    driver.findElement(By.id("Input_ConfirmPassword")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).clear();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Abc-123");
    assertThat(driver.findElement(By.cssSelector(".btn-primary")).getText(), is("Update password"));
    driver.findElement(By.cssSelector(".btn-primary")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Incorrect password."));
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).clear();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("123-Abc");
    driver.findElement(By.id("Input_NewPassword")).clear();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("aaa");
    {
      WebElement element = driver.findElement(By.id("Input_ConfirmPassword"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("change-password-form"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("change-password-form")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).clear();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("aaa");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The New password must be at least 6 and at max 100 characters long."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("Practica9Web")).click();
    driver.close();
  }
}