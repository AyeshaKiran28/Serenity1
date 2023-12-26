package com.stepdefination;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.pagesg.Serenity_PagesG;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Stepdefinition_gg extends Serenity_PagesG{

	
	@Steps
	Serenity_PagesG sdp;
	
	
	
	@Given("To launch the myntra website")
	public void to_launch_the_myntra_website() {
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

	}

	@When("To mouseover houseandliving")
	public void to_mouseover_houseandliving() {
	    sdp.to_mouseover_houseandliving();
	}

	@When("To click the string lights")
	public void to_click_the_string_lights() {
	  sdp.to_click_the_string_lights();
	}

	@When("To click the homesake")
	public void to_click_the_homesake() throws InterruptedException, AWTException {
		sdp.to_click_the_homesake();
	}

	@Then("To validate the homesake page")
	public void to_validate_the_homesake_page() {
		sdp.to_validate_the_homesake_page();
	}

	@When("To click the add to bag")
	public void to_click_the_add_to_bag() throws InterruptedException {
		sdp.to_click_the_add_to_bag();
	}

	@When("To click the bag icon")
	public void to_click_the_bag_icon() {
		sdp.to_click_the_bag_icon();
	}

	@When("To click the place order")
	public void to_click_the_place_order() {
		sdp.to_click_the_place_order();
	}


	
	
}
