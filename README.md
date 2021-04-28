# PERSON APPLICATION

This is an application to add person names into theH2 in-memory database and search persons by name fragment. 
This application was compiled using Java 8. Make sure you have a Java 8 or greater installed on your computer. 
You can check your current java version by using the `java -version` command in your terminal window.  

<br>
This application runs on localhost port 8888 - make sure it is not used by anything else.

## How to run the application
### To start the application:
1. Download app.jar file from [application](https://github.com/thomastammoja/appTestAssignment/tree/master/application) folder.
2. Open a terminal window on your computer.
3. Locate the download folder (where you downloaded the **app.jar** file).
4. Change the working directory inside your terminal window to download folder: `cd "your/download/folder"`.  
   **PS! You can skip this step if you open your terminal inside the download directory.**
5. Run the application by using the following command: `java -jar app.jar`.
6. Wait for the application to start. It will usually take around 6 seconds.

### To use the application:
1. Open postman.
2. Use the POST method with [person](http://localhost:8888/person) endpoint to add persons to the database.  
   2.1 Change your code body style to raw JSON(application/json).  
   2.2 Write your code in JSON format. As an example: `{"name":"Thomas"}`  
   2.3 You will get **Person added** as a response if adding a person was successful.
3. USE GET method with [Search person](http://localhost:8888/person?search=) endpoint to search a person from the database.  
   3.1 Add the name (or part of the name) right after the equal sign. As an example:  
   `http://localhost:8888/person?search=thomas`  
   **PS! This search method is not case-sensitive.**  
   3.2 You will get all rows from the database that include the searched word as a JSON list.  
   3.3 You can also use this method in your browser with the same URL.  
   3.4 If you leave the search parameter value empty then the entire table is retrieved.

## Links to endpoints:
- [Add person](http://localhost:8888/person)
- [Search person](http://localhost:8888/person?search=)

## Contributor
Thomas Tammoja

**Version 1.0.0**