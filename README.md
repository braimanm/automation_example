# automation_example
This is an example of testing Tricentis Vehicle Insurance Quote application located at http://sampleapp.tricentis.com/101/

This example is using **selenium-uitaf** open source project for UI test automation, 
and shows how to use it in business oriented development approach.

The test assumes that Chrome browser is installed on the target machine where this test should run.
<br>This project is targeting Java 8 only!

Prerequisites:
1) Install JDK version 8
2) Install Maven
3) Optionally you can install IntelliJ and open this project as maven project

To build and execute the solution just follow these steps:
1)	Clone this repository to your machine `git clone https://github.com/braimanm/automation_example.git`
2)	Navigate to project folder `cd automation_example`
3)	Build the solution by invoking following command:  `mvn clean package`
4)	Execute the solution by invoking `java -jar target/example.jar`

The test will invoke 5 Chrome browser instances and execute 5 different test cases in parallel.
At the end of the test, report with execution results will be launched in the default browser.
