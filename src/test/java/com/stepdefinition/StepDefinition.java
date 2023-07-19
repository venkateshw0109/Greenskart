package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@Before
	public void itsBeforeHooks() throws IOException {

		screenShot("beforeHooks");
	}
	
	@After
	public void itsAfterHooks() throws IOException {

		screenShot("afterHooks");
	}

	@Given("User launch the browser and url")
	public void user_launch_the_browser_and_url() throws IOException {
		String url = File_Reader_Manager.getInstanceCr().getUrl();
		getUrl(url);
	}

	@When("User search cucumber vegetable in searchbox")
	public void user_search_cucumber_vegetable_in_searchbox() {

		pom.getInstancePomPage01().getSearchBox().sendKeys("Cucumber");

	}

	@When("User click the add to cart button")
	public void user_click_the_add_to_cart_button() throws InterruptedException {

		Thread.sleep(2000);
		pom.getInstancePomPage01().getAddToCart().click();
	}

	@When("User Click the items icon")
	public void user_click_the_items_icon() {

		pom.getInstancePomPage01().getItems().click();
	}

	@When("User click the proceed to checkout")
	public void user_click_the_proceed_to_checkout() {

		pom.getInstancePomPage01().getProceedToCheckOut().click();
	}

	@Then("payment page shown")
	public void payment_page_shown() throws InterruptedException {

		System.out.println("Next page");
		Thread.sleep(2000);
	}

	@When("user enter the promo code")
	public void user_enter_the_promo_code() throws InterruptedException {

		pom.getInstancePomPage02().getPromoCode().sendKeys("1234");
		Thread.sleep(2000);
	}

	@When("user click the apply button")
	public void user_click_the_apply_button() {

		pom.getInstancePomPage02().getApply().click();
	}

	@When("user click the place order button")
	public void user_click_the_place_order_button() {

		pom.getInstancePomPage02().getPlaceOrder().click();
	}

	@When("User select the country")
	public void user_select_the_country() {

		Select s = new Select(pom.getInstancePomPage03().getCountry());
		s.selectByValue("India");
	}

	@When("User click the agree button")
	public void user_click_the_agree_button() {

		pom.getInstancePomPage03().getAgree().click();
	}

	@When("user click the proceed button")
	public void user_click_the_proceed_button() {

		pom.getInstancePomPage03().getProceed().click();
	}

}
