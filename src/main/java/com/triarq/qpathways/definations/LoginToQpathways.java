package com.triarq.qpathways.definations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToQpathways {

	@Given("^open chrome and start qpathways$")
	public void open_chrome_and_start_qpathways() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		System.out.println("Open Chrome and Sart qpathways");
	}

	@When("^i enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		System.out.println("enter username and password");
	}

	@Then("^user should be able to login sucsessfully$")
	public void user_should_be_able_to_login_sucsessfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		System.out.println("user should be login sucsesfull");
	}

}
