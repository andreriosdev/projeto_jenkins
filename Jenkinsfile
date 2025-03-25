pipeline {
    agent any
    
    // Configuração de limpeza automática (adicionar no início)
    options {
        buildDiscarder(logRotator(
            daysToKeepStr: '7',     // Mantém builds por 7 dias
            numToKeepStr: '5'       // Mantém no máximo 5 builds
        ))
    }

    stages {
        stage('Checkout') {
            steps {
                git(
                    url: 'https://github.com/andreriosdev/projeto_jenkins.git',
                    branch: 'main'
                )
                sh 'chmod +x gradlew'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
                junit '**/build/test-results/test/*.xml'
            }
        }
    }
    
    // Configurações pós-build (opcional)
    post {
        always {
            cleanWs()  // Limpa workspace após execução
        }
    }
}
