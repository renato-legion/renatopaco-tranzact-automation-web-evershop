package renatopaco.tranzact.automation.web.evershop.tasks.cart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.questions.DetailPaymentQuestions;
import renatopaco.tranzact.automation.web.evershop.tasks.registerAccount.RegisterAccounts;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.DetailPaymentSuccessfullPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.RegisterPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.ValidateProductsOrder;
import renatopaco.tranzact.automation.web.evershop.utils.PriceTotalCalculatedStrings;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class VerifyOrderCart implements Task {

    ValidateProductsOrder validateProductsOrder = new ValidateProductsOrder();
    private final String EmailGlobal;

    private final String QuantityProduct1;
    private final String NameProduct1;
    private final String TotalPrice1;
    private final String Size1;
    private final String Color1;

    private final String QuantityProduct2;
    private final String NameProduct2;
    private final String TotalPrice2;
    private final String Size2;
    private final String Color2;

    private final String QuantityProduct3;
    private final String NameProduct3;
    private final String TotalPrice3;
    private final String Size3;
    private final String Color3;


    private String SubTotal;
    private String TotalCart;

    public VerifyOrderCart(String emailGlobal, String quantityProduct1, String nameProduct1, String totalPrice1, String size1, String color1, String quantityProduct2, String nameProduct2, String totalPrice2, String size2, String color2, String quantityProduct3, String nameProduct3, String totalPrice3, String size3, String color3, String subTotal, String totalCart) {
        EmailGlobal = emailGlobal;
        QuantityProduct1 = quantityProduct1;
        NameProduct1 = nameProduct1;
        TotalPrice1 = totalPrice1;
        Size1 = size1;
        Color1 = color1;
        QuantityProduct2 = quantityProduct2;
        NameProduct2 = nameProduct2;
        TotalPrice2 = totalPrice2;
        Size2 = size2;
        Color2 = color2;
        QuantityProduct3 = quantityProduct3;
        NameProduct3 = nameProduct3;
        TotalPrice3 = totalPrice3;
        Size3 = size3;
        Color3 = color3;
        SubTotal = subTotal;
        TotalCart = totalCart;
    }
    PriceTotalCalculatedStrings pricefunciton= new PriceTotalCalculatedStrings();

    @Override
    @Step("Verify data")
    public <T extends Actor> void performAs(T actor) {

        SubTotal=pricefunciton.ConvertToMoneyStyle(SubTotal);
        TotalCart=pricefunciton.ConvertToMoneyStyle(TotalCart);



        theActorInTheSpotlight().should(
                seeThat(DetailPaymentQuestions.QLBL_EMAIL_DETAIL_PAYMENT(), equalTo(EmailGlobal)),
                seeThat(DetailPaymentQuestions.QLBL_PAYMENTMETHOD_DETAIL_PAYMENT(), equalTo("Cash On Delivery")),


                seeThat(DetailPaymentQuestions.QLBL_NAME_DETAIL_SHIPPING(), equalTo("Renato Paco Huerta")),
                seeThat(DetailPaymentQuestions.QLBL_ADDRESS_DETAIL_SHIPPING(), equalTo("Av. la Molina 378, La Molina")),
                seeThat(DetailPaymentQuestions.QLBL_ZIPCITY_DETAIL_SHIPPING(), equalTo("07001, Lima Metropolitana")),
                seeThat(DetailPaymentQuestions.QLBL_PROVINCESTTATE_DETAIL_SHIPPING(), equalTo("Nebraska, United States")),
                seeThat(DetailPaymentQuestions.QLBL_PHONENUMBER_DETAIL_SHIPPING(), equalTo("987654321"))


        );

        theActorInTheSpotlight().should(
                seeThat(DetailPaymentQuestions.QLBL_NAME_DETAIL_BILLING(), equalTo("Renato Paco Huerta")),
                seeThat(DetailPaymentQuestions.QLBL_ADDRESS_DETAIL_BILLING(), equalTo("Av. la Molina 378, La Molina")),
                seeThat(DetailPaymentQuestions.QLBL_ZIPCITY_DETAIL_BILLING(), equalTo("07001, Lima Metropolitana")),
                seeThat(DetailPaymentQuestions.QLBL_PROVINCESTTATE_DETAIL_BILLING(), equalTo("Nebraska, United States")),
                seeThat(DetailPaymentQuestions.QLBL_PHONENUMBER_DETAIL_BILLING(), equalTo("987654321"))

        );

        validateProductsOrder.validateProducts(QuantityProduct1,NameProduct1,TotalPrice1,Size1,Color1,QuantityProduct2,NameProduct2,TotalPrice2,Size2,Color2,QuantityProduct3,NameProduct3,TotalPrice3,Size3,Color3);
        System.out.println("Product variables globales: "+ SubTotal +" "+TotalCart);
        theActorInTheSpotlight().should(
                seeThat(DetailPaymentQuestions.QLBL_SUBTOTAL(), equalTo(SubTotal)),
                seeThat(DetailPaymentQuestions.QLBL_SHIPPINGPRICE(), equalTo("$15.00")),
                seeThat(DetailPaymentQuestions.QLBL_TOTAL(), equalTo(TotalCart))

        );
    }

    public static Performable withData(String emailGlobal, String quantityProduct1, String nameProduct1, String totalPrice1, String size1, String color1, String quantityProduct2, String nameProduct2, String totalPrice2, String size2, String color2, String quantityProduct3, String nameProduct3, String totalPrice3, String size3, String color3, String subTotal, String totalCart) {
        return instrumented(VerifyOrderCart.class, emailGlobal, quantityProduct1,nameProduct1,totalPrice1,size1,color1,quantityProduct2,nameProduct2,totalPrice2,size2,color2,quantityProduct3,nameProduct3,totalPrice3,size3,color3,subTotal,totalCart);
    }
}
