# automation_example
This is a test automation example using the **selenium-uitaf** open source project for UI testing. The test is designed to test the Tricentis Vehicle Insurance Quote application located at http://sampleapp.tricentis.com/101/ using the Chrome browser. 

The test assumes that Chrome browser is installed on the target machine where this test should run and it supported by Java 8 only!

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

A bit more about the test automation framework used in this example:<br>
The framework uses a component-based, data-driven, business-oriented approach.<br>
A big difference between this framework and others is that, instead of writing test code that deals with web page complexity and web element interactions through convoluted code, this framework focuses on solving business-oriented validations of your enterprise business application.<br>
The framework also addresses data-related issues by using separation of concerns (SOC) principles. The test code logic is clean and completely separated from the data facilities, allowing well-crafted tests to be written once and used with hundreds or thousands of different datasets.<br>
The datasets can contain static or dynamically generated data supplied to the test during execution and can alter the flow of the test depending on the supplied data.<br>
The framework uses the "page object" design pattern, but goes one step further by allowing automatic population of all components on the page in a single line of code and making page object classes serializable to and from datasets. The framework also generates datasets from test assets, eliminating the need to guess how to supply data to your tests in a unified fashion.<br>
One of the interesting features of this framework is implicit testing during web component population and automatic retry in case data is inserted incorrectly due to issues with the web application, web browser, or underlying operating system instability. In other words, it mimics human interaction with the web application, in which the operator usually deletes the entry and repopulates the field if data is inserted incorrectly.<br>
All of the features mentioned here are made possible by introducing "page components," which are much smarter than primitive Selenium web elements. A page component is a reusable test artifact written in Java that has a single goal: to provide supplied data to your application under test, no matter how complex the component is. The complexity and logic are encapsulated in the component itself and do not leak into the test code.
