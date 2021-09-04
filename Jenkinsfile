pipeline {
    agent any

    tools {
        // Install the Maven version configured as "Maven_Home" and add it to the path.
        maven "MAVEM_HOME"
    }
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
