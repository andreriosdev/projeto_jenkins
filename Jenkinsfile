pipeline {
    agent any
    tools {
        jdk 'jdk17'      // Nome da JDK configurada no Jenkins
        gradle 'gradle8' // Nome do Gradle configurado no Jenkins
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew clean assemble'
                archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
                junit 'build/test-results/test/**/*.xml'  // Relatório de testes
            }
        }
    }
}
