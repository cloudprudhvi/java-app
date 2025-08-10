# Spring Boot Greeting Application

A modern web application built with Spring Boot that provides a browser-based interface for greeting users.

## Project Description

This web application demonstrates modern Spring Boot development practices with:
1. RESTful web endpoints for form handling
2. Responsive web interface using Thymeleaf templates
3. Comprehensive test coverage
4. CI/CD pipeline support with Jenkins

## Project Structure

```
java-app/
├── pom.xml                    # Maven project configuration file
├── Jenkinsfile               # Jenkins CI/CD pipeline configuration
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── GreetingApp.java  # Main Spring Boot application
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── greeting.html        # Thymeleaf template
│   │       └── application.properties   # Application configuration
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── GreetingAppTests.java  # Test suite
```

### File Descriptions

- `pom.xml`: Maven project configuration file that defines:
  - Project coordinates (groupId, artifactId, version)
  - Java version (21)
  - Spring Boot dependencies
  - Test dependencies
  - Build configuration

- `Jenkinsfile`: CI/CD pipeline configuration:
  - Automated build and test stages
  - Code quality checks with SonarQube
  - Deployment configurations for dev and prod
  - Email notifications

- `src/main/java/com/example/GreetingApp.java`: Main application source code:
  - Spring Boot application class
  - Web controller with REST endpoints
  - Form handling logic

- `src/main/resources/templates/greeting.html`: Web interface:
  - Thymeleaf template for the greeting page
  - Responsive design
  - Form implementation

- `src/test/java/com/example/GreetingAppTests.java`: Test suite:
  - Controller tests
  - Form submission tests
  - Edge case handling tests

## Prerequisites

- Java Development Kit (JDK) 21 or later
- Maven 3.8 or later
- Ubuntu or compatible Linux distribution

## Installation

If you don't have Java and Maven installed, you can install them using:

```bash
sudo apt update
sudo apt install -y openjdk-21-jdk maven
```

## Building and Testing

### Build the project:
```bash
mvn clean package
```

### Run tests:
```bash
mvn test
```

The test suite includes:
- Controller endpoint testing
- Form submission validation
- Edge case handling
- Response validation

### Test Coverage
The application includes comprehensive tests for:
- GET endpoint "/"
- POST endpoint "/greet"
- Valid name handling
- Empty input validation
- Special character handling
- Long input handling

## Running the Application

Run the application (requires sudo for port 80):
```bash
sudo java -jar target/greeting-app-1.0-SNAPSHOT.jar
```

## Usage

1. Open your web browser and navigate to `http://localhost:80`
2. Enter your name in the text field
3. Click the "Greet" button
4. A personalized greeting message will appear

## Technical Details

- Built with Spring Boot 3.1.5
- Uses Thymeleaf for server-side templating
- Implements Spring MVC architecture
- Comprehensive test suite with JUnit 5
- CI/CD pipeline with Jenkins
- Runs on embedded Tomcat server

## Development

### Running Tests
The project includes comprehensive tests that can be run with:
```bash
mvn test
```

### CI/CD Pipeline
The included Jenkinsfile provides:
- Automated build and test execution
- Code quality checks
- Development and production deployments
- Email notifications for build failures

### Available Endpoints
- GET "/" - Shows the greeting form
- POST "/greet" - Processes the greeting request
