SMARTBEAR TIME CONVERSION APPLICATION

This project converts users time entries into British english words (in text);

Setup Process
--------------
This project is a maven project which can be built and run via a console.
Please ensure Maven has been installed on the computer system where the application will be run. 
Kindly follow:  https://maven.apache.org/download.cgi for maven installation guide.

Steps
    1. Run Maven compile command to validate and run tests on the application.
        Command: mvn clean install
    2. Run maven command to package the project into an executable file.
        Command: mvn package
    3. Step 1 above generates the java jar file to run the application. This can be located in the target folder or desired location of the build. 
        Enter the command to change directory into the target.
        Command: cd ./target
    4. Launch/Run the application
        Command: java -jar smartbeartime.jar
    5. Enter 0 to stop/terminate the application.
