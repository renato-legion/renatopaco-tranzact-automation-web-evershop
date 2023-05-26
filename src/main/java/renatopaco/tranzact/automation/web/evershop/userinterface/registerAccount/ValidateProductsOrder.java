package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import renatopaco.tranzact.automation.web.evershop.utils.PriceTotalCalculatedStrings;

import java.util.Locale;
import java.util.Objects;

public class ValidateProductsOrder extends PageObject {
    static String [][] matriz = new String[3][5];
    PriceTotalCalculatedStrings priceTotalCalculatedStrings2 = new PriceTotalCalculatedStrings();

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]")
    WebElement LBL1_QUANTITY_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/span[1]")
    WebElement LBL1_NAME_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/ul[1]/li[1]/span[2]")
    WebElement LBL1_SIZE_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/ul[1]/li[2]/span[2]")
    WebElement LBL1_COLOR_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/span[1]")
    WebElement LBL1_TOTALPRICE_;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/span[1]")
    WebElement LBL2_QUANTITY_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[1]")
    WebElement LBL2_NAME_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/ul[1]/li[1]/span[2]")
    WebElement LBL2_SIZE_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/ul[1]/li[2]/span[2]")
    WebElement LBL2_COLOR_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/span[1]")
    WebElement LBL2_TOTALPRICE_;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[1]")
    WebElement LBL3_QUANTITY_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/span[1]")
    WebElement LBL3_NAME_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[2]/ul[1]/li[1]/span[2]")
    WebElement LBL3_SIZE_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[2]/ul[1]/li[2]/span[2]")
    WebElement LBL3_COLOR_;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/span[1]")
    WebElement LBL3_TOTALPRICE_;


    public void validateProducts(String QuantityProduct1,String NameProduct1,String TotalPrice1,String Size1,String Color1,String QuantityProduct2,String NameProduct2,String TotalPrice2,String Size2,String Color2,String QuantityProduct3,String NameProduct3,String TotalPrice3,String Size3,String Color3){

        matriz [0][0]=NameProduct1;
        matriz [0][1]=QuantityProduct1;
        matriz [0][2]=TotalPrice1;
        matriz [0][3]=Size1;
        matriz [0][4]=Color1;

        matriz [1][0]=NameProduct2;
        matriz [1][1]=QuantityProduct2;
        matriz [1][2]=TotalPrice2;
        matriz [1][3]=Size2;
        matriz [1][4]=Color2;

        matriz [2][0]=NameProduct3;
        matriz [2][1]=QuantityProduct3;
        matriz [2][2]=TotalPrice3;
        matriz [2][3]=Size3;
        matriz [2][4]=Color3;


        System.out.println("\nLABEL 1 "+ LBL1_NAME_.getText());
        System.out.println("\nLABEL 2 "+ LBL2_NAME_.getText());
        System.out.println("\nLABEL 3 "+ LBL3_NAME_.getText());

        System.out.println("\n\n0 0 "+ matriz [0][0]);
        System.out.println("\n0 1 "+ matriz [0][1]);
        System.out.println("\n0 2 "+ matriz [0][2]);
        System.out.println("\n0 3 "+ matriz [0][3]);
        System.out.println("\n0 4 "+ matriz [0][4]);

        System.out.println("\n1 0 "+ matriz [1][0]);
        System.out.println("\n1 1 "+ matriz [1][1]);
        System.out.println("\n1 2 "+ matriz [1][2]);
        System.out.println("\n1 3 "+ matriz [1][3]);
        System.out.println("\n1 4 "+ matriz [1][4]);

        System.out.println("\n2 0 "+ matriz [2][0]);
        System.out.println("\n2 1 "+ matriz [2][1]);
        System.out.println("\n2 2 "+ matriz [2][2]);
        System.out.println("\n2 3 "+ matriz [2][3]);
        System.out.println("\n2 4 "+ matriz [2][4]);


        for (int i=0; i<3; i++){
                if(LBL1_NAME_.getText().toLowerCase(Locale.ROOT).equals((matriz[i][0]).toLowerCase(Locale.ROOT)))
                {
                    System.out.println("\nContador i = "+i+"\n");
                    System.out.println("\nCantidad label i "+LBL1_QUANTITY_.getText()+"\n");
                    System.out.println("\nSize i "+LBL1_SIZE_.getText()+"\n");
                    System.out.println("\nCantidad Color i "+LBL1_COLOR_.getText()+"\n");
                    System.out.println("\nCantidad Total Price "+LBL1_TOTALPRICE_.getText()+"\n");
                    Assert.assertEquals(LBL1_QUANTITY_.getText(),matriz[i][1]);
                    if (LBL1_SIZE_.getText().equals(matriz[i][3]))
                    {
                        Assert.assertEquals(LBL1_SIZE_.getText(),matriz[i][3]);
                        Assert.assertEquals(LBL1_COLOR_.getText(),matriz[i][4]);
                    }
                    else if (LBL1_SIZE_.getText().equals(matriz[i][4]))
                    {
                        Assert.assertEquals(LBL1_SIZE_.getText(),matriz[i][4]);
                        Assert.assertEquals(LBL1_COLOR_.getText(),matriz[i][3]);
                    }
                    Assert.assertEquals(LBL1_TOTALPRICE_.getText(),priceTotalCalculatedStrings2.ConvertToMoneyStyle(matriz[i][2]));
                    System.out.println("\nEl producto #Numero " + (i+1)+" se encuentra en el 1. PRIMER LABEL DEL DETALLE DE VENTA.\n");

                }
                else if (LBL2_NAME_.getText().toLowerCase(Locale.ROOT).equals((matriz[i][0]).toLowerCase(Locale.ROOT))){

                    System.out.println("\nContador i "+i+"\n");
                    System.out.println("\nCantidad label i "+LBL2_QUANTITY_.getText()+"\n");
                    System.out.println("\nSize i"+LBL2_SIZE_.getText()+"\n");
                    System.out.println("\nCantidad Color i "+LBL2_COLOR_.getText()+"\n");
                    System.out.println("\nCantidad Total Price "+LBL2_TOTALPRICE_.getText()+"\n");

                    Assert.assertEquals(LBL2_QUANTITY_.getText(),matriz[i][1]);
                    if (LBL2_SIZE_.getText().equals(matriz[i][3]))
                    {
                        Assert.assertEquals(LBL2_SIZE_.getText(),matriz[i][3]);
                        Assert.assertEquals(LBL2_COLOR_.getText(),matriz[i][4]);
                    }
                    else if (LBL2_SIZE_.getText().equals(matriz[i][4]))
                    {
                        Assert.assertEquals(LBL2_SIZE_.getText(),matriz[i][4]);
                        Assert.assertEquals(LBL2_COLOR_.getText(),matriz[i][3]);
                    }
                    Assert.assertEquals(LBL2_TOTALPRICE_.getText(),priceTotalCalculatedStrings2.ConvertToMoneyStyle(matriz[i][2]));
                    System.out.println("\nEl producto #Numero " + (i+1)+" se encuentra en el 2. SEGUNDO LABEL DEL DETALLE DE VENTA.\n");

                }
                else if (LBL3_NAME_.getText().toLowerCase(Locale.ROOT).equals((matriz[i][0]).toLowerCase(Locale.ROOT))){
                    System.out.println("\nContador i "+i+"\n");
                    System.out.println("\nCantidad label i "+LBL3_QUANTITY_.getText()+"\n");
                    System.out.println("\nSize i "+LBL3_SIZE_.getText()+"\n");
                    System.out.println("\nCantidad Color i "+LBL3_COLOR_.getText()+"\n");
                    System.out.println("\nCantidad Total Price "+LBL3_TOTALPRICE_.getText()+"\n");
                    Assert.assertEquals(LBL3_QUANTITY_.getText(),matriz[i][1]);
                    if (LBL3_SIZE_.getText().equals(matriz[i][3]))
                    {
                        Assert.assertEquals(LBL3_SIZE_.getText(),matriz[i][3]);
                        Assert.assertEquals(LBL3_COLOR_.getText(),matriz[i][4]);
                    }
                    else if (LBL3_SIZE_.getText().equals(matriz[i][4]))
                    {
                        Assert.assertEquals(LBL3_SIZE_.getText(),matriz[i][4]);
                        Assert.assertEquals(LBL3_COLOR_.getText(),matriz[i][3]);
                    }
                    Assert.assertEquals(LBL3_TOTALPRICE_.getText(),priceTotalCalculatedStrings2.ConvertToMoneyStyle(matriz[i][2]));
                    System.out.println("\nEl producto #Numero " + (i+1)+" se encuentra en el 3. TERCER LABEL DEL DETALLE DE VENTA.\n");
                }
                else {
                    System.out.println("None of the 3 products are on the list of the created order.");
                    break;
                }


        }

    }


}
