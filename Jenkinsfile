pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Code pulled from GitHub'
                sh 'ls'
            }
        }

        stage('Python tests') {
            steps {
                dir('python-app') {
                    sh '''
                        python3 -m venv venv
                        . venv/bin/activate
                        pip install -r requirements.txt
                        pytest
                    '''
                }
            }
        }

        stage('Java build') {
            steps {
                dir('java-app') {
                    sh 'mvn -B clean package'
                }
            }
        }
    }
}