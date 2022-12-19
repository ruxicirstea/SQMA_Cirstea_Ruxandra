pipeline {
    agent any

    stages {
        stage('TestStudent') {
            steps {
                sh 'mvn -Dtest=TestStudent test'
            }
        }
        stage('TestStudentVarsta') {
            steps {
                sh 'mvn -Dtest=TestStudentVarsta test'
            }
        }

    }
}
