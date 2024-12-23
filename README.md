REST API - Java POST Method

This project demonstrates how to create a RESTful API in Java using a POST method to handle incoming requests. The code is structured for clarity and ease of use, following best practices for REST API development.

Features

RESTful Architecture: Implements a standard REST API using Java.

POST Method: Processes incoming POST requests to create or update resources.

JSON Support: Handles JSON payloads for easy data exchange.

Dependency Management: Utilizes Maven or Gradle for managing project dependencies.

Scalability: Designed to be extensible for additional endpoints and functionality.

SMS Sending: Sends SMS messages using the send.lk API.

HTTP POST Requests: Demonstrates setting headers, sending JSON payloads, and processing responses.

Error Handling: Includes basic error handling for HTTP response codes.

Technologies Used

Java: Core programming language.

Spring Boot: Framework for building RESTful web services.

Maven/Gradle: Build and dependency management tools.

Postman: For testing the API endpoints.

Getting Started

Prerequisites

Java Development Kit (JDK 8 or later)

Maven or Gradle

An IDE such as IntelliJ IDEA or Eclipse

Installation

Clone the repository:

git clone https://github.com/your-username/rest-api-java-post-method.git

Navigate to the project directory:

cd rest-api-java-post-method

Import the project into your IDE.

Build and Run

Build the project using Maven or Gradle:

# For Maven
mvn clean install

# For Gradle
gradle build

Run the application:

mvn spring-boot:run

or

java -jar target/rest-api-java-post-method-0.0.1-SNAPSHOT.jar

API Endpoints

POST /api/resource

Description: Creates a new resource.

Request Body:

{
    "name": "string",
    "value": "string"
}

Response:

{
    "id": "integer",
    "name": "string",
    "value": "string"
}

Example: SMS Sending

The Snippet.java file provides an example of using the send.lk SMS API. The example:

Takes user input for recipient number, sender ID, message content, and an authorization token.

Formats the input as a JSON payload.

Sends the payload to the https://sms.send.lk/api/v3/sms/send endpoint.

Handles the API's HTTP response, including error codes.

Example Request

Request URL: https://sms.send.lk/api/v3/sms/send

Request Body:

{
    "recipient": "+1234567890",
    "sender_id": "YourSenderID",
    "message": "Hello World!"
}

Response Example:

{
    "status": "success",
    "message_id": "12345"
}

Testing

Use Postman or a similar tool to send a POST request to the API endpoint. Example:

Set the URL: http://localhost:8080/api/resource

Select the POST method.

Add a JSON body to the request:

{
    "name": "Sample",
    "value": "Example"
}

Send the request and verify the response.

Project Structure

rest-api-java-post-method/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.restapi/
│   │   │       ├── RestApiApplication.java
│   │   │       └── controller/
│   │   │           └── ResourceController.java
│   ├── resources/
│       └── application.properties
├── pom.xml (or build.gradle)
└── README.md

Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Acknowledgements

Spring Boot Documentation

Postman for API testing
