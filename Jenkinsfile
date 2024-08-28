pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/dsmv04/pruebaPractica'
            }
        }

        stage('Build') {
            steps {
                script {
                    mvnHome = tool 'M3'
                }
                sh "${mvnHome}/bin/mvn clean install"
            }
        }

        stage('Test') {
            steps {
                script {
                    mvnHome = tool 'M3'
                }
                sh "${mvnHome}/bin/mvn test"
            }
        }

        stage('Coverage Report') {
            steps {
                script {
                    mvnHome = tool 'M3'
                }
                sh "${mvnHome}/bin/mvn jacoco:report"
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            jacoco execPattern: '**/target/*.exec'
        }
    }
}
