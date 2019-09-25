package poles;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step {
	@Given("enter 200 in the calculator")
	public void ip()
	{
		System.out.println("enter 200 in the calculator");
	}
	@And("press add")
	public void add1()
	{
		System.out.println("press add");
	}
@And("enter 30 in the calculator")
public void add2()
{
	System.out.println("enter 30 in the calculator");
}
@When("press equal")
public void when()
{
	System.out.println("press equal");
}
@Then("the result should be 230")
public void then()
{
	System.out.println("the result should be 230");
}
}
