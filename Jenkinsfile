pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git(
                    url: 'https://github.com/andreriosdev/projeto_jenkins.git',
                    branch: 'main'
                )
                sh 'chmod +x gradlew && ls -la'
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
                junit '**/build/test-results/test/*.xml'
            }
        }
    }
}
