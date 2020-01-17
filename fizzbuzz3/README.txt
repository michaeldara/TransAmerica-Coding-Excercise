Author: Michael Dara

Instructions on running the FizzBuzz3 project:

Prerequisites:

    - Install Maven to your machine
    - Install JDK 1.8 or higher to your machine

Building and Running Project:

   - Import FizzBuzz3 project from the FizzBuzz3.zip file as maven projet into your Eclipse/preferred development tool (or) extract the zip file to a location.

   - run command "mvn clean install". This will run all the unit tests on the projects.

   - For coverage report, go to /target/site/jacoco/com.mdara.transamerica.fizzbuzz3 in the project folder
     Open the file index.html as a web browser.

   - To run the application, issue the below java command or run FizzBuzz3.java from the development tool with range of sequence numnbers 1 to 20 as 
     command line arguments
 
     Example      : java FizzBuzz3 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
     Output Result: 1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz
		            fizz: 4
		            buzz: 3
		            fizzbuzz: 1
		            lucky: 2
		            integer: 10