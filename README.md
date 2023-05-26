## TRANZACT-AUTOMATION-WEB - EVERSHOP

### Archetype
````text 
Renatopaco.tranzact.automation.web.evershop/
├── src/
├── main/
│   ├── java/
│   ├── Renatopaco.tranzact.automation.web.evershop/
│   └── exceptions
│   └── interactions
│   └── models
│   └── questions
│   └── runners
│   └── stepsdefinitions
│   └── tasks
│   └── userinterface
│   └── utils
├── test/
├─ resources
│   ├── features
│   └── webdriver
├── serenity.conf
├── pom.xml
├── README.md
└── serenity.properties
````

### Compile code Maven
1st:
````
mvn clean
````
2nd:
````
Go to runner and enter @tag and run, remember enter a
new EMAIL <ramdom EMAIL> in Tramites.feature:
````
3rd:
````
mvn serenity:aggregate
````
4th:
````
click on url to see the report
````

*Remember:
If you want to change the examples, keep in mind the following:
1. The web dynamically changes its data so it is recommended to view the web to know which product to put.
2. Remember to change the email that is the unique password
3. A list of options for each parameter is attached:
   * Product1 (above menu title menu): ´Kids´, ´Women´ or ´Men´
   * Position1 (product position): ´First´´Second´´Third´´Fourth´
   * Quantity1 (amount of products): ´#number´
   * Size1 (product size): ´S´,´M´,´L´,´X´,´XL´
   * Color1: ´White´´Pink´´Green´´Black´´Brown´´Blue´´Grey´´Red´
###Author: Renato Francisco Paco Huerta 
###Linkedin: https://www.linkedin.com/in/renatopaco98/

