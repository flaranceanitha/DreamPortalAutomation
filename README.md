***Dream Portal Automation Framework***

**Overview**

Dream Portal Automation Framework is a Selenium WebDriver automation project developed using Java, TestNG, Maven, and Page Object Model (POM).
The framework automates and validates the functionality of the Dream Portal web application including UI validations, table validations, 
synchronization handling, multiple window handling, and screenshot evidence generation.
This project demonstrates a clean and reusable Selenium automation framework structure following industry-standard automation testing practices.



**Technologies Used**

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- Git & GitHub
- Page Object Model (POM)


**Framework Features**

- Selenium 4 Automation Framework
- Page Object Model Design Pattern
- Reusable Utility Classes
- Explicit Wait Handling
- Multiple Window Handling
- Screenshot Capture
- Maven Project Structure
- TestNG Reporting
- Git Version Control



**Project Structure**

```plaintext
DreamPortalAutomation
│
├── screenshots
│
├── src
│   ├── main
│   │   └── java
│   │       ├── base
│   │       ├── pages
│   │       └── utils
│   │
│   └── test
│       └── java
│           └── tests
│
├── test-output
├── pom.xml
├── testng.xml
└── README.md
```

**Test Scenarios**

HomePageTest
* Verify Home Page Launch
* Verify My Dreams Button Visibility
* Verify Multiple Window Opening

DreamDiaryTest
* Verify Dream Diary Table Data
* Verify Dream Details
* Capture Screenshot Evidence

**Utility Classes**

WaitUtils

Handles explicit waits and synchronization.

ScreenshotUtils

Captures screenshots during execution for test evidence.

**BaseTest**

The BaseTest class handles:

* Browser initialization
* Chrome browser launch
* URL launch
* Browser termination

**Design Pattern Used:**
***Page Object Model (POM)***

This framework follows the Page Object Model design pattern where:

* Each webpage is maintained as a separate Java class
* Locators and methods are reusable
* Test scripts remain clean and maintainable

***Benefits:***

* Better code reusability
* Easy maintenance
* Improved readability
* Scalable framework structure

**Author**

Flarance Anitha

QA Automation Testing Project using Selenium WebDriver, Java, TestNG, and Maven.
