package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterWhileCheckoutPage {
    private SHAFT.GUI.WebDriver driver;

    public RegisterWhileCheckoutPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By ProductButton = By.xpath("//a[@href=\"/products\"]//i[@class=\"material-icons card_travel\"]");
    private By AddProductToCartButton = By.xpath("//div[@class='features_items']//div[contains(@class, 'single-products')][1]//div[@class='productinfo text-center']//a[contains(@class, 'add-to-cart') and @data-product-id='1' and contains(text(), 'Add to cart')]");
    private By ContinueSoppingButton = By.xpath("//button[@data-dismiss=\"modal\"]");
    private By CartButton = By.xpath("//a[@href=\"/view_cart\"]//i");
    private By VerifyCartPage = By.xpath("//li[@class=\"active\"]");
    private By ProceedToCheckoutButton = By.xpath("//a[@class=\"btn btn-default check_out\"]");
    private By CheckoutRegistrationButton = By.xpath("//a[@href=\"/login\"]//u");
    private By NameTextField = By.xpath("//input[@data-qa=\"signup-name\"]");
    private By EmailTextField = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By SignupButton = By.xpath("//button[@data-qa=\"signup-button\"]");
    private By TitleGender1 = By.xpath("//div[@class=\"radio-inline\"]//div[@class=\"radio\"]//input[@id=\"id_gender1\"]");
    private By UserName = By.xpath("//div[@class=\"required form-group\"]//input[@data-qa=\"name\"]");
    private By UserPassword = By.xpath("//div[@class=\"required form-group\"]//input[@data-qa=\"password\"]");
    private By Day = By.xpath("//select[@data-qa=\"days\"]//option[@value=\"1\"]");
    private By Month = By.xpath("//select[@data-qa=\"months\"]//option[@value=\"1\"]");
    private By Year = By.xpath("//select[@data-qa=\"years\"]//option[@value=\"2001\"]");
    private By CheckBoxNewSletter = By.xpath("//div[@class=\"checkbox\"]//input[@name=\"newsletter\"]");
    private By CheckBoxSpecialOffers = By.xpath("//div[@class=\"checkbox\"]//input[@name=\"optin\"]");
    private By FirstName = By.xpath("//input[@data-qa=\"first_name\"]");
    private By LastName = By.xpath("//input[@data-qa=\"last_name\"]");
    private By Company = By.xpath("//input[@data-qa=\"company\"]");
    private By Address = By.xpath("//input[@data-qa=\"address\"]");
    private By Address2 = By.xpath("//input[@data-qa=\"address2\"]");
    private By Country = By.xpath("//select[@data-qa=\"country\"]//option[@value=\"Canada\"]");
    private By State = By.xpath("//input[@data-qa=\"state\"]");
    private By City = By.xpath("//input[@data-qa=\"city\"]");
    private By ZipCode = By.xpath("//input[@data-qa=\"zipcode\"]");
    private By MobileNumber = By.xpath("//input[@data-qa=\"mobile_number\"]");
    private By CreateAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");
    private By AccountCreated = By.xpath("//h2[@data-qa=\"account-created\"]");
    private By ContinueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By LoggedIn = By.xpath("//ul[@class=\"nav navbar-nav\"]");
    private By RegCartButton = By.xpath("//a[@href=\"/view_cart\"]//i");
    private By RegProceedToCheckoutButton = By.xpath("//a[@class=\"btn btn-default check_out\"]");
    private By AddressDetails = By.xpath("//h2[@class='heading' and text()='Address Details']");
    private By ReviewYourOrder = By.xpath("//h2[@class='heading' and text()='Review Your Order']");
    private By CommentTextArea = By.xpath("//textarea[@class=\"form-control\"]");
    private By PlaceOrderButton = By.xpath("//a[@href=\"/payment\"]");
    private By NameOnCard = By.xpath("//input[@class=\"form-control\"]");
    private By CardNumber = By.xpath("//input[@data-qa=\"card-number\"]");
    private By CVCNumber = By.xpath("//input[@data-qa=\"cvc\"]");
    private By ExpMonth = By.xpath("//input[@data-qa=\"expiry-month\"]");
    private By ExpYear = By.xpath("//input[@data-qa=\"expiry-year\"]");
    private By PayButton = By.xpath("//button[@data-qa=\"pay-button\"]");
    private By AlertMessage = By.xpath("//p[@style=\"font-size: 20px; font-family: garamond;\"]");
    private By DeleteAccButton = By.xpath("//a[@href=\"/delete_account\"]//i");
    private By DeletedAcc = By.xpath("//h2[@data-qa=\"account-deleted\"]//b");
    private By ContinButton = By.xpath("//a[@data-qa=\"continue-button\"]");

    public RegisterWhileCheckoutPage navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnProductButton() {
        driver.element().click(ProductButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnAddProductToCartButton() {
        driver.element().click(AddProductToCartButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnContinueSoppingButton() {
        driver.element().click(ContinueSoppingButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnCartButton() {
        driver.element().click(CartButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnProceedToCheckoutButton() {
        driver.element().click(ProceedToCheckoutButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnCheckoutRegistrationButton() {
        driver.element().click(CheckoutRegistrationButton);
        return this;
    }

    public RegisterWhileCheckoutPage fillNameTextField(String name) {
        driver.element().type(NameTextField,name);
        return this;
    }

    public RegisterWhileCheckoutPage fillEmailTextField(String email) {
        driver.element().type(EmailTextField,email);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnSignupButton() {
        driver.element().click(SignupButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnTitleGender1() {
        driver.element().click(TitleGender1);
        return this;
    }

    public RegisterWhileCheckoutPage fillUserName(String username) {
        driver.element().type(UserName, username);
        return this;
    }

    public RegisterWhileCheckoutPage fillPassword(String password) {
        driver.element().type(UserPassword, password);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnDay() {
        driver.element().click(Day);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnMonth() {
        driver.element().click(Month);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnYear() {
        driver.element().click(Year);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnCheckBoxNewSletter() {
        driver.element().click(CheckBoxNewSletter);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnCheckBoxSpecialOffers() {
        driver.element().click(CheckBoxSpecialOffers);
        return this;
    }

    public RegisterWhileCheckoutPage fillFirstName(String Fname) {
        driver.element().type(FirstName, Fname);
        return this;
    }

    public RegisterWhileCheckoutPage fillLastName(String Sname) {
        driver.element().type(LastName, Sname);
        return this;
    }

    public RegisterWhileCheckoutPage fillCompany(String Compname) {
        driver.element().type(Company, Compname);
        return this;
    }

    public RegisterWhileCheckoutPage fillAddress(String Faddress) {
        driver.element().type(Address, Faddress);
        return this;
    }

    public RegisterWhileCheckoutPage fillAddress2(String Saddress) {
        driver.element().type(Address2, Saddress);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnCountry() {
        driver.element().click(Country);
        return this;
    }

    public RegisterWhileCheckoutPage fillState(String state) {
        driver.element().type(State, state);
        return this;
    }

    public RegisterWhileCheckoutPage fillCity(String city) {
        driver.element().type(City, city);
        return this;
    }

    public RegisterWhileCheckoutPage fillZipCode(String zipcode) {
        driver.element().type(ZipCode, zipcode);
        return this;
    }

    public RegisterWhileCheckoutPage fillMobileNumber(String mobnumber) {
        driver.element().type(MobileNumber, mobnumber);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnCreateAccountButton() {
        driver.element().click(CreateAccountButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnContinueButton() {
        driver.element().click(ContinueButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnRegCartButton() {
        driver.element().click(RegCartButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnRegProceedToCheckoutButton() {
        driver.element().click(RegProceedToCheckoutButton);
        return this;
    }

    public RegisterWhileCheckoutPage fillCommentTextArea(String comment) {
        driver.element().type(CommentTextArea, comment);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnPlaceOrderButton() {
        driver.element().click(PlaceOrderButton);
        return this;
    }

    public RegisterWhileCheckoutPage fillNameOnCard(String cardname) {
        driver.element().type(NameOnCard, cardname);
        return this;
    }

    public RegisterWhileCheckoutPage fillCardNumber(String cardnumber) {
        driver.element().type(CardNumber, cardnumber);
        return this;
    }

    public RegisterWhileCheckoutPage fillCVCNumber(String cvcno) {
        driver.element().type(CVCNumber, cvcno);
        return this;
    }

    public RegisterWhileCheckoutPage fillExpMonth(String month) {
        driver.element().type(ExpMonth, month);
        return this;
    }

    public RegisterWhileCheckoutPage fillExpYear(String year) {
        driver.element().type(ExpYear, year);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnPayButton() {
        driver.element().click(PayButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnDeleteAccButton() {
        driver.element().click(DeleteAccButton);
        return this;
    }

    public RegisterWhileCheckoutPage clickOnContinButton() {
        driver.element().click(ContinButton);
        return this;
    }



    @Step("Validate that the user is on Home Page")
    public RegisterWhileCheckoutPage validateHomePage() {
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that the user is on Home Page")
    public RegisterWhileCheckoutPage validateVerifyCartPage() {
        driver.element().verifyThat(VerifyCartPage).text().contains("Shopping Cart");
        return this;
    }


    @Step("Validate that the user has created an account")
    public RegisterWhileCheckoutPage validateAccountCreated() {
        driver.element().verifyThat(AccountCreated).text().isEqualTo("ACCOUNT CREATED!");
        return this;
    }

    @Step("Validate that the user has logged in")
    public RegisterWhileCheckoutPage validateLoggedIn() {
        driver.element().verifyThat(LoggedIn).text().contains("Logged in as Samy");
        return this;
    }

    @Step("Validate that Address Details is appear")
    public RegisterWhileCheckoutPage validateAddressDetails() {
        driver.element().verifyThat(AddressDetails).text().contains("Address Details");
        return this;
    }

    @Step("Validate that Review Your Order is appear")
    public RegisterWhileCheckoutPage validateReviewYourOrder() {
        driver.element().verifyThat(ReviewYourOrder).text().contains("Review Your Order");
        return this;
    }

    @Step("Validate that order is placed successfully")
    public RegisterWhileCheckoutPage validateAlertMessage() {
        driver.element().verifyThat(AlertMessage).text().contains("Congratulations! Your order has been confirmed!");
        return this;
    }


    @Step("Validate that the user deleted account")
    public RegisterWhileCheckoutPage validateDeletedAcc() {
        driver.element().verifyThat(DeletedAcc).text().contains("ACCOUNT DELETED!");
        return this;
    }


}