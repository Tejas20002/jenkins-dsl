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
        stage("Npm Install") {
            steps {
                sh '''
                  ls -a
                  cat Jenkinsfile
                  cat index.js
                  npm install                    
                   '''
            }
        }
    }
}
