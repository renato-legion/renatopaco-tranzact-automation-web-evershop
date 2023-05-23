package renatopaco.tranzact.automation.web.evershop.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import renatopaco.tranzact.automation.web.evershop.tasks.cart.*;
import renatopaco.tranzact.automation.web.evershop.tasks.login.ButtomLoginSectionWITHACC;
import renatopaco.tranzact.automation.web.evershop.tasks.login.ButtomLoginSectionWITHOUTACC;
import renatopaco.tranzact.automation.web.evershop.tasks.login.LoginAccount;
import renatopaco.tranzact.automation.web.evershop.tasks.login.OpenEvershop;
import renatopaco.tranzact.automation.web.evershop.tasks.logout.LogOutEvershop;
import renatopaco.tranzact.automation.web.evershop.tasks.menu.SelectMenuKWM;
import renatopaco.tranzact.automation.web.evershop.tasks.menu.VerifySubMenuKWM;
import renatopaco.tranzact.automation.web.evershop.tasks.products.*;
import renatopaco.tranzact.automation.web.evershop.tasks.registerAccount.RegisterAccounts;
import renatopaco.tranzact.automation.web.evershop.tasks.registerAccount.TextButtomCreateAccount;
import renatopaco.tranzact.automation.web.evershop.utils.PriceTotalCalculatedStrings;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
/**
 * @author Renato Paco
 */
public class E2ELoginStepDefinitions {

    PriceTotalCalculatedStrings priceTotalCalculatedStrings = new PriceTotalCalculatedStrings();
    String UserNameGlobal = null;
    String PasswordGlobal = null;
    String EmailGlobal = null;

    String PriceProduct1 = null;
    String TotalPrice1 = null;
    String PriceProduct2 = null;
    String TotalPrice2 = null;
    String PriceProduct3 = null;
    String TotalPrice3 = null;


    String NameProduct1 = null;
    String NameProduct2 = null;
    String NameProduct3 = null;

    String QuantityProduct1 = null;
    String QuantityProduct2 = null;
    String QuantityProduct3 = null;

    String SizeProduct1 = null;
    String SizeProduct2 = null;
    String SizeProduct3 = null;

    String ColorProduct1 = null;
    String ColorProduct2 = null;
    String ColorProduct3 = null;

    String ShippingCost = "15";
    String SubTotal=null;
    String TotalCart=null;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the (.*) enters the webApplication evershop$")
    public void the_automation_enters_the_web_application_evershop(String automation) {
        theActorCalled(automation).attemptsTo(
                OpenEvershop.loginEvershopPage()
        );

    }
    @When("^registers with username (.*) and password (.*) and (.*)$")
    public void registroNuevoUsuarioContrasena(String user, String password,String email) throws InterruptedException {
        Thread.sleep(500);
        //Clic LoginSection without account
        theActorInTheSpotlight().attemptsTo(
        new ButtomLoginSectionWITHOUTACC()
        );
        //Clic Create Account
        theActorInTheSpotlight().attemptsTo(
                new TextButtomCreateAccount()
        );
        //Insert the User, email and password
        theActorInTheSpotlight().attemptsTo(
    RegisterAccounts.withData(user,password,email)
        );



        UserNameGlobal=user;
        PasswordGlobal=password;
        EmailGlobal=email;

        System.out.println("Successfull Registration!");

        Thread.sleep(500);

    }
    @And("performs the logut and login activity with the new user")
    public void realizaLoginyLogout() throws InterruptedException {

        Thread.sleep(1500);
        System.out.println("Created User: "+ UserNameGlobal +"\nGLOBAL EMAIL: "+EmailGlobal +"\nPASSWORD GLOBAL: "+PasswordGlobal);
        // Clic LoginSection with ACC
        theActorInTheSpotlight().attemptsTo(
                new ButtomLoginSectionWITHACC()
        );
        Thread.sleep(500);
        //Logout Session
        theActorInTheSpotlight().attemptsTo(
                new LogOutEvershop()
        );
        Thread.sleep(500);
        // Clic LoginSection without acc active
        theActorInTheSpotlight().attemptsTo(
                new ButtomLoginSectionWITHOUTACC()
        );
        // Login with new user
        theActorInTheSpotlight().attemptsTo(
                LoginAccount.withData(EmailGlobal,PasswordGlobal)
        );

        Thread.sleep(500);
    }
    @And("^select 3 differents products and add it to the cart with different quantities from (.*) , (.*) , (.*) , (.*) , (.*), (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*)$")
    public void select3diffProductsAddToCart(String Product1, String Position1, String Quantity1, String Size1, String Color1, String Product2, String Position2, String Quantity2, String Size2, String Color2, String Product3, String Position3, String Quantity3, String Size3, String Color3) throws InterruptedException {
        QuantityProduct1 = Quantity1;
        QuantityProduct2 = Quantity2;
        QuantityProduct3 = Quantity3;

        SizeProduct1 = Size1;
        SizeProduct2 = Size2;
        SizeProduct3 = Size3;

        ColorProduct1 = Color1;
        ColorProduct2 = Color2;
        ColorProduct3 = Color3;



        System.out.println("99"+Product1);
        // Clic MENU - TYPE : Kids
        theActorInTheSpotlight().attemptsTo(
                SelectMenuKWM.withData(Product1)
        );
        Thread.sleep(500);

        //Verify stay on that subTITLE menu Kids
        theActorInTheSpotlight().attemptsTo(
             new VerifySubMenuKWM(Product1)
        );
        //Select the first product in that group
        theActorInTheSpotlight().attemptsTo(
                SelectProducts.withData(Position1)
        );
        //Insert Quantity
        theActorInTheSpotlight().attemptsTo(
                InsertQuantyProducts.withData(Quantity1)
        );
        //Select Size
        theActorInTheSpotlight().attemptsTo(
                SelectSizeProducts.withData(Size1)
        );
        //Select Color
        theActorInTheSpotlight().attemptsTo(
                SelectColorProducts.withData(Color1)
        );
        //Get Price
        theActorInTheSpotlight().attemptsTo(
               new GetPriceAndNameProduct()
        );

        PriceProduct1 = Serenity.sessionVariableCalled("Price").toString();
        TotalPrice1 = priceTotalCalculatedStrings.PriceStringsMultiply(PriceProduct1,Quantity1);
        NameProduct1 = Serenity.sessionVariableCalled("Name").toString();
        System.out.println("Price FINAL STEPDEFINION"+PriceProduct1 + " Total: "+TotalPrice1 + " NameProduct1: "+ NameProduct1 + " Cantidad: " +QuantityProduct1 + " Seize: "+SizeProduct1+ " Color:"+ColorProduct1);
        //Clic AddToCard
        theActorInTheSpotlight().attemptsTo(
                new SelectAddToCard()
        );
       Thread.sleep(500);

        theActorInTheSpotlight().attemptsTo(
              new SelectMenuKWM("Menu")
        );


//
        // Clic MENU - TYPE : Women
        theActorInTheSpotlight().attemptsTo(
                SelectMenuKWM.withData(Product2)
        );
//
        //Select the first product in that group
        theActorInTheSpotlight().attemptsTo(
                SelectProducts.withData(Position2)
        );
        //Insert Quantity
        theActorInTheSpotlight().attemptsTo(
                InsertQuantyProducts.withData(Quantity2)
        );
        //Select Size
        theActorInTheSpotlight().attemptsTo(
                SelectSizeProducts.withData(Size2)
        );
        //Select Color
        theActorInTheSpotlight().attemptsTo(
                SelectColorProducts.withData(Color2)
        );
        //Get Price
        theActorInTheSpotlight().attemptsTo(
                new GetPriceAndNameProduct()
        );

        PriceProduct2 = Serenity.sessionVariableCalled("Price").toString();
        TotalPrice2 = priceTotalCalculatedStrings.PriceStringsMultiply(PriceProduct2,Quantity2);
        NameProduct2 = Serenity.sessionVariableCalled("Name").toString();
        System.out.println("Product:2 Price FINAL STEPDEFINION"+PriceProduct2 + " Total: "+TotalPrice2 + " NameProduct1: "+ NameProduct2 + " Cantidad: " +QuantityProduct2 + " Seize: "+SizeProduct2+ " Color:"+ColorProduct2);
        //Clic AddToCard
        theActorInTheSpotlight().attemptsTo(
                new SelectAddToCard()
        );


        // Clic MENU - TYPE : Men or etc
        theActorInTheSpotlight().attemptsTo(
                SelectMenuKWM.withData(Product3)
        );
//
        //Select the  product in that group
        theActorInTheSpotlight().attemptsTo(
                SelectProducts.withData(Position3)
        );
        //Insert Quantity
        theActorInTheSpotlight().attemptsTo(
                InsertQuantyProducts.withData(Quantity3)
        );
        //Select Size
        theActorInTheSpotlight().attemptsTo(
                SelectSizeProducts.withData(Size3)
        );
        //Select Color
        theActorInTheSpotlight().attemptsTo(
                SelectColorProducts.withData(Color3)
        );
        //Get Price
        theActorInTheSpotlight().attemptsTo(
                new GetPriceAndNameProduct()
        );

        PriceProduct3 = Serenity.sessionVariableCalled("Price").toString();
        TotalPrice3 = priceTotalCalculatedStrings.PriceStringsMultiply(PriceProduct3,Quantity3);
        NameProduct3 = Serenity.sessionVariableCalled("Name").toString();
        System.out.println("Product:3 Price FINAL STEPDEFINION"+PriceProduct3 + " Total: "+TotalPrice3 + " NameProduct1: "+ NameProduct3+ " Cantidad: " +QuantityProduct3 + " Seize: "+SizeProduct3+ " Color:"+ColorProduct3);
        //Clic AddToCard
        theActorInTheSpotlight().attemptsTo(
                new SelectAddToCard()
        );
        SubTotal =priceTotalCalculatedStrings.PriceStringsSumm(TotalPrice1,TotalPrice2,TotalPrice3);
        TotalCart = priceTotalCalculatedStrings.PriceStringsPlus15(SubTotal,ShippingCost);
    }
    @And("Go to Checkout page and click on Checkout")
    public void GotoCheckoutpageandclickonCheckout() throws InterruptedException {

        // Clic MENU - TYPE : Kids
        theActorInTheSpotlight().attemptsTo(
                SelectMenuKWM.withData("Cart")
        );
        Thread.sleep(500);
        //Clic en CHECKOUT
        theActorInTheSpotlight().attemptsTo(
                new SelectCheckOutCart()
        );
        Thread.sleep(2500);
    }

    @And("Fill the shipping address and submit")
    public void Filltheshippingaddressandsubmit() throws InterruptedException {
        // Enter shipping information and Clic Continue payment
        Thread.sleep(500);
        theActorInTheSpotlight().attemptsTo(
              new FillShippingInformation()
        );
        Thread.sleep(2500);

    }
    @And("Click on success to get correct card information")
    public void ClickOnSuccessToGetCorrectCardInformation() throws InterruptedException {
        // Clic Visa Mastercar and
        theActorInTheSpotlight().attemptsTo(
                new ClicCreditCard()
        );
        Thread.sleep(1500);

    }
    @And("Fill payment information")
    public void Fillpaymentinformation() throws InterruptedException {
        // Fill Test Success payment information
        theActorInTheSpotlight().attemptsTo(
                new FillCorrectPaymentInformation()
        );
        Thread.sleep(1500);

    }

    @And("Click Place Order")
    public void ClickPlaceOrder() throws InterruptedException {
        // Fill Test Success payment information
        theActorInTheSpotlight().attemptsTo(
                new ClicPlaceOrder()
        );
        Thread.sleep(1500);

    }

    @Then("Verify Order created successful with the correct information Contact, Payment, Shipping Address, Billing Address and Items")
    public void VerifyOrderCreatedSuccessful() throws InterruptedException {
        // Fill Test Success payment information


        theActorInTheSpotlight().attemptsTo(
                VerifyOrderCart.withData(EmailGlobal,QuantityProduct1,NameProduct1,TotalPrice1,SizeProduct1,ColorProduct1,QuantityProduct2,NameProduct2,TotalPrice2,SizeProduct2,ColorProduct2,QuantityProduct3,NameProduct3,TotalPrice3,SizeProduct3,ColorProduct3,SubTotal,TotalCart)
        );
        Thread.sleep(1500);

    }

}
