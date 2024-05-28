package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements 
{
public WebDriver driver;
public By Email = By.xpath("//*[@id=\"Email\"]");
public Elements(WebDriver driver)
{
	this.driver=driver;
}
public void dfind(By ele) {
    WebElement element = driver.findElement(ele);
    element.click();
}
}