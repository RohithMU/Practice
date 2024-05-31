package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements 
{
public WebDriver driver;
public By Email = By.xpath("//*[@id=\"Email\"]");
public By Password = By.xpath("//*[@id=\"Password\"]");
public By Login_In = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");

public Elements(WebDriver driver) 
{
	this.driver=driver;
}
//public By Password = By.xpath("//*[@id=\"Password\"]");
//public By Password = By.xpath("//*[@id=\"Password\"]");
public void dfind(By ele) 
{
    WebElement element = driver.findElement(ele);
    element.click();
}
public void dfind(By ele, String text) 
{
	WebElement element = driver.findElement(ele);
	element.sendKeys(text);
}
}