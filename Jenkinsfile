pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git(
                    url: 'https://github.com/andreriosdev/projeto_jenkins.git',
                    branch: 'main',
                    credentialsId: ''  # Remova esta linha se não usar autenticação
                )
                sh 'chmod +x gradlew && ls -la'  # Debug + permissões
            }
        }
        
        stage('Build') {
            steps {
                sh './gradlew --version && ./gradlew build'
            }
        }
        
        stage('Test') {
            steps {
                sh './gradlew test'
                junit '**/build/test-results/test/*.xml'  # Publica relatórios
            }
        }
    }
}pipeline {
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
