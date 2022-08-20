# FormedicAssignmentTest
# clinical trial automation software Test(FormedixAssignment)

##About Formedix :
   Formedix is a leading supplier of clinical trial automation software and services based on CDISC (Clinical Data Interchange Standards Consortium). standards.

## End to End Assessment Test(FormedixAssignment)

## Introduction:

### I have documented prescribe the tools & technology, approaches, resources, of all testing activities of the project clinical trial automation software.
### This document also outlines what will be tested, the features that will be tested. 

## Testing Tools and Technologies : Test Automation tool Selenium with JAVA programmimg language(version javaSE 1.8), Platform(s) - Windows 10.
   
##  Framework Architecture:
   * step 1-Installing Ecplise IDE for Java Developers in my local machine and installing Java Jdk(with Java_HOME)and set Enviroment variables for that.
   * Step 2-Installing the Selenium 4.0 library for my desired programming language.
   * Step 3-Set up the browser driver to automate my browser (e.g.  Google Chrome, Internet Explorer, and firefox).
   * Step 4-(Optional) Set up and configure Selenium WebDriver for end-to-end application testing using selenium. 
   * Located webpage elements through xpath.
   * I have used Maven to build the project.
   * I have integrated with jars to extend its functionalities and add dependencies in pom.xml file from to get maven central repository and add drivers in lib folder.
   * Used POM Design Pattern - for each web page to create separate .class file and used Encapulation concept here for variables and methods and also used constructor for same driver instance to maintain all the test cases.
   * Used TestNG : Converted my project to TestNG. I have used annotations to better understand for each testcases(@BeforeTest,@Test,@AfterTest),I am able to execute my testcases in parallel execution using .xml file.
   * Report : Testng gives the report in .index.html whichever testcases has passed/failed.
   * data.properties file : Initialized broweser and url in this properties file.
     URL: https://ryze-staging.formedix.com/sign-in
   * Base file : Extended this base class into all the testcases. 
   * Maven Project Folder structure like this:
 ###    src/main/java folder
 ###    package-PageObjects
 ###    under this 2 .java classes(loginpage,navigationpage).
 ###    package-Resources
 ###    under this 2 .java classes(baseclass) and data.properties file.
 ###    src/test/java folder
 ###    package-testcases
 ###    under this 1 .java classes(LoginPageTC)
     
## 2 Scope:
## Task 1- Login:
###I have successfully executed LoginTC with given user name and password credintials.I have used Parameterization to access login credentials by using @DataProvider annotation.

## Task 2- Repository:
###I have successfully executed LoginPageTc navigate repository to studies,
###successfully clicked on TechStudy menu bar 
###validated tech test study view.
###successfully clicked on TechStudy menu bar
###successfully validated ‘Data acquisition’ asset group view.
###successfully clicked on view ‘Forms’.
###successfully clicked on ‘Medical History’icon and view the ‘Medical History’ form.
###successfully clicked on edit form by adding a ‘Description’text to the textbox.
###successfully clicked on validate and update icon and check successfully saved or not.
###checked user update has been preserved on the property panel,and on the main form view or not.
###checked Over the mouse on user icon(testteamtechtest) on the bottom left hand side of the menu bar.
###checked Logout button is clicked successfuly or not.  
###Some of the elements on page didn't clicking through click() method, so i have used for clicking elements through Action class.
###checked all test cases has successfully validated or not,

## Task 3 - Github
### I have push my FormedixAssignment Project from git to github with Document.
### I have created README.txt file for documentation purpose.
   


## Thank You for this assignment.
