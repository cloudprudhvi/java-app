# Spring Boot Greeting Application

A modern web application that provides a browser-based interface for greeting users. Built with Spring Boot, this application runs in headless environments and is accessible through any web browser.

## Project Description

This web application allows users to:
1. Access the greeting interface through a web browser
2. Enter their name in a stylish form
3. Click a "Greet" button
4. See a personalized greeting message with modern styling

## Project Structure

```
java-app/
├── pom.xml                    # Maven project configuration file
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── GreetingApp.java  # Spring Boot application code
│       └── resources/
│           ├── templates/
│           │   └── greeting.html        # Thymeleaf template
│           └── application.properties   # Application configuration
```

### File Descriptions

- `pom.xml`: Maven project configuration file that defines:
  - Project coordinates (groupId, artifactId, version)
  - Java version (21)
  - Spring Boot dependencies and version
  - Build configuration for creating an executable JAR

- `src/main/java/com/example/GreetingApp.java`: Main application source code
  - Spring Boot application class with @SpringBootApplication
  - REST controller for handling web requests
  - Implements the greeting logic

- `src/main/resources/templates/greeting.html`: Web interface template
  - Thymeleaf template for the greeting page
  - Responsive design with modern styling
  - Form for user input

- `src/main/resources/application.properties`: Configuration file
  - Server port configuration (80)
  - Other Spring Boot settings

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

## Building and Running

Build the project:
```bash
mvn clean package
```

Run the application (requires sudo for port 80):
```bash
sudo java -jar target/greeting-app-1.0-SNAPSHOT.jar
```

## Usage

1. Open your web browser and navigate to `http://localhost:80`
2. Enter your name in the text field
3. Click the "Greet" button
4. A personalized greeting message will appear on the page

## Technical Details

- Built with Spring Boot 3.1.5 for modern web application development
- Uses Thymeleaf for server-side HTML templating
- Implements responsive web design
- Runs in headless environments (no GUI system required)
- RESTful architecture with Spring MVC
- Packaged as an executable JAR with embedded Tomcat server

## Features

- Browser-based interface accessible from any device
- Modern, responsive design
- No GUI system requirements (works in headless environments)
- Professional-grade web application architecture
- Easy deployment and configuration
