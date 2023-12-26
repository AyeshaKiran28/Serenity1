package com.pagesg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class Serenity_PagesG extends PageObject{
	
	@Managed
	public static WebDriver driver;
	
	
	
	@Step
	public void to_mouseover_houseandliving() {
	    Actions mO = new Actions(getDriver());
	    mO.moveToElement($(By.xpath("(//a[text()='Home & Living'])[1]"))).build().perform();
	}
	
	@Step
	public void to_click_the_string_lights() {
	  $(By.xpath("//a[text()='String Lights']")).click();
	}

	@Step
	public void to_click_the_homesake() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		////h3[text()='Homesake'])[1]
		/*
		 * Robot ser = new Robot(); ser.keyPress(KeyEvent.VK_KP_DOWN);
		 * ser.keyRelease(KeyEvent.VK_KP_DOWN);
		 */
		//Thread.sleep(2000);
		
		$(By.className("img-responsive")).click();
		
	
		//JavascriptExecutor a = (JavascriptExecutor)driver;
	
	}

	@Step
	public void to_validate_the_homesake_page() {
		String actual = getTitle();
		System.out.println(actual);
		String expected = "Stringlight - Buy Stringlight online in India";
		Assert.assertEquals(actual, expected);
	}
	
	@Step
	
	public void to_click_the_add_to_bag() throws InterruptedException {
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> childWindowHandles = driver.getWindowHandles();
		for (String all : childWindowHandles ) {
			driver.switchTo().window(all);
		}

		Thread.sleep(4000);
		$(By.xpath("//div[text()='ADD TO BAG']")).click();
		//String text = $(By.xpath("//h1[text()='Homesake']")).getText();
		//System.out.println(text);
	}

	@Step
	public void to_click_the_bag_icon() {
		$(By.xpath("//span[text()='Bag']")).click();
	}

	@Step
	public void to_click_the_place_order() {
		$(By.xpath("//div[text()='PLACE ORDER']")).doubleClick();
	}

	
	

}
