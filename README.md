# automation_example
This is an example of how to automate the creation of a new account on http://automationpractice.com
The test assumes that Chrome browser is installed on the target machine where this test should run.

To build the solution just follow the following steps:
1)	Clone this repository to your machine
2)	Build the solution by invoking following command:  mvn clean package
3)	Execute the solution by invoking java -jar target\example-1.0-SNAPSHOT.jar

The test will invoke 4 Chrome browser instances and will fill the Account Registration form with randomly generated data.
At the end of the test, report with execution results will be launched in the default browser.
