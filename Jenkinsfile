pipeline {
    agent any
    tools {
        nodejs "nodejs"
    }
    stages {
        stage("Version check") {
            steps {
                sh '''
                  node --version
                  php --version
                  npm --version
                 '''
            }
        }
        stage("Install") {
            steps {
                sh '''
                  node install                    
                   '''
            }
        }
    }
}
