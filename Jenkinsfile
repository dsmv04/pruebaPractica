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
                // Listar el contenido del directorio para verificar la generación del reporte
                sh 'ls -R target/site/jacoco/'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            jacoco execPattern: '**/target/*.exec'
            // Archivar los reportes de cobertura
            archiveArtifacts artifacts: 'target/site/jacoco/*.html', allowEmptyArchive: true
        }
        failure {
            mail to: 'dalton.munoz.v@gmail.com',
                 subject: "Pipeline Failed: ${currentBuild.fullDisplayName}",
                 body: "Something is wrong with ${env.BUILD_URL}"
        }
    }
}
