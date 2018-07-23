# collage-example-web
Spring boot multi module sample project with Maven ,Swagger and Postgres
#GET THE SOURCE CODE
If you want to check out the source code and test it on your own you need to have Java SE, Git and Postgres installed. Then perform:

$ git clone https://github.com/dipankarghoshIN/collage-example-web.git
Using pom.xml open collage.svc into your IDE 

#POSTGRES SET UP
If you check into application.yml file inside resources folder you can find postgres configuration
datasource:
    platform: postgres
    url: jdbc:postgresql://localhost:5433/postgres
    username: postgres
    password: ada539!

**above code create connection between your collage.svc with postgres 
In my case postgres running local machine that's why (localhost) and port no I am using 5433 and database name postgres 
url: jdbc:postgresql://localhost:5433/postgres 

My Postgres username: postgres and password: ada539!

****Change above all those thinges based on your local postgres setup.
*****Find out postgres.txt file and Used whole query into postgres Query tool it's created Table name and a row with data where primary key studentUsn

#RUN SOURCE CODE
***If you did all those steps correctly your spring boot project running into(port:8602 and path: /student)
**Below lines you can see when your project successfully running into your IDE
 main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8602 (http) with context path '/student'
 main] c.collage.student.managment.Application  : Started Application in 6.785 seconds (JVM running for 7.926)

#SWAGGER
**STEP1:When your project succesfully running into your IDE just hit http://localhost:8602/student/swagger-ui.html#! this url into your browser. 
**STEP2: You will get SWAGGER UI open in your Browser, now click on Swagger record controller there have two option GET and POST 
**STEP3: For GET request use 1AY12CS034 as a studentUsn to get the record from database.
**STEP4: For Post request insert a row inside database.
{
  "city": "Bangalore",
  "firstYearAvg": 76.5,
  "fourYearAvg": 78.5,
  "pin": 560090,
  "secoundYearAvg": 87.5,
  "specialzation": "ECE",
  "state": "KA",
  "studentName": "Dipankar Ghosh",
  "studentUsn": "1AY12EE040",
  "thirdYearAvg": 92.5
}
