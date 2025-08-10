# Simple Java Greeting Application

A simple Java Swing application that provides a graphical user interface for greeting users.

## Project Description

This application creates a simple GUI window where users can:
1. Enter their name in a text field
2. Click a "Greet" button
3. See a personalized greeting message

## Project Structure

```
java-app/
├── pom.xml                 # Maven project configuration file
├── build.sh               # Build and run script
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── GreetingApp.java  # Main application code
```

### File Descriptions

- `pom.xml`: Maven project configuration file that defines:
  - Project coordinates (groupId, artifactId, version)
  - Java version (17)
  - Build configuration
  - Dependencies
  - JAR packaging with main class definition

- `build.sh`: Shell script that automates the build and run process
  - Builds the project using Maven
  - Runs the resulting JAR file

- `src/main/java/com/example/GreetingApp.java`: Main application source code
  - Contains the GUI implementation using Java Swing
  - Handles user input and displays greetings
  - Uses Event Dispatch Thread for proper Swing application execution

## Prerequisites

- Java Development Kit (JDK) 17 or later
- Maven 3.8 or later
- Ubuntu or compatible Linux distribution

## Installation

If you don't have Java and Maven installed, you can install them using:

```bash
sudo apt update
sudo apt install -y openjdk-17-jdk maven
```

## Building and Running

There are two ways to build and run the application:

### 1. Using the build script

Simply run:
```bash
./build.sh
```

This will:
- Clean and build the project with Maven
- Run the resulting JAR file

### 2. Manual commands

Build the project:
```bash
mvn clean package
```

Run the application:
```bash
java -jar target/greeting-app-1.0-SNAPSHOT.jar
```

## Usage

1. When you run the application, a window will appear
2. Enter your name in the text field
3. Click the "Greet" button
4. A greeting message will appear below the button

## Technical Details

- Built with Java Swing for the GUI
- Uses Maven for project management and building
- Implements proper Swing threading practices using SwingUtilities.invokeLater()
- Packaged as an executable JAR with dependencies
