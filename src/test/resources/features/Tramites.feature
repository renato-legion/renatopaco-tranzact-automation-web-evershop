@allTramites
Feature: AutoWeb EverShop by Renato Paco
#Author: Renato Paco

  @Automated @Happy_path @functional_testing @Tranzact
  Scenario Outline: [HAPPY PATH] Flujo E2E Prueba Tranzact
    Given the automation enters the webApplication evershop
    When registers with username <user> and password <password> and <email>
    And performs the logut and login activity with the new user
    And select 3 differents products and add it to the cart with different quantities from <Product1> , <Position1> , <Quantity1> , <Size1> , <Color1>, <Product2> , <Position2> , <Quantity2> , <Size2> , <Color2> , <Product3> , <Position3> , <Quantity3> , <Size3> , <Color3>
    And Go to Checkout page and click on Checkout
    And Fill the shipping address and submit
    And Click on success to get correct card information
    And Fill payment information
    And Click Place Order
    Then Verify Order created successful with the correct information Contact, Payment, Shipping Address, Billing Address and Items
    Examples:
      | user            | password | email                     | Product1 | Position1 | Quantity1 | Size1 | Color1 | Product2 | Position2 | Quantity2 | Size2 | Color2 | Product3 | Position3 | Quantity3 | Size3 | Color3 |
      | Adriana Ordonez | aaaa     | adriana@XdMMVl.com        | Kids     | First     | 2         | XL    | White  | Women    | Third     | 5         | XL    | Black  | Men      | Third     | 3         | L     | White  |
      | Renato Huerta   | aaaad    | renatoEFD@lEEMMW.com      | Kids     | Fourth    | 4         | S     | Black  | Women    | Third     | 11        | L     | White  | Men      | First     | 9         | XL    | Black  |
      | Kira Ordonez    | aaaa     | Kira@rXRCM.com            | Kids     | Third     | 42        | X     | White  | Women    | First     | 7         | S     | Black  | Men      | Second    | 459       | S     | Black  |
      | Camote Ordonez  | aaaa     | CamoteVX@ddMg.com         | Kids     | Second    | 51        | L     | Black  | Women    | Fourth    | 23        | M     | Black  | Men      | First     | 9         | XL    | Black  |
      | Diana Ordonez   | aaaa     | DianaC4GS@lWXSVDVxffk.com | Kids     | First     | 13        | XL    | White  | Women    | Second    | 79        | XL    | Black  | Men      | Third     | 1349      | L     | White  |
