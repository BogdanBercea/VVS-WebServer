PROJECT
========================

The project is in the web_server folder




STATIC/DYNAMIC ANALYSIS
========================

To see the results of static analysis and dynamic analysis, access the static_dynamic_analysis_pics folder


WEB SERVER
=======================

Copiling
---------

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
Go to web_server folder and run the following command:

    $ mvn clean package

This will create a "target" folder containing the application jar file: java-WebServer-1.0-jar-with-dependencies.jar

Step 4 - Start the Server
-------------------------
To start the server go to the "target" folder and run the following command:

    $ java -jar java-WebServer-1.0-jar-with-dependencies.jar <PORT_NUMBER>
    (!!! PORT_NUMBER is optional, default post is 8080)
    (!!! When you run the server leave it on the default port because web tests are done on this port)

To stop the server, just press Cntr+C on the command line.
