package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;

/**
 * Created by Karthik on 10/15/2016.
 */
public class LoginStep extends BaseUtil{

    private  BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("Navigate Login Page");
        base.Driver.navigate().to(BaseUtil.URL);
    }


}
