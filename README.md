# ms-meetup
In Order to do the setup, please follow following steps:
1. Fork the repository
2. Clone it in your local 
3. Using an IDE, import it as a maven project.
4. Please uncomment h2 db properties from application.properties file and comment all the other DB related properties.
5. Build the project and Run it as a Spring boot app.

In case step number 4 fails: 
	Please set the following env variables and use step 6:
	1.	 RDS_DB_NAME = techwizardsdb
	2.	 RDS_HOSTNAME = tech-wizards-db.mysql.database.azure.com
	3.	 RDS_PASSWORD = Welcome1
	4.	 RDS_PORT = 3306
	5.	 RDS_USERNAME = techwizards@tech-wizards-db

6. Replace the application.properties with latest version in the repository.


Except /ketchup/authenticate and /ketchup/signup, all other endpoints are protected. So, in order to hit other endpoints
Please generate a token and pass it in headers.

To generate token, please use the follwing URL with Request:

URL: https://ms-meetup-1.azurewebsites.net/ketchup/authenticate
Request-method: POST
Content-Type: application/json
Request: {"username":"ankit.sood","password":"Welcome1"}

You'll get a token in response. Send that token in request, for all other endpoints.

Sample Request:

header value:
Key: Authorization
Value: Bearer <Token Received>
URL: https://ms-meetup-1.azurewebsites.net/categories/
