# REST API - Java POST Method 🚀

Welcome to the **REST API - Java POST Method** repository! This project demonstrates how to build a robust and scalable RESTful API in Java using the POST method. Perfect for beginners and intermediate developers looking to implement real-world API solutions.

---

## 🎯 Key Features

- 🌐 **RESTful Design**: Follows REST principles for clean and consistent API architecture.
- 📨 **POST Method**: Handles creating and updating resources using HTTP POST requests.
- 📦 **JSON Integration**: Effortlessly parses and handles JSON payloads for seamless data exchange.
- 🛠 **Dependency Management**: Built with Maven/Gradle for streamlined builds and dependency control.
- 🔄 **Extensibility**: Modular and easily extendable for adding more endpoints.
- 📲 **SMS Functionality**: Includes SMS sending using the `send.lk` API.
- 📋 **Error Handling**: Handles HTTP responses with appropriate status codes and error messages.

---

## 🛠 Technologies Used

- **Java**: Core programming language.
- **Spring Boot**: Framework for RESTful web services.
- **Maven/Gradle**: Build and dependency management.
- **Postman**: For API testing.

---

## ⚙️ Getting Started

### Prerequisites

- Java Development Kit (JDK 8 or later)
- Maven or Gradle
- An IDE like IntelliJ IDEA or Eclipse

### Installation Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/rest-api-java-post-method.git
   ```
2. Navigate to the project directory:
   ```bash
   cd rest-api-java-post-method
   ```
3. Import the project into your IDE.

---

## 🚀 Build and Run

### Using Maven
```bash
mvn clean install
mvn spring-boot:run
```

### Using Gradle
```bash
gradle build
java -jar build/libs/rest-api-java-post-method-0.0.1-SNAPSHOT.jar
```

---

## 🔗 API Endpoints

### **POST** `/api/resource`
- **Purpose**: Create a new resource.
- **Request Body**:
  ```json
  {
      "name": "string",
      "value": "string"
  }
  ```
- **Response**:
  ```json
  {
      "id": "integer",
      "name": "string",
      "value": "string"
  }
  ```

---

## 📤 SMS Sending Example

The included `Snippet.java` file showcases how to send SMS messages via the `send.lk` API. Here's a breakdown:

### Workflow:
1. Input recipient number, sender ID, message content, and authorization token.
2. Format the JSON payload.
3. Send the payload to the `send.lk` endpoint.
4. Handle the HTTP response.

### Example Request

**Endpoint**: `https://sms.send.lk/api/v3/sms/send`

**Request Body**:
```json
{
    "recipient": "+1234567890",
    "sender_id": "YourSenderID",
    "message": "Hello World!"
}
```

**Response**:
```json
{
    "status": "success",
    "message_id": "12345"
}
```

---

## 🛠 Testing the API

Use Postman or a similar tool to test your API:

1. Set the URL: `http://localhost:8080/api/resource`
2. Choose POST as the method.
3. Add a JSON body:
   ```json
   {
       "name": "Sample",
       "value": "Example"
   }
   ```
4. Send the request and verify the response.

---

## 📂 Project Structure

```
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
```

---

## 🌟 Contributing

We welcome contributions! Here's how you can get started:
1. Fork the repository.
2. Create a feature branch: `git checkout -b feature-branch-name`
3. Commit your changes: `git commit -m 'Add new feature'`
4. Push to your branch: `git push origin feature-branch-name`
5. Submit a pull request.

---

## 📜 License

This project is licensed under the MIT License. For more details, check the LICENSE file.

---

## 💡 Acknowledgements

Special thanks to:
- The Spring Boot team for their excellent documentation.
- Postman for simplifying API testing.

---

### Ready to explore? Clone the repository and start building! 🎉

