package Page;


import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public int randomGenretaor(int i)
	{
		Random rnd = new Random();
		int randomNumber=rnd.nextInt(999);
		return randomNumber;
	}
	
	public void selectDropdown(WebElement element, String visibleText)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	public void waitForElement(WebDriver driver, int timeInSecond, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
}
