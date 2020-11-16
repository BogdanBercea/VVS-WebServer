Java Web Server

To start the Java Web Server, download the application jar file and run the following command:

    $ java -jar web-server.jar <PORT_NUMBER>
 
To stop the Simple Web server, just press Cntr+C on the command line.
(The parameter PORT_NUMBER is optional, default port is 8080)


COMPILING
=========

Step 1 - Install Requirements
-----------------------------
To download and compile the source code you need to install: 

- Java SDK v1.6+
- Maven v2.0+
- Git v1.7+

Step 2 - Get the source code
----------------------------
Download the project source code from GitHub repository.
This will create a folder "VVS-WebServer" containing the project source files. 

Step 3 - Compile it!
--------------------
Go to the project root folder and run the following command:

    $ mvn clean package

This will create a "target" folder containing the application jar file: java-WebServer-1.0-jar-with-dependencies.jar  
