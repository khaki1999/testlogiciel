package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Test.HomePage;

public class HomeStep{

    private HomePage  homepage = new HomePage();


    @Given("user in the home page")
    public void UserInTheHomePage(){
        homepage.NavigateTOhomePage();
    }

    @When("user click avatar in navbar")
    public void UserClickAvatar(){
        homepage.NavigateTOhomePage();
        homepage.clickAvatar();
    }


    @Then("modal is open")
    public void ModalIsOpen(){
        homepage.NavigateTOhomePage();
        homepage.clickAvatar();
        homepage.Connexion();
    }

}
