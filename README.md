# Foodics
## Environment
* Using Java 20 OpenJDK
* Using Selenium 4
* Using IntelliJ IDEA IDE to develop the solution
* Using TestNG as a Test Framework to create and execute the script
* Using Maven to build and manage the project
* Using Edge driver to run the script
* Using Page Object Model as a Design Pattern

## Classes
* Creating Pages Package to contain all pages classes
* Creating a GoogleSearch_Page class in Pages Package to contain the elements in search Page.
* Creating a Page_Base class in Pages Package to contain common methods and properties that are used across multiple page classes.
* Creating a SearchResult_Page class in Pages Package to call the elements action from it
* Creating a Test_base in class in Test_base package to contain common methods and properties that are used across multiple test classes.
* Creating a Testing_SearchFunctionality Test Case in TestSearch class in Test_Search package  (validate that number of results exist on UI, Validate if the number of results on page 2 is equal to page 3 or not
and Validate there are different search suggestions displayed at the end of the page)

* Creating a BaseTests class contains the setup and teardown.
