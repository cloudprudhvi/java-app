#!/bin/bash

# Build the project with Maven
mvn clean package

mvn test
# Run the application
java -jar target/greeting-app-1.0-SNAPSHOT.jar
