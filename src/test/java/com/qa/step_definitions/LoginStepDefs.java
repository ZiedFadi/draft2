package com.qa.step_definitions;

import org.openqa.selenium.By;

import com.qa.utils.SeleniumUtils;
import com.qa.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	
	private SeleniumUtils selUtil = new SeleniumUtils();

	@Given("Je me connecte sur l'application")
	public void jeMeConnecteSurLApplication() throws InterruptedException {
		
		Setup.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@When("Je saisis le username")
	public void jeSaisisLeUsername() {
		
		selUtil.clearField(Setup.getDriver().findElement(By.name("username")));
		selUtil.writeText(Setup.getDriver().findElement(By.name("username")), "Admin");
	}
	@When("Je saisis le mot de passe")
	public void jeSaisisLeMotDePasse() {
		
		selUtil.clearField(Setup.getDriver().findElement(By.name("password")));
		selUtil.writeText(Setup.getDriver().findElement(By.name("password")), "admin123");
	}
	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		
		selUtil.click(Setup.getDriver().findElement(By.xpath("//button[@type='submit']")));
	}




}
