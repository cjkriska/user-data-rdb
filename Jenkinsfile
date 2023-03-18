node {
    stage("Clone the project") {
        git branch: 'main', url: 'https://github.com/cjkriska/user-data-rdb.git'
    }

    stage("Compilation") {
        sh "chmod +x ./mvnw"
        sh "./mvnw clean install -DskipTests"
    }

    stage("Tests and Deployment") {
        stage("Running unit tests") {
            sh "./mvnw test -Punit"
        }
        stage("Deployment") {
            sh 'nohup ./mvnw spring-boot:run -Dspring-boot.run.arguments=--server.port=8001 &'
        }
    }
}