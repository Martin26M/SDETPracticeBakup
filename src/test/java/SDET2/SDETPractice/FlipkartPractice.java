package SDET2.SDETPractice;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FlipkartPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);

		if (driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).isDisplayed()) {
			driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();

		}
		a.moveToElement(driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[5]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a[8]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//span[@class='xtXmba']//following-sibling::a[4]"))).click()
				.build().perform();
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_4ddWXP'][1]/a[2]"));

		for (WebElement res : list) {

			if (res.getText().equalsIgnoreCase("Electrobot Core 2 Duo (4 GB RAM/Intel Onboard Graphics ...")) {

				res.click();
			}

		}

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();

		String Parent = it.next();
		String child = it.next();

		driver.switchTo().window(child);
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
		Thread.sleep(5000);
		String TotalAmount = driver
				.findElement(By.xpath("//div[@class='Ob17DV']/div//following-sibling::span/div/div/span")).getText();
		
		TotalAmount = TotalAmount.replaceAll("[^0-9]", "");
		System.out.println(TotalAmount);
		if (TotalAmount.equalsIgnoreCase(ExcelRead.getcelldata())) {

			System.out.println("Amount is correct");
			
			
		}

	}

}
