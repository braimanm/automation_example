# automation_example
This is an example of testing Tricentis Vehicle Insurance Quote application located at http://sampleapp.tricentis.com/101/

This example is using **selenium-uitaf** open source project for UI test automation, 
and shows how to use it in business oriented development approach.

The test assumes that Chrome browser is installed on the target machine where this test should run.
<br>This project is targeting Java 8 only!

Prerequisites:
1) Install JDK version 8
2) Install Maven
3) Install Git
4) Optionally you can install IntelliJ and open this project as maven project

To build and execute the solution just follow these steps:
1)	Clone this repository to your machine `git clone https://github.com/braimanm/automation_example.git`
2)	Navigate to project folder `cd automation_example`
3)	Build the solution by invoking following command:  `mvn clean package`
4)	Execute the solution by invoking `java -jar target/example.jar`

The test will invoke 5 Chrome browser instances and execute 5 different test cases in parallel.
At the end of the test, report with execution results will be launched in the default browser.

Little bit more about the Test Automation framework used in this example:<br>
The framework is using component based, data driven, business oriented approach. <br>
The big difference between this and other frameworks is that instead of writing test code which deal with web page complexity and web element interactions by writing convoluted code, this framework concentrates on solving business oriented validations of your enterprise business application. <br>
The framework is also solving data related issues by using separation of concerns (SOC) principles. The test code logic is clean and completely separated from the data facilities so well crafted test can be written once and used with hundred or thousand different datasets. <br>
The datasets can contain static or dynamically generated data supplied to the test during execution and can alter the flow of your test depending on supplied data.<br>
The framework is uses “Page Object” design patten but going one step further, it allows automatic population of all components on the page in one line of code and makes page object classes to be serializable to and from datasets. The framework also generate datasets from test assets removing guessing on how to supply data to your tests in unified fashion.<br>
One of the interesting features of this framework is implicit testing during web component population and automatic retry in case data is inserted incorrectly due to some issues related to web application, web browser or underlying operating system instability. In other words it’s mimic human interaction with web application, when data is inserted incorrectly the operator usually will delete entry and repopulate the field again.<br>
All the features that I have pointed out here are possible by introducing “Page Components” which are much smarter than primitive Selenium web elements. Page Component in nutshell is reusable test artifact written in Java language which has one goal: it need to provide supplied data to your application and it doesn’t matter how complex this component is as the complexity and the logic is encapsulated in component itself and this logic is not leaking in to your test code. 
