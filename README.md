# jenkins-dsl

Jenkins pipeline and dsl practise purpose create this project. 
This project made in node js, normal weather application project.

Jenkinsfile is create for the jenkins pipeline and the dsl.groovy is create for the Jenkins dsl proccess for learning purpose.

Jenkins file code

```
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
                  npm install                    
                   '''
            }
        }
    }
}
```

Jenkins Dsl file dsl.groovy

```
job('nodeweatherapp') {
    scm {
        git{
            remote {
                url("https://github.com/Tejas20002/jenkins-dsl.git")
            }
            branch("*/master")
        }
    }
    wrappers{
        nodejs('nodejs')
    }
    steps {
        shell('npm install')
    }
}
```
