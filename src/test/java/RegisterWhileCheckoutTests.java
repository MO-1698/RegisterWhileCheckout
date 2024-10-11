import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.RegisterWhileCheckoutPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterWhileCheckoutTests {
    private SHAFT.GUI.WebDriver driver;


    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate user registration while checkout")
    private void validateRegisterWhileCheckout() {
        new RegisterWhileCheckoutPage(driver).navigateToURL("https://automationexercise.com/")
                .validateHomePage().clickOnProductButton().clickOnAddProductToCartButton().clickOnContinueSoppingButton().clickOnCartButton()
                .validateVerifyCartPage().clickOnProceedToCheckoutButton().clickOnCheckoutRegistrationButton()
                .fillNameTextField("Samy").fillEmailTextField("Samy@yahoo.com").clickOnSignupButton()
                .clickOnTitleGender1().fillUserName("Samy")
                .fillPassword("Samy123456789").clickOnDay().clickOnMonth().clickOnYear()
                .clickOnCheckBoxNewSletter().clickOnCheckBoxSpecialOffers().fillFirstName("Samy")
                .fillLastName("Madvic").fillCompany("Canada Travel").fillAddress("1250 Grand Lake Rd, Sydney, NS B1M 1A2, Canada")
                .fillAddress2("1255 Grand Lake Rd, Sydney, NS B1M 1A2, Canada")
                .clickOnCountry().fillState("Nova Scotia").fillCity("Sydney")
                .fillZipCode("B1P 6L2").fillMobileNumber("(902) 540-5555").clickOnCreateAccountButton()
                .validateAccountCreated().clickOnContinueButton().validateLoggedIn().clickOnCartButton()
                .clickOnProceedToCheckoutButton().validateAddressDetails().validateReviewYourOrder()
                .fillCommentTextArea("This is just a test").clickOnPlaceOrderButton().fillNameOnCard("Sam")
                .fillCardNumber("123456789").fillCVCNumber("311").fillExpMonth("10").fillExpYear("2026")
                .clickOnPayButton().validateAlertMessage().clickOnDeleteAccButton().validateDeletedAcc().clickOnContinButton();
    }
}
