# automation_example
This is a test automation example using the **selenium-uitaf** open source project for UI testing. The test is designed to test the Tricentis Vehicle Insurance Quote application located at http://sampleapp.tricentis.com/101/ using the Chrome browser. 

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

The test automation framework described in this example is based on a component-based, data-driven, business-oriented approach.<br>
It aims to make it easier to write clean, business-oriented test code that can be used with many different datasets. <br>
The framework uses separation of concerns (SOC) principles to separate the test code logic from data facilities, allowing well-crafted tests to be written once and used with hundreds or thousands of different datasets. The datasets can contain static or dynamically generated data and can alter the flow of the test depending on the data supplied. The framework uses the "page object" design pattern and allows automatic population of all components on a page with a single line of code, as well as the automatic generation of datasets from test assets. It also includes implicit testing during web component population and automatic retry in case of issues with data insertion. This is made possible by the use of "page components", which are reusable test artifacts written in Java that can handle complex logic and data insertion without leaking it into the test code.
