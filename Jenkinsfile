pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                 echo 'Building the application'
            }
        }
         stage('Test') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean install"
            }
        }
         stage('Deploy') {
            steps {
                 echo 'Deploying the application'
            }
        }
    }
    post
    {
        always{
            emailext body: 'Testing piple lines', subject: 'Status', to: 'shashi.srcon@gmail.com'
        }
    }
}
