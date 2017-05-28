University Course Application
-----------------------------

This app will be used to view list of universities, list of courses, list of enrolled students.
Using this we can add/remove/modify courses.
Also It will useful for registering/deregistering/modifying student details.

System requirements
-------------------

All you need to build this project is Java SDK 1.7 or better, Maven 3.0 or better, MySQL 5.1 database, Spring 4.2.6, Hibernate 4.1.0.

The application this project produces is designed to be run on Apache Tomcat 8.0 Server.

Build and Deploy
-----------------

Please build this project using maven and then deploy it on server.
After this restart your web server.

Using this Application
----------------------

Once server is started you can navigate to http://localhost:8080/UniVersityCourseApp/ this link.
On this page you will find three links as below:
1.  University List - on click of this link you will be able to see list of all the universities in a table format.
    University Name, University Id, University Country will be present in a tabled format.
2.  Student List  - on click of this link you will routed to a page which contains a form and list of enrolled students in a table format.
    In the given form user will be able to add Student Name and COurse Name and on click of submit button that student will be enrolled
    for that course if its a new request else the details will be modified in database.
    Student Name, Course Name, Edit Link and Deregister Link will be present in table.
    On Click of Edit link student details will be populated in the above form and any modifications to that will be saved in database.
    On Click of Deregister link that perticular student is deregistered for that course and accordingly below table will be updated. 
3.  Course List - On click of this link you will be routed to a page wich contains a form and list of available courses in a table format.
    In the given form user will be able to add course name and university name and on click of submit button that course will be registered
    for that university if its a new request else the details will be modified in database.
    Course Name, University Name, Edit Link and Delete Link is present in table.
    On click of Edit Link course details will be populated in the above form and any modifications to that will be saved on click of submit.
    On click of Delete link that particular course is deleted and below table is also updated.
    
 Future Enhancements
 --------------------
 
 Going further we can add a better UI to this application, add validations depending on fields, add validations for relation between course
 and university. We can also apply authorization by providing a login page and tasks will be separated for student and admin.
 
 
