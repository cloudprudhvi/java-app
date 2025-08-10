pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/cloudprudhvi/java-app.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Run') {
            steps {
                sh 'java -jar target/*.jar &'
                echo 'Java application started.'
            }
        }
    }
    post {
        success {
            echo 'Java pipeline completed successfully!'
        }
        failure {
            echo 'Java pipeline failed.'
        }
    }
}
