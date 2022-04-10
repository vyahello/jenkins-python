pipeline {
    // declare where your build is going to run, you can use docker image as agent
    // agent any
    agent {
        docker {
            image 'python:3.7'
        }
    }
    // add stages, will be run inside docker container
    stages {
        stage('Checkout') {
            steps {
                sh "python --version"
                sh "docker --version"
                echo "Build"
                echo "Build Number - $env.BUILD_NUMBER"
                echo "BUILD_ID - $env.BUILD_ID"
                echo "JOB_NAME - $env.JOB_NAME"
                echo "BUILD_TAG - $env.BUILD_TAG"
                echo "BUILD_URL - $env.BUILD_URL"
            }
        }
    }
    // action to execute after all stages
    post {
        always {
            echo "Always run"
        }
        success {
            echo "Run when you are successful"
        }
        failure {
            echo "Run when you are fail"
        }
    }
}