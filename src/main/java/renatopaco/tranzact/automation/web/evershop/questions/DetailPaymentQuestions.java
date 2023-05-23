package renatopaco.tranzact.automation.web.evershop.questions;

import net.serenitybdd.screenplay.Question;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.DetailPaymentSuccessfullPage;

public class DetailPaymentQuestions {

    public static Question<String> QLBL_EMAIL_DETAIL_PAYMENT() {
        return actor -> DetailPaymentSuccessfullPage.LBL_EMAIL_DETAIL_PAYMENT.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_PAYMENTMETHOD_DETAIL_PAYMENT() {
        return actor -> DetailPaymentSuccessfullPage.LBL_PAYMENTMETHOD_DETAIL_PAYMENT.resolveFor(actor).waitUntilVisible().getText();
    }


    public static Question<String> QLBL_NAME_DETAIL_SHIPPING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_NAME_DETAIL_SHIPPING.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_ADDRESS_DETAIL_SHIPPING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_ADDRESS_DETAIL_SHIPPING.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_ZIPCITY_DETAIL_SHIPPING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_ZIPCITY_DETAIL_SHIPPING.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_PROVINCESTTATE_DETAIL_SHIPPING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_PROVINCESTTATE_DETAIL_SHIPPING.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_PHONENUMBER_DETAIL_SHIPPING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_PHONENUMBER_DETAIL_SHIPPING.resolveFor(actor).waitUntilVisible().getText();
    }


    public static Question<String> QLBL_NAME_DETAIL_BILLING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_NAME_DETAIL_BILLING.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_ADDRESS_DETAIL_BILLING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_ADDRESS_DETAIL_BILLING.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_ZIPCITY_DETAIL_BILLING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_ZIPCITY_DETAIL_BILLING.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_PROVINCESTTATE_DETAIL_BILLING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_PROVINCESTTATE_DETAIL_BILLING.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_PHONENUMBER_DETAIL_BILLING() {
        return actor -> DetailPaymentSuccessfullPage.LBL_PHONENUMBER_DETAIL_BILLING.resolveFor(actor).waitUntilVisible().getText();
    }

    ////////////////////////////////////////////PRODUCTS//////////////////////////////////////////
    public static Question<String> QLBL1_QUANTITY() {
        return actor -> DetailPaymentSuccessfullPage.LBL1_QUANTITY.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL1_NAME() {
        return actor -> DetailPaymentSuccessfullPage.LBL1_NAME.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL1_SIZE() {
        return actor -> DetailPaymentSuccessfullPage.LBL1_SIZE.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL1_COLOR() {
        return actor -> DetailPaymentSuccessfullPage.LBL1_COLOR.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL1_TOTALPRICE() {
        return actor -> DetailPaymentSuccessfullPage.LBL1_TOTALPRICE.resolveFor(actor).waitUntilVisible().getText();
    }


    public static Question<String> QLBL2_QUANTITY() {
        return actor -> DetailPaymentSuccessfullPage.LBL2_QUANTITY.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL2_NAME() {
        return actor -> DetailPaymentSuccessfullPage.LBL2_NAME.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL2_SIZE() {
        return actor -> DetailPaymentSuccessfullPage.LBL2_SIZE.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL2_COLOR() {
        return actor -> DetailPaymentSuccessfullPage.LBL2_COLOR.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL2_TOTALPRICE() {
        return actor -> DetailPaymentSuccessfullPage.LBL2_TOTALPRICE.resolveFor(actor).waitUntilVisible().getText();
    }


    public static Question<String> QLBL3_QUANTITY() {
        return actor -> DetailPaymentSuccessfullPage.LBL3_QUANTITY.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL3_NAME() {
        return actor -> DetailPaymentSuccessfullPage.LBL3_NAME.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL3_SIZE() {
        return actor -> DetailPaymentSuccessfullPage.LBL3_SIZE.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL3_COLOR() {
        return actor -> DetailPaymentSuccessfullPage.LBL3_COLOR.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL3_TOTALPRICE() {
        return actor -> DetailPaymentSuccessfullPage.LBL3_TOTALPRICE.resolveFor(actor).waitUntilVisible().getText();
    }

///////////////////////////////////////PAYMENT TOTAL & SHIPPING COST

    public static Question<String> QLBL_SUBTOTAL() {
        return actor -> DetailPaymentSuccessfullPage.LBL_SUBTOTAL.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_SHIPPINGPRICE() {
        return actor -> DetailPaymentSuccessfullPage.LBL_SHIPPINGPRICE.resolveFor(actor).waitUntilVisible().getText();
    }
    public static Question<String> QLBL_TOTAL() {
        return actor -> DetailPaymentSuccessfullPage.LBL_TOTAL.resolveFor(actor).waitUntilVisible().getText();
    }



}
