package renatopaco.tranzact.automation.web.evershop.utils;

public class PriceTotalCalculatedStrings {

    public int Total;
    public int number1;
    public int number2;
    public String TotalString;

    public int totalSum;
    public int number1Sum;
    public int number2Sum;
    public int number3Sum;
    public String TotalStringSum;

    public int Total15;
    public int number1Plus;
    public int number2Plus;
    public String TotalStringSum2;

    public String ConvertedPrice;

    public String PriceStringsMultiply(String one, String two){

        System.out.println(one+" "+two);
        number1= Integer.parseInt(one);
        number2= Integer.parseInt(two);
        Total=number1*number2;
        TotalString= String.valueOf(Total);
        return TotalString;
    }
    public String PriceStringsSumm(String one, String two,String three){
        System.out.println("Summ: "+one+" + "+two +" + "+three);
        number1Sum= Integer.parseInt(one);
        number2Sum= Integer.parseInt(two);
        number3Sum= Integer.parseInt(three);

        totalSum=number1Sum+number2Sum+number3Sum;
        TotalStringSum= String.valueOf(totalSum);
        return TotalStringSum;
    }

    public String PriceStringsPlus15(String one, String two){

        number1Plus= Integer.parseInt(one);
        number2Plus= Integer.parseInt(two);

        Total15=number1Plus+number2Plus;
        TotalStringSum2= String.valueOf(Total15);
        return TotalStringSum2;
    }

    public String ConvertToMoneyStyle(String one){


        if (one.length()==3)
        {
            ConvertedPrice="$"+one+".00";
        }
        else if (one.length()==4)
        {
            char primernumero=one.charAt(0);
            String tresncumeros=one.substring(1,4);
            System.out.println("\nPrecio convertido 4 numeros:: "+ConvertedPrice);
            ConvertedPrice="$"+primernumero+","+tresncumeros+".00";
        }
        else if (one.length()==5)
        {
            char primernumero=one.charAt(0);
            char segundonumero=one.charAt(1);
            String tresncumeros=one.substring(2,5);
            System.out.println("\nPrecio convertido 5 numeros:: "+ConvertedPrice);
            ConvertedPrice="$"+primernumero+segundonumero+","+tresncumeros+".00";
        }
        else if (one.length()==6)
        {
            char primernumero=one.charAt(0);
            char segundonumero=one.charAt(1);
            char tercernumero=one.charAt(2);
            String tresncumeros=one.substring(3,6);
            System.out.println("\nPrecio convertido 6 numeros:: "+ConvertedPrice);
            ConvertedPrice="$"+primernumero+segundonumero+tercernumero+","+tresncumeros+".00";
        }
        else if (one.length()==7)
        {
            char primernumero=one.charAt(0);
            char segundonumero=one.charAt(1);
            char tercernumero=one.charAt(2);
            char cuartonumero=one.charAt(3);
            String tresncumeros=one.substring(4,7);
            System.out.println("\nPrecio convertido 4 numeros:: "+ConvertedPrice);
            ConvertedPrice="$"+primernumero+","+segundonumero+tercernumero+cuartonumero+","+tresncumeros+".00";
        }
        else if (one.length()==8)
        {
            char primernumero=one.charAt(0);
            char segundonumero=one.charAt(1);
            char tercernumero=one.charAt(2);
            char cuartonumero=one.charAt(3);
            char cinconumero=one.charAt(4);
            String tresncumeros=one.substring(5,7);
            System.out.println("\nPrecio convertido 4 numeros:: "+ConvertedPrice);
            ConvertedPrice="$"+primernumero+segundonumero+","+tercernumero+cuartonumero+cinconumero+","+tresncumeros+".00";
        }

        return ConvertedPrice;
    }




}
