#!/bin/bash

# Build the project with Maven
mvn clean package

# Run the application
java -jar target/greeting-app-1.0-SNAPSHOT.jar
