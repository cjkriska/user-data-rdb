pipeline {
    agent any
    tools {
        maven "jenkins-maven"
    }

    stages {
        stage('Build Artifact') {
            steps {
                sh "mvn clean package -DskipTests=true"
                archive 'target/*.jar'
            }
        }
    }
}