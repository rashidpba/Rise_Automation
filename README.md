# Rise_Automation
test-automation-quickstart
Java selenium+cucumber project for test automation,. Created with lessons learned from a large number of development projects to provide all commonly required components and concepts.

Concepts Included

Common web page interaction methods
Commonly used test utility classes

Tools
Maven
Cucumber-JVM
JUnit
Eclips
Selenium Webdriver

Requirements
In order to utilise this project you need to have the following installed locally:
its an cucumber project,so install cucumber plug in in eclips;

Maven 3
Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config)
Java 1.8


Usage
The project is broken into separate modules for API, UI, Performance and Security testing. Each of these modules can be utilised independently of the others using maven profiles.

To run all modules, navigate to test-automation-quickstart directory and run,throug JUnit runner;

Reporting
Reports for each module are written into their respective /target directories after a successful run.

NOTE: As mentioned, cucumber reports are written to a separate file for feature. 




