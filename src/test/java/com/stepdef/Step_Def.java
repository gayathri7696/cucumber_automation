package com.stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.automation.runner.Test_Runner;
import com.base.Base_class;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.object.Page_Object_Manager;
import com.property.reader.File_Reader_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Step_Def extends Base_class {
	public static WebDriver driver=Test_Runner.driver;
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	@Given("user Launch The Application")
	public void user_launch_the_application() throws Throwable {
		String url=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_config_url();
		geturl(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("user Clicks The Signin Page")
	public void user_clicks_the_signin_page() {

		pom.get_Instance_Hp().getSignin_btn();
		click(pom.get_Instance_Hp().getSignin_btn());
	}
	@When("user Enter Emailid In Emailid Field")
	public void user_enter_emailid_in_emailid_field() throws Throwable {
		pom.get_Instance_loginpg().getEmail();
		//String username=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Automation test case.xlsx", 2, 5);
		String username=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Instance_email();
		sendkeys(pom.get_Instance_loginpg().getEmail(),username);
	}
	@When("user Enter Password In Password Field")
	public void user_enter_password_in_password_field() throws Throwable {
		pom.get_Instance_loginpg().getPassword();
		//String password=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Automation test case.xlsx", 8, 5);
		String password=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Instance_password();
		sendkeys(pom.get_Instance_loginpg().getPassword(), password);
	}
	@Then("user Clicks Signin Button And Navigates To Home Page")
	public void user_clicks_signin_button_and_navigates_to_home_page() {
		pom.get_Instance_loginpg().getSignin_btn();
		click(pom.get_Instance_loginpg().getSignin_btn());
	}
	@When("user Click Women")
	public void user_click_women() {
		pom.get_Instance_Hp().getWomen();
		click(pom.get_Instance_Hp().getWomen());
	}
	@When("user Clicks The Dress")
	public void user_clicks_the_dress() {
		pom.get_Instance_womenpg().getComposition();
		scroll(pom.get_Instance_womenpg().getComposition());
		pom.get_Instance_womenpg().getImage();
		click(pom.get_Instance_womenpg().getImage());
	}
	@When("user Clicks Addtocart")
	public void user_clicks_addtocart() {
		pom.get_Instance_cart().getAddtocart();
		click(pom.get_Instance_cart().getAddtocart());
	}
	@When("user Clicks Proceed To Checkout")
	public void user_clicks_proceed_to_checkout() throws InterruptedException {
		pom.get_Instance_cc().getCheckout();
		Thread.sleep(3000);
		click(pom.get_Instance_cc().getCheckout());
		
	}
	@When("user Clicks Proceed To Summary Checkout")
	public void user_clicks_proceed_to_summary_checkout() {
		pom.get_Instance_sumcc().getSummaryckot();
		click(pom.get_Instance_sumcc().getSummaryckot());
		
	}
	@When("user Clicks Proceed To Address Checkout")
	public void user_clicks_proceed_to_address_checkout() {
		pom.get_Instance_addresscc().getAddresschout();
		click(pom.get_Instance_addresscc().getAddresschout());
	}
	@When("user Clicks Terms Checkbox")
	public void user_clicks_terms_checkbox() {
		pom.get_Instance_shipping().getTerms();
		click(pom.get_Instance_shipping().getTerms());
	}
	@When("user Clicks Proceed To Shipping Checkout")
	public void user_clicks_proceed_to_shipping_checkout() {
		pom.get_Instance_shipping().getShipping_checkout();
		click(pom.get_Instance_shipping().getShipping_checkout());
	   
	}
	@When("user Clicks Pay By Bankwire")
	public void user_clicks_pay_by_bankwire() {
		
		pom.get_Instance_payment().getPaybybank();
		click(pom.get_Instance_payment().getPaybybank());
	}
	
	@When("user Clicks Conform My Order")
	public void user_clicks_conform_my_order() throws IOException {
		pom.get_Instance_order().getOder();
		click(pom.get_Instance_order().getOder());
		javascript();
		screenshot("img1.png");
	}
	@Then("user Clicks Logout Button")
	public void user_clicks_logout_button() {

		click(pom.get_Instance_Logout().getLogout());
	}
	@When("user Clicks Dresses")
	public void user_clicks_dresses() {
		click(pom.get_Instance_Hp().getDress());
	    
	}
	
	@When("user Clicks Evening Dresses")
	public void user_clicks_evening_dresses() {
		click(pom.get_Instance_dress().getEve_dress());
	}
	@When("user Clicks The Dress2")
	public void user_clicks_the_dress2() {
		javascript();
		click(pom.get_Instance_eve_dress().getImg());
	}
	@When("user Clicks Addtocart2")
	public void user_clicks_addtocart2() throws InterruptedException {
		javascript();
		frame_in(0);
		pom.get_Instance_cart().getAddtocart();
		Thread.sleep(10000);
		click(pom.get_Instance_cart().getAddtocart());
		frame_out();
	}
	@When("user Clicks Proceed To Checkout2")
	public void user_clicks_proceed_to_checkout2() throws InterruptedException {
		pom.get_Instance_cc().getCheckout();
		Thread.sleep(3000);
		click(pom.get_Instance_cc().getCheckout());
	    
	}
	@When("user Clicks Proceed To Summary Checkout2")
	public void user_clicks_proceed_to_summary_checkout2() {
		pom.get_Instance_sumcc().getSummaryckot();
		click(pom.get_Instance_sumcc().getSummaryckot());
	   
	}
	@When("user Clicks Proceed To Address Checkout2")
	public void user_clicks_proceed_to_address_checkout2() {
		pom.get_Instance_addresscc().getAddresschout();
		click(pom.get_Instance_addresscc().getAddresschout());
	    
	}
	@When("user Clicks Terms Checkbox2")
	public void user_clicks_terms_checkbox2() {
		pom.get_Instance_shipping().getTerms();
		click(pom.get_Instance_shipping().getTerms());
	   
	}
	@When("user Clicks Proceed To Shipping Checkout2")
	public void user_clicks_proceed_to_shipping_checkout2() {
		
		pom.get_Instance_shipping().getShipping_checkout();
		click(pom.get_Instance_shipping().getShipping_checkout());
	     
	}
	@When("user Clicks Pay By Bankwire2")
	public void user_clicks_pay_by_bankwire2() {
		pom.get_Instance_payment().getPaybybank();
		click(pom.get_Instance_payment().getPaybybank());
	   
	}
	@When("user Clicks Conform My Order2")
	public void user_clicks_conform_my_order2() throws IOException {
		pom.get_Instance_order().getOder();
		click(pom.get_Instance_order().getOder());
		javascript();
		screenshot("img2.png");
	   
	}
	@Then("user Clicks Logout Button2")
	public void user_clicks_logout_button2() {
		click(pom.get_Instance_Logout().getLogout());
	   
	}
	@When("user Clicks Tshirt")
	public void user_clicks_tshirt() {
		click(pom.get_Instance_Hp().getTshirt());
	}

	@When("user Clicks The Dress3")
	public void user_clicks_the_dress3() {
		javascript();
		pom.get_Instance_tshirtpg().getTshirt_img();
		click(pom.get_Instance_tshirtpg().getTshirt_img());
	}
	
	@When("user Clicks Addtocart3")
	public void user_clicks_addtocart3() {
		frame_in(0);
		pom.get_Instance_cart().getAddtocart();
		click(pom.get_Instance_cart().getAddtocart());
		frame_out();  
	}
	@When("user Clicks Proceed To Checkout3")
	public void user_clicks_proceed_to_checkout3() throws InterruptedException {
		pom.get_Instance_cc().getCheckout();
		Thread.sleep(3000);
		click(pom.get_Instance_cc().getCheckout());    
		}
	@When("user Clicks Proceed To Summary Checkout3")
	public void user_clicks_proceed_to_summary_checkout3() {
		pom.get_Instance_sumcc().getSummaryckot();
		click(pom.get_Instance_sumcc().getSummaryckot());
	   
	}
	@When("user Clicks Proceed To Address Checkout3")
	public void user_clicks_proceed_to_address_checkout3() {
		pom.get_Instance_addresscc().getAddresschout();
		click(pom.get_Instance_addresscc().getAddresschout());
	}
	@When("user Clicks Terms Checkbox3")
	public void user_clicks_terms_checkbox3() {
		pom.get_Instance_shipping().getTerms();
		click(pom.get_Instance_shipping().getTerms());
	   
	}
	    
	@When("user Clicks Proceed To Shipping Checkout3")
	public void user_clicks_proceed_to_shipping_checkout3() {
		pom.get_Instance_shipping().getShipping_checkout();
		click(pom.get_Instance_shipping().getShipping_checkout());
	     
	    
	}
	@When("user Clicks Pay By Bankwire3")
	public void user_clicks_pay_by_bankwire3() {
		pom.get_Instance_payment().getPaybybank();
		click(pom.get_Instance_payment().getPaybybank());
	}
	@When("user Clicks Conform My Order3")
	public void user_clicks_conform_my_order3() {
		pom.get_Instance_order().getOder();
		click(pom.get_Instance_order().getOder());

	}
	@Then("user Clicks Logout Button3")
	public void user_clicks_logout_button3() {
		click(pom.get_Instance_Logout().getLogout());
}
}

