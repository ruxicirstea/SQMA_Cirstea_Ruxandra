pipeline {
    agent any

    stages {
        stage('TestStudent') {
            steps {
                bat 'mvn -Dtest=TestStudent test'
            }
        }
        stage('TestStudentVarsta') {
            steps {
                bat 'mvn -Dtest=TestStudentVarsta test'
            }
        }

    }
}
